<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name View</title>
</head>
<body>

<!--  this is with request object-->
<%-- Hello <%=request.getAttribute("firstName") %> --%>

<!-- this is to use with request param model -->
date is :${Date}  <br/>
hello ${firstName} <br/>

-------------------------<br/>
List of team members 
${Names}


</body>
</html>






