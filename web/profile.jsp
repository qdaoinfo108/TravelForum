<%-- 
    Document   : profile
    Created on : Nov 15, 2018, 5:38:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang cá nhân</title>

        <link href="common-css/bootstrap.css" rel="stylesheet">

        <link href="common-css/ionicons.css" rel="stylesheet">


        <link href="single-post-1/css/styles.css" rel="stylesheet">

        <link href="single-post-1/css/responsive.css" rel="stylesheet">


        <link href="front-page-category/css/styles.css" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">



    </head>
    <body>
        <jsp:include page="header.jsp"/>


        <div class="slider">
            <div class="display-table  center-text">
                <h1 class="title display-table-cell"><b>Xin chào, user</b></h1>
            </div>
        </div><!-- slider -->


        <section class="post-area section">
            <div class="container">

                <div class="row">

                    <div class="col-lg-8 col-md-12 no-right-padding">

                        <div class="main-post">

                            <div class="blog-post-inner">
                                <h4>Các bài post trước đó :</h4>
                                <div class="post-info">

                                    <div class="left-area">
                                        <a class="avatar" href="#"><img src="images/avatar-1-120x120.jpg" alt="Profile Image"></a>
                                    </div>

                                    <div class="middle-area">
                                        <a class="name" href="#"><b>Katy Liu</b></a>
                                        <h6 class="date">on Sep 29, 2017 at 9:48 am</h6>
                                    </div>

                                </div><!-- post-info -->

                                <h3 class="title"><a href="#"><b>Lưu ý khi đến chợ đêm Đà Lạt !!</b></a></h3>

                                <p class="para">review quán nào ngon quán nào dở bla bla ...</p>

                                <!--                                <div class="post-image"><img src="images/blog-1-1000x600.jpg" alt="Blog Image"></div>-->

                                <p class="para" style="color:red">Chỗ này chạy vòng for rồi phân trang ....
                                Nếu là tài khoản admin thì phải thêm 1 mục duyệt bài</p>
                                  
                            </div><!-- blog-post-inner -->

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

                            <!-- <div class="post-footer post-info">

                                    <div class="left-area">
                                            <a class="avatar" href="#"><img src="images/avatar-1-120x120.jpg" alt="Profile Image"></a>
                                    </div>

                                    <div class="middle-area">
                                            <a class="name" href="#"><b>Katy Liu</b></a>
                                            <h6 class="date">on Sep 29, 2017 at 9:48 am</h6>
                                    </div>

                            </div>post-info -->


                        </div><!-- main-post -->
                    </div><!-- col-lg-8 col-md-12 -->
                    <div class="col-lg-4 col-md-12 no-left-padding">

                        <div class="single-post info-area">

                            <div class="sidebar-area about-area">
                                <h4 class="title"><b>Thông tin tài khoản</b></h4>
                                <p>user : ... </p>
                                <p>Name : .....</p>
                                <p>Loại tài khoản : ....</p>
                            </div>

                            <div class="tag-area">

                                <h4 class="title"><b>Các chức năng khác</b></h4>
                                <ul>
                                    <li><a href="#">Nếu tài khoản admin thì là Duyệt bài</a></li>
                                    
                                </ul>

                            </div><!-- subscribe-area -->
                            
                            <div class="sidebar-area subscribe-area">

                                <h4 class="title"><b>SUBSCRIBE</b></h4>
                                <div class="input-area">
                                    <form>
                                        <input class="email-input" type="text" placeholder="Enter your email">
                                        <button class="submit-btn" type="submit"><i class="icon ion-ios-email-outline"></i></button>
                                    </form>
                                </div>

                            </div><!-- subscribe-area -->

                            

                        </div><!-- info-area -->

                    </div><!-- col-lg-4 col-md-12 -->

                </div><!-- row -->

            </div><!-- container -->
        </section><!-- post-area -->

        <jsp:include page="footer.jsp"/>
    </body>
    <script src="common-js/jquery-3.1.1.min.js"></script>

    <script src="common-js/tether.min.js"></script>

    <script src="common-js/bootstrap.js"></script>

    <script src="common-js/scripts.js"></script>
</html>
