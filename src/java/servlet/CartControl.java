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
@WebServlet(name = "CartControl", urlPatterns = {"/CartControl"})
public class CartControl extends HttpServlet {

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
        account a = (account) ses.getAttribute("account");

        DAO dao = new DAO();
        String pid = request.getParameter("pid");
        String amount = request.getParameter("amount");
        List<Integer> amountList = new ArrayList<>();
        if (a == null) {
            if (pid != null && amount != null) {
                Cookie arr1[] = request.getCookies();
                Cookie arr2[] = request.getCookies();
                String txt1 = "";
                String txt2 = "";
                for (Cookie o : arr1) {
                    if (o.getName().equals("id")) {
                        txt1 = txt1 + o.getValue();
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }
                }
                for (Cookie o : arr2) {
                    if (o.getName().equals("amount")) {
                        txt2 = txt2 + o.getValue();
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }
                }
                if (txt1.isEmpty()) {
                    txt1 = pid;
                } else {
                    txt1 = txt1 + "," + pid;
                }
                if (txt2.isEmpty()) {
                    txt2 = amount;
                } else {
                    txt2 = txt2 + "," + amount;
                }
                Cookie cookie1 = new Cookie("id", txt1);
                Cookie cookie2 = new Cookie("amount", txt2);
                cookie1.setMaxAge(60 * 60 * 24);
                cookie2.setMaxAge(60 * 60 * 24);
                response.addCookie(cookie1);
                response.addCookie(cookie2);
                response.sendRedirect("ShowCookieControl");
            }else{
                response.sendRedirect("ShowCookieControl");
            }
        } else {
            if (pid != null && amount != null) {
                cart c = dao.checkCart(a.getId() + "", pid);
                if (c == null) {
                    dao.addCart(a.getId() + "", pid, amount);
                } else {
                    dao.updateCart(amount, c.getId() + "");
                }
            }
            List<product> cart = dao.loadCart(a.getId() + ""); 
            if (cart != null) {
                for(int i=0;i<cart.size();i++){
                    int temp=dao.getProductDetail("Select * from HE141488_product where id = "+cart.get(i).getId()).getAmount();
                    if(temp==0){
                        dao.deleteCart(a.getId()+"", cart.get(i).getId()+"");
                    }else{
                        if(temp<cart.get(i).getAmount()){
                            dao.updateCart(temp+"", cart.get(i).getId() + "");
                        }
                        amountList.add(temp);
                    }
                }
                request.setAttribute("cart", cart);
                request.setAttribute("amountList", amountList);
                request.getRequestDispatcher("cart.jsp").forward(request, response);
            } else {
                response.sendRedirect("cart.jsp");
            }
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
