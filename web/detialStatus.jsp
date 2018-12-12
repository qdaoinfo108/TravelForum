<%-- 
    Document   : detialStatus
    Created on : Dec 11, 2018, 12:07:04 PM
    Author     : Admin
--%>

<%@page import="model.Account"%>
<%@page import="model.Status"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    int id = Integer.parseInt(request.getParameter("id"));
    dao.StatusDAO.tangView(id);
    Status s = dao.StatusDAO.getStatusByID(id);
    Account a = dao.LoginAccount.getInfoAccount(s.getUsername());
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><%= s.getStatus_title()%></title>

        <!-- Stylesheets -->

        <link href="common-css/bootstrap.css" rel="stylesheet">

        <link href="common-css/ionicons.css" rel="stylesheet">


        <link href="single-post-3/css/styles.css" rel="stylesheet">

        <link href="single-post-3/css/responsive.css" rel="stylesheet">
    </head>
    <body>

        <jsp:include page="header.jsp"/>

        <% if (s.getStatus_image().equals("images/status/")){ %>
        <div class="slider center-text" style="height: 600px; width: 100%; background-size: cover; position: relative; z-index: 1;
             background-image: url(../../TravelForum/images/default-banner.jpg); color: #fff;"> 
            <% } else { %>
            <div class="slider center-text" style="height: 600px; width: 100%; background-size: cover; position: relative; z-index: 1;
                 background-image: url(../../TravelForum/<%= s.getStatus_image() %>); color: #fff;"> <% } %>
                <div class="container height-100">
                    <div class="row height-100" >

                        <div class="col-lg-1 hidden-md-down"></div>

                        <div class="col-lg-10 col-md-12">
                            <div class="display-table">
                                <div class="display-table-cell">
                                    <h5 class="pre-title">FASHION</h5>

                                    <h3 class="title"><a href="#"><b><%= s.getStatus_title()%></b></a></h3>

                                    <div class="post-info">

                                        <div class="left-area">
                                            <a class="avatar" href="#"><img src="<%if (a.getImage() == null) { %> images/default-avatar.jpeg <% } else {%> <%= a.getImage()%> <% }%>" alt="Profile Image"></a>
                                        </div>

                                        <div class="middle-area">
                                            <a class="name" href="#"><b><%= a.getName()%></b></a>
                                            <h6 class="date">lúc <%= s.getStatus_date()%></h6>
                                        </div>

                                    </div><!-- post-info -->

                                </div><!-- display-table-cell -->
                            </div><!-- display-table -->

                        </div><!-- col-lg-10 -->
                    </div><!-- row -->
                </div><!-- conatiner -->
            </div><!-- slider -->

            <div class="container">
                <div class="row">

                    <div class="col-md-1"></div>
                    <div class="col-md-10">

                        <div class="main-post">

                            <div class="post-bottom-area">

                                <p class="para"><%= s.getStatus_content() %></p>

                                <ul class="tags">
                                    <li><a href="#"><%= dao.CategoryDAO.getNameCategoryInt(s.getCategory()) %></a></li>
                                    <li><a href="#"><%= dao.CityDAO.getNameCityInt(s.getCity()) %></a></li>

                                </ul>

                                <div class="post-icons-area">
                                    <ul class="post-icons">
                                        <li><a href="#"><i class="ion-heart"></i>57</a></li>
                                        <li><a href="#"><i class="ion-chatbubble"></i>6</a></li>
                                        <li><a href="#"><i class="ion-eye"></i>138</a></li>
                                    </ul>

                                    <ul class="icons">
                                        <li>SHARE : </li>
                                        <li><a href="#"><i class="ion-social-facebook"></i></a></li>
                                        <li><a href="#"><i class="ion-social-twitter"></i></a></li>
                                        <li><a href="#"><i class="ion-social-pinterest"></i></a></li>
                                    </ul>
                                </div>


                                <!-- something -->

                            </div><!-- post-bottom-area -->

                        </div><!-- main-post -->

                    </div><!-- col-md-10 -->

                </div><!-- row -->

            </div><!-- container -->


        </section><!-- post-area -->

        <jsp:include page="incluCommnet.jsp"/>

        <jsp:include page="footer.jsp"/>
</body>
</html>
