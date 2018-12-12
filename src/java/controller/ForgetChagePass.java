/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ForgetChagePass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        String sUrl = request.getParameter("forget_url");
        String pass1 = request.getParameter("account_password1");

        boolean kt = dao.LoginAccount.changePss(sUrl, pass1);
        if (kt = true) {
            request.setAttribute("msgchagnepass", "Đã thay đổi mật khẩu thành công");
            RequestDispatcher rd = request.getRequestDispatcher("/detialForgetAccount.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("/404.jsp");
            rd.forward(request, response);
        }
    }

}
