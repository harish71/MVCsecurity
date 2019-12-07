<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1>h1111</h1>
     <form action=" /person/goperson " >
     <fieldset>
     <legend>PERSONAL DETAIL FORM</legend>
     NAME:<input type="text" name="firstName"><br>
     LASTNAME:<input type="text" name="lastName"><br>
     MIDDLENAME:<input type="text" name="middleName"><br>
     MARRAIGEDATE:<input type="text" name="marriageDate" ><br>
     Gender:<select name="gender.id">
       <option value="0">--SELECT--</option>
       <option value="1">MALE</option>
       <option value="2">FEMALE</option>
       <option value="3">OTHER</option>
     </select><br>
     MARRAIGEaTSTUS:<select name="maritalStatus.id">
       <option value="0">--SELECT--</option>
       <option value="1">YES</option>
       <option value="2">no</option>
     </select><br>
    COUNTRY :
     <select name="nationality.id">
     <option value="0">--SELECT--</option>
      <c:forEach items="${conrar}" var="ref">
          <option value="${ref.id}">${ref.name}</option>
      </c:forEach>
     </select><br>
     STATE:<select name="state.id">
     <option value="0">--SELECT--</option>
       <option value="1">AP</option>
       <option value="2">TS</option>
       <option value="3">MUM</option>
       <option value="4">KAR</option>
       <option value="5">TN</option>
     </select><br>
     RELIGIN:<input type="radio" name="religion" value="1">HINDU
     <input type="radio" name="religion" value="2">CHRISTIAN
     <input type="radio" name="religion" value="3">MUSILIM<br>
     
     <input type="submit" value="save"> 
     </fieldset>
     </form>
</body>
</html>