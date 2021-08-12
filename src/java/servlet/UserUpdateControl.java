/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.DAO;
import entity.account;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nam
 */
@WebServlet(name = "UserUpdateControl", urlPatterns = {"/UserUpdateControl"})
public class UserUpdateControl extends HttpServlet {

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
        HttpSession ses =request.getSession();
        account a =(account) ses.getAttribute("account");
        String pass = request.getParameter("pass");
        String user = request.getParameter("user");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        DAO dao = new DAO();
        if (pass == null) {
            dao.updateUser(a.getId()+"", firstName, lastName, email, address, phone);
            response.sendRedirect("HomeControl");
        } else {
            if (pass.length() < 8 || pass.length() > 10) {
                request.setAttribute("mess", "Password has length from 8 to 10");
                request.getRequestDispatcher("managerUser.jsp").forward(request, response);
            }
            int count = 0;
            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);
                if (!(ch + "").matches("[a-zA-Z0-9]")) {
                    System.out.println(ch);
                    request.setAttribute("mess", "Pass does not contain special characters");
                    request.getRequestDispatcher("managerUser.jsp").forward(request, response);
                }
                if ((ch + "").matches("[0-9]")) {
                    count++;
                }
            }
            if (count == 0) {
                request.setAttribute("mess", "Password must contain at least 1 number");
                request.getRequestDispatcher("managerUser.jsp").forward(request, response);
            }
            dao.updatePass(a.getId()+"", pass);
            response.sendRedirect("HomeControl");
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
