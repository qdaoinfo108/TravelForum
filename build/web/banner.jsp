<%-- 
    Document   : banner
    Created on : Nov 15, 2018, 4:50:30 PM
    Author     : Admin
--%>
<%@page import="dao.CityDAO" %>
<%@page import="model.City"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="main-slider">
            <div class="swiper-container position-static" data-slide-effect="slide" data-autoheight="false"
                 data-swiper-speed="500" data-swiper-autoplay="10000" data-swiper-margin="0" data-swiper-slides-per-view="4"
                 data-swiper-breakpoints="true" data-swiper-loop="true" >
                
                <div class="swiper-wrapper">
                    <%  ArrayList<City> list = CityDAO.getListCity();
                    for ( int i = 1 ; i < list.size(); i++ ) { %>

                    <div class="swiper-slide">
                        <a class="slider-category" href="#">
                            <div class="blog-image"><img src="<%= list.get(i).getCity_image() %>" alt="Blog Image"></div>

                            <div class="category">
                                <div class="display-table center-text">
                                    <div class="display-table-cell">
                                        <h3><b><%= list.get(i).getCity_name() %></b></h3>
                                    </div>
                                </div>
                            </div>

                        </a>
                    </div><!-- swiper-slide -->
                    <% } %>
                    
                </div><!-- swiper-wrapper -->

            </div><!-- swiper-container -->

        </div><!-- slider -->


    </body>
</html>
