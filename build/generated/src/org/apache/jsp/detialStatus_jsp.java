package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;
import model.Status;

public final class detialStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
 
    int id = Integer.parseInt(request.getParameter("id"));
    dao.StatusDAO.tangView(id);
    Status s = dao.StatusDAO.getStatusByID(id);
    Account a = dao.LoginAccount.getInfoAccount(s.getUsername());

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>");
      out.print( s.getStatus_title());
      out.write("</title>\n");
      out.write("\n");
      out.write("        <!-- Stylesheets -->\n");
      out.write("\n");
      out.write("        <link href=\"common-css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"common-css/ionicons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"single-post-3/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"single-post-3/css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
 if (s.getStatus_image().equals("images/status/")){ 
      out.write("\n");
      out.write("        <div class=\"slider center-text\" style=\"height: 600px; width: 100%; background-size: cover; position: relative; z-index: 1;\n");
      out.write("             background-image: url(../../TravelForum/images/default-banner.jpg); color: #fff;\"> \n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            <div class=\"slider center-text\" style=\"height: 600px; width: 100%; background-size: cover; position: relative; z-index: 1;\n");
      out.write("                 background-image: url(../../TravelForum/");
      out.print( s.getStatus_image() );
      out.write("); color: #fff;\"> ");
 } 
      out.write("\n");
      out.write("                <div class=\"container height-100\">\n");
      out.write("                    <div class=\"row height-100\" >\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-1 hidden-md-down\"></div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-10 col-md-12\">\n");
      out.write("                            <div class=\"display-table\">\n");
      out.write("                                <div class=\"display-table-cell\">\n");
      out.write("                                    <h5 class=\"pre-title\">FASHION</h5>\n");
      out.write("\n");
      out.write("                                    <h3 class=\"title\"><a href=\"#\"><b>");
      out.print( s.getStatus_title());
      out.write("</b></a></h3>\n");
      out.write("\n");
      out.write("                                    <div class=\"post-info\">\n");
      out.write("\n");
      out.write("                                        <div class=\"left-area\">\n");
      out.write("                                            <a class=\"avatar\" href=\"#\"><img src=\"");
if (a.getImage() == null) { 
      out.write(" images/default-avatar.jpeg ");
 } else {
      out.write(' ');
      out.print( a.getImage());
      out.write(' ');
 }
      out.write("\" alt=\"Profile Image\"></a>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"middle-area\">\n");
      out.write("                                            <a class=\"name\" href=\"#\"><b>");
      out.print( a.getName());
      out.write("</b></a>\n");
      out.write("                                            <h6 class=\"date\">lúc ");
      out.print( s.getStatus_date());
      out.write("</h6>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div><!-- post-info -->\n");
      out.write("\n");
      out.write("                                </div><!-- display-table-cell -->\n");
      out.write("                            </div><!-- display-table -->\n");
      out.write("\n");
      out.write("                        </div><!-- col-lg-10 -->\n");
      out.write("                    </div><!-- row -->\n");
      out.write("                </div><!-- conatiner -->\n");
      out.write("            </div><!-- slider -->\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-1\"></div>\n");
      out.write("                    <div class=\"col-md-10\">\n");
      out.write("\n");
      out.write("                        <div class=\"main-post\">\n");
      out.write("\n");
      out.write("                            <div class=\"post-bottom-area\">\n");
      out.write("\n");
      out.write("                                <p class=\"para\">");
      out.print( s.getStatus_content() );
      out.write("</p>\n");
      out.write("\n");
      out.write("                                <ul class=\"tags\">\n");
      out.write("                                    <li><a href=\"#\">");
      out.print( dao.CategoryDAO.getNameCategoryInt(s.getCategory()) );
      out.write("</a></li>\n");
      out.write("                                    <li><a href=\"#\">");
      out.print( dao.CityDAO.getNameCityInt(s.getCity()) );
      out.write("</a></li>\n");
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                                <div class=\"post-icons-area\">\n");
      out.write("                                    <ul class=\"post-icons\">\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-heart\"></i>57</a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-chatbubble\"></i>6</a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-eye\"></i>138</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("\n");
      out.write("                                    <ul class=\"icons\">\n");
      out.write("                                        <li>SHARE : </li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-social-facebook\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-social-twitter\"></i></a></li>\n");
      out.write("                                        <li><a href=\"#\"><i class=\"ion-social-pinterest\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <!-- something -->\n");
      out.write("\n");
      out.write("                            </div><!-- post-bottom-area -->\n");
      out.write("\n");
      out.write("                        </div><!-- main-post -->\n");
      out.write("\n");
      out.write("                    </div><!-- col-md-10 -->\n");
      out.write("\n");
      out.write("                </div><!-- row -->\n");
      out.write("\n");
      out.write("            </div><!-- container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        </section><!-- post-area -->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "incluCommnet.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("</body>\n");
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
