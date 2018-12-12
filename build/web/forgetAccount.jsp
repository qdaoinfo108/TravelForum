<%-- 
    Document   : forgetAccount
    Created on : Nov 29, 2018, 2:28:46 PM
    Author     : Admin
--%>

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
                            <h2 class="form-title">Quên mật khẩu</h2>
                            <form method="POST" action="ForgetAccount" class="register-form" id="login-form">
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="account_username" id="your_name" placeholder="Nhập email của bạn"/>
                                </div>
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Gửi"/>
                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </section>
        </div>

        <jsp:include page="footer.jsp"/>


    </body>
</html>
