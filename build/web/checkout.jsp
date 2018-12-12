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
        <title>Thanh toán</title>
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
            String img = dao.LoginAccount.getImgAccount(email);

            ArrayList<Status> listTrue = dao.StatusDAO.getAllStatusTrueByAccount(email);
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
                                        <th>Tiêu đề</th>
                                        <th>Lượt xem</th>
                                        <th>Thành tiền</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%  int tongview = dao.StatusDAO.tinhTongView2(email) * 5;
                                        for (int i = 0; i < listTrue.size(); i++) {%>
                                    <tr>
                                        <td><%= listTrue.get(i).getStatus_title()%></td>
                                        <td><%= listTrue.get(i).getStatus_view2()%></td>
                                        <td><%= listTrue.get(i).getStatus_view2() * 5%></td>
                                    </tr>
                                    <% }%>
                                </tbody>
                            </table>
                        </div>
                                    <h3 style="text-align: center">Thành tiền : <%= tongview %> <span>VNĐ</span></h3>
                                    <button class="alert-success" ><a href="SaveMoney?total=<%= email %>">Thanh toán</a></button>
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