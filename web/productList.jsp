<%-- 
    Document   : productList
    Created on : Jan 27, 2021, 10:26:55 AM
    Author     : nam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/productList.css">
        <style>
            .productList .card .btn-block {
                display: block;
                width: 100%;
            }
            .productList .card .btn-success {
                color: #fff;
                background-color: #28a745;
                border-color: #28a745;
            }
            .productList .card .btn {
                background-color: red; /* màu của Quản trị mạng ^^ */
                border: none;
                color: white;
                padding: 10px 7px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
            }
        </style>
        <title>Product List</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <main>
            <div class="productList" style="clear: both">
                <div class="left">
                    <ul class="menu">
                        <li class="${tagGender == 0 ? "active2":""}"><a href="CategoryControl?gender=0">Nữ</a></li>&nbsp;
                        <li class="${tagGender == 1 ? "active2":""}"><a href="CategoryControl?gender=1">Nam</a></li>&nbsp;
                        <li class="${tagGender != 0 && tagGender != 1 ? "active2":""}"><a href="ProductListControl">Tất cả</a></li>
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
                            <li class="${tagPrice == 0 ? "active":""}"><a href="CategoryControl?price=0"><200k</a></li>
                            <li class="${tagPrice == 200 ? "active":""}"><a href="CategoryControl?price=200">200k-400k</a></li>
                            <li class="${tagPrice == 400 ? "active":""}"><a href="CategoryControl?price=400">400k-800k</a></li>
                            <li class="${tagPrice == 800 ? "active":""}"><a href="CategoryControl?price=800">800k-1.600k</a></li>
                            <li class="${tagPrice == 1600 ? "active":""}"><a href="CategoryControl?price=1600">>1.600k</a></li>
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
                <div class="right">
                    <div>
                        <img src="image/desktop_productlist.jpg" style="width: 850px;margin-right: 5%">
                    </div>
                    <div class="row">
                        <form action="CheckOutControl" method="post">
                            <c:forEach var="p" items="${product}">
                                <div class="card">
                                    <img class="image" src="${p.value.image}">
                                    <div class="card-body">
                                        <h4><a href="DetailControl?pid=${p.key}">${p.value.name}</a></h4>
                                        <p style="text-align: center">${p.value.color}</p>
                                        <p style="text-align: center"><b>${p.value.price} VND</b></p>
                                        <div class="col">
                                            <c:if test="${sessionScope.account==null}">
                                                <c:if test="${p.value.amount!=0}">
                                                    <a href="CartControl?pid=${p.key}&amount=1" class="btn btn-success btn-block">Add to Cart</a>
                                                </c:if>
                                                <c:if test="${p.value.amount==0}">
                                                    <a href="#" class="btn btn-success btn-block">Sale Out</a>
                                                </c:if>
                                            </c:if>
                                            <c:if test="${sessionScope.account!=null}">
                                                <c:if test="${sessionScope.account.admin==true}">
                                                    <a href="EditControl?pid=${p.key}" class="btn btn-success btn-block">Edit</a>
                                                </c:if>
                                                <c:if test="${sessionScope.account.admin!=true}">
                                                    <c:if test="${p.value.amount!=0}">
                                                        <a href="CartControl?pid=${p.key}&amount=1" class="btn btn-success btn-block">Add to Cart</a>
                                                    </c:if>
                                                    <c:if test="${p.value.amount==0}">
                                                        <a href="#" class="btn btn-success btn-block">Sale Out</a>
                                                    </c:if>
                                                </c:if>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </form>
                    </div>
                    <div class="pagination">
                        <c:forEach begin="1" end="${page}" var="p">
                            <a href="CategoryControl?index=${p}" class="${tagIndex == p ? "active":""}">${p}</a>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </main>
        <%@include file="footer.jsp"%>
    </body>
</html>