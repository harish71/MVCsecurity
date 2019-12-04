<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveperson">
    <legend>Personal details</legend>
    First Name:<input type="text"  placeholder="First Name"name="firstName">
    Middle Name:<input type="text" placeholder="First Name" name="middleName">
    Last Name:<input type="text" placeholder="First Name" name="lastName"><br>
    Gender:<input type="radio"  name="gender">Male
           <input type="radio"  name="gender">Female<br>

    marriage status:<input type="text" placeholder="marital status" name="maritalStatus">
    Marriage Date:<input type="text" placeholder="marital date" name="marriageDate"><br><br>
    NATIVE STATE:<input type="text" placeholder="native state" name="state"><br><br>
    RELIGION:<input type="text" placeholder="religion Name" name="religion"><br><br>
    NATIONALITY id:<input type="text" placeholder="National id" name="nationality"><br><br>
	<input type="submit" name="submit">
</form>
</body>
</html>