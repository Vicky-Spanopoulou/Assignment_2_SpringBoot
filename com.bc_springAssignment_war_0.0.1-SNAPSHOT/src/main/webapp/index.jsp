<%-- 
    Document   : index
    Created on : Jun 17, 2021, 11:15:07 AM
    Author     : vicky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/css/style.css">
        <title>Home page</title>
    </head>
    <body>
        <div class="indexpage">
            <h2>Welcome!</h2>
            <br>
            <div class="indexbuttons">
                <a href="form"><button class="buttons">Add new trainer</button></a>
                <a href="alltrainers"><button class="buttons">All Trainers</button></a>
            </div>
        </div>
    </body>
</html>
