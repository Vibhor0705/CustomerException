<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h1>Record of all Customer</h1>
<table border="1">
    <tr>
      <th>
        Id
        
      </th>
      <th > 
        Name
        </th>
       
           
 </tr>
 <c:forEach items="${fetch}" var="customer">
<tr >
    <td><c:out value="${customer.cid}"/></td> 
    <td><c:out value="${customer.cname}"/></td> 
    
  </tr>
</c:forEach>
 </table>
 
</body>
</html>