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
        <title>New Trainer</title>
        <link rel="stylesheet" href="/css/style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </head>
    <body>
        <div class="form">
        <form:form method="POST" action="insertform" modelAttribute="newtrainer" >
            <h3>New Trainer:</h3>
            <p>
                <label>First name:</label>
                <form:input path="firstName" id="fname"/>
                <form:errors path="firstName"/>
                <br><br>

                <label>Last name:</label>
                <form:input path="lastName" id="lname"/>
                <form:errors path="lastName"/><br><br>

                <label>Subject:</label>
                <form:input path="subject"/>
                <form:errors path="subject"/><br><br>
                <!--                <div id="a""></div>-->
            </p>
            <br>
            <input type="submit" value="Save" id="savebtn" class="buttons"/>
            <button id="back" class="buttons" type="submit" formnovalidate="formnovalidate" formaction="index.jsp">Back</button>
        </form:form>
        <!--<br>-->
        
        </div>
        
        <script src="/js/myjs.js"></script>
    </body>
</html>
