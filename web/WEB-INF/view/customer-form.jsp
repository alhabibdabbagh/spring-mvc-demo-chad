<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: habib
  Date: 10/18/22
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
</head>
<style>
    .error{
        color: red;
    }
</style>
<body>

<i> fill out the form </i>
<br><br>

<form:form action="processForm" modelAttribute="customer">

    First Name :  <form:input path="firstName" ></form:input>
    <br><br>
    last Name :  <form:input path="lastName"  />
    <form:errors path="lastName" cssClass="error"/>
    <br><br>
    <br><br>
     Age :  <c:input path="age"/>
    <c:errors path="age" cssClass="error"/>
    <br><br>

    Postal Code :  <c:input path="postalCode"/>
    <c:errors path="postalCode" cssClass="error"/>
    <br><br>
    <input type="submit" name="submit" value="submit"/>


</form:form>

</body>
</html>
