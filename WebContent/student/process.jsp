<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>进度控制</title>
	<link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/indexOfS.css">
    <link rel="stylesheet" type="text/css" href="../css/zui.css">
    <link rel="stylesheet" type="text/css" href="../css/process.css">
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
            <div class="body_banner_stu1" style="height: 100%;">
                <span><a href="indexOfStudent.jsp">通知</a></span>
            </div>
            <div class="body_banner_stu2" style="height: 100%;">
                <span><a href="chooseCourse.jsp">选题</a></span>
            </div>
            <div class="body_banner_stu3" style="height: 100%;background-color: #e6e6e6;">
                <span><a href="process.jsp">进度管理</a></span>
            </div>
        </div>
    	<div class="body_center">
            <div class="body_center_form">
                <form>
    		        <div class="body_process1">
                        <div class="switch">
                            <input type="checkbox">
                            <label>已开始</label>
                        </div>
                    </div>
                    <div class="body_process2">
                        <div class="switch">
                            <input type="checkbox">
                            <label>已完成</label>
                        </div>
                    </div>
                    <div class="body_process3">
                        <div class="switch">
                            <input type="checkbox">
                            <label>已提交</label>
                        </div>
                    </div>
                    <div class="body_process_save">
                        <button class="btn btn-block " type="commit">保存状态</button>
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