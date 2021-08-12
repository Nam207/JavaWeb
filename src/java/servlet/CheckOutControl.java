/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.DAO;
import entity.account;
import entity.product;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CheckOutControl", urlPatterns = {"/CheckOutControl"})
public class CheckOutControl extends HttpServlet {

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
        String pid = request.getParameter("pid");
        DAO dao = new DAO();
        HttpSession ses = request.getSession();
        account a = (account) ses.getAttribute("account");
        if (a != null) {
            List<product> cart = dao.loadCart(a.getId() + "");
            request.setAttribute("cart", cart);
            request.getRequestDispatcher("checkOut.jsp").forward(request, response);
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
            request.setAttribute("cart", list);
            request.getRequestDispatcher("checkOut.jsp").forward(request, response);
        }
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
