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
            <div class="body_banner_stu1" style="height: 100%;">
                <span><a href="indexOfTeacher.jsp">发布题目</a></span>
            </div>
            <div class="body_banner_stu2" style="height: 100%;">
                <span><a href="notice.jsp">发布通知</a></span>
            </div>
            <div class="body_banner_stu3" style="height: 100%;">
                <span><a href="chooseStudent.jsp">管理学生</a></span>
            </div>
            <div class="body_banner_stu4" style="height: 100%;background-color: #e6e6e6;">
                <span><a href="${s }/processs">查看学生进程</a></span>
            </div>
        </div>
    	<div class="body_center">
            <div class="body_table">
                <table class="table">
                    <thead>
                        <tr>
                            <th>姓名</th>
                            <th>课题</th>
                            <th>进度</th>                        
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${Maap }" var="stu">
                        <tr>
                            <td>${stu.key.name }</td>
                            <td>${stu.value }</td>                            
                            <td>${stu.key.process}</td>
                        </tr>
                    </c:forEach>
                    <tr>
                    	<td>0代表未开始，1代表已开始，2代表已完成，3代表已提交</td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="body_bottom">
            <span>@2019 Copyright qqqqwwww</span>
        </div>
    </div>
</body>
</html>