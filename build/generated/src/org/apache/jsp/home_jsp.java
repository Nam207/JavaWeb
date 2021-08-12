package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.user;
import DAO.DAO;
import entity.account;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/homeBody.css\">\n");
      out.write("        <title>Home Page</title>\n");
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
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Link</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" id=\"navbarDropdown\">\n");
      out.write("                            Dropdown\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-content\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                        </div>\n");
      out.write("                        <!--         <ul class=\"dropdown-content\">\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"\">item 1</a></li>\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"\">item 1</a></li>\n");
      out.write("                                        <li class=\"dropdown-item\"><a href=\"\">item 1</a></li>\n");
      out.write("                                </ul> -->\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link disabled\" href=\"#\">Disabled</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Load jquery trước khi load bootstrap js -->\n");
      out.write("        <script src=\"jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
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
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" id=\"navbarDropdown\">Hello ");
      out.print(u.getLastName());
      out.write("</a>\n");
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
      out.write("\n");
      out.write("        <main>\n");
      out.write("        <div class=\"content\" style=\"clear: both\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <a href=\"ProductListControl\">\n");
      out.write("                        <img src=\"image/KV_Urbas_Unsettling_Banner_Desktop_1920x1050.jpg\">\n");
      out.write("                        <img src=\"image/Corluray_bannerweb_desktop1920x1050.jpg\" class=\"hide\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                    <img src=\"image/banner-phụ_2m-600x320.jpg\">\n");
      out.write("                    <div>\n");
      out.write("                        <h3 class=\"title\">\n");
      out.write("                            <a href=\"CategoryControl?gender=1&color=Black\">ALL BLACK IN BLACK</a>\n");
      out.write("                        </h3>\n");
      out.write("                        <h3>\n");
      out.write("                            <p>Mặc dù được ứng dụng rất nhiều, nhưng sắc đen lúc nào cũng toát lên một vẻ huyền bí không nhàm chán</p>\n");
      out.write("                        </h3>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <img src=\"image/Banner_Sale-off-1.jpg\">\n");
      out.write("                <div class=\"n\">\n");
      out.write("                    <h3 class=\"title\">\n");
      out.write("                        <a href=\"CategoryControl?cate=2\">OUTLET SALE</a>\n");
      out.write("                    </h3>\n");
      out.write("                    <h3>\n");
      out.write("                       <p>Danh mục những  sản phẩm bán tại Outlet Store, đã được phát hành trước một thời gian và đang rơi vào tình trạng bể size, hết mã.</p>\n");
      out.write("                    </h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"home-buy\" style=\"clear: both\">\n");
      out.write("            <div class=\"title\">DANH MỤC MUA HÀNG</div>\n");
      out.write("            <div class=\"left\" style=\"background-image: url('image/giayNam.jpg')\">\n");
      out.write("                <div class=\"list\">\n");
      out.write("                    <a class=\"title\" href=\"CategoryControl?gender=1\">GIÀY NAM</a> <br><br>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"middle\" style=\"background-image: url('image/giayNu.jpg')\">\n");
      out.write("                <div class=\"list\">\n");
      out.write("                    <a class=\"title\" href=\"CategoryControl?gender=0\">GIÀY NỮ</a> <br><br> \n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\" style=\"background-image: url('image/dongSanPham.jpg')\">\n");
      out.write("                <div class=\"list\">\n");
      out.write("                    <a class=\"title\" href=\"ProductListControl\">DÒNG SẢN PHẨM</a><br><br>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"home-bSell\" style=\"clear: both\">\n");
      out.write("            <div class=\"title\">BEST SELLER</div>\n");
      out.write("            <div>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div style=\"clear: both\">\n");
      out.write("            <a href=\"\">\n");
      out.write("                <img src=\"image/AnanasxLuckyLuke-Pack_banner_desktop.jpg\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"infor\">\n");
      out.write("            <div class=\"left\">\n");
      out.write("                <div class=\"title\" style=\"text-align: center\">SOCIAL</div>\n");
      out.write("                <div class=\"list\">\n");
      out.write("                    <a href=\"\"><img src=\"image/icon_facebook.svg\">&nbsp; Facebook</a><br>\n");
      out.write("                    <a href=\"\"><img src=\"image/icon_instagram.svg\">&nbsp; Instagram</a><br>\n");
      out.write("                    <a href=\"\"><img src=\"image/icon_youtube.svg\">&nbsp; Youtube</a><br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <div class=\"title\" style=\"text-align: center\">TIN TỨC & BÀI VIẾT</div>\n");
      out.write("                <div class=\"news-list\">\n");
      out.write("                    <div class=\"left2\">\n");
      out.write("                        <a href=\"https://snkrvn.com/skechers-x-one-punch-man-collab-dang-cap-se-mo-ban-chinh-thuc-tai-viet-nam-vao-28-01-2021/\">\n");
      out.write("                            <img width=\"300\" height=\"300\" src=\"https://snkrvn.com/wp-content/uploads/2021/01/Skechers-X-One-Punch-Man.jpg\"></a>\n");
      out.write("                        <h3 class=\"post-title\">\n");
      out.write("                            <a href=\"https://snkrvn.com/skechers-x-one-punch-man-collab-dang-cap-se-mo-ban-chinh-thuc-tai-viet-nam-vao-28-01-2021/\">SKECHERS X ONE PUNCH MAN</a></h3>\n");
      out.write("                        <h3 class=\"post-des\">28 tháng 01 năm 2021 sẽ mở màn cho một collab giữa thương hiệu sneakers SKECHERS và bộ truyện tranh nổi tiếng đình đám ONE PUNCH MAN, đây được xem là một trong những collaboration (Đồng sáng tạo) xứng đáng có mặt trong bộ sưu tập sneakers của những tín đồ yêu giày đế bằng & những fans của bộ truyện comic đầy thú vị này.</h3>\n");
      out.write("                        <h3 class=\"post-detail\"><a href=\"https://snkrvn.com/skechers-x-one-punch-man-collab-dang-cap-se-mo-ban-chinh-thuc-tai-viet-nam-vao-28-01-2021/\">Đọc thêm</a></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"left2\">\n");
      out.write("                        <a href=\"https://giaygiare.vn/30-mau-giay-nike-air-jordan-sap-ra-mat-2021.html\">\n");
      out.write("                            <img width=\"300\" height=\"300\" src=\"https://giaygiare.vn/upload/images/-30-mau-giay-nike-air-jordan-sap-ra-mat-nam-2021.jpg\"></a>\n");
      out.write("                        <h3 class=\"post-title\"><a\n");
      out.write("                                href=\"https://giaygiare.vn/30-mau-giay-nike-air-jordan-sap-ra-mat-2021.html\">+30 MẪU GIÀY NIKE AIR JORDAN</a></h3>\n");
      out.write("                        <h3 class=\"post-des\">Khi năm 2020 sắp kết thúc, nhiều người chắc chắn đang thở phào nhẹ nhõm, hy vọng rằng năm tới sẽ “bình thường” hơn những gì chúng ta đã trải qua. Nếu mọi người mong muốn “bước đi với cuộc sống nhẹ nhàng hơn”. Thì hãy đến với danh sách các bản phát hành năm 2021 của Jordan Brand.</h3>\n");
      out.write("                        <h3 class=\"post-detail\"><a href=\"https://giaygiare.vn/30-mau-giay-nike-air-jordan-sap-ra-mat-2021.html\">Đọc thêm</a></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div style=\"clear: both\"></div>\n");
      out.write("                    <div class=\"left2\">\n");
      out.write("                        <a href=\"https://genk.vn/converse-gioi-thieu-giay-co-the-thay-doi-mau-nhu-tac-ke-khi-gap-anh-nang-20190720162932194.chn\">\n");
      out.write("                            <img width=\"300\" height=\"300\" src=\"https://genk.mediacdn.vn/thumb_w/660/2019/7/20/sneak1-1563614762059880132043.jpg\"></a>\n");
      out.write("                        <h3 class=\"post-title\"><a\n");
      out.write("                                href=\"https://genk.vn/converse-gioi-thieu-giay-co-the-thay-doi-mau-nhu-tac-ke-khi-gap-anh-nang-20190720162932194.chn\">CONVERSE GIÀY ĐỔI MÀU</a></h3>\n");
      out.write("                        <h3 class=\"post-des\">Những đôi giày Converse trắng này sẽ đổi màu khi bạn đi ra nắng. Gần đây, thế giới smartphone đón chào một trào lưu mới với các thiết bị có mặt lưng thay đổi màu sắc theo góc nhìn và bây giờ nó còn lan rộng sang những đôi giày thể thao.</h3>\n");
      out.write("                        <h3 class=\"post-detail\"><a href=\"https://genk.vn/converse-gioi-thieu-giay-co-the-thay-doi-mau-nhu-tac-ke-khi-gap-anh-nang-20190720162932194.chn\">Đọc thêm</a></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"left2\">\n");
      out.write("                        <a href=\"https://ananas.vn/sneaker-fest-vietnam-va-su-ket-hop/\">\n");
      out.write("                            <img width=\"300\" height=\"300\" src=\"image/new4.jpg\"></a>\n");
      out.write("                        <h3 class=\"post-title\"><a\n");
      out.write("                                href=\"https://ananas.vn/sneaker-fest-vietnam-va-su-ket-hop/\">SNEAKER FEST VIETNAM VÀ SỰ KẾT HỢP</a></h3>\n");
      out.write("                        <h3 class=\"post-des\">Việc sử dụng dáng giày Vulcanized High Top của Ananas trong thiết kế và cảm hứng bắt nguồn từ linh vật Peeping - đại diện cho tinh thần xuyên suốt 6 năm qua Sneaker Fest Vietnam, chúng tôi tự tin đây sẽ là sản phẩm đáng mong chờ cho mọi “đầu giày” vào mùa hè năm nay...</h3>\n");
      out.write("                        <h3 class=\"post-detail\"><a href=\"https://ananas.vn/sneaker-fest-vietnam-va-su-ket-hop/\">Đọc thêm</a></h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
          out.write("                        <a href=\"CategoryControl?cate=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&gender=1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    ");
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
    _jspx_th_c_forEach_1.setVar("cate");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a href=\"CategoryControl?cate=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.key}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&gender=0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    ");
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
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTitle}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("title");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a href=\"CategoryControl?title=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tilte}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTitle}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a><br>\n");
          out.write("                    ");
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
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("p");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <div class=\"left\">\n");
          out.write("                    <div class=\"image\"><a href=\"DetailControl?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></a>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"caption\">\n");
          out.write("                        <h3 class=\"name\"><a\n");
          out.write("                                href=\"DetailControl?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                        </h3>\n");
          out.write("                        <h3 class=\"color\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                        <h3 class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.value.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                ");
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
}
