package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CityDAO;
import model.City;
import java.util.ArrayList;

public final class banner_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main-slider\">\n");
      out.write("            <div class=\"swiper-container position-static\" data-slide-effect=\"slide\" data-autoheight=\"false\"\n");
      out.write("                 data-swiper-speed=\"500\" data-swiper-autoplay=\"10000\" data-swiper-margin=\"0\" data-swiper-slides-per-view=\"4\"\n");
      out.write("                 data-swiper-breakpoints=\"true\" data-swiper-loop=\"true\" >\n");
      out.write("                \n");
      out.write("                <div class=\"swiper-wrapper\">\n");
      out.write("                    ");
  ArrayList<City> list = CityDAO.getListCity();
                    for ( int i = 1 ; i < list.size(); i++ ) { 
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"swiper-slide\">\n");
      out.write("                        <a class=\"slider-category\" href=\"#\">\n");
      out.write("                            <div class=\"blog-image\"><img src=\"");
      out.print( list.get(i).getCity_image() );
      out.write("\" alt=\"Blog Image\"></div>\n");
      out.write("\n");
      out.write("                            <div class=\"category\">\n");
      out.write("                                <div class=\"display-table center-text\">\n");
      out.write("                                    <div class=\"display-table-cell\">\n");
      out.write("                                        <h3><b>");
      out.print( list.get(i).getCity_name() );
      out.write("</b></h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                    </div><!-- swiper-slide -->\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    \n");
      out.write("                </div><!-- swiper-wrapper -->\n");
      out.write("\n");
      out.write("            </div><!-- swiper-container -->\n");
      out.write("\n");
      out.write("        </div><!-- slider -->\n");
      out.write("\n");
      out.write("\n");
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
