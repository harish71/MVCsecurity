<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="core" uri="http://java.sun.com/jstl/core_rt" %>  
 <%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function savePerson(){
	document.forms[0].action="/hr/savePage";
	document.forms[0].submit();
}
function getAll(){
	document.forms[0].action="/hr/getAll";
	document.forms[0].submit();
}
function updatePerson(){
	document.forms[0].action="/hr/savePage";
	document.forms[0].submit();
}
function deletePerson(){
	document.forms[0].action="/hr/deleteperson";
	document.forms[0].submit();
}

</script>
</head>
<body>
<form>
<fieldset>
<legend>Person Details</legend>
<input type="hidden" name="id" value="${personByid.id}"><br>
Last Name    :<input type="text" name="lastName" value="${personByid.lastName}"><br>
First Name   :<input type="text" name="firstName" value="${personByid.firstName}"><br>
Middle Name  :<input type="text" name="middleName" value="${personByid.middleName}"><br>
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
<input type="button" value="Save" onclick="savePerson()">
<input type="button" value="getAll" onclick="getAll()">
<input type="button" value="update" onclick="updatePerson()">
<input type="button" value="delete" onclick="deletePerson()">
</fieldset>
 <a href="/hr/addressPage?id=${personByid.id}">Next</a>
<sec:csrfInput/>
</form>
<core:if test="${personsattr!=null}">
<table border="4">
<tr>
<th>Last name</th>
<th>First name</th>
<th>Middle name</th>
<th>Gender</th>
<th>MaritalStatus</th>
<th>MarriageDate</th>
<th>State</th>
<th>Religion</th>
<th>Nationality</th>
</tr>
<core:forEach items="${personsattr}" var="obj">
<tr>
<td><a href="/hr/getById?id=${obj.id}">${obj.lastName}</a></td>
<td>${obj.firstName}</td>
<td>${obj.middleName}</td>
<td>${obj.gender.name}</td>
<td>${obj.maritalStatus.name}</td>
<td>${obj.marriageDate}</td>
<td>${obj.state.name}</td>
<td>${obj.religion.name}</td>
<td>${obj.nationality.name}</td> 
</tr>
</core:forEach>
</table>
</core:if>
</body>
</html>