<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Hello We are in HR Page</h1>
   <h3>${username}</h3>
   
   <a href="/logout"> LOGOUT</a>
   <sec:csrfInput/>
</body>
</html>