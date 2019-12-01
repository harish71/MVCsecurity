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
    <form method="post" action="abc" >
        
        UserName:: <input type="text"     name="userName"> <br>
   		Password:: <input type="password" name="password"> <br>
   		<input type="submit" value="Login">
   		<sec:csrfInput/>
    </form>
		  

</body>
</html>