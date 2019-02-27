<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>选题</title>
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/indexOfS.css">
    <link rel="stylesheet" type="text/css" href="../css/chooseCourse.css">
    <link rel="stylesheet" type="text/css" href="../css/zui.css">
    <script src="../js/jquery-2.2.3.min.js"></script>
</head>
<body>
    <div class="body">
    	<div class="body_top">
    		<div class="body_top_title">
    			<span>河北师范大学软件学院毕业设计管理平台</span>
    		</div>
    		<div class="body_top_person">
    			<span>李明&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    			<span><a href="#">退出</a></span>
    		</div>
    	</div>
    	<div class="body_banner">
            <div class="body_banner_stu1" style="height:100%;">
                <span><a href="indexOfStudent.jsp">通知</a></span>
            </div>
            <div class="body_banner_stu2" style="height:100%;">
                <span><a href="chooseCourse.jsp">选题</a></span>
            </div>
            <div class="body_banner_stu3" style="height:100%;">
                <span><a href="process.jsp">进度管理</a></span>
            </div>
        </div>
    	<div class="body_center">
    		<div class="body_table">
                <table class="table">
                    <thead>
                        <tr>
                            <th>题目</th>
                            <th>老师</th>
                            <th>选择</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">选择</button></td>
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