<%-- 
    Document   : testUpload
    Created on : Dec 5, 2018, 3:57:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>

        <form action="ChangeInfoAccount" method="POST" enctype="multipart/form-data">
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


            <button type="submit" class="btn btn-primary">Lưu</button>
        </form>

    </body>

</html>