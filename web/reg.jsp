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
        <title>Đăng kí</title>
              
	<!-- Stylesheets -->

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

        <div class="main" style="padding-top: 50px; padding-bottom: 0px;">

            <!-- Sign up form -->
            <section class="signup">
                <div class="container">
                    <div class="signup-content">
                        <div class="signup-form">
                            <h2 class="form-title">Đăng kí</h2>
                            <form method="POST" class="register-form" id="register-form">
                                <div class="form-group">
                                    <label for="name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                    <input type="text" name="name" id="name" placeholder="Họ & tên"/>
                                </div>
                                <div class="form-group">
                                    <label for="email"><i class="zmdi zmdi-email"></i></label>
                                    <input type="email" name="email" id="email" placeholder="Email đăng nhập"/>
                                </div>
                                <div class="form-group">
                                    <label for="pass"><i class="zmdi zmdi-lock"></i></label>
                                    <input type="password" name="pass" id="pass" placeholder="Mật khẩu"/>
                                </div>
                                <div class="form-group">
                                    <label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
                                    <input type="password" name="re_pass" id="re_pass" placeholder="Repeat your password"/>
                                </div>
                                <div class="form-group">
                                    <input type="checkbox" name="agree-term" id="agree-term" class="agree-term" />
                                    <label for="agree-term" class="label-agree-term"><span><span></span></span>I agree all statements in  <a href="#" class="term-service">Terms of service</a></label>
                                </div>
                                <div class="form-group form-button">
                                    <input type="submit" name="reg" id="signup" class="form-submit" value="Đăng kí"/>
                                </div>
                            </form>
                        </div>
                        <div class="signup-image">
                            <figure><img src="styleLogin/images/signup-image.jpg" alt="sing up image"></figure>
                            <a href="login.jsp" class="signup-image-link">Bạn đã có tài khoản</a>
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
