<%-- 
    Document   : signUp
    Created on : Mar 15, 2021, 10:46:41 AM
    Author     : nam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
        <link href="css/login.css" rel="stylesheet" type="text/css"/>
        <title>Registration Form</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <main>
        <div id="logreg-forms" style="clear: both; background-image: url(image/giày-sneakers-2-elle-man-8-475x317.jpg);width: 100%;height: 600px;">
            <br><br><br>
            <form action="SignUpControl" method="post">
                <h1 class="h3 mb-3 font-weight-normal" style="text-align: center; color: aqua;"> Sign up</h1>
                <p style="color: #DF4B3B; font-weight: bold; size: 20px">${mess}</p>
                <input oninput="checkUser()" name="user" type="text" id="user-name" class="form-control" placeholder="User name" required="" autofocus="">
                <input name="firstName" type="text" id="first-name" class="form-control" placeholder="Fisrt Name" required="" autofocus="">
                <input name="lastName" type="text" id="last-name" class="form-control" placeholder="Last Name" required="" autofocus="">
                <input oninput="checkPass()" name="pass" type="password" id="user-pass" class="form-control" placeholder="Password" required autofocus="">
                <input name="repass" type="password" id="user-repeatpass" class="form-control" placeholder="Repeat Password" required autofocus="">

                <button class="btn btn-primary btn-block" type="submit"><i class="fas fa-user-plus"></i> Sign Up</button>
                <a href="login.jsp"><i class="fas fa-angle-left"></i> Back</a>
            </form>
            <br>
        </div>
        </main>
        <%@include file="footer.jsp"%>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
            function toggleResetPswd(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle() // display:block or none
                $('#logreg-forms .form-reset').toggle() // display:block or none
            }

            function toggleSignUp(e) {
                e.preventDefault();
                $('#logreg-forms .form-signin').toggle(); // display:block or none
                $('#logreg-forms .form-signup').toggle(); // display:block or none
            }

            $(() => {
                // Login Register Form
                $('#logreg-forms #forgot_pswd').click(toggleResetPswd);
                $('#logreg-forms #cancel_reset').click(toggleResetPswd);
                $('#logreg-forms #btn-signup').click(toggleSignUp);
                $('#logreg-forms #cancel_signup').click(toggleSignUp);
            })
        </script>
        <br>
    </body>
</html>
