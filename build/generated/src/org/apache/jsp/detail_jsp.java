package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.product;
import entity.user;
import DAO.DAO;
import entity.account;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/detail.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/productList.css\">\n");
      out.write("        <style>\n");
      out.write("            .gallery-wrap .img-big-wrap img {\n");
      out.write("                height: 300px;\n");
      out.write("                width: auto;\n");
      out.write("                display: inline-block;\n");
      out.write("                cursor: zoom-in;\n");
      out.write("            }\n");
      out.write("            .productList .detail .left{\n");
      out.write("                width: 300px;\n");
      out.write("            }\n");
      out.write("            .productList .detail .right{\n");
      out.write("                width: 47%;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Detail</title>\n");
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
      out.write("                        <li><a>Nữ</a></li>&nbsp;\n");
      out.write("                        <li><a href=\"P\">Nam</a></li>&nbsp;\n");
      out.write("                        <li><a href=\"ProductListControl\">Tất cả</a></li>\n");
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
      out.write("                            <li><a><200k</a></li>\n");
      out.write("                            <li><a>200k-400k</a></li>\n");
      out.write("                            <li><a>400k-800k</a></li>\n");
      out.write("                            <li><a>800k-1.500k</a></li>\n");
      out.write("                            <li><a>>1.500k</a></li>\n");
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
      out.write("                <div class=\"right detail\">\n");
      out.write("                    <div class=\"left\">\n");
      out.write("                        <div class=\"gallery-wrap\"> \n");
      out.write("                            <div class=\"img-big-wrap\">\n");
      out.write("                                <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right\">\n");
      out.write("                        <form action=\"CartControl\" method=\"gets\">\n");
      out.write("                            <div>\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                                <p style=\"text-align: center; font-size: 20px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" VND</p>\n");
      out.write("                                <dl>\n");
      out.write("                                    <dt style=\"font-weight: bold\">Description</dt>\n");
      out.write("                                    <dd><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></dd>\n");
      out.write("                                </dl>\n");
      out.write("                                <hr>\n");
      out.write("                                <dt style=\"font-weight: bold; color: red\">THÔNG TIN SẢN PHẨM</dt>\n");
      out.write("                                <dd><p>Gender: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.gender ? \"Male\":\"Female\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></dd>\n");
      out.write("                                <dd><p>Size: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></dd>\n");
      out.write("                                <dd><p>Color: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></dd>\n");
      out.write("                                <dd><p>Dòng sản phẩm: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></dd>\n");
      out.write("                                <hr>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <dl class=\"param param-inline\">\n");
      out.write("                                            <dt>Quantity: </dt>\n");
      out.write("                                            <dd>\n");
      out.write("                                                <select name=\"amount\" class=\"form-control form-control-sm\" style=\"width:70px;\">\n");
      out.write("                                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    ");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_1.setPageContext(_jspx_page_context);
      _jspx_th_c_if_1.setParent(null);
      _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.amount != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        ");
product p = (product) request.getAttribute("detail");
                                                        for (int i = 1; i <= p.getAmount(); i++) {
          out.write("\n");
          out.write("                                                        <option>");
          out.print(i);
          out.write("</option>\n");
          out.write("                                                        ");
}
          out.write("\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      out.write("\n");
      out.write("                                                </select>\n");
      out.write("                                            </dd>\n");
      out.write("                                        </dl>  <!-- item-property .// -->\n");
      out.write("                                    </div> <!-- col.// -->\n");
      out.write("\n");
      out.write("                                </div> <!-- row.// -->\n");
      out.write("                                <hr>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.amount == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <option>Sale off</option>\n");
        out.write("                                                    ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <a href=\"login.jsp\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Add to cart </a>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.amount == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <input type=\"submit\" value=\"Add To Cart\" disabled=\"disabled\">\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.amount != 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <input type=\"submit\" value=\"Add To Cart\">\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
