package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Travel forum | TMDT</title>\n");
      out.write("        \n");
      out.write("        <!-- Font -->\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500\" rel=\"stylesheet\">\n");
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
      out.write("        <link href=\"common-css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"common-css/ionicons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<link href=\"single-post-1/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<link href=\"single-post-1/css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "postStt.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blog.jsp", out, false);
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                \n");
      out.write("\t<script src=\"common-js/jquery-3.1.1.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"common-js/tether.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"common-js/bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"common-js/swiper.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"common-js/scripts.js\"></script>\n");
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
