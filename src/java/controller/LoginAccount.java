/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author Admin
 */
@WebServlet(name = "LoginAccount", urlPatterns = {"/LoginAccount"})
public class LoginAccount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Connection conn = connect.ConnectDB.getConnection();
        String tendangnhap = request.getParameter("account_username");
        String matkhau = request.getParameter("account_password");

        Account acc = new Account();
        acc.setUser(tendangnhap);
        acc.setPass(matkhau);

        String hoten = dao.LoginAccount.showHoTen(request, conn, acc);
        String err = "";
        String CheckLogin = dao.LoginAccount.CheckLogin(request, conn, acc);

        if (dao.LoginAccount.CheckLogin(request, conn, acc).equals("thatbai")) {
            err = "Tài khoản hoặc mật khẩu không đúng";
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);
        }
        String url = "/login.jsp";

        try {
            if (CheckLogin.equals("thanhcong")) {

                HttpSession seesion = request.getSession(true);
                seesion.setAttribute("sessionname", hoten);
                seesion.setAttribute("email", tendangnhap);
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            } else {
                request.setAttribute("msglogin", "Tài khoản hoặc mật khẩu không đúng");
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }
}
