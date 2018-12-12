<%-- 
    Document   : statusFalseAccount
    Created on : Dec 10, 2018, 3:03:40 PM
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
        <title>Danh sách bài viết chưa duyệt</title>
        <link href="common-css/bootstrap.css" rel="stylesheet">

        <link href="common-css/ionicons.css" rel="stylesheet">
        <link href="single-post-1/css/styles.css" rel="stylesheet">
        <link href="single-post-1/css/responsive.css" rel="stylesheet">

        <link href="front-page-category/css/styles.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">

    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <% String email = (String) session.getAttribute("email");
            Account acc = dao.LoginAccount.getInfoAccount(email);
            String img = dao.LoginAccount.getImgAccount(email);

            ArrayList<Status> listTrue = dao.StatusDAO.getAllStatusFalseByAccount(email);
        %>
        <div class="slider">
            <div class="display-table  center-text">
                <h1 class="title display-table-cell"><b>Xin chào, <%= session.getAttribute("sessionname")%></b></h1>
            </div>
        </div><!-- slider -->

        <section class="blog-area section">
            <div class="container">

                <div class="row">
                    <div class="col-lg-8 col-md-12">
                        <div class="row">

                            <% for (int i = 0; i < listTrue.size(); i++) {%>
                            <div class="col-md-6 col-sm-12">
                                <div class="card h-100">
                                    <div class="single-post post-style-1">

                                        <div class="blog-image"><img src="<%= listTrue.get(i).getStatus_image()%> " alt="Blog Image"></div>

                                        <a class="avatar" href="#"><img src="<% if (acc.getImage() == null) { %>
                                                                        images/default-avatar.jpeg
                                                                        <% } else {%>
                                                                        <%= img%>
                                                                        <% }%>" alt="Profile Image">"</a>

                                        <div class="blog-info">

                                            <h4 class="title"><a href="#"><b><%= listTrue.get(i).getStatus_content()%></b></a></h4>

                                            <ul class="post-footer">
                                                <p>Tình trạng : <span style="color: red"> CHƯA DUYỆT</span></p>
                                            </ul>

                                        </div><!-- blog-info -->
                                    </div><!-- single-post -->
                                </div><!-- card -->
                            </div><!-- col-md-6 col-sm-12 -->

                            <% }%>
                        </div><!-- row -->

                        <a class="load-more-btn" href="#"><b>LOAD MORE</b></a>

                    </div><!-- col-lg-8 col-md-12 -->

                    <jsp:include page="incluInfoAccount.jsp"/>


                </div><!-- row -->

            </div><!-- container -->
        </section><!-- section -->

        <jsp:include page="footer.jsp"/>
    </body>
    <script src="common-js/jquery-3.1.1.min.js"></script>

    <script src="common-js/tether.min.js"></script>

    <script src="common-js/bootstrap.js"></script>

    <script src="common-js/scripts.js"></script>
</html>