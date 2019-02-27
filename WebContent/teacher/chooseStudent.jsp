<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>查看学生进程</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/indexOfT.css">
    <link rel="stylesheet" type="text/css" href="../css/chooseStudent.css">
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
    			<span>李明&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    			<span><a href="#">退出</a></span>
    		</div>
    	</div>
    	<div class="body_banner">
            <div class="body_banner_stu1" style="height: 100%;">
                <span><a href="indexOfTeacher.jsp">发布题目</a></span>
            </div>
            <div class="body_banner_stu2" style="height: 100%;">
                <span><a href="notice.jsp">发布通知</a></span>
            </div>
            <div class="body_banner_stu3" style="height: 100%;background-color: #e6e6e6;">
                <span><a href="chooseStudent.jsp">管理学生</a></span>
            </div>
            <div class="body_banner_stu4" style="height: 100%;">
                <span><a href="procControl.jsp">查看学生进程</a></span>
            </div>
        </div>
    	<div class="body_center">
            <div class="body_table">
                <table class="table">
                    <thead>
                        <tr>
                            <th>姓名</th>
                            <th>方向</th>
                            <th>删除</th>                        
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>张三</td>
                            <td>大数据</td>                            
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>
                        </tr>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>                        
                        </tr>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>
                        </tr>
                        <tr>
                            <td>考研信息交流平台</td>
                            <td>张三</td>                            
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>
                        </tr>
                        <tr>
                            <td>闲置品网络交易平台</td>
                            <td>李四</td>
                            <td><button data-toggle="button" class="btn " type="button">删除</button></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="body_center_page">
                <ul class="pager">
                    <li class="previous"><a href="#">«</a></li>
                    <li class="active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li class="next"><a href="#">»</a></li>
                </ul>
            </div>
        </div>
        <div class="body_bottom">
            <span>@2019 Copyright qqqqwwww</span>
        </div>
    </div>
</body>
</html>