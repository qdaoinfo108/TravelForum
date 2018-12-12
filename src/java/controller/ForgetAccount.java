/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tools.RandomCharacter;

/**
 *
 * @author Admin
 */
public class ForgetAccount extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String username = request.getParameter("account_username");
        //set time
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, +30);
        //-------------------------------------------------------------------
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date thoiGian = cal.getTime();
        String s1 = sdf2.format(thoiGian);
        java.sql.Timestamp t1 = new java.sql.Timestamp(thoiGian.getTime());
        // set URL
        String sRandom = RandomCharacter.randomUrl();

        dao.LoginAccount.themURLTime(sRandom, t1, username);

        Properties mailServerProperties;
        Session getMailSession;
        MimeMessage mailMessage;

        // Step1: setup Mail Server
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");

        // Step2: get Mail Session
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        mailMessage = new MimeMessage(getMailSession);
        try {

            mailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(username)); 
            mailMessage.setSubject("Quên mật khẫu", "utf-8");
            mailMessage.setText(" Bấm vào đường link để lấy lại mật khẩu : \n"
                    + request.getContextPath() + "/detialForgetAccount.jsp?forget_url=" + sRandom, "utf-8");

            // Step3: Send mail
            Transport transport = getMailSession.getTransport("smtp");

            transport.connect("smtp.gmail.com", "qdao.cntt@gmail.com", "10081997");
            transport.sendMessage(mailMessage, mailMessage.getAllRecipients());
            transport.close();

        } catch (Exception e) {

        }
        response.sendRedirect(request.getContextPath() + "/detialForgetAccount.jsp?forget_url=" + sRandom);

    }

}
