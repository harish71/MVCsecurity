<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="core" uri="http://java.sun.com/jstl/core_rt" %>  
 <%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/hr/savecontactPage" method="post">
<fieldset>
<legend>Person Details</legend>
Phone Number    :<input type="text" name="number"><br>
Email   :<input type="text" name="email"><br>
Landline Number  :<input type="text" name="landline"><br>
Fax: <input type="text" name="fax"><br>
<input type="hidden" name="${personID}"><br>
<input type="submit" value="Save"><br>


</fieldset>
<sec:csrfInput/>
</form>
</body>
</html>