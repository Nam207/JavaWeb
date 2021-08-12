/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.DAO;
import entity.account;
import entity.user;
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
@WebServlet(name = "SignUpControl", urlPatterns = {"/SignUpControl"})
public class SignUpControl extends HttpServlet {

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
        String user= request.getParameter("user");
        String pass= request.getParameter("pass");
        String repass= request.getParameter("repass");
        String firstName= request.getParameter("firstName");
        String lastName= request.getParameter("lastName");
        DAO dao = new DAO();
        if(user.length()<8 || user.length()>10){
            request.setAttribute("mess", "Account has length from 8 to 10");
            request.getRequestDispatcher("signUp.jsp").forward(request, response);
        }
        if(pass.length()<8 || pass.length()>10){
            request.setAttribute("mess", "Password has length from 8 to 10");
            request.getRequestDispatcher("signUp.jsp").forward(request, response);
        }
        int count=0;
        for(int i=0; i<pass.length();i++){
            char ch = pass.charAt(i);
            if(!(ch+"").matches("[a-zA-Z0-9]")){
                request.setAttribute("mess", "Pass does not contain special characters");
                request.getRequestDispatcher("signUp.jsp").forward(request, response);
            }
            if((ch+"").matches("[0-9]")){
                count++;
            }
        }
        if(count==0){
            request.setAttribute("mess", "Password must contain at least 1 number");
            request.getRequestDispatcher("signUp.jsp").forward(request, response);
        }
        if(pass.equals(repass)){
            account a= dao.checkAccount(user);
            if(a==null){
                dao.signUpAccount(user, pass);
                dao.signUpUser(firstName,lastName,"","","");
                account acc = dao.login(user, pass);
                user u = dao.loginUser(acc.getId()+"");
                HttpSession ses=request.getSession();
                ses.setAttribute("account", acc);
                ses.setAttribute("user", u);
                request.getRequestDispatcher("HomeControl").forward(request, response);
            }else{
                request.setAttribute("mess", "Account already exists");
                request.getRequestDispatcher("signUp.jsp").forward(request, response);
            }
        }else{
            request.setAttribute("mess", "Password and Re-passord are not same");
            request.getRequestDispatcher("signUp.jsp").forward(request, response);
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
