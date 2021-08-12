<%-- 
    Document   : managerUser
    Created on : Mar 11, 2021, 2:46:48 PM
    Author     : nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager Account</title>
        <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <main>
        <div class="well" style="clear: both">
            <ul class="nav nav-tabs">
                <li class="active"><a href="#home" data-toggle="tab">Profile</a></li>
                <li class="active"><a href="#profile" data-toggle="tab">Password</a></li>
            </ul>
            <div id="myTabContent" class="tab-content">
                <div class="tab-pane active in" id="home">
                    <form id="tab" action="UserUpdateControl" method="post">
                        <br>
                        <br>
                        <p style="color: #DF4B3B; font-weight: bold; size: 20px">${mess}</p>
                        <label>Username</label>
                        <input type="text" name="user" value="${sessionScope.account.user}" class="input-xlarge" disabled="disable"><br><br>
                        <label>First Name</label> 
                        <input type="text" name="firstName" value="${user.firstName}" class="input-xlarge"><br><br>
                        <label>Last Name</label>
                        <input type="text" name="lastName" value="${user.lastName}" class="input-xlarge"><br><br>
                        <label>Email</label>
                        <input type="text" name="email" value="${user.email}" class="input-xlarge"><br><br>
                        <label>Phone</label>
                        <input type="text" name="phone" value="${user.phone}" class="input-xlarge"><br><br>
                        <label>Address</label>
                        <textarea value="Smith" name="address" rows="3" class="input-xlarge">${user.address}</textarea><br><br>
                        <div>
                            <button type="submit" class="btn btn-primary">Update</button>
                        </div>
                    </form>
                </div>
                <div class="tab-pane fade" id="profile">
                    <form id="tab2" action="UserUpdateControl" method="post">
                        <br>
                        <br>
                        <p style="color: #DF4B3B; font-weight: bold; size: 20px">${mess}</p>
                        <label>New Password</label>
                        <input type="password" name="pass" class="input-xlarge"><br><br>
                        <div>
                            <button type="submit" class="btn btn-primary">Update</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        </main>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
