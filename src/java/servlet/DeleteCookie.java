/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nam
 */
@WebServlet(name = "DeleteCookie", urlPatterns = {"/DeleteCookie"})
public class DeleteCookie extends HttpServlet {

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
        String id = request.getParameter("pid");
        Cookie arr1[] = request.getCookies();
        Cookie arr2[] = request.getCookies();
        String txt1 = "";
        for (Cookie o : arr1) {
            if (o.getName().equals("id")) {
                txt1 = txt1 + o.getValue();
                o.setMaxAge(0);
                response.addCookie(o);
            }
        }
        String txt2 = "";
        for (Cookie o : arr2) {
            if (o.getName().equals("amount")) {
                txt2 = txt2 + o.getValue();
                o.setMaxAge(0);
                response.addCookie(o);
            }
        }
        String idArr[] = txt1.split(",");
        String amountArr[] = txt2.split(",");
        String idOutPut = "";
        String amountOutPut = "";
        for (int i = 0; i < amountArr.length; i++) {
            if (!idArr[i].equals(id)) {
                System.out.println(!idArr[i].equals(id));
                System.out.println(amountArr[i]);
                System.out.println(amountOutPut);
                if (amountOutPut.isEmpty()) {
                    amountOutPut = amountArr[i];
                } else {
                    amountOutPut = amountOutPut + "," + amountArr[i];
                }
            }
        }
        for (int i = 0; i < idArr.length; i++) {
            if (!idArr[i].equals(id)) {
                if (idOutPut.isEmpty()) {
                    idOutPut = idArr[i];
                } else {
                    idOutPut = idOutPut + "," + idArr[i];
                }
            }
        }
        if (!idOutPut.isEmpty()) {
            Cookie c1 = new Cookie("id", idOutPut);
            Cookie c2 = new Cookie("amount", amountOutPut);
            c1.setMaxAge(60 * 60 * 24);
            c2.setMaxAge(60 * 60 * 24);
            response.addCookie(c1);
            response.addCookie(c2);
        }
        response.sendRedirect("CartControl");
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
