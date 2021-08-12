<%-- 
    Document   : detail
    Created on : Feb 4, 2021, 4:09:56 PM
    Author     : nam
--%>

<%@page import="entity.product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/detail.css" type="text/css"/>
        <link rel="stylesheet" href="css/productList.css" type="text/css"/>
        <style>
            .gallery-wrap .img-big-wrap img {
                height: 300px;
                width: auto;
                display: inline-block;
                cursor: zoom-in;
            }
            .productList .detail .left{
                width: 300px;
            }
            .productList .detail .right{
                width: 47%;
            }
        </style>
        <title>Detail</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <main>
            <div class="productList" style="clear: both">
                <div class="left">
                    <ul class="menu">
                        <li><a>Nữ</a></li>&nbsp;
                        <li><a href="P">Nam</a></li>&nbsp;
                        <li><a href="ProductListControl">Tất cả</a></li>
                    </ul>
                    <br><br>
                    <ul class="menu2">
                        <ul>
                            <li class="title">Trạng thái</li>
                                <c:forEach var="cate" items="${cate}">
                                <li class="${tagCate == cate.key ? "active":""}"><a href="CategoryControl?cate=${cate.key}">${cate.value.name}</a></li>
                                </c:forEach>
                        </ul>
                        <br><br>
                        <ul>
                            <li class="title">Dòng sản phẩm</li>
                                <c:forEach var="title" items="${listTitle}">
                                <li class="${tagTitle == title ? "active":""}"><a href="CategoryControl?title=${title}">${title}</a></li>
                                </c:forEach>
                        </ul>
                        <br><br>
                        <ul>
                            <li class="title">Giá</li>
                            <li><a><200k</a></li>
                            <li><a>200k-400k</a></li>
                            <li><a>400k-800k</a></li>
                            <li><a>800k-1.500k</a></li>
                            <li><a>>1.500k</a></li>
                        </ul>
                        <br><br>
                        <ul>
                            <li class="title">Size</li>
                                <c:forEach var="size" items="${listSize}">
                                <li class="${tagSize == size ? "active":""}"><a href="CategoryControl?size=${size}">${size}</a></li>
                                </c:forEach>
                        </ul>
                        <br><br>
                        <ul>
                            <li class="title">Màu sắc</li>
                                <c:forEach var="color" items="${listColor}">
                                <li class="${tagColor == color ? "active":""}"><a href="CategoryControl?color=${color}">${color}</a></li>
                                </c:forEach>
                        </ul>
                    </ul>
                </div>
                <div class="right detail">
                    <div class="left">
                        <div class="gallery-wrap"> 
                            <div class="img-big-wrap">
                                <div> <a href="#"><img src="${detail.image}"></a></div>
                            </div>
                        </div>
                    </div>
                    <div class="right">
                        <form action="CartControl" method="gets">
                            <div>
                                <input type="hidden" name="pid" value="${detail.id}">
                                <h3>${detail.name}</h3>
                                <p style="text-align: center; font-size: 20px;">${detail.price} VND</p>
                                <dl>
                                    <dt style="font-weight: bold">Description</dt>
                                    <dd><p>${detail.description}</p></dd>
                                </dl>
                                <hr>
                                <dt style="font-weight: bold; color: red">THÔNG TIN SẢN PHẨM</dt>
                                <dd><p>Gender: ${detail.gender ? "Male":"Female"}</p></dd>
                                <dd><p>Size: ${detail.size}</p></dd>
                                <dd><p>Color: ${detail.color}</p></dd>
                                <dd><p>Dòng sản phẩm: ${detail.title}</p></dd>
                                <hr>

                                <div class="row">
                                    <div class="col-sm-5">
                                        <dl class="param param-inline">
                                            <dt>Quantity: </dt>
                                            <dd>
                                                <select name="amount" class="form-control form-control-sm" style="width:100px; height: 30px">
                                                    <c:if test="${detail.amount == 0}">
                                                        <option>Sale off</option>
                                                    </c:if>
                                                    <c:if test="${detail.amount != 0}">
                                                        <%product p = (product) request.getAttribute("detail");
                                                        for (int i = 1; i <= p.getAmount(); i++) {%>
                                                        <option><%=i%></option>
                                                        <%}%>
                                                    </c:if>
                                                </select>
                                            </dd>
                                        </dl>  <!-- item-property .// -->
                                    </div> <!-- col.// -->

                                </div> <!-- row.// -->
                                <hr>
                                <c:if test="${sessionScope.account==null}">
                                    <c:if test="${detail.amount == 0}">
                                        <input type="submit" value="Add To Cart" disabled="disabled">
                                    </c:if>
                                    <c:if test="${detail.amount != 0}">
                                        <input type="submit" value="Add To Cart">
                                    </c:if>
                                </c:if>
                                <c:if test="${sessionScope.account!=null}">
                                    <c:if test="${detail.amount == 0}">
                                        <input type="submit" value="Add To Cart" disabled="disabled">
                                    </c:if>
                                    <c:if test="${detail.amount != 0}">
                                        <input type="submit" value="Add To Cart">
                                    </c:if>
                                </c:if>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </main>
        <%@include file="footer.jsp"%>
    </body>
</html>
