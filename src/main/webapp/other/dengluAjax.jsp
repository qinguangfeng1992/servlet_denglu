<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/27
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="../js/jquery-3.0.0.js">
</script>
<script>
    /*  $(function(){



     })*/
    function diao() {
        $.post("tblstuajax", $("#f").serialize(), function (data) {
                    var a = eval(data);
                    if (a) {
                        alert("登录成功！")
                        location = "denglu.jsp"
                    } else {
                        alert("登录失败！")
                    }
                }
        )
    }
</script>
<html>
<head>
    <title>测试Servlet</title>
</head>
<body>
大家好，我是周杰伦

<form action="javascript:void(0)" method="get" id="f">
    <input type="text" name="textname">
    <input type="password" name="pwd">
    <input type="button" value="提交" onclick="diao()">
</form>


</body>
</html>
