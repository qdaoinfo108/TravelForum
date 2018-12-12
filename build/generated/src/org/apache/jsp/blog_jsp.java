package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Like;
import model.Status;
import java.util.ArrayList;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
 ArrayList<Status> list = dao.StatusDAO.getAllStatusTrue();
            String emailHientai = (String) session.getAttribute("email");
        
      out.write("\n");
      out.write("        <section class=\"blog-area section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    ");
 for (int i = 0; i < list.size(); i++) {
                            String img = dao.LoginAccount.getImgAccount(list.get(i).getUsername());
                            String name = dao.LoginAccount.getNameAccount(list.get(i).getUsername());
                            String city = dao.CityDAO.getNameCityInt(list.get(i).getCity());
                            String category = dao.CategoryDAO.getNameCategoryInt(list.get(i).getCategory());
                            int binhluan = dao.CommentDAO.demCommentByIDStatus(list.get(i).getStatus_id());
                            if (list.get(i).getStatus_image().equals("images/status/")) {
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("\n");
      out.write("                            <div class=\"single-post post-style-2 post-style-3\">\n");
      out.write("\n");
      out.write("                                <div class=\"blog-info\">\n");
      out.write("\n");
      out.write("                                    <h6 class=\"pre-title\"><a href=\"#\"><b><span>Danh mục : ");
      out.print( category);
      out.write("<br>Thành phố : ");
      out.print( city);
      out.write(" </span></b></a></h6>\n");
      out.write("\n");
      out.write("                                    <h4 class=\"title\"><a href=\"detialStatus.jsp?id=");
      out.print( list.get(i).getStatus_id());
      out.write("\"><b>");
      out.print( list.get(i).getStatus_title());
      out.write("</b></a></h4>\n");
      out.write("\n");
      out.write("                                    <p>");
      out.print( list.get(i).getStatus_content());
      out.write("</p>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"avatar-area\">\n");
      out.write("                                        <a class=\"avatar\" href=\"#\"><img src=\"");
      out.print( img);
      out.write("\" alt=\"Profile Image\"></a>\n");
      out.write("                                        <div class=\"right-area\">\n");
      out.write("                                            <a class=\"name\" href=\"#\"><b>");
      out.print( name);
      out.write("</b></a>\n");
      out.write("                                            <h6 class=\"date\" href=\"#\">lúc ");
      out.print( list.get(i).getStatus_date());
      out.write("</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <ul class=\"post-footer\">\n");
      out.write("                                        ");
 Like l = dao.LikeDAO.getLike(emailHientai, list.get(i).getStatus_id());
                                            if (l.isCondition() == true) {
      out.write("\n");
      out.write("                                        <li><a href=\"UnLikeController?id=");
      out.print( list.get(i).getStatus_id());
      out.write("&email=");
      out.print( emailHientai);
      out.write("\"><i class=\"ion-heart\"></i>");
      out.print( dao.LikeDAO.demLike(list.get(i).getStatus_id()));
      out.write("</a></li>\n");
      out.write("                                                ");
 } else {
      out.write("\n");
      out.write("                                        <li><a href=\"LikeController?id=");
      out.print( list.get(i).getStatus_id());
      out.write("&email=");
      out.print( emailHientai);
      out.write("\"><i class=\"ion-heart\"></i>");
      out.print( dao.LikeDAO.demLike(list.get(i).getStatus_id()));
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-chatbubble\"></i>");
      out.print( dao.CommentDAO.demCommentByIDStatus(list.get(i).getStatus_id()));
      out.write("</a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-eye\"></i>");
      out.print( list.get(i).getStatus_view());
      out.write("</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </div><!-- blog-right -->\n");
      out.write("\n");
      out.write("                            </div><!-- single-post extra-blog -->\n");
      out.write("\n");
      out.write("                        </div><!-- card -->\n");
      out.write("                    </div><!-- col-lg-4 col-md-6 -->    \n");
      out.write("                    ");
 } else {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                        <div class=\"card h-100\">\n");
      out.write("                            <div class=\"single-post post-style-2\">\n");
      out.write("\n");
      out.write("                                <div class=\"blog-image\"><img src=\"");
      out.print( list.get(i).getStatus_image());
      out.write("\" alt=\"Blog Image\"></div>\n");
      out.write("\n");
      out.write("                                <div class=\"blog-info\">\n");
      out.write("\n");
      out.write("                                    <h6 class=\"pre-title\"><a href=\"#\"><b><span>Danh mục : ");
      out.print( category);
      out.write("<br>Thành phố : ");
      out.print( city);
      out.write(" </span></b></a></h6>\n");
      out.write("\n");
      out.write("                                    <h4 class=\"title\"><a href=\"detialStatus.jsp?id=");
      out.print( list.get(i).getStatus_id());
      out.write("\"><b>");
      out.print( list.get(i).getStatus_title());
      out.write("</b></a></h4>\n");
      out.write("\n");
      out.write("                                    <p>");
      out.print( list.get(i).getStatus_content());
      out.write("</p>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"avatar-area\">\n");
      out.write("                                        <a class=\"avatar\" href=\"#\"><img src=\"");
      out.print( img);
      out.write("\" alt=\"Profile Image\"></a>\n");
      out.write("                                        <div class=\"right-area\">\n");
      out.write("                                            <a class=\"name\" href=\"#\"><b>");
      out.print( name);
      out.write("</b></a>\n");
      out.write("                                            <h6 class=\"date\" href=\"#\"> lúc ");
      out.print( list.get(i).getStatus_date());
      out.write("</h6>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <ul class=\"post-footer\">\n");
      out.write("                                        <li><a href=\"LikeController?id=");
      out.print( list.get(i).getStatus_id());
      out.write("&email=");
      out.print( emailHientai);
      out.write("\"><i class=\"ion-heart\"></i>");
      out.print( dao.LikeDAO.demLike(list.get(i).getStatus_id()));
      out.write("</a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-chatbubble\"></i>");
      out.print( binhluan);
      out.write("</a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-eye\"></i>");
      out.print( list.get(i).getStatus_view());
      out.write("</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                </div><!-- blog-right -->\n");
      out.write("\n");
      out.write("                            </div><!-- single-post extra-blog -->\n");
      out.write("\n");
      out.write("                        </div><!-- card -->\n");
      out.write("                    </div><!-- col-lg-8 col-md-12 -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
 }
                        }
      out.write("\n");
      out.write("                </div><!-- row -->\n");
      out.write("\n");
      out.write("                <a class=\"load-more-btn\" href=\"#\"><b>Tải thêm</b></a>\n");
      out.write("\n");
      out.write("            </div><!-- container -->\n");
      out.write("        </section><!-- section -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
