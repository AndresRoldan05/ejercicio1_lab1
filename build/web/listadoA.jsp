<%-- 
    Document   : listadoA
    Created on : 19/08/2018, 09:58:44 PM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Listado autos!</h1>
        <c:forEach var="a" items="${Carros}">
            |${a.matricula}| |${a.marca}| |${a.modelo}| |${a.año}| |${a.valor}| |${a.caracteristica}|
            <a onclick="return confirm('Estas seguro?')" href="concesionarioservlet?action=delete&id=${a.ID}">Delete</a>
            <hr/>
        </c:forEach>
    </body>
</html>