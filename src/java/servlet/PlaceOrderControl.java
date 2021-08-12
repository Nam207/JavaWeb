/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.DAO;
import entity.account;
import entity.cart;
import entity.product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nam
 */
@WebServlet(name = "PlaceOrderControl", urlPatterns = {"/PlaceOrderControl"})
public class PlaceOrderControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession ses = request.getSession();
        account acc = (account) ses.getAttribute("account");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String cardType = request.getParameter("CreditCardType");
        String cardNumber = request.getParameter("car_number");
        DAO dao = new DAO();
        java.util.Date time = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(time.getTime());
        java.sql.Time sqlTime = new Time(time.getTime());
        if (acc != null) {
            List<cart> cart = dao.takeCart(acc.getId() + "");
            for (int i = 0; i < cart.size(); i++) {
                dao.addCheckOut(cart.get(i).getAccountId() + "",
                        cart.get(i).getProductId() + "", cart.get(i).getAmount() + "",
                         firstName, lastName, address, phone, email, cardType,
                        cardNumber,sqlDate,sqlTime);
                product p = dao.getProductDetail("Select * from HE141488_product where id like '" + cart.get(i).getProductId() + "'");
                dao.placeOrder(cart.get(i).getAmount(), cart.get(i).getProductId() + "", p.getAmount());
                dao.deleteCart(acc.getId() + "", p.getId() + "");
            }
        } else {
            Cookie arr1[] = request.getCookies();
            Cookie arr2[] = request.getCookies();
            PrintWriter out = response.getWriter();
            List<product> list = new ArrayList<>();
            String amountArr[] = null;
            List<Integer> amountList = new ArrayList<>();
            for (Cookie o : arr2) {
                if (o.getName().equals("amount")) {
                    amountArr = o.getValue().split(",");
                }
            }
            for (Cookie o : arr1) {
                if (o.getName().equals("id")) {
                    String txt[] = o.getValue().split(",");
                    for (int i = 0; i < txt.length; i++) {
                        list.add(dao.getProductCoockie("SELECT * from HE141488_product "
                                + "Where id = " + txt[i], amountArr[i]));
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).getId() == list.get(j).getId()) {
                        list.get(i).setAmount(list.get(j).getAmount());
                        list.remove(j);
                        j--;
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                dao.addCheckOut("0", list.get(i).getId() + "",
                        list.get(i).getAmount() + "",
                         firstName, lastName, address, phone, email, cardType,
                        cardNumber,
                        sqlDate,sqlTime);
                product p = dao.getProductDetail("Select * from HE141488_product where id like '" + list.get(i).getId() + "'");
                dao.placeOrder(list.get(i).getAmount(), list.get(i).getId() + "", p.getAmount());
            }
            for (Cookie o : arr1) {
                o.setMaxAge(0);
                response.addCookie(o);
            }
            for (Cookie o : arr2) {
                o.setMaxAge(0);
                response.addCookie(o);
            }
        }
        response.sendRedirect("HomeControl");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
