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
            <div class="body_banner_stu1" style="height: 100%;background-color: #e6e6e6;">
                <span><a href="indexOfTeacher.jsp">发布题目</a></span>
            </div>
            <div class="body_banner_stu2" style="height: 100%;">
                <span><a href="notice.jsp">发布通知</a></span>
            </div>
            <div class="body_banner_stu3" style="height: 100%;">
                <span><a href="chooseStudent.jsp">管理学生</a></span>
            </div>
            <div class="body_banner_stu4" style="height: 100%;">
                <span><a href="${s }/processs">查看学生进程</a></span>
            </div>
        </div>
    	<div class="body_center">
            <div class="body_table">
                <table class="table">
                    <thead>
                        <tr>
                            <th>题目</th>
                            <th>老师</th>
                            <th>删除</th>                        
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${projectOfTeacher }" var = "p">
                        <tr>
                            <td>${p.name }</td>
                            <td>${teacher.name }</td>                            
                            <td><a class="btn" href="${s }/deleteProject?projectName=${p.name}&tId=${teacher.teacherId}">删除</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
    		<div class="body_center_form">
                <form class="form-horizontal" action="${s }/teacherAddProject" method="post">
                    <div class="form-group">
                        <label for="exampleInputAccount4" class="col-sm-2">课题</label>
                        <div class="col-md-6 col-sm-10">
                            <input type="text" class="form-control" name="projectName"id="exampleInputAccount4" placeholder="请输入课题名称">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword4" class="col-sm-2">导师</label>
                        <div class="col-md-6 col-sm-10">
                            <input type="text" class="form-control" name="teachersid"id="exampleInputPassword4" placeholder="请输入导师姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-2 col-sm-10">
                            <button type="submit" class="btn btn-default" style="background-color: #0483d4;color: #FFFFFF;">
                                <a href="#" style="text-decoration: none;color: #FFFFFF;">添加课题</a>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
    	</div>
    	<div class="body_bottom">
    		<span>@2019 Copyright qqqqwwww</span>
    	</div>
    </div>
</body>
</html>