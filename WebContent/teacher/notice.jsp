<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>发布题目</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/indexOfT.css">
    <link rel="stylesheet" type="text/css" href="../css/notice.css">
    <link rel="stylesheet" type="text/css" href="../css/zui.css">
    <script src="../js/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="../js/zui.js"></script>
</head>
<body>
    <div class="body">
    	<div class="body_top">
    		<div class="body_top_title">
    			<span>河北师范大学软件学院毕业设计管理平台</span>
    		</div>
    		<div class="body_top_person">
    			<span>${teacher.name }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    			<span><a href="${s}/teacherExit">退出</a></span>
    		</div>
    	</div>
    	<div class="body_banner">
            <div class="body_banner_stu1" style="height: 100%;">
                <span><a href="indexOfTeacher.jsp">发布题目</a></span>
            </div>
            <div class="body_banner_stu2" style="height: 100%;background-color: #e6e6e6;">
                <span><a href="notice.jsp">发布通知</a></span>
            </div>
            <div class="body_banner_stu3" style="height: 100%;">
                <span><a href="chooseStudent.jsp">管理学生</a></span>
            </div>
            <div class="body_banner_stu4" style="height: 100%;">
                <span><a href="${s }/processs">查看学生进程</a></span>
            </div>
            <div class="body_banner_stu4" style="height: 100%;">
                <span><a href="${s}/mod">查看学生通知</a></span>
            </div>
        </div>
    	<div class="body_center">
            <div class="notice_form">
            <form action="${s}/modify" method="post">
                <div class="form-group">
                    <label for="exampleInputAccount1">通知主题</label>
                    <input type="text" name="theme" class="form-control" id="exampleInputAccount1" placeholder="请输入通知主题">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">发布人</label>
                    <input type="text" name="teacherName" class="form-control" id="exampleInputPassword1" placeholder="请输入发布人姓名">
                </div>
                <textarea id="content" name="content" class="form-control kindeditor" style="height:150px;">请输入通知内容...</textarea>
                <button type="submit" class="btn btn-primary" style="margin: 1em auto;">发布通知</button>
            </form>
            </div>
    	</div>
    	<div class="body_bottom">
    		<span>@2019 Copyright qqqqwwww</span>
    	</div>
    </div>
</body>
</html>