<%-- 
    Document   : home
    Created on : Jan 25, 2021, 4:08:11 PM
    Author     : nam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/homeBody.css">
        <title>Home Page</title>
        <style>
            .content .hide1{
                display: none;
            }
            .content .row a:hover img:first-child{
                display: none;
            }
            .content .row a:hover img:last-child{
                display: inline-block;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <main>
            <div class="content" style="clear: both" >
                <div class="row">
                    <a href="ProductListControl">
                        <img src="image/KV_Urbas_Unsettling_Banner_Desktop_1920x1050.jpg">
                        <img src="image/Corluray_bannerweb_desktop1920x1050.jpg" class="hide1">
                    </a>
                </div>
            </div>
            <div class="content">
                <div class="left">
                    <img src="image/banner-phụ_2m-600x320.jpg">
                    <div>
                        <h3 class="title">
                            <a href="CategoryControl?gender=1&color=Black">ALL BLACK IN BLACK</a>
                        </h3>
                        <h3>
                            <p>Mặc dù được ứng dụng rất nhiều, nhưng sắc đen lúc nào cũng toát lên một vẻ huyền bí không nhàm chán</p>
                        </h3>
                    </div>
                </div>
                <div class="right">
                    <img src="image/Banner_Sale-off-1.jpg">
                    <div class="n">
                        <h3 class="title">
                            <a href="CategoryControl?cate=2">OUTLET SALE</a>
                        </h3>
                        <h3>
                            <p>Danh mục những  sản phẩm bán tại Outlet Store, đã được phát hành trước một thời gian và đang rơi vào tình trạng bể size, hết mã.</p>
                        </h3>
                    </div>
                </div>
            </div>
            <div class="home-buy" style="clear: both">
                <div class="title">DANH MỤC MUA HÀNG</div>
                <div class="left" style="background-image: url('image/giayNam.jpg')">
                    <div class="list">
                        <a class="title" href="CategoryControl?gender=1">GIÀY NAM</a> <br><br>
                        <c:forEach var="cate" items="${cate}">
                            <a href="CategoryControl?cate=${cate.key}&gender=1">${cate.value.name}</a>
                        </c:forEach>
                    </div>
                </div>
                <div class="middle" style="background-image: url('image/giayNu.jpg')">
                    <div class="list">
                        <a class="title" href="CategoryControl?gender=0">GIÀY NỮ</a> <br><br> 
                        <c:forEach var="cate" items="${cate}">
                            <a href="CategoryControl?cate=${cate.key}&gender=0">${cate.value.name}</a>
                        </c:forEach>
                    </div>
                </div>
                <div class="right" style="background-image: url('image/dongSanPham.jpg')">
                    <div class="list">
                        <a class="title" href="ProductListControl">DÒNG SẢN PHẨM</a><br><br>
                        <c:forEach items="${listTitle}" var="title">
                            <a href="CategoryControl?title=${tilte}">${listTitle}</a><br>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="home-bSell" style="clear: both">
                <div class="title">BEST SELLER</div>
                <div style="margin-left: 120px">
                    <c:forEach items="${product}" var="p">
                        <div class="left">
                            <div class="image"><a href="DetailControl?pid=${p.value.id}">
                                    <img src="${p.value.image}"></a>
                            </div>
                            <div class="caption">
                                <h3 class="name"><a
                                        href="DetailControl?pid=${p.value.id}">${p.value.name}</a>
                                </h3>
                                <h3 class="color">${p.value.color}</h3>
                                <h3 class="price">${p.value.price}</h3>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <div style="clear: both">
                <a href="">
                    <img src="image/AnanasxLuckyLuke-Pack_banner_desktop.jpg">
                </a>
            </div>

            <div class="infor">
                <div class="left">
                    <div class="title" style="text-align: center">SOCIAL</div>
                    <div class="list">
                        <a href=""><img src="image/icon_facebook.svg">&nbsp; Facebook</a><br>
                        <a href=""><img src="image/icon_instagram.svg">&nbsp; Instagram</a><br>
                        <a href=""><img src="image/icon_youtube.svg">&nbsp; Youtube</a><br>
                    </div>
                </div>
                <div class="right">
                    <div class="title" style="text-align: center">TIN TỨC & BÀI VIẾT</div>
                    <div class="news-list">
                        <div class="left2">
                            <a href="https://snkrvn.com/skechers-x-one-punch-man-collab-dang-cap-se-mo-ban-chinh-thuc-tai-viet-nam-vao-28-01-2021/">
                                <img width="300" height="300" src="https://snkrvn.com/wp-content/uploads/2021/01/Skechers-X-One-Punch-Man.jpg"></a>
                            <h3 class="post-title">
                                <a href="https://snkrvn.com/skechers-x-one-punch-man-collab-dang-cap-se-mo-ban-chinh-thuc-tai-viet-nam-vao-28-01-2021/">SKECHERS X ONE PUNCH MAN</a></h3>
                            <h3 class="post-des">28 tháng 01 năm 2021 sẽ mở màn cho một collab giữa thương hiệu sneakers SKECHERS và bộ truyện tranh nổi tiếng đình đám ONE PUNCH MAN, đây được xem là một trong những collaboration (Đồng sáng tạo) xứng đáng có mặt trong bộ sưu tập sneakers của những tín đồ yêu giày đế bằng & những fans của bộ truyện comic đầy thú vị này.</h3>
                            <h3 class="post-detail"><a href="https://snkrvn.com/skechers-x-one-punch-man-collab-dang-cap-se-mo-ban-chinh-thuc-tai-viet-nam-vao-28-01-2021/">Đọc thêm</a></h3>
                        </div>
                        <div class="left2">
                            <a href="https://giaygiare.vn/30-mau-giay-nike-air-jordan-sap-ra-mat-2021.html">
                                <img width="300" height="300" src="https://giaygiare.vn/upload/images/-30-mau-giay-nike-air-jordan-sap-ra-mat-nam-2021.jpg"></a>
                            <h3 class="post-title"><a
                                    href="https://giaygiare.vn/30-mau-giay-nike-air-jordan-sap-ra-mat-2021.html">+30 MẪU GIÀY NIKE AIR JORDAN</a></h3>
                            <h3 class="post-des">Khi năm 2020 sắp kết thúc, nhiều người chắc chắn đang thở phào nhẹ nhõm, hy vọng rằng năm tới sẽ “bình thường” hơn những gì chúng ta đã trải qua. Nếu mọi người mong muốn “bước đi với cuộc sống nhẹ nhàng hơn”. Thì hãy đến với danh sách các bản phát hành năm 2021 của Jordan Brand.</h3>
                            <h3 class="post-detail"><a href="https://giaygiare.vn/30-mau-giay-nike-air-jordan-sap-ra-mat-2021.html">Đọc thêm</a></h3>
                        </div>
                        <div style="clear: both"></div>
                        <div class="left2">
                            <a href="https://genk.vn/converse-gioi-thieu-giay-co-the-thay-doi-mau-nhu-tac-ke-khi-gap-anh-nang-20190720162932194.chn">
                                <img width="300" height="300" src="https://genk.mediacdn.vn/thumb_w/660/2019/7/20/sneak1-1563614762059880132043.jpg"></a>
                            <h3 class="post-title"><a
                                    href="https://genk.vn/converse-gioi-thieu-giay-co-the-thay-doi-mau-nhu-tac-ke-khi-gap-anh-nang-20190720162932194.chn">CONVERSE GIÀY ĐỔI MÀU</a></h3>
                            <h3 class="post-des">Những đôi giày Converse trắng này sẽ đổi màu khi bạn đi ra nắng. Gần đây, thế giới smartphone đón chào một trào lưu mới với các thiết bị có mặt lưng thay đổi màu sắc theo góc nhìn và bây giờ nó còn lan rộng sang những đôi giày thể thao.</h3>
                            <h3 class="post-detail"><a href="https://genk.vn/converse-gioi-thieu-giay-co-the-thay-doi-mau-nhu-tac-ke-khi-gap-anh-nang-20190720162932194.chn">Đọc thêm</a></h3>
                        </div>
                        <div class="left2">
                            <a href="https://ananas.vn/sneaker-fest-vietnam-va-su-ket-hop/">
                                <img width="300" height="300" src="image/new4.jpg"></a>
                            <h3 class="post-title"><a
                                    href="https://ananas.vn/sneaker-fest-vietnam-va-su-ket-hop/">SNEAKER FEST VIETNAM VÀ SỰ KẾT HỢP</a></h3>
                            <h3 class="post-des">Việc sử dụng dáng giày Vulcanized High Top của Ananas trong thiết kế và cảm hứng bắt nguồn từ linh vật Peeping - đại diện cho tinh thần xuyên suốt 6 năm qua Sneaker Fest Vietnam, chúng tôi tự tin đây sẽ là sản phẩm đáng mong chờ cho mọi “đầu giày” vào mùa hè năm nay...</h3>
                            <h3 class="post-detail"><a href="https://ananas.vn/sneaker-fest-vietnam-va-su-ket-hop/">Đọc thêm</a></h3>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <%@include file="footer.jsp" %>
    </body>
</html>
