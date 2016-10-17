
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/31
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

欢迎光临大帅哥！！<br/>
<%--<%
 Hobby ho= (Hobby)request.getAttribute("hobby");
%>--%>

<%--
<%=
ho.getUsername()+"<br/>"
%>
<%=
ho.getHobby() + "<br/>"
%>
<%=
ho.getPassword() + "<br/>"
%>
<%=
ho.getSex() + "<br/>"
%>
<%=
ho.getBorn() + "<br/>"
%>
<%=
ho.getPhone() + "<br/>"
%>
<%=
ho.getQQ() + "<br/>"
%>
<%=
ho.getDescr() + "<br/>"
%>
--%>

<hr/>
<%--最后面是获取 实体类里面属性的名字要一致--%>
${sessionScope.job.username}<br/>
${sessionScope.job.password}<br/>
${sessionScope.job.hobby}<br/>
${sessionScope.job.sex}<br/>
${sessionScope.job.address}<br/>
${sessionScope.job.descr}<br/>

</body>
</html>
