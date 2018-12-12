<%-- 
    Document   : statusFalseAccount
    Created on : Dec 10, 2018, 3:03:40 PM
    Author     : Admin
--%>
<%@page import="model.History"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Status"%>
<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách thanh toán</title>
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
                        <div class="container" style="text-align: left">
                            <h2>Thanh toán</h2>
                            <p>Danh sách lượt view của bạn</p>            
                            <table class="table table-striped">
                                <thead>
                                    <tr>
                                        <th>Ngày thanh toán</th>
                                        <th>Tổng lượt xem</th>
                                        <th>Số tiền</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%  ArrayList<History> listH = dao.HistoryDAO.getListHistory(email);
                                        for (int i = 0; i < listH.size(); i++) {%>
                                    <tr>
                                        <td><%= listH.get(i).getDate()%></td>
                                        <td><%= listH.get(i).getViewTotal()%></td>
                                        <td><%= listH.get(i).getMoney()* 5%></td>
                                    </tr>
                                    <% }%>
                                </tbody>
                            </table>
                        </div>
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