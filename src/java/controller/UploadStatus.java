/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Status;

/**
 *
 * @author Admin
 */
@MultipartConfig()
public class UploadStatus extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

        private static final String UPLOAD_DIRECTORY = "images/status/";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        // get time 
        
        Calendar cal = Calendar.getInstance();
        //-------------------------------------------------------------------
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date thoiGian = cal.getTime();
        java.sql.Timestamp t1 = new java.sql.Timestamp(thoiGian.getTime());
        
        // end get time
        String title =request.getParameter("title");
        String content = request.getParameter("status_content");
        Timestamp date = t1;
        String img = UPLOAD_DIRECTORY + tools.UploadFile.UploadFileStatus(request);
        String location = "";
        String user = request.getParameter("account_username");
        int category = Integer.parseInt(request.getParameter("category"));
        int city = Integer.parseInt(request.getParameter("city"));
        
        Status s = new Status();
        s.setCategory(category);
        s.setCity(city);
        s.setStatus_content(content);
        s.setStatus_date(date);
        s.setStatus_image(img);
        s.setStatus_title(title);
        s.setStatus_location(location);
        s.setUsername(user);
        
        boolean kt = dao.StatusDAO.add(s);
        if (kt == true) {
            
            getServletContext().getRequestDispatcher("/index.jsp").forward(
                    request, response);
        } else {
            getServletContext().getRequestDispatcher("/404.jsp").forward(
                    request, response);
        }
    }

}
