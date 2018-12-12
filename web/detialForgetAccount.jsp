<%-- 
    Document   : forgetAccount
    Created on : Nov 29, 2018, 2:28:46 PM
    Author     : Admin
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Timestamp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quên tài khoản</title>
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500" rel="stylesheet">

        <link href="common-css/bootstrap.css" rel="stylesheet">

        <link href="common-css/swiper.css" rel="stylesheet">

        <link href="common-css/ionicons.css" rel="stylesheet">


        <link href="front-page-category/css/styles.css" rel="stylesheet">

        <link href="front-page-category/css/responsive.css" rel="stylesheet">


        <!-- Main css -->
        <link rel="stylesheet" href="styleLogin/css/style.css">
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <% if (request.getAttribute("msgchagnepass") == null ){ %>
        <%
            String sUrl = request.getParameter("forget_url");
            long soMin = dao.LoginAccount.sosanhDate(sUrl);
            if (soMin <= 30) {
        %>
        <div class="main" style="padding-top: 50px; padding-bottom: 50  px;">

            <!-- Sign up form -->
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="styleLogin/images/signin-image.jpg" alt="sing up image"></figure>
                            <a href="login.jsp" class="signup-image-link">Đăng nhập</a>
                        </div>
                        <% String email = dao.LoginAccount.showEmail(sUrl);%>
                        <div class="signin-form">
                            <h2 class="form-title">Quên mật khẩu</h2>
                            <p>Email của bạn :<span style="color: red;   "><%= email%></span></p></br>
                            <form method="POST" action="ForgetChagePass?forget_url=<%=sUrl %>" class="register-form" id="login-form">
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="password" name="account_password1" id="pass1" placeholder="Nhập mật khẩu mới"/>
                                </div>
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="password" name="account_password2" id="pass2" placeholder="Nhập mật khẩu mới"/>
                                </div>
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Xác nhận"/>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </section>
        </div>
        <% } else { %>

        <div class="main" style="padding-top: 50px; padding-bottom: 50  px;">

            <!-- Sign up form -->
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="styleLogin/images/signin-image.jpg" alt="sing up image"></figure>
                            <a href="login.jsp" class="signup-image-link">Đăng nhập</a>
                        </div>

                        <div class="signin-form">
                            <h2 class="form-title">Xin lỗi, liên kết đã hế hạn.</h2>
                            <h3><a href="forgetAccount.jsp">Bấm lại đây để lấy lại mật khẩu </a</h3>

                        </div>
                    </div>
                </div>
            </section>
        </div>
        <% } } else {%>
        <div class="main" style="padding-top: 50px; padding-bottom: 50  px;">

            <!-- Sign up form -->
            <section class="sign-in">
                <div class="container">
                    <div class="signin-content">
                        <div class="signin-image">
                            <figure><img src="styleLogin/images/signin-image.jpg" alt="sing up image"></figure>
                            <a href="login.jsp" class="signup-image-link">Đăng nhập</a>
                        </div>

                        <div class="signin-form">
                            <h2 class="form-title" style="color: red;">Thay đổi mật khẩu thành công.</h2>
                            <h3><a href="login.jsp">Bấm lại đây để đăng nhập </a</h3>

                        </div>
                    </div>
                </div>
            </section>
        </div>
        
        <% } %>
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
</html>
