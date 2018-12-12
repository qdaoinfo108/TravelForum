/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static dao.StatusDAO.deleteView2;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.History;

/**
 *
 * @author Admin
 */
public class SaveMoney extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        // get time 

        Calendar cal = Calendar.getInstance();
        //-------------------------------------------------------------------
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date thoiGian = cal.getTime();
        java.sql.Timestamp t1 = new java.sql.Timestamp(thoiGian.getTime());

        String email = request.getParameter("total");
        int tongview = dao.StatusDAO.tinhTongView2(email);
        // double
        
        int money = tongview * 5;

        History history = new History();
        history.setAccount_username(email);
        history.setDate(t1);
        history.setMoney(money);
        history.setViewTotal(tongview);
        boolean kt = dao.HistoryDAO.themHistory(history);
        if (kt == false) {
            deleteView2(email);
            getServletContext().getRequestDispatcher("/listcheckout.jsp").forward(
                    request, response);
        } else {
            getServletContext().getRequestDispatcher("/404.jsp").forward(
                    request, response);
        }
//        String email = (String)
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
