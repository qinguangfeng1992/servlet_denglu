<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Unicorn Admin</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" href="css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="css/unicorn.login.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<div id="logo">
    <img src="img/logo.png" alt=""/>
</div>
<div id="loginbox">
    <form id="loginform" class="form-vertical" action="tblstuval" method="post"/>
    <p>&nbsp;</p>

    <div class="control-group">
        <div class="controls">
            <div class="input-prepend">
                <span class="add-on"><i class="icon-user"></i></span><input type="text" name="stuname" placeholder="请输入用户名"/>
            </div>
        </div>
    </div>
    <div class="control-group">
        <div class="controls">
            <div class="input-prepend">
                <span class="add-on"><i class="icon-lock"></i></span><input type="password" name="stupwd"/>
            </div>
        </div>
    </div>
    <div class="form-actions">

        <span class="pull-right"><input type="submit" class="btn btn-inverse" value="登录"/></span>
    </div>
    </form>

</div>

<script src="js/jquery.min.js"></script>
<script src="js/unicorn.login.js"></script>
</body>
</html>
