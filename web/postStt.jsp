<%-- 
    Document   : postStt
    Created on : Nov 16, 2018, 9:01:53 AM
    Author     : Admin
--%>

<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.City"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <% String email = (String) session.getAttribute("email");
        if (email != null){
        %>
        
        <section class="comment-section">
            <div class="container">
                <div class="row">

                    <div class="col-lg-12 col-md-12">
                        <div class="comment-form">
                            <form method="post" action="UploadStatus" enctype="multipart/form-data">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <input name="title"  class="text-area-messge form-control"
                                                  placeholder="Tiêu đề"  >
                                    </div>
                                    <input type="hidden" name="account_username" value="<%= email %>" >
                                    <div class="col-sm-12">
                                        <textarea name="status_content" rows="2" class="text-area-messge form-control"
                                                  placeholder="Cập nhật bài viết" aria-required="true" aria-invalid="false" ></textarea >
                                    </div><!-- col-sm-12 -->
                                    <div class="col-sm-12">
                                        <div class="col-sm-4">
                                            <div class="container">
                                                <!-- bootstrap-imageupload. -->
                                                <div class="imageupload panel panel-default">

                                                    <label class="btn btn-primary btn-file">
                                                        <!-- The file is stored here. -->
                                                        <input type="file" name="file">
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-sm-4">
                                            <div class="form-group form-group" style="padding :5px">
                                                <% ArrayList<City> city = dao.CityDAO.getListCity(); %>
                                                <select class="form-control form-control-lg" name="city">
                                                    <option value="" selected disabled hidden>Chọn thành phố</option>
                                                    <% for (int i = 0; i < city.size(); i++) {%>
                                                    <option value="<%= city.get(i).getCity_id()%>"><%= city.get(i).getCity_name()%></option>

                                                    <% }%>
                                                </select>
                                            </div>
                                        </div>

                                        <div class="col-sm-4">
                                            <div class="form-group form-group" style="padding :5px" >
                                                <% ArrayList<Category> category = dao.CategoryDAO.getListCategory(); %>
                                                <select class="form-control form-control-lg" name="category">
                                                    <option value="" selected disabled hidden>Chọn danh mục</option>
                                                    <% for (int i = 0; i < city.size(); i++) {%>
                                                    <option value="<%= category.get(i).getCategory_id() %>"><%= category.get(i).getCategory_name() %></option>
                                                    <% }%>

                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-sm-12">
                                        <button class="submit-btn" type="submit" id="form-submit"><b>Đăng</b></button>
                                    </div><!-- col-sm-12 -->

                                </div><!-- row -->
                            </form>
                        </div><!-- comment-form -->
                    </div>
                </div>
            </div>
        </section>
<% } else { } %>
    </body>
    <script>
        var $imageupload = $('.imageupload');
        $imageupload.imageupload();

    </script>
</html>
