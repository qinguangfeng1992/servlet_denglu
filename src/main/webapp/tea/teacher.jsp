
<%@ page import="java.util.List" %>
<%@ page import="com.qinguangfeng827.impl.ImplTea" %>
<%@ page import="com.qinguangfeng827.entity.Tblteacher" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/26
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  Object name=session.getAttribute("name");
  if(name==null){
    response.sendRedirect("login.jsp");
    return ;
  }
%>
<%
  ImplTea implTea = new ImplTea();
  List<Tblteacher> list = implTea.selectTeaAll();

%>



<!DOCTYPE html>
<html lang="en">
<head>
  <title>教师信息管理</title>
  <meta charset="UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <link rel="stylesheet" href="../css/bootstrap.min.css"/>
  <link rel="stylesheet" href="../css/bootstrap-responsive.min.css"/>
  <link rel="stylesheet" href="../css/uniform.css"/>
  <link rel="stylesheet" href="../css/select2.css"/>
  <link rel="stylesheet" href="../css/unicorn.main.css"/>
  <link rel="stylesheet" href="../css/unicorn.grey.css" class="skin-color"/>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>


<div id="header">
  <h1><a href="./dashboard.html"></a></h1>
</div>


<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav btn-group">
    <li class="btn btn-inverse"><a title="" href="#"><i class="icon icon-user"></i> <span
            class="text"><%=name %></span></a></li>
    <li class="btn btn-inverse"><a title="" href="../login.jsp"><i class="icon icon-share-alt"></i> <span
            class="text">退出</span></a></li>
  </ul>
</div>

<div id="sidebar">
  <a href="#" class="visible-phone"><i class="icon icon-th-list"></i>考试信息管理</a>
  <ul>
    <li >
      <a href="../stu/student.jsp"><i class="icon icon-th"></i> <span>学员信息列表</span> </a>
      <ul>
        <li class="active"><a href="../stu/addstu.jsp">新增学员</a></li>
      </ul>
    </li>

    <li class="submenu active ">
      <a href="#"><i class="icon icon-th"></i> <span>教师信息列表</span> </a>
      <ul>
        <li class="active"><a href="addtea.jsp">新增教师</a></li>
      </ul>
    </li>

    <li >
      <a href="../course/course.jsp"><i class="icon icon-th"></i> <span>课程信息列表</span> </a>
      <ul>
        <li class="active"><a href="../course/addcour.jsp">新增课程</a></li>
      </ul>
    </li>

    <li >
      <a href="../sco/score.jsp"><i class="icon icon-th"></i> <span>分数信息列表</span> </a>
      <ul>
        <li class="active"><a href="#">新增分数</a></li>
      </ul>
    </li>

  </ul>

</div>


<div id="content">
  <div id="content-header">
    <h1>教师信息管理</h1>
  </div>
  <div id="breadcrumb">
    <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>合众艾特</a>
    <a href="#" class="current">教师信息</a>
  </div>
  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <div class="widget-box">
          <div class="widget-title">
            <h5>教师信息列表</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
              <tr>
                <th style="text-align: center;font-family:微软雅黑;"><h5>教师编号</h5></th>
                <th style="text-align: center;font-family:微软雅黑;"><h5>姓名</h5></th>

                <th style="text-align: center;font-family:微软雅黑;"><h5>编辑</h5></th>
                <th style="text-align: center;font-family:微软雅黑;"><h5>删除</h5></th>

              </tr>
              </thead>
              <%
                for (Tblteacher tb : list) {
              %>
              <tbody>

              <td style="text-align: center;font-family:Consolas;"><strong><%=tb.getTeaId()%>
              </strong></td>
              <td style="text-align: center;font-family:Consolas;"><strong><%=tb.getTeaName()%>
              </strong></td>


              <td style="text-align: center;font-family:Consolas;"> <a href="/tea/edittea.jsp?teaid=<%=
              tb.getTeaId()
              %>"/> 编辑 </a> </td>
              <td style="text-align: center;font-family:Consolas;"> <a href="javascript:deleteTea(<%=tb.getTeaId()%>)"/> 删除 </a> </td>



              </tr>
              <%
                }
              %>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
<script>

  function deleteTea(teaid) {

    var a = window.confirm("确定删除吗？");
    if (a == true) {
      location = '../tblteadele?teaid='+ teaid;
    }

  }


</script>
<script src="../js/jquery.min.js"></script>
<script src="../js/jquery.ui.custom.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/jquery.uniform.js"></script>
<script src="../js/select2.min.js"></script>
<script src="../js/jquery.dataTables.min.js"></script>
<script src="../js/unicorn.js"></script>

</body>
</html>

