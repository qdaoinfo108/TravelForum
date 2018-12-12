<%-- 
    Document   : reg
    Created on : Nov 15, 2018, 4:57:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng nhập</title>

        <!-- Stylesheets -->
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
                            <a href="reg.jsp" class="signup-image-link">Tạo tài khoản</a><a href="forgetAccount.jsp" class="signup-image-link">Quên mật khẩu</a>
                        </div>

                        <div class="signin-form">
                            <h2 class="form-title">Đăng nhập</h2>
                            <form method="POST" action="LoginAccount" class="register-form" id="login-form">
                                
                                <% if(request.getAttribute("msglogin")==null){ %> 
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="account_username" id="your_name" placeholder="Email"/>
                                </div>
                                <div class="form-group">
                                    <label for="your_pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="account_password" id="your_pass" placeholder="Mật khẩu"/>
                                </div>
                                
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Đăng nhập"/>
                                </div>
                                <% } else { %> 
                                
                                <div class="form-group">
                                    <p style="color: red"><%= request.getAttribute("msglogin") %> </p>
                                </div>
                                <div class="form-group">
                                    <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="account_username" id="your_name" placeholder="Email"/>
                                </div>
                                <div class="form-group">
                                    <label for="your_pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="account_password" id="your_pass" placeholder="Mật khẩu"/>
                                </div>
                                
                                <div class="form-group form-button">
                                    <input type="submit" name="signin" id="signin" class="form-submit" value="Đăng nhập"/>
                                </div>
                                <% } %>
                            </form>
                            <div class="social-login">
                                <span class="social-label">Or login with</span>
                                <ul class="socials">
                                    <li><a href="#"><i class="display-flex-center zmdi zmdi-facebook"></i></a></li>
                                    <li><a href="#"><i class="display-flex-center zmdi zmdi-twitter"></i></a></li>
                                    <li><a href="#"><i class="display-flex-center zmdi zmdi-google"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>

        <jsp:include page="footer.jsp"/>

    </body>
    <script src="styleLogin/vendor/jquery/jquery.min.js"></script>
    <script src="styleLogin/js/main.js"></script>
</html>
