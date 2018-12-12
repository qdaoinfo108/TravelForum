<%-- 
Document   : header
Created on : Nov 15, 2018, 4:48:08 PM
Author     : Admin
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Forum Travel | TMDT </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <style>
            .dropbtn {
                background-color: #4CAF50;
                color: white;
                padding: 16px;
                font-size: 16px;
                border: none;
            }

            /* The container <div> - needed to position the dropdown content */
            .dropdown {
                position: relative;
                display: inline-block;
            }

            /* Dropdown Content (Hidden by Default) */
            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f1f1f1;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

        </style>

    </head>
    <body>
        <% String email = (String) session.getAttribute("email");
            Account acc = dao.LoginAccount.getInfoAccount(email);
        %>
        <header style="font-size:15px">
            <div class="container-fluid position-relative no-side-padding">

                <a href="index.jsp" class="logo"><img src="images/logo.png" alt="Logo Image"></a>
                    <%
                        String tendangnhap = request.getParameter("user");
                    %>
                <div class="menu-nav-icon" data-nav-menu="#main-menu"><i class="ion-navicon"></i></div>

                <ul class="main-menu visible-on-click" id="main-menu">
                    <li><a href="index.jsp">Trang Chủ</a></li>
                    <li><a href="#">Danh Mục</a></li>
                    <li><a href="#">Nổi bật</a></li>
                        <%
                            if (session.getAttribute("sessionname") == null) {
                        %>
                    <li><a href="login.jsp">Đăng Nhập</a></li>
                        <% } else {%>

                    <li><a href="profile.jsp">
                            <span style="margin: 0 auto;width: 40px; height: 40px;border-radius: 100px;">
                                <% if (acc.getImage() == null) { %>
                                <img src="images/default-avatar.jpeg" alt="Profile Image">
                                <% } else {%>
                                <img src="<%= acc.getImage()%>" alt="Profile Image">

                                <% }%> </span>
                            <%= acc.getName() %></a>
                    </li>
                    <% }%>

                </ul><!-- main-menu -->

                <div class="src-area">
                    <form>
                        <button class="src-btn" type="submit"><i class="ion-ios-search-strong"></i></button>
                        <input class="src-input" type="text" placeholder="Nhập địa điểm bạn muốn tìm kiếm">
                    </form>
                </div>

            </div><!-- conatiner -->
        </header>

    </body>
</html>

