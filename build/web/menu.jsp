<%-- 
    Document   : menu
    Created on : 4/07/2018, 10:45:02 PM
    Author     : Andres
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${empty login}">
    |<a href="login.jsp">Login</a>|
    |<a href="registroC.jsp">RegistarCliente</a>|
    |<a href="registroV.jsp">RegistarCarro</a>|
    |<a href="registroA.jsp">RegistarVenta</a>|
    
</c:if>
<c:if test="${not empty login}">
    |<a href="concesionarioservlet?action=logout">Logout</a>|
    |<a href="concesionarioservlet?action=listaClientes">ListaCliente</a>|
    |<a href="concesionarioservlet?action=listaVentas">ListaVentas</a>|
    |<a href="concesionarioservlet?action=list">ListaCarro</a>|
</c:if>
|<a href="about.jsp">About</a>|
<hr/>
