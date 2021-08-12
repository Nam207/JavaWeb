<%-- 
    Document   : checkOut
    Created on : Mar 13, 2021, 12:06:30 PM
    Author     : nam
--%>

<%@page import="java.util.List"%>
<%@page import="entity.product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Out</title>
        <link rel="stylesheet" href="css/checkOut.css">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        
        <!------ Include the above in your HEAD tag ---------->

        <%@include file="header.jsp"%>
        <main style="clear: both">
        <%List<product> cart = (List<product>) request.getAttribute("cart");
        int total=0;   
        int ship=50000;
        %> 
            <div class="container wrapper">
                <div class="row cart-head">
                    <div class="container">
                        <div class="row">
                            <p></p>
                        </div>
                        <div class="row">
                            <div style="display: table; margin: auto;">
                                <span class="step step_complete"> <a href="CartControl" class="check-bc">Cart</a> <span class="step_line step_complete"> </span> <span class="step_line backline"> </span> </span>
                            <span class="step step_complete"> <a href="#" class="check-bc">Checkout</a> <span class="step_line "> </span> <span class="step_line step_complete"> </span> </span>
                            <span class="step_thankyou check-bc step_complete">Thank you</span>
                        </div>
                    </div>
                    <div class="row">
                        <p></p>
                    </div>
                </div>
            </div>    
            <div class="row cart-body">
                <form class="form-horizontal" method="post" action="PlaceOrderControl">
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-push-6 col-sm-push-6">
                        <!--REVIEW ORDER-->
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                Review Order <div class="pull-right"><small><a class="afix-1" href="CartControl?acc=${sessionScope.account.id}">Edit Cart</a></small></div>
                            </div>
                            <div class="panel-body">
                                    <c:forEach var="cate" items="${cart}">
                                        <div class="form-group">
                                            <div class="col-sm-3 col-xs-3">
                                                <img class="img-responsive" src="${cate.image}">
                                            </div>
                                            <div class="col-sm-6 col-xs-6">
                                                <div class="col-xs-12">${cate.name}</div>
                                                <div class="col-xs-12"><small>Quantity:<span>${amount}</span></small></div>
                                            </div>
                                            <div class="col-sm-3 col-xs-3 text-right">
                                                <h6><span>VND</span>${cate.price}</h6>
                                            </div>
                                        </div>
                                    </c:forEach>
                                <div class="form-group"><hr /></div>
                                <div class="form-group">
                                    <%for(int i=0;i<cart.size();i++){
                                        total+=cart.get(i).getAmount()*Integer.parseInt(cart.get(i).getPrice()+"");
                                    }%>
                                    <div class="col-xs-12">
                                        <strong>Subtotal</strong>
                                        <div class="pull-right"><span>VND</span><span><%=total%></span></div>
                                    </div>
                                    <%if(total>=4000000){
                                        ship=0;%>
                                    <div class="col-xs-12">
                                        <small>Shipping</small>
                                        <div class="pull-right"><span>Free Ship</span></div>
                                    </div>
                                    <%}else{%>
                                    <div class="col-xs-12">
                                        <small>Shipping</small>
                                        <div class="pull-right"><span>+ VND</span><span><%=ship%></span></div>
                                    </div>
                                    <%}%>
                                </div>
                                <div class="form-group"><hr /></div>
                                <div class="form-group">
                                    <div class="col-xs-12">
                                        <strong>Order Total</strong>
                                        <div class="pull-right"><span>VND</span><span><%=total+ship%></span></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--REVIEW ORDER END-->
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12 col-md-pull-6 col-sm-pull-6">
                        <!--SHIPPING METHOD-->
                        <div class="panel panel-info">
                            <div class="panel-heading">Address</div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-md-12">
                                        <h4>Shipping Address</h4>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-6 col-xs-12">
                                        <strong>First Name:</strong>
                                        <input type="text" name="first_name" class="form-control" value="${sessionScope.user.firstName}" required="" />
                                    </div>
                                    <div class="span1"></div>
                                    <div class="col-md-6 col-xs-12">
                                        <strong>Last Name:</strong>
                                        <input required="" type="text" name="last_name" class="form-control" value="${sessionScope.user.lastName}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Address:</strong></div>
                                    <div class="col-md-12">
                                        <input required="" type="text" name="address" class="form-control" value="${sessionScope.user.address}" />
                                    </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Phone:</strong></div>
                                    <div class="col-md-12">
                                        <input required="" type="text" name="phone" class="form-control" value="${sessionScope.user.phone}" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Email:</strong></div>
                                    <div class="col-md-12">
                                        <input required="" type="email" name="email" class="form-control" value="${sessionScope.user.email}" />
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--SHIPPING METHOD END-->
                        <!--CREDIT CART PAYMENT-->
                        <div class="panel panel-info">
                            <div class="panel-heading"><span><i class="glyphicon glyphicon-lock"></i></span> Secure Payment</div>
                            <div class="panel-body">
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Card Type:</strong></div>
                                    <div class="col-md-12">
                                        <select id="CreditCardType" name="CreditCardType" class="form-control" style="height: 34px">
                                            <option value="5">Visa</option>
                                            <option value="6">BIDV</option>
                                            <option value="7">TP Bank</option>
                                            <option value="8">AGRI Bank</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-12"><strong>Credit Card Number:</strong></div>
                                    <div class="col-md-12"><input required="" type="text" class="form-control" name="car_number" value="" /></div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <button type="submit" class="btn btn-primary btn-submit-fix">Place Order</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--CREDIT CART PAYMENT END-->
                    </div>

                </form>
            </div>
            <div class="row cart-footer">

            </div>
        </div>
        </main>
        <%@include file="footer.jsp"%>
    </body>
</html>
