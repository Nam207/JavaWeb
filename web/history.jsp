<%-- 
    Document   : History
    Created on : Mar 19, 2021, 8:50:34 AM
    Author     : nam
--%>

<%@page import="java.util.HashMap"%>
<%@page import="entity.product"%>
<%@page import="entity.checkOut"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>History</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link href="css/history.css" rel="stylesheet" type="text/css">
    </head>
    <body>
    <%@include file="header.jsp" %>

    <%List<String> listTime = (List<String>) request.getAttribute("listTime");
        List<checkOut> listOut = (List<checkOut>) request.getAttribute("listOut");
        HashMap<Integer,product> listPro=(HashMap<Integer,product>) request.getAttribute("listPro");
    %>
    <main style="margin-left: 350px; margin-top: 300px; margin-bottom: 200px">
    <%for (int i = 0; i < listTime.size(); i++) {
            int total=0;
    %>
    <div class="row" style="clear: both; width: 1300px">
        
        <div class="col-md-7">
            <div class="history_wrapper">

                <div class="history_header">
                    <div class="history_header_product">
                        Product
                    </div> 
                    <div class="history_header_quantity">
                        Quantity
                    </div>   
                    <div class="history_header_size">
                        Price
                    </div>  
                    <div class="history_header_date">
                        Date
                    </div>    
                </div>
                <%for (int j = 0; j < listOut.size(); j++) {%>    
                <div class="history_body">
                    <div class="history_list">
                    <%if (listTime.get(i).equals(listOut.get(j).getDate() + " " + listOut.get(j).getTime())) {%>
                        <div class="history_item_name">
                            <span class="item_name"> 
                                <%for (HashMap.Entry<Integer, product> en : listPro.entrySet()) {
                                        int key = en.getKey();
                                        product val = en.getValue();
                                    if(key==listOut.get(j).getId()){%>
                                    <%=val.getName()%>
                                    <%}}%>
                            </span>   
                        </div>
                        <div class="history_item_quantity">
                            <span class="item_quantity">
                                <%=listOut.get(j).getAmount()%>
                            </span>
                        </div>
                        <div class="history_item_size">
                            <span class="item_size">
                                <%for (HashMap.Entry<Integer, product> en : listPro.entrySet()) {
                                        int key = en.getKey();
                                        product val = en.getValue();
                                    if(key==listOut.get(j).getId()){
                                       total+= Integer.parseInt(val.getPrice()+"")*listOut.get(j).getAmount();
                                    %>
                                    <%=val.getPrice()%>
                                    <%}}%>
                            </span>
                        </div>
                        <div class="history_item_date">
                            <span class="item_date">
                                <%=listOut.get(j).getDate()+" "+listOut.get(j).getTime()%>
                            </span>

                        </div>
                            <%}%>
                            <%}%>
                        <div class="history_list_footer">
                            <span class="label label-success">Completed</span>
                            <%int ship=50000;
                            if(total>4000000){%>
                            <span class="histroy_total"><b>Total(FREE SHIP) : </b><%=total%></span>
                            <%}else{%>
                            <span class="histroy_total"><b>Total(+ship) : </b><%=total%>+<%=ship%>=<%=total+ship%></span>
                            <%}%>
                        </div>
                    </div>
                </div>
            </div>
        </div>    
    </div>
    <br><br><br>
        </div>
    <%}%>
    </main>
    <%@include file="footer.jsp" %>
    </body>
</html>
