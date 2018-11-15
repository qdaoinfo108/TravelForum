package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Đăng kí</title>\n");
      out.write("              \n");
      out.write("\t<!-- Stylesheets -->\n");
      out.write("\n");
      out.write("\t<link href=\"common-css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"common-css/swiper.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"common-css/ionicons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<link href=\"front-page-category/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"front-page-category/css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <!-- Main css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"styleLogin/css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main\" style=\"padding-top: 50px; padding-bottom: 50px;\">\n");
      out.write("\n");
      out.write("            <!-- Sign up form -->\n");
      out.write("            <section class=\"signup\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"signup-content\">\n");
      out.write("                        <div class=\"signup-form\">\n");
      out.write("                            <h2 class=\"form-title\">Đăng kí</h2>\n");
      out.write("                            <form method=\"POST\" class=\"register-form\" id=\"register-form\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"name\"><i class=\"zmdi zmdi-account material-icons-name\"></i></label>\n");
      out.write("                                    <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"Họ & tên\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"email\"><i class=\"zmdi zmdi-email\"></i></label>\n");
      out.write("                                    <input type=\"email\" name=\"email\" id=\"email\" placeholder=\"Email đăng nhập\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"pass\"><i class=\"zmdi zmdi-lock\"></i></label>\n");
      out.write("                                    <input type=\"password\" name=\"pass\" id=\"pass\" placeholder=\"Mật khẩu\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"re-pass\"><i class=\"zmdi zmdi-lock-outline\"></i></label>\n");
      out.write("                                    <input type=\"password\" name=\"re_pass\" id=\"re_pass\" placeholder=\"Repeat your password\"/>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"checkbox\" name=\"agree-term\" id=\"agree-term\" class=\"agree-term\" />\n");
      out.write("                                    <label for=\"agree-term\" class=\"label-agree-term\"><span><span></span></span>I agree all statements in  <a href=\"#\" class=\"term-service\">Terms of service</a></label>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group form-button\">\n");
      out.write("                                    <input type=\"submit\" name=\"reg\" id=\"signup\" class=\"form-submit\" value=\"Đăng kí\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"signup-image\">\n");
      out.write("                            <figure><img src=\"styleLogin/images/signup-image.jpg\" alt=\"sing up image\"></figure>\n");
      out.write("                            <a href=\"login.jsp\" class=\"signup-image-link\">Bạn đã có tài khoản</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script src=\"styleLogin/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"styleLogin/js/main.js\"></script>\n");
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
