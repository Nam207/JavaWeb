<%-- 
    Document   : ManagerProduct
    Created on : Dec 28, 2020, 5:19:02 PM
    Author     : nam
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Look Account</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>Look <b>Account</b></h2>
                        </div>
                        <div class="col-sm-6">
                        </div>
                    </div>
                </div>
            </div>
            <div id="editEmployeeModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <form action="AdminUserControl" method="post">
                            <div class="modal-header">						
                                <h4 class="modal-title">Account</h4>
                                <a href="ManagerProductControl"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button></a>
                            </div>
                            <div class="modal-body">	
                                <div class="form-group">
                                    <label>ID</label>
                                    <input value="${acc.id}" name="id" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Account</label>
                                    <input readonly value="${acc.user}" name="user" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Password</label>
                                    <input readonly value="${acc.pass}" name="password" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Fisrt Name</label>
                                    <input readonly value="${us.firstName}" name="firstName" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Last Name</label>
                                    <input readonly value="${us.lastName}" name="lastName" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Phone</label>
                                    <input readonly value="${us.phone}" name="phone" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Email</label>
                                    <input readonly value="${us.email}" name="email" type="text" class="form-control" required>
                                </div>
                                <div class="form-group">
                                    <label>Address</label>
                                    <textarea readonly name="description" class="form-control" required>${us.address}</textarea>
                                </div>   
                            </div>
                    </div>
                    <div class="modal-footer">
                        <input type="submit" class="btn btn-success" value="OK">
                    </div>
                    </form>
                </div>
            </div>
        </div>

    </div>


    <script src="js/manager.js" type="text/javascript"></script>
</body>
</html>