<%-- 
    Document   : changeinfo
    Created on : Dec 5, 2018, 3:07:50 PM
    Author     : Admin
--%>

<%@page import="model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thay đổi thông tài khoản</title>

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

        %>
        <section class="post-area section">
            <div class="container">

                <div class="row">

                    <div class="col">
                        <% if (request.getAttribute("messageChange") == null) {%>
                        <form action="ChangeInfoAccount" method="post" enctype="multipart/form-data">
                            <div class="center-area" style="margin: 0 auto; width: 70px; height: 70px; overflow: hidden; z-index: 10;
                                 border-radius: 100px; position: relative; border: 7px solid #fff; box-shadow: 0px 0px 10px rgba(0,0,0,.2);">
                                <a class="" href="#"><img src="images/default-avatar.jpeg" alt="Profile Image"></a>
                            </div>
                            <br>
                            <center>
                                <span>Thay đổi ảnh đại diện</span>

                                <div class="container">
                                    <!-- bootstrap-imageupload. -->
                                    <div class="imageupload panel panel-default">

                                        <label class="btn btn-primary btn-file">
                                            <!-- The file is stored here. -->
                                            <input type="file" name="file">
                                        </label>
                                    </div>
                                </div>
                            </center>
                            <div class="form-group">
                                <label for="exampleInputEmail1">Email của bạn</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="<%= email%>" disabled="true">
                                    <input type="hidden" name="account_username" value="<%= email%>">
                                <small id="emailHelp" class="form-text text-muted">Thông tin này không thể thay đổi.</small>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Mật khẩu</label>
                                <input type="password" name="account_password" class="form-control" id="pass1" placeholder="Mật khẩu mới">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Nhập lại mật khẩu</label>
                                <input type="password" name="account_password2" class="form-control" id="pass2" placeholder="Mật khẩu mới">
                            </div>
                            <div class="form-group">
                                <label for="">Tên :</label>
                                <input type="text" name="account_name" class="form-control" id="exampleInputPassword1" placeholder="<%= session.getAttribute("sessionname")%>">
                            </div>

                            <button type="submit" class="btn btn-primary">Lưu</button>
                        </form>
                        <% } else {%>

                        <h2> <%= request.getAttribute("messageChange")%></h2>
                        <% }%>
                    </div><!-- col-lg-4 col-md-12 -->

                </div><!-- row -->

            </div><!-- container -->
        </section><!-- post-area -->

        <jsp:include page="footer.jsp"/>
    </body>
    <script language="javascript">
        var password = document.getElementById("pass1")
                , confirm_password = document.getElementById("pass2");

        function validatePassword() {

            if (password.value != confirm_password.value) {
                confirm_password.setCustomValidity("Mật khẩu không trùng");
            } else {
                confirm_password.setCustomValidity('');
            }

        }

        password.onchange = validatePassword;
        confirm_password.onkeyup = validatePassword;
    </script>
    <script>
        var $imageupload = $('.imageupload');
        $imageupload.imageupload();

    </script>
</html>
