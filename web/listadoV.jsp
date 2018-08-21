<%-- 
    Document   : listadoV
    Created on : 4/07/2018, 11:04:00 PM
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
        <h1>Listado ventas!</h1>
        <c:forEach var="a" items="${Ventas}">
            |${a.ID_venta}| |${a.matricula}| |${a.propietario}| |${a.fecha}| |${a.total}|
            <a onclick="return confirm('Estas seguro?')" href="concesionarioservlet?action=delete&id=${a.ID_venta}">Delete</a>
            <hr/>
        </c:forEach>
    </body>
</html>
