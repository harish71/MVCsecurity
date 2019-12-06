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
<form action="/hr/saveAddrs" method="post">
<fieldset>
<legend>Address Details</legend>
House No     :<input type="text" name="houseNo"><br>
Street       :<input type="text" name="street"><br>
Area         :<input type="text" name="area"><br>
LandMark     : <input type="text" name="landMark"><br>
Pincode      :<input type="text" name="pincode"><br>
City:          <select name="city.id">
               <option value="0">---SELECT--</option>
               <core:forEach items="${cityAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>
State        :<select name="state.id">
               <option value="0">---SELECT--</option>
               <core:forEach items="${statesAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>
Country      :<select name="country.id">
                  <option value="0">---SELECT---</option>
                 <core:forEach  items="${countryAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>
Address Type :<select name="type.id">
               <option value="0">---SELECT----</option>
               <core:forEach items="${addtypeAttr}" var="obj">
                  <option value="${obj.id}">${obj.name}</option>
                  </core:forEach>
              </select><br>

<input type="submit" value="Save"><br>
</fieldset>
 <a href="/hr/contactPage">Next</a>
<sec:csrfInput/>
</form>

</body>
</html>