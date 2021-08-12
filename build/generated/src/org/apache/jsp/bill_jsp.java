package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.user;
import DAO.DAO;
import entity.account;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Manager Bills</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"css/manager.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            .dropdown{\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .dropdown-content{\n");
      out.write("                display: none;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("                z-index: 1;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .dropdown:hover .dropdown-content{\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .dropdown:active .dropdown-content{\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            .dropdown-item {\n");
      out.write("                display: block;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: .25rem 1.5rem;\n");
      out.write("                clear: both;\n");
      out.write("                font-weight: 400;\n");
      out.write("                color: #212529;\n");
      out.write("                text-align: inherit;\n");
      out.write("                white-space: nowrap;\n");
      out.write("                background-color: transparent;\n");
      out.write("                border: 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
HttpSession ses = request.getSession();
            Object a = ses.getAttribute("account");
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"background-color: black\">\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\" style=\"float: right\">\n");
      out.write("                    <li class=\"nav-item\" ><a class=\"nav-link\" style=\"color: white\" href=\"contact.jsp\">  Tìm cửa hàng  </a></li>&nbsp;\n");
      out.write("                    ");
if (a == null) {
      out.write("\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" style=\"color: white\" href=\"login.jsp\">   Đăng nhập   </a></li>&nbsp;\n");
      out.write("                        ");
} else {
                            account acc = (account) a;
                            user u = (user) ses.getAttribute("user");
                        
      out.write("\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" style=\"color: white\" href=\"#\" id=\"navbarDropdown\">  Hello ");
      out.print(u.getLastName());
      out.write("  </a>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            ");
if (acc.isAdmin()) {
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"AdminUserControl\">Quản lý User</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ManagerProductControl\">Quản lý Sản Phẩm</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"BillControl\">Đơn hàng</a>\n");
      out.write("                            ");
} else {
      out.write("\n");
      out.write("                            <a class=\"dropdown-item\" href=\"ManagerUserControl\">Quản lý Tài khoản</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"HistoryControl\">Lịch sử mua</a>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </li>&nbsp;\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" style=\"color: white\" href=\"LogOutControl\">  Đăng xuất  </a></li>&nbsp;\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </li>&nbsp;\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
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
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container\" style=\"clear: both\">\n");
      out.write("                <div class=\"table-wrapper\">\n");
      out.write("                    <div class=\"table-title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <h2>Manage <b>Bill</b></h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <a href=\"#deleteEmployeeModal\" class=\"btn btn-danger\" data-toggle=\"modal\"><i class=\"material-icons\">&#xE15C;</i> <span>Delete All</span></a>\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>Account</th>\n");
      out.write("                                <th>First Name</th>\n");
      out.write("                                <th>Last Name</th>\n");
      out.write("                                <th>Address</th>\n");
      out.write("                                <th>Phone</th>\n");
      out.write("                                <th>Email</th>\n");
      out.write("                                <th>Card Type</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
List<account> acc= (List<account>) request.getAttribute("acc");
                            List<user> u= (List<user>) request.getAttribute("us");
                            for(int i=0;i<acc.size();i++){
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(acc.get(i).getId());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(acc.get(i).getUser());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(acc.get(i).getPass());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print((u.get(i).getFirstName()+" "+u.get(i).getLastName()));
      out.write("</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <a href=\"EditUserControl?acc=");
      out.print(acc.get(i).getId());
      out.write("\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Look\">visibility</i></a>\n");
      out.write("                                        <a href=\"DeleteUserControl?acc=");
      out.print(acc.get(i).getId());
      out.write("\"><i class=\"material-icons\" data-toggle=\"tooltip\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Delete Modal HTML -->\n");
      out.write("            <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <form action=\"DeleteUserControl\">\n");
      out.write("                            <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                                <h4 class=\"modal-title\">Delete Product</h4>\n");
      out.write("                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                                <p>Are you sure you want to delete these Records?</p>\n");
      out.write("                                <p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <script src=\"js/manager.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("        </script>\n");
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
      out.write("                    <a href=\"#\"><img style=\"width: 40px; height: 40px\" src=\"image/icon_facebook.svg\"></a>&nbsp;\n");
      out.write("                    <a href=\"#\"><img style=\"width: 40px; height: 40px\" src=\"image/icon_instagram.svg\"></a>&nbsp;\n");
      out.write("                    <a href=\"#\"><img style=\"width: 40px; height: 40px\" src=\"image/icon_youtube.svg\"></a>\n");
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
        out.write("                            <a class=\"nav-link\" style=\"color: white\" href=\"CartControl\">  Giỏ hàng  </a>\n");
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
