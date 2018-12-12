<%-- 
    Document   : incluCommnet
    Created on : Dec 11, 2018, 1:05:09 PM
    Author     : Admin
--%>

<%@page import="model.Comment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Account"%>
<%@page import="model.Status"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int id = Integer.parseInt(request.getParameter("id"));
            Status s = dao.StatusDAO.getStatusByID(id);
            Account a = dao.LoginAccount.getInfoAccount(s.getUsername());
            String aHientai = (String) session.getAttribute("email");
        %>
        <section class="comment-section center-text">
            <div class="container">
                <h4><b>Bình luận</b></h4>
                <div class="row">

                    <div class="col-lg-2 col-md-0"></div>

                    <div class="col-lg-8 col-md-12">
                        <div class="comment-form">
                            <form method="get" action="UploadComment">
                                <div class="row">
                                    <input type="hidden" value="<%= id%>" name="id">
                                    <input type="hidden" value="<%= aHientai%>" name="email">


                                    <div class="col-sm-12">
                                        <textarea name="content" rows="2" class="text-area-messge form-control"
                                                  placeholder="Nội dung bình luận" aria-required="true" aria-invalid="false"></textarea >
                                    </div><!-- col-sm-12 -->
                                    <div class="col-sm-12">
                                        <button class="submit-btn" type="submit" id="form-submit"><b>Gửi</b></button>
                                    </div><!-- col-sm-12 -->

                                </div><!-- row -->
                            </form>
                        </div><!-- comment-form -->

                        <h4><b>Bình luận trước đó (<%= dao.CommentDAO.demCommentByIDStatus(id)%>)</b></h4>

                        <div class="commnets-area text-left">

                            <% ArrayList<Comment> cmt = dao.CommentDAO.listCommentByIDStatus(id);
                                for (int i = 0; i < cmt.size(); i++) {
                                    Account acmt = dao.LoginAccount.getInfoAccount(cmt.get(i).getAccount_username());
                            %>
                            <div class="commnets-area stext-left">
                                <div class="comment">
                                    <div class="post-info">

                                        <div class="left-area">
                                            <a class="avatar" href="#"><img src="<% if (acmt.getImage() == null) { %>
                                                                                images/default-avatar.jpeg
                                                                            <% } else { %>

                                                                            <%= acmt.getImage() %>
                                                                            <% }%>" alt="Profile Image"></a>
                                        </div>

                                        <div class="middle-area">
                                            <a class="name" href="#"><b><%= acmt.getName()%></b></a>
                                            <h6 class="date">lúc <%= cmt.get(i).getComment_date()%></h6>
                                        </div>

                                        <!--                                        <div class="right-area">
                                                                                    <h5 class="reply-btn" ><a href="#"><b>REPLY</b></a></h5>
                                                                                </div>-->

                                    </div><!-- post-info -->

                                    <p><%= cmt.get(i).getComment_content()%></p>

                                </div>

                            </div><!-- commnets-area -->
                            <% }%>
                            <a class="more-comment-btn" href="#"><b>VIEW MORE COMMENTS</a>

                        </div><!-- col-lg-8 col-md-12 -->

                    </div><!-- row -->

                </div><!-- container -->
        </section>

    </body>
</html>
