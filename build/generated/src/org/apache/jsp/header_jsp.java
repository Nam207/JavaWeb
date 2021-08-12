package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.user;
import DAO.DAO;
import entity.account;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel ='stylesheet' href='css/header.css'>\n");
      out.write("        <style>\n");
      out.write("            .active {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav .icon {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown {\n");
      out.write("                float: left;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown .dropbtn {\n");
      out.write("                font-size: 17px;    \n");
      out.write("                border: none;\n");
      out.write("                outline: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                background-color: inherit;\n");
      out.write("                font-family: inherit;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content {\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f9f9f9;\n");
      out.write("                min-width: 160px;\n");
      out.write("                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a {\n");
      out.write("                float: none;\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                text-align: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover, .dropdown:hover .dropbtn {\n");
      out.write("                background-color: #555;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown-content a:hover {\n");
      out.write("                background-color: #ddd;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .dropdown:hover .dropdown-content {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .topnav a:not(:first-child), .dropdown .dropbtn {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("                .topnav a.icon {\n");
      out.write("                    float: right;\n");
      out.write("                    display: block;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 600px) {\n");
      out.write("                .topnav.responsive {position: relative;}\n");
      out.write("                .topnav.responsive .icon {\n");
      out.write("                    position: absolute;\n");
      out.write("                    right: 0;\n");
      out.write("                    top: 0;\n");
      out.write("                }\n");
      out.write("                .topnav.responsive a {\n");
      out.write("                    float: none;\n");
      out.write("                    display: block;\n");
      out.write("                    text-align: left;\n");
      out.write("                }\n");
      out.write("                .topnav.responsive .dropdown {float: none;}\n");
      out.write("                .topnav.responsive .dropdown-content {position: relative;}\n");
      out.write("                .topnav.responsive .dropdown .dropbtn {\n");
      out.write("                    display: block;\n");
      out.write("                    width: 100%;\n");
      out.write("                    text-align: left;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
HttpSession ses = request.getSession();
            Object a = ses.getAttribute("account");
        
      out.write("\n");
      out.write("        <div class=\"header1\" style=\"background-color: black\">\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    ");
if (a == null) {
      out.write("\n");
      out.write("                    <li><a href=\"login.jsp\"> Đăng nhập</a></li>\n");
      out.write("                        ");
} else {
                            account acc = (account) a;
                            user u = (user) ses.getAttribute("user");
                        
      out.write("\n");
      out.write("                    <li><a href=\"LogOutControl\"> Đăng xuất</a></li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <button class=\"dropbtn\">Hello ");
      out.print(u.getLastName());
      out.write("\n");
      out.write("                            <i class=\"fa fa-caret-down\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            ");
if (acc.isAdmin()) {
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ManagerUserControl\">Quản lý Tài khoản</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ManagerProductControl\">Quản lý Sản Phẩm</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Đơn hàng</a>\n");
      out.write("                            ");
} else {
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ManagerUserControl\">Quản lý Tài khoản</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Lịch sử mua</a>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <li><a href=\"contact.jsp\"> Tìm cửa hàng</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header2\">\n");
      out.write("            <div>\n");
      out.write("                <div class=\"left\" style=\"margin-left: 100px\">\n");
      out.write("                    <a href=\"HomeControl\"><img src=\"image/logo.png\" style=\"width:100%;height: 50%;\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left\" style=\"margin-left: 100px;margin-top: 50px\">\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li><a href=\"CategoryControl?cate=2\">Sale Off</a></li>\n");
      out.write("                        <li><a href=\"CategoryControl?gender=0\">Nữ</a></li>\n");
      out.write("                        <li><a href=\"CategoryControl?gender=1\">Nam</a></li>\n");
      out.write("                        <li><a href=\"ProductListControl\">Sản phẩm</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\" style=\"margin-right: 20px\">\n");
      out.write("                    <form class=\"example\" action=\"SearchControl\" style=\"margin: 40px\" method=\"post\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search..\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtSearch}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                        <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.admin != true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a href=\"CartControl\"> Giỏ hàng</a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
