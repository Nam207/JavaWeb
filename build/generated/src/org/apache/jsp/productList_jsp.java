package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.user;
import DAO.DAO;
import entity.account;

public final class productList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/productList.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            img.wp-smiley,\n");
      out.write("            img.emoji {\n");
      out.write("                display: inline !important;\n");
      out.write("                border: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                height: 1em !important;\n");
      out.write("                width: 1em !important;\n");
      out.write("                margin: 0 .07em !important;\n");
      out.write("                vertical-align: -0.1em !important;\n");
      out.write("                background: none !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel='stylesheet' id='wp-block-library-css'  href='https://ananas.vn/wp-includes/css/dist/block-library/style.min.css?ver=5.2' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='dashicons-css'  href='https://ananas.vn/wp-includes/css/dashicons.min.css?ver=5.2' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-bootstrap-css-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/bootstrap.min.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-ie10-viewport-bug-workaround-css-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/ie10-viewport-bug-workaround.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-jquery-simple-mobilemenu-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/jquery-simple-mobilemenu.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-slick-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/slick.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-slick-theme-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/slick-theme.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-bootstrap-select-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/bootstrap-select.min.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-jBox-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/jBox.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='fe-style-css'  href='https://ananas.vn/wp-content/themes/ananas/fe-assets/css/style.css?ver=1.0.0.6' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='ananas-style-css'  href='https://ananas.vn/wp-content/themes/ananas/style.css?ver=5.2' type='text/css' media='all' />\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .productList .card .btn-block {\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .productList .card .btn-success {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: #28a745;\n");
      out.write("                border-color: #28a745;\n");
      out.write("            }\n");
      out.write("            .productList .card .btn {\n");
      out.write("                background-color: red; /* màu của Quản trị mạng ^^ */\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px 7px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Product List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
HttpSession ses=request.getSession();
        Object a =ses.getAttribute("account");
        
      out.write("\n");
      out.write("        <div class=\"header1\" style=\"background-color: black\">\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <ul class=\"menu\">\n");
      out.write("                    <li>\n");
      out.write("                        ");
if (a == null) {
      out.write("\n");
      out.write("                            <a href=\"login.jsp\"> Giỏ hàng</a>\n");
      out.write("                        ");
} else {
      out.write("\n");
      out.write("                        <a href=\"CartControl\"> Giỏ hàng</a>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                    ");
if (a == null) {
      out.write("\n");
      out.write("                        <li><a href=\"login.jsp\"> Đăng nhập</a></li>\n");
      out.write("                    ");
} else {
                        account acc = (account) a;
                        user u = (user) ses.getAttribute("user");
                    
      out.write("\n");
      out.write("                        <li><a href=\"LogOutControl\"> Đăng xuất</a></li>\n");
      out.write("                        <li><a href=\"ManagerUserControl\"> Quản lý Tài khoản</a></li>\n");
      out.write("                        <li><a href=\"#\">Hello ");
      out.print(u.getLastName());
      out.write("</a></li>\n");
      out.write("                        ");
if (acc.isAdmin()) {
      out.write("\n");
      out.write("                            <li><a href=\"ManagerProductControl\"> Quản lý Sản Phẩm</a></li>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <li><a href=\"\"> Tìm cửa hàng</a></li>\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"productList\" style=\"clear: both\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <ul class=\"menu\">\n");
      out.write("                        <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagGender == 0 ? \"active2\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?gender=0\">Nữ</a></li>&nbsp;\n");
      out.write("                        <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagGender == 1 ? \"active2\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?gender=1\">Nam</a></li>&nbsp;\n");
      out.write("                        <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagGender != 0 && tagGender != 1 ? \"active2\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"ProductListControl\">Tất cả</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br><br>\n");
      out.write("                    <ul class=\"menu2\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"title\">Trạng thái</li>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <br><br>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"title\">Dòng sản phẩm</li>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <br><br>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"title\">Giá</li>\n");
      out.write("                            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagPrice == 0 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?price=0\"><200k</a></li>\n");
      out.write("                            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagPrice == 200 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?price=200\">200k-400k</a></li>\n");
      out.write("                            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagPrice == 400 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?price=400\">400k-800k</a></li>\n");
      out.write("                            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagPrice == 800 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?price=800\">800k-1.600k</a></li>\n");
      out.write("                            <li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagPrice == 1600 ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a href=\"CategoryControl?price=1600\">>1.600k</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <br><br>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"title\">Size</li>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                        <br><br>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"title\">Màu sắc</li>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right\">\n");
      out.write("                    <div>\n");
      out.write("                        <img src=\"image/desktop_productlist.jpg\" style=\"width: 850px;margin-right: 5%\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <form action=\"CheckOutControl\" method=\"post\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"pagination\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"footer\" style=\"clear: both; background-color: #4f5b66\">\n");
      out.write("            <div style=\"background-color: #4f5b66\">\n");
      out.write("            <div class=\"left\" style=\"background-color: #4f5b66\">\n");
      out.write("                <div>\n");
      out.write("                    <h3>NAMShop - MUA SẮM VÀ BÁN HÀNG ONLINE ĐƠN GIẢN, NHANH CHÓNG VÀ AN TOÀN</h3>\n");
      out.write("                    <h3>NAMShop - MUA BÁN ONLINE MỌI LÚC, MỌI NƠI</h3>\n");
      out.write("                    <h3>NAMShop - MUA HÀNG CHÍNH HÃNG TỪ CÁC THƯƠNG HIỆU LỚN</h3>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"image/icon_bocongthuong.png\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"right\" style=\"background-color: #4f5b66\">\n");
      out.write("                <div>\n");
      out.write("                    <div class=\"left2\">\n");
      out.write("                        <a href=\"ProductListControl\"><h4>SẢN PHẨM</h4></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"CategoryControl?gender=1\">Giày Nam</a></li>\n");
      out.write("                            <li><a href=\"CategoryControl?gender=0\">Giày Nữ</a></li>\n");
      out.write("                            <li><a href=\"CategoryControl?cate=2\">Sale-off</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"left2\">\n");
      out.write("                        <a href=\"\"><h4>LIÊN HỆ VÀ HỖ TRỢ</h4></a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Email góp ý</a></li>\n");
      out.write("                            <li><a href=\"#\">Hotline</a></li>\n");
      out.write("                            <li><a href=\"#\">0974 485 920</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left2\">\n");
      out.write("                    <a href=\"HomeControl\"><img src=\"image/logo.png\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left2\">\n");
      out.write("                    <h4>NAMShop SOCIAL</h4>\n");
      out.write("                    <a href=\"#\"><img src=\"image/icon_facebook.svg\"></a>&nbsp;\n");
      out.write("                    <a href=\"#\"><img src=\"image/icon_instagram.svg\"></a>&nbsp;\n");
      out.write("                    <a href=\"#\"><img src=\"image/icon_youtube.svg\"></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"left2\">\n");
      out.write("                    Địa Chỉ: 25 Nguyễn Du, tổ 16B, khu 2A, Nông Trang, Việt Trì, Vietnam.<br>\n");
      out.write("                    Copyright © 2020 Nam. All rights reserved.\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"row left-tree\">\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">TRẠNG THÁI  <span class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li>\n");
      out.write("                            <label class=cb-checked>\n");
      out.write("                                <input checked name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"online-only\" hidden>Online Only                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label class=cb-checked>\n");
      out.write("                                <input checked name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"best-seller\" hidden>Best Seller                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">KIỂU DÁNG  <span class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"low-top\" hidden>Low Top                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"high-top\" hidden>High Top                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"slip-on\" hidden>Slip-on                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">DÒNG SẢN PHẨM  <span class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"basas\" hidden>Basas                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"vintas\" hidden>Vintas                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"urbas\" hidden>Urbas                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"hat\" hidden>Hat | Nón                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"basic-tee-tron\" hidden>Basic Tee | Áo thun cơ bản                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">GIÁ  <span class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"500-599k\" hidden>500k - 599k                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"400-499k\" hidden>400k - 499k                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"200-299k\" hidden>200k - 299k                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">BỘ SƯU TẬP  <span class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"ananas-typo-logo\" hidden>Ananas Typo Logo                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"the-ocean\" hidden>The Ocean                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"pop-up\" hidden>Pop-up                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"inversion\" hidden>Inversion                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"the-new-military\" hidden>The New Military                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"new-simple-life\" hidden>New Simple Life                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"mono-black\" hidden>Mono-Black                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"new-familiar\" hidden>New Familiar                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"bumper-gum\" hidden>Bumper Gum                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">SIZE SẢN PHẨM KHÁC  <span\n");
      out.write("                            class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li class=\"cb-size\">\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"free\" hidden>free</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"s\" hidden>S</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"m\" hidden>M</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"l\" hidden>L</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"xl\" hidden>XL</label>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">CHẤT LIỆU  <span class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"canvas\" hidden>Canvas | Vải                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"suede\" hidden>Suede | Da lộn                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbStatus\" class=\"cb-item\" type=\"checkbox\" value=\"cotton\" hidden>Cotton                                            <span class=\"glyphicon\"></span>\n");
      out.write("                            </label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">SIZE GIÀY  <span\n");
      out.write("                            class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li class=\"cb-size\">\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"35\" hidden>35</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"36\" hidden>36</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"37\" hidden>37</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"38\" hidden>38</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"39\" hidden>39</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"40\" hidden>40</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"41\" hidden>41</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"42\" hidden>42</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"43\" hidden>43</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"44\" hidden>44</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"45\" hidden>45</label>\n");
      out.write("                            <label >\n");
      out.write("                                <input  name=\"cbSize\" type=\"checkbox\" value=\"46\" hidden>46</label>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("                <li class=\"first-lvl\">\n");
      out.write("                    <label label-default=\"\" class=\"tree-toggle nav-header orange\">MÀU SẮC  <span\n");
      out.write("                            class=\"caret caret-active\"></span></label>\n");
      out.write("                    <ul class=\"nav tree\">\n");
      out.write("                        <li class=\"cb-color\">\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #006964;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"teal-color\" hidden></label>\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #999999;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"grey\" hidden></label>\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #0e2366;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"navy\" hidden></label>\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #f4f4f4;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"white\" hidden></label>\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #588732;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"green\" hidden></label>\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #ff80aa;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"pink\" hidden></label>\n");
      out.write("                            <label ><span class=\"bg-color\" style=\"background-color: #000000;\"></span>\n");
      out.write("                                <input                                                     name=\"cbColor\"\n");
      out.write("                                                                                           type=\"checkbox\"\n");
      out.write("                                                                                           value=\"black\" hidden></label>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-divider\"></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("cate");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagCate == cate.key ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"CategoryControl?cate=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("title");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTitle}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagTitle == title ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"CategoryControl?title=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setVar("size");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSize}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagSize == size ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"CategoryControl?size=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setVar("color");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listColor}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagColor == color ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"CategoryControl?color=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setVar("p");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"card\">\n");
          out.write("                                    <img class=\"image\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <div class=\"card-body\">\n");
          out.write("                                        <h4><a href=\"DetailControl?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        <p style=\"text-align: center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                        <p style=\"text-align: center\"><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VND</b></p>\n");
          out.write("                                        <div class=\"col\">\n");
          out.write("                                            <a href=\"CheckOutControl\" class=\"btn btn-success btn-block\">BUY</a>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setBegin(1);
    _jspx_th_c_forEach_5.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_5.setVar("p");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <a href=\"CategoryControl?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tagIndex == p ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }
}
