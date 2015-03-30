<%-- 
    Document   : Home
    Created on : Mar 30, 2015, 1:55:43 PM
    Author     : Tung
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>List of Product</h1>
        <table>
            <c:forEach items="${list}" var="pro">
            <tr>
                <td>${pro.name}</td>
                <td>${pro.price}</td>
            </tr>
            </c:forEach>
        </table>
    </body>
</html>
