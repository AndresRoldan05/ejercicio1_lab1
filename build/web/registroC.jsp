<%-- 
    Document   : registroC
    Created on : 4/07/2018, 11:03:05 PM
    Author     : Andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="style.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.theme.min.css">

        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        <h1>Hello World!</h1>
        <div class ="container well">
<form action="concesionarioservlet?action=insertarCliente" method="post">
<table>
<tr>
<th> <label><b>ID:</b></label></th>
<th> <input type="text" placeholder="Enter ID" class="form-control" name="ID" required=""/>
</th>
</tr>
<tr>
<th><label><b>nombre:</b></label></th>
<th><input type="nombre" placeholder="Enter nombre" class="form-control" name="nombre" required=""/></th>
</tr>
<tr>
<th><label><b>apellido:</b></label></th>
<th><input type="apellido" placeholder="Enter apellido" class="form-control" name="apellido" required=""/></th>
</tr>
<tr>
<th><label><b>correo_electronico:</b></label></th>
<th><input type="correo_electronico" placeholder="Enter correo_electronico" class="form-control" name="correo_electronico" required=""/></th>
</tr>
<tr>
<th><label><b>contraseña:</b></label></th>
<th><input type="contraseña" placeholder="Enter contraseña" class="form-control" name="contraseña" required=""/></th>
</tr>
<tr>
<th><label><b>rol:</b></label></th>
<th><input type="rol" placeholder="Enter rol" class="form-control" name="rol" required=""/></th>
</tr>

<div class="break"></div>

<tr>
<td colspan="2">
 <input class="btn icon-btn btn-success" type="submit" name="action" value="Insertar">
 <span class="glyphicon glyphicon-ok-sign"></span>

 <input class="btn btn-info btn-lg" type="reset" name="action" value="Reset">
 <span class="glyphicon glyphicon-remove"></span>
</td>
</tr>
</table>
</form>
<br>
</div>
    </body>
</html>

