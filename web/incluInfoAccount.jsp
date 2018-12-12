<%-- 
    Document   : incluInfoAccount
    Created on : Dec 10, 2018, 10:46:59 PM
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Status"%>
<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String email = (String) session.getAttribute("email");
            Account acc = dao.LoginAccount.getInfoAccount(email);
            String img = dao.LoginAccount.getImgAccount(email);

            ArrayList<Status> listTrue = dao.StatusDAO.getAllStatusTrueByAccount(email);
        %>
        <div class="col-lg-4 col-md-12 ">

            <div class="single-post info-area ">

                <div class="about-area">
                    <center>
                        <h4 class="title"><b>Thông tin tài khoản</b></h4>
                        <div class="center-area" style="margin: 0 auto; width: 70px; height: 70px; overflow: hidden; z-index: 10;
                             border-radius: 100px; position: relative; border: 7px solid #fff; box-shadow: 0px 0px 10px rgba(0,0,0,.2);">
                            <a class="" href="#">
                                <% if (acc.getImage() == null) { %>
                                <img src="images/default-avatar.jpeg" alt="Profile Image">
                                <% } else {%>
                                <img src="<%= acc.getImage()%>" alt="Profile Image">

                                <% }%>
                            </a>
                        </div>

                        <br>
                        <p>Email : <%= email%></p><br>
                        <p>Tên  : <%= acc.getName()%></p><br>
                        <p>Đổi mật khẩu gần nhất : </p></center>
                </div>

                <div class="subscribe-area">

                    <h4 class="title"><b>....</b></h4>
                    <div class="input-area">
                        <form>
                            <input class="email-input" type="text" placeholder="Enter your email">
                            <button class="submit-btn" type="submit"><i class="ion-ios-email-outline"></i></button>
                        </form>
                    </div>

                </div><!-- subscribe-area -->

                <div class="tag-area">

                    <h4 class="title"><b>Các chức năng khác</b></h4>
                    <% int role = dao.LoginAccount.CheckRoleAccount(email);
                        if (role == 1) {
                    %>
                    <ul>
                        <li><a href="changeinfo.jsp">Đổi thông tin tài khoản</a></li>
                        <li><a href="statusFalseAccount.jsp">Danh sách bài chưa duyệt</a></li> 
                        <li><a href="checkout.jsp">Thanh toán</a></li>  
                        <li><a href="listcheckout.jsp">Lịch sử thanh toán</a></li>                                   


                    </ul>
                    <% } else { %>
                    <ul>
                        <li><a href="statusFalseByAdmin.jsp">Danh sách bài chưa duyệt</a></li>
                        <li><a href="">Danh sách bài đã duyệt</a></li>                                   
                    </ul>
                    <% }%>
                </div><!-- subscribe-area -->

            </div><!-- info-area -->

        </div><!-- col-lg-4 col-md-12 -->
    </body>
</html>
