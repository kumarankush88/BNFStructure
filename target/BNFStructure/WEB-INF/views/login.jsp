<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div align = "center">
<form:form id ="loginForm" method="post" action="loginUser" modelAttribute="user">  

Username:<form:input type ="text" size="40" path="userName"  /><br/><br/>  
Password:<form:input type ="password" size="40" path="password"  /><br/><br/>  
<div>
<u><a href="#" onclick="document.forms['loginForm'].submit();">Login</a></u>
</div>
 </form:form> 
</div>  
</body>
</html>