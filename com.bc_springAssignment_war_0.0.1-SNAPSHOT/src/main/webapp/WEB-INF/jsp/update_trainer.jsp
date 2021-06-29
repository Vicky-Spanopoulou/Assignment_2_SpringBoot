<%-- 
    Document   : teacherform
    Created on : Jun 18, 2021, 1:41:35 PM
    Author     : vicky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" href="/css/style.css">


    </head>
    <body>
        <div class="form">
            <form:form method="GET" action="update/${trainer.id}" modelAttribute="trainer">
                <h3>Update Trainer:</h3>
                <p>
                    <label>First name:</label>
                    <form:input path="firstName" id="fname"/><br><br>

                    <label>Last name:</label>
                    <form:input path="lastName" id="lname"/><br><br>

                    <label>Subject:</label>
                    <form:input path="subject"/><br><br>
                </p>
                <br>
                <input type="submit" value="Update" id="savebtn" class="buttons"/>
                <button id="back" class="buttons" type="submit" formnovalidate="formnovalidate" formaction="../index.jsp">Back</button>
            </form:form>
            <br>
        </div>
        <script src="/js/myjs.js"></script>
    </body>
</html>
