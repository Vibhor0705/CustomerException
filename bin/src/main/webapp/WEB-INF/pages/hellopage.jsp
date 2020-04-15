<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<body>
<h1>User information </h1>
<h2>
message is model object name and below we are using model object by its name

<c:out value="${message}"/> in angular {{message}}
<br>
<c:out value="hello" /> in angular {{"hello"}}

<br>
<c:out value="${10*2}" /> in angular {{10*2}}
</h2>
</body>
</html>