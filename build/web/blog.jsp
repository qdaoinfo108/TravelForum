<%-- 
    Document   : blog
    Created on : Nov 15, 2018, 4:52:58 PM
    Author     : Admin
--%>

<%@page import="model.Like"%>
<%@page import="model.Status"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <% ArrayList<Status> list = dao.StatusDAO.getAllStatusTrue();
            String emailHientai = (String) session.getAttribute("email");
        %>
        <section class="blog-area section">
            <div class="container">
                <div class="row">

                    <% for (int i = 0; i < list.size(); i++) {
                            String img = dao.LoginAccount.getImgAccount(list.get(i).getUsername());
                            String name = dao.LoginAccount.getNameAccount(list.get(i).getUsername());
                            String city = dao.CityDAO.getNameCityInt(list.get(i).getCity());
                            String category = dao.CategoryDAO.getNameCategoryInt(list.get(i).getCategory());
                            int binhluan = dao.CommentDAO.demCommentByIDStatus(list.get(i).getStatus_id());
                            if (list.get(i).getStatus_image().equals("images/status/")) {
                    %>


                    <div class="col-lg-4 col-md-6">
                        <div class="card h-100">

                            <div class="single-post post-style-2 post-style-3">

                                <div class="blog-info">

                                    <h6 class="pre-title"><a href="#"><b><span>Danh mục : <%= category%><br>Thành phố : <%= city%> </span></b></a></h6>

                                    <h4 class="title"><a href="detialStatus.jsp?id=<%= list.get(i).getStatus_id()%>"><b><%= list.get(i).getStatus_title()%></b></a></h4>

                                    <p><%= list.get(i).getStatus_content()%></p>
                                    <br>
                                    <div class="avatar-area">
                                        <a class="avatar" href="#"><img src="<%= img%>" alt="Profile Image"></a>
                                        <div class="right-area">
                                            <a class="name" href="#"><b><%= name%></b></a>
                                            <h6 class="date" href="#">lúc <%= list.get(i).getStatus_date()%></h6>
                                        </div>
                                    </div>

                                    <ul class="post-footer">
                                        <% Like l = dao.LikeDAO.getLike(emailHientai, list.get(i).getStatus_id());
                                            if (l.isCondition() == true) {%>
                                        <li><a href="UnLikeController?id=<%= list.get(i).getStatus_id()%>&email=<%= emailHientai%>"><i class="ion-heart"></i><%= dao.LikeDAO.demLike(list.get(i).getStatus_id())%></a></li>
                                                <% } else {%>
                                        <li><a href="LikeController?id=<%= list.get(i).getStatus_id()%>&email=<%= emailHientai%>"><i class="ion-heart"></i><%= dao.LikeDAO.demLike(list.get(i).getStatus_id())%></a></li>

                                        <% }%>
                                        
                                        <li><a href="#"><i class="ion-chatbubble"></i><%= dao.CommentDAO.demCommentByIDStatus(list.get(i).getStatus_id())%></a></li>
                                        <li><a href="#"><i class="ion-eye"></i><%= list.get(i).getStatus_view()%></a></li>
                                    </ul>

                                </div><!-- blog-right -->

                            </div><!-- single-post extra-blog -->

                        </div><!-- card -->
                    </div><!-- col-lg-4 col-md-6 -->    
                    <% } else {%>



                    <div class="col-lg-8 col-md-12">
                        <div class="card h-100">
                            <div class="single-post post-style-2">

                                <div class="blog-image"><img src="<%= list.get(i).getStatus_image()%>" alt="Blog Image"></div>

                                <div class="blog-info">

                                    <h6 class="pre-title"><a href="#"><b><span>Danh mục : <%= category%><br>Thành phố : <%= city%> </span></b></a></h6>

                                    <h4 class="title"><a href="detialStatus.jsp?id=<%= list.get(i).getStatus_id()%>"><b><%= list.get(i).getStatus_title()%></b></a></h4>

                                    <p><%= list.get(i).getStatus_content()%></p>
                                    <br>
                                    <div class="avatar-area">
                                        <a class="avatar" href="#"><img src="<%= img%>" alt="Profile Image"></a>
                                        <div class="right-area">
                                            <a class="name" href="#"><b><%= name%></b></a>
                                            <h6 class="date" href="#"> lúc <%= list.get(i).getStatus_date()%></h6>
                                        </div>
                                    </div>

                                    <ul class="post-footer">
                                        <li><a href="LikeController?id=<%= list.get(i).getStatus_id()%>&email=<%= emailHientai%>"><i class="ion-heart"></i><%= dao.LikeDAO.demLike(list.get(i).getStatus_id())%></a></li>
                                        <li><a href="#"><i class="ion-chatbubble"></i><%= binhluan%></a></li>
                                        <li><a href="#"><i class="ion-eye"></i><%= list.get(i).getStatus_view()%></a></li>
                                    </ul>

                                </div><!-- blog-right -->

                            </div><!-- single-post extra-blog -->

                        </div><!-- card -->
                    </div><!-- col-lg-8 col-md-12 -->


                    <% }
                        }%>
                </div><!-- row -->

                <a class="load-more-btn" href="#"><b>Tải thêm</b></a>

            </div><!-- container -->
        </section><!-- section -->
    </body>
</html>
