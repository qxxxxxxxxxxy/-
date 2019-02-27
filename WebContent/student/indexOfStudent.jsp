<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/indexOfS.css">
    <link rel="stylesheet" type="text/css" href="../css/zui.css">
    <script src="../js/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="../js/zui.js"></script>
    <style> #accordion > div + p {padding-top: 10px;} </style>
</head>
<body>
    <div class="body">
    	<div class="body_top">
    		<div class="body_top_title">
    			<span>河北师范大学软件学院毕业设计管理平台</span>
    		</div>
    		<div class="body_top_person">
    			<span>${stu.name }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>
    			<span><a href="#">退出</a></span>
    		</div>
    	</div>
    	<div class="body_banner">
    		<div class="body_banner_stu1" style="height: 100%;background-color: #e6e6e6;">
                <span><a href="indexOfStudent.jsp">通知</a></span>
            </div>
            <div class="body_banner_stu2" style="height: 100%;">
                <span><a href="chooseCourse.jsp">选题</a></span>
            </div>
            <div class="body_banner_stu3" style="height: 100%;">
                <span><a href="process.jsp">进度管理</a></span>
            </div>
    	</div>
    	<div class="body_center">
    		<div class="body_center_notice">
                <div id="accordion">
                    <p>
                        <a href="#collapseExample1" data-toggle="collapse" data-parent="#accordion" class="btn btn-link" style="margin-top:1em;">关于毕业设计的通知1</a>
                    </p>
                    <div class="collapse" id="collapseExample1">
                        <div class="bg-primary with-padding">
                            <p>被折叠元素内容。</p>
                            <p>多个触发元素可以指向同一个折叠内容。</p>
                        </div>
                    </div>
                    <hr>
                    <p>
                        <a href="#collapseExample2" data-toggle="collapse" data-parent="#accordion" class="btn btn-link collapsed">关于毕业设计的通知1</a>
                    </p>
                    <div class="collapse" id="collapseExample2">
                        <div class="bg-success with-padding">
                            <p>被折叠元素内容。</p>
                            <p>多个触发元素可以指向同一个折叠内容。</p>
                        </div>
                    </div>
                    <hr>
                    <p>
                        <a href="#collapseExample3" data-toggle="collapse" data-parent="#accordion" class="btn btn-link collapsed">关于毕业设计的通知1</a>
                    </p>
                    <div class="collapse" id="collapseExample3">
                        <div class="bg-danger with-padding">
                            <p>被折叠元素内容。</p>
                            <p>多个触发元素可以指向同一个折叠内容。</p>
                        </div>
                    </div>
                    <hr>
                    <p>
                        <a href="#collapseExample4" data-toggle="collapse" data-parent="#accordion" class="btn btn-link collapsed">关于毕业设计的通知1</a>
                    </p>
                    <div class="collapse" id="collapseExample4">
                        <div class="bg-primary with-padding">
                            <p>被折叠元素内容。</p>
                            <p>多个触发元素可以指向同一个折叠内容。</p>
                        </div>
                    </div>
                    <hr>
                    <p>
                        <a href="#collapseExample5" data-toggle="collapse" data-parent="#accordion" class="btn btn-link collapsed">关于毕业设计的通知1</a>
                    </p>
                    <div class="collapse" id="collapseExample5">
                        <div class="bg-success with-padding">
                            <p>被折叠元素内容。</p>
                            <p>多个触发元素可以指向同一个折叠内容。</p>
                        </div>
                    </div>
                    <hr>
                    <p>
                        <a href="#collapseExample6" data-toggle="collapse" data-parent="#accordion" class="btn btn-link collapsed">关于毕业设计的通知1</a>
                    </p>
                    <div class="collapse" id="collapseExample6">
                        <div class="bg-danger with-padding">
                            <p>被折叠元素内容。</p>
                            <p>多个触发元素可以指向同一个折叠内容。</p>
                        </div>
                    </div>
                </div>
            </div>
    	</div>
    	<div class="body_bottom">
    		<span>@2019 Copyright qqqqwwww</span>
    	</div>
    </div>
</body>
</html>