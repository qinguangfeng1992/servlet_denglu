
<%@ page import="com.qinguangfeng827.impl.ImplSco" %>
<%@ page import="com.qinguangfeng827.entity.Tblscore" %>
<%@ page import="com.qinguangfeng827.impl.ImplCous" %>
<%@ page import="com.qinguangfeng827.entity.Tblcourse" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/26
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Unicorn Admin</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="../css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="../css/colorpicker.css"/>
    <link rel="stylesheet" href="../css/datepicker.css"/>
    <link rel="stylesheet" href="../css/uniform.css"/>
    <link rel="stylesheet" href="../css/select2.css"/>
    <link rel="stylesheet" href="../css/unicorn.main.css"/>
    <link rel="stylesheet" href="../css/unicorn.grey.css" class="skin-color"/>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
</head>
<body>
<%
    Object name=session.getAttribute("name");
    if(name==null){
        response.sendRedirect("login.jsp");
        return ;
    }
%>
<%
    ImplCous implCous = new ImplCous();
    String courseid = request.getParameter("courseid");

    Tblcourse tblcourse  =implCous.selectCousId(courseid);
%>

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
    <a href="#" class="visible-phone"><i class="icon icon-th-list"></i>课程信息管理</a>
    <ul>
        <li class="submenu active open">
            <a href="#"><i class="icon icon-th-list"></i> <span>课程信息列表</span> </a>
            <ul>
                <li class="active"><a href="form-common.html">课程编辑</a></li>
            </ul>
        </li>
    </ul>

</div>


<div id="content">
    <div id="content-header">
        <h1>课程编辑</h1>
    </div>
    <div id="breadcrumb">
        <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>课程管理</a>
        <a href="#" class="current">编辑课程</a>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>
								</span>
                        <h5>填写课程信息</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <form action="../tblcourupd" method="post" class="form-horizontal"/>
                        <div class="control-group">
                            <label class="control-label">课程编号</label>

                            <div class="controls">
                                <input type="text" name="courseid" value="<%=tblcourse .getCourseId()%>"/>

                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label">教员编号</label>

                            <div class="controls">
                                <input type="text" name="teaid" value="<%=tblcourse.getTeaId()%>"/>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">分数</label>

                            <div class="controls">
                                <input type="text" name="coursename" value="<%=tblcourse.getCourseName()%>"/>
                            </div>
                        </div>



                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary">修改</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="row-fluid">
            <div class="span12">

            </div>
        </div>

    </div>
</div>


<script src="../js/jquery.min.js"></script>
<script src="../js/jquery.ui.custom.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/bootstrap-colorpicker.js"></script>
<script src="../js/bootstrap-datepicker.js"></script>
<script src="../js/jquery.uniform.js"></script>
<script src="../js/select2.min.js"></script>
<script src="../js/unicorn.js"></script>
<script src="../js/unicorn.form_common.js"></script>
</body>
</html>
