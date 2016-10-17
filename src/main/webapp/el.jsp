<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/31
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name="form1" method="post" action="myhobby">
  <table width="384" border="1" cellspacing="0" cellpadding="0">
    <tr>
      <td height="64" colspan="2" align="center">表格</td>
    </tr>
    <tr>
      <td width="185" height="43" align="right">用户名：</td>
      <td width="199"><label for="t"></label>
      <input type="text" name="username" id="t"></td>
    </tr>
    <tr>
      <td height="53" align="right">密码：</td>
      <td><input type="password" name="password" id="t2"></td>
    </tr>
    <tr>
      <td height="52" align="right">兴趣爱好：</td>
      <td><input type="checkbox" name="h" value="足球" >
      足球
        <input type="checkbox" name="h" value="篮球" >
        篮球
        <input type="checkbox" name="h" value="睡觉">
        睡觉
     </td>
    </tr>
    <tr>
      <td height="57" align="right">性别：</td>
      <td><input type="text" name="sex" id="t4"></td>
    </tr>
    <tr>
      <td height="59" align="right">生日：</td>
      <td><input type="text" name="born" id="t5"></td>
    </tr>
    <tr>
      <td height="52" align="right">手机号：</td>
      <td><input type="text" name="phone" id="t6"></td>
    </tr>
    <tr>
      <td height="65" align="right">QQ：</td>
      <td><input type="text" name="QQ" id="t7"></td>
    </tr>
    <tr>
      <td height="46" align="right">自我描述：</td>
      <td><input type="text" name="descr" id="t8"></td>
    </tr>
    <tr>
      <td height="73" align="center"><input type="submit" name="zhuce" id="s" value="注册"></td>
      <td align="center">重置</td>
    </tr>
  </table>
</form>
</body>
</html>
