package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkOut_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/checkOut.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"container wrapper\">\n");
      out.write("                <div class=\"row cart-head\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <p></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div style=\"display: table; margin: auto;\">\n");
      out.write("                                <span class=\"step step_complete\"> <a href=\"CartControl\" class=\"check-bc\">Cart</a> <span class=\"step_line step_complete\"> </span> <span class=\"step_line backline\"> </span> </span>\n");
      out.write("                            <span class=\"step step_complete\"> <a href=\"#\" class=\"check-bc\">Checkout</a> <span class=\"step_line \"> </span> <span class=\"step_line step_complete\"> </span> </span>\n");
      out.write("                            <span class=\"step_thankyou check-bc step_complete\">Thank you</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <p></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("            <div class=\"row cart-body\">\n");
      out.write("                <form class=\"form-horizontal\" method=\"post\" action=\"\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-push-6 col-sm-push-6\">\n");
      out.write("                        <!--REVIEW ORDER-->\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                Review Order <div class=\"pull-right\"><small><a class=\"afix-1\" href=\"CartControl?acc=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Edit Cart</a></small></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <div class=\"form-group\"><hr /></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <strong>Subtotal</strong>\n");
      out.write("                                        <div class=\"pull-right\"><span>$</span><span>200.00</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <small>Shipping</small>\n");
      out.write("                                        <div class=\"pull-right\"><span>-</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\"><hr /></div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-xs-12\">\n");
      out.write("                                        <strong>Order Total</strong>\n");
      out.write("                                        <div class=\"pull-right\"><span>$</span><span>150.00</span></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--REVIEW ORDER END-->\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-pull-6 col-sm-pull-6\">\n");
      out.write("                        <!--SHIPPING METHOD-->\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-heading\">Address</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <h4>Shipping Address</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-6 col-xs-12\">\n");
      out.write("                                        <strong>First Name:</strong>\n");
      out.write("                                        <input type=\"text\" name=\"first_name\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"span1\"></div>\n");
      out.write("                                    <div class=\"col-md-6 col-xs-12\">\n");
      out.write("                                        <strong>Last Name:</strong>\n");
      out.write("                                        <input type=\"text\" name=\"last_name\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Address:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"address\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Phone:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"phoneNumber\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Email:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" name=\"email\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--SHIPPING METHOD END-->\n");
      out.write("                        <!--CREDIT CART PAYMENT-->\n");
      out.write("                        <div class=\"panel panel-info\">\n");
      out.write("                            <div class=\"panel-heading\"><span><i class=\"glyphicon glyphicon-lock\"></i></span> Secure Payment</div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Card Type:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <select id=\"CreditCardType\" name=\"CreditCardType\" class=\"form-control\">\n");
      out.write("                                            <option value=\"5\">Visa</option>\n");
      out.write("                                            <option value=\"6\">MasterCard</option>\n");
      out.write("                                            <option value=\"7\">American Express</option>\n");
      out.write("                                            <option value=\"8\">Discover</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Credit Card Number:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" name=\"car_number\" value=\"\" /></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\"><strong>Card CVV:</strong></div>\n");
      out.write("                                    <div class=\"col-md-12\"><input type=\"text\" class=\"form-control\" name=\"car_code\" value=\"\" /></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <strong>Expiration Date</strong>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <select class=\"form-control\" name=\"\">\n");
      out.write("                                            <option value=\"\">Month</option>\n");
      out.write("                                            <option value=\"01\">01</option>\n");
      out.write("                                            <option value=\"02\">02</option>\n");
      out.write("                                            <option value=\"03\">03</option>\n");
      out.write("                                            <option value=\"04\">04</option>\n");
      out.write("                                            <option value=\"05\">05</option>\n");
      out.write("                                            <option value=\"06\">06</option>\n");
      out.write("                                            <option value=\"07\">07</option>\n");
      out.write("                                            <option value=\"08\">08</option>\n");
      out.write("                                            <option value=\"09\">09</option>\n");
      out.write("                                            <option value=\"10\">10</option>\n");
      out.write("                                            <option value=\"11\">11</option>\n");
      out.write("                                            <option value=\"12\">12</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <select class=\"form-control\" name=\"\">\n");
      out.write("                                            <option value=\"\">Year</option>\n");
      out.write("                                            <option value=\"2015\">2015</option>\n");
      out.write("                                            <option value=\"2016\">2016</option>\n");
      out.write("                                            <option value=\"2017\">2017</option>\n");
      out.write("                                            <option value=\"2018\">2018</option>\n");
      out.write("                                            <option value=\"2019\">2019</option>\n");
      out.write("                                            <option value=\"2020\">2020</option>\n");
      out.write("                                            <option value=\"2021\">2021</option>\n");
      out.write("                                            <option value=\"2022\">2022</option>\n");
      out.write("                                            <option value=\"2023\">2023</option>\n");
      out.write("                                            <option value=\"2024\">2024</option>\n");
      out.write("                                            <option value=\"2025\">2025</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <span>Pay secure using your credit card.</span>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <ul class=\"cards\">\n");
      out.write("                                            <li class=\"visa hand\">Visa</li>\n");
      out.write("                                            <li class=\"mastercard hand\">MasterCard</li>\n");
      out.write("                                            <li class=\"amex hand\">Amex</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary btn-submit-fix\">Place Order</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--CREDIT CART PAYMENT END-->\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row cart-footer\">\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setVar("cate");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <div class=\"form-group\">\n");
          out.write("                                            <div class=\"col-sm-3 col-xs-3\">\n");
          out.write("                                                <img class=\"img-responsive\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-6 col-xs-6\">\n");
          out.write("                                                <div class=\"col-xs-12\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                <div class=\"col-xs-12\"><small>Quantity:<span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></small></div>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"col-sm-3 col-xs-3 text-right\">\n");
          out.write("                                                <h6><span>VND</span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cate.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h6>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"form-group\">\n");
        out.write("                                            <div class=\"col-sm-3 col-xs-3\">\n");
        out.write("                                                <img class=\"img-responsive\" src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"col-sm-6 col-xs-6\">\n");
        out.write("                                                <div class=\"col-xs-12\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                                                <div class=\"col-xs-12\"><small>Quantity:<span>1</span></small></div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <div class=\"col-sm-3 col-xs-3 text-right\">\n");
        out.write("                                                <h6><span>VND</span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h6>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
