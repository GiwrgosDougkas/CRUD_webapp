<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Log in</title>
    <#include "partials/head.ftlh">

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="/css/loginStylesheet.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="sidenav">
    <div class="login-main-text">
            <h2>PROPRIUM<br>Repair Services</h2>
        <p>Welcome. Login from here.</p>

    </div>
</div>
<div class="main">
    <div class="col-md-6 col-sm-12">
        <div class="login-form">
            <form name='login' action="/login" method='POST'>
                <div class="form-group">
                    <label>Email</label>
                    <input type="email" class="form-control" placeholder="Email" name="email" id="email">
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input type="password" class="form-control" placeholder="Password" name="password" id="email">
                </div>
                <button type="submit" class="btn btn-black">
                Login
                </button>
                 <#if RequestParameters.error??><br><br><br><h6 class="errormessage">Email or Password were incorrect. Try Again.</h6></#if>
            </form>
        </div>
    </div>
</div>
<#include "partials/scripts.ftlh">
</body>
</html>