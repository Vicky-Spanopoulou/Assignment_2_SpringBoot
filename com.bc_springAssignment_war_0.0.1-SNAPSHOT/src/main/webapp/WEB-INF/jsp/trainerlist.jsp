<%-- 
    Document   : trainerlist
    Created on : Jun 19, 2021, 4:17:28 PM
    Author     : vicky
--%>

<%@page import="com.springAssignment.spvicky.model.Trainer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" href="/css/style.css">
        <title>Trainers</title>
    </head>
    <body>
        <div id="titleh2">
            <h2>Trainer table</h2>
        </div>
        <div class="all_trainers">
            <table>
                <tr>
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Subject</th>
                </tr>
                <c:forEach var="trainer" items="${viewtrainers}">
                    <tr>
                        <td>${trainer.firstName}</td>
                        <td>${trainer.lastName}</td>
                        <td>${trainer.subject}</td>
                        <td><a href="/edit/${trainer.id}"><button>update</button></a></td>
                        <td><a href="/delete/${trainer.id}"><button>delete</button></a></td>
                    </tr>
                </c:forEach>               
            </table> 
        </div>
        <br>
        <div id="home_btn">
            <a href="index.jsp"><button class="buttons">Home</button></a>
        </div>
        <br>

        <script src="/js/myjs.js"></script>
    </body>
</html>
