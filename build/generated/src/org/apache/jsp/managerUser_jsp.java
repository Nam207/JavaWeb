package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Manager Account</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("        <div class=\"well\" style=\"clear: both\">\n");
      out.write("            <ul class=\"nav nav-tabs\">\n");
      out.write("                <li class=\"active\"><a href=\"#home\" data-toggle=\"tab\">Profile</a></li>\n");
      out.write("                <li><a href=\"#tab2\" data-toggle=\"tab\">Password</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div id=\"myTabContent\" class=\"tab-content\">\n");
      out.write("                <div class=\"tab-pane active in\" id=\"home\">\n");
      out.write("                    <form id=\"tab\">\n");
      out.write("                        <label>Username</label>\n");
      out.write("                        <input type=\"text\" value=\"jsmith\" class=\"input-xlarge\">\n");
      out.write("                        <label>First Name</label>\n");
      out.write("                        <input type=\"text\" value=\"John\" class=\"input-xlarge\">\n");
      out.write("                        <label>Last Name</label>\n");
      out.write("                        <input type=\"text\" value=\"Smith\" class=\"input-xlarge\">\n");
      out.write("                        <label>Email</label>\n");
      out.write("                        <input type=\"text\" value=\"jsmith@yourcompany.com\" class=\"input-xlarge\">\n");
      out.write("                        <label>Address</label>\n");
      out.write("                        <textarea value=\"Smith\" rows=\"3\" class=\"input-xlarge\">2817 S 49th\n");
      out.write("    Apt 314\n");
      out.write("    San Jose, CA 95101\n");
      out.write("                        </textarea>\n");
      out.write("                        <label>Time Zone</label>\n");
      out.write("                        <select name=\"DropDownTimezone\" id=\"DropDownTimezone\" class=\"input-xlarge\">\n");
      out.write("                            <option value=\"-12.0\">(GMT -12:00) Eniwetok, Kwajalein</option>\n");
      out.write("                            <option value=\"-11.0\">(GMT -11:00) Midway Island, Samoa</option>\n");
      out.write("                            <option value=\"-10.0\">(GMT -10:00) Hawaii</option>\n");
      out.write("                            <option value=\"-9.0\">(GMT -9:00) Alaska</option>\n");
      out.write("                            <option selected=\"selected\" value=\"-8.0\">(GMT -8:00) Pacific Time (US & Canada)</option>\n");
      out.write("                            <option value=\"-7.0\">(GMT -7:00) Mountain Time (US & Canada)</option>\n");
      out.write("                            <option value=\"-6.0\">(GMT -6:00) Central Time (US & Canada), Mexico City</option>\n");
      out.write("                            <option value=\"-5.0\">(GMT -5:00) Eastern Time (US & Canada), Bogota, Lima</option>\n");
      out.write("                            <option value=\"-4.0\">(GMT -4:00) Atlantic Time (Canada), Caracas, La Paz</option>\n");
      out.write("                            <option value=\"-3.5\">(GMT -3:30) Newfoundland</option>\n");
      out.write("                            <option value=\"-3.0\">(GMT -3:00) Brazil, Buenos Aires, Georgetown</option>\n");
      out.write("                            <option value=\"-2.0\">(GMT -2:00) Mid-Atlantic</option>\n");
      out.write("                            <option value=\"-1.0\">(GMT -1:00 hour) Azores, Cape Verde Islands</option>\n");
      out.write("                            <option value=\"0.0\">(GMT) Western Europe Time, London, Lisbon, Casablanca</option>\n");
      out.write("                            <option value=\"1.0\">(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris</option>\n");
      out.write("                            <option value=\"2.0\">(GMT +2:00) Kaliningrad, South Africa</option>\n");
      out.write("                            <option value=\"3.0\">(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg</option>\n");
      out.write("                            <option value=\"3.5\">(GMT +3:30) Tehran</option>\n");
      out.write("                            <option value=\"4.0\">(GMT +4:00) Abu Dhabi, Muscat, Baku, Tbilisi</option>\n");
      out.write("                            <option value=\"4.5\">(GMT +4:30) Kabul</option>\n");
      out.write("                            <option value=\"5.0\">(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent</option>\n");
      out.write("                            <option value=\"5.5\">(GMT +5:30) Bombay, Calcutta, Madras, New Delhi</option>\n");
      out.write("                            <option value=\"5.75\">(GMT +5:45) Kathmandu</option>\n");
      out.write("                            <option value=\"6.0\">(GMT +6:00) Almaty, Dhaka, Colombo</option>\n");
      out.write("                            <option value=\"7.0\">(GMT +7:00) Bangkok, Hanoi, Jakarta</option>\n");
      out.write("                            <option value=\"8.0\">(GMT +8:00) Beijing, Perth, Singapore, Hong Kong</option>\n");
      out.write("                            <option value=\"9.0\">(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk</option>\n");
      out.write("                            <option value=\"9.5\">(GMT +9:30) Adelaide, Darwin</option>\n");
      out.write("                            <option value=\"10.0\">(GMT +10:00) Eastern Australia, Guam, Vladivostok</option>\n");
      out.write("                            <option value=\"11.0\">(GMT +11:00) Magadan, Solomon Islands, New Caledonia</option>\n");
      out.write("                            <option value=\"12.0\">(GMT +12:00) Auckland, Wellington, Fiji, Kamchatka</option>\n");
      out.write("                        </select>\n");
      out.write("                        <div>\n");
      out.write("                            <button class=\"btn btn-primary\">Update</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tab-pane fade\" id=\"profile\">\n");
      out.write("                    <form id=\"tab2\">\n");
      out.write("                        <label>New Password</label>\n");
      out.write("                        <input type=\"password\" class=\"input-xlarge\">\n");
      out.write("                        <div>\n");
      out.write("                            <button class=\"btn btn-primary\">Update</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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
