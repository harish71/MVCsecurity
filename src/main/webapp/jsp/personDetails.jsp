<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/hr/savePage" method="post">
<fieldset>
<legend>Person Details</legend>
Last Name    :<input type="text" name="lastName"><br>
First Name   :<input type="text" name="firstName"><br>
Middle Name  :<input type="text" name="MiddleName"><br>
Gender       : <input type="radio" name="gender" value="male" checked> Male
               <input type="radio" name="gender" value="female"> Female
               <input type="radio" name="gender" value="others"> Other<br>
MaritalStatus:<input type="radio"  name="maritalStatus" value="married" checked> Married
               <input type="radio" name="maritalStatus" value="unmarried"> UnMarried<br>
MarriageDate :<input type="text" name="marriageDate"><br>
State        :<select name="state">
                  <option value="AP">AP</option>
                  <option value="TS">TS</option>
                  <option value="kerala">Kerala</option>
              </select><br>
Religion     :<select name="religion">
                  <option value="hindhu">Hindhu</option>
                  <option value="muslim">Muslim</option>
                  <option value="sikku">Sikku</option>
                  <option value="others">Others</option>
              </select><br>
Nationality  :<select name="religion">
                  <option value="india">India</option>
                  <option value="USA">USA</option>
              </select><br>
<input type="submit" value="Save"><br>
</fieldset>
</form>
</body>
</html>