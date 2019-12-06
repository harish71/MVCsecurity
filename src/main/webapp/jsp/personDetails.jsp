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
<form action="/hr/savePage" method="post">
<fieldset>
<legend>Person Details</legend>
<input type="hidden" name="id" ><br>
Last Name    :<input type="text" name="lastName"><br>
First Name   :<input type="text" name="firstName"><br>
Middle Name  :<input type="text" name="MiddleName"><br>
Gender       :<core:forEach items="${gendersAttr}" var="obj">
               <input type="radio" name="gender.id" value="${obj.id}">${obj.name}
               </core:forEach><br>
MaritalStatus:<core:forEach items="${martialstatusAttr}" var="obj">
               <input type="radio"  name="maritalStatus.id" value="${obj.id}" checked>${obj.name}
              </core:forEach><br>
              
MarriageDate :<input type="date" name="marriageDate"><br>
State        :<select name="state.id">
               <option value="0">---SELECT--</option>
               <core:forEach items="${statesAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>
Religion     :<select name="religion.id">
               <option value="0">---SELECT----</option>
               <core:forEach items="${religionsAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>
Nationality  :<select name="nationality.id">
                  <option value="0">---SELECT---</option>
                 <core:forEach  items="${countryAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>
<input type="submit" value="Save"><br>
</fieldset>
 <a href="/hr/addressPage">Next</a>
<sec:csrfInput/>
</form>
</body>
</html>