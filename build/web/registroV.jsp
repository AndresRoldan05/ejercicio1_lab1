<%-- 
    Document   : registroV
    Created on : 4/07/2018, 11:03:18 PM
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
<form action="concesionarioservlet?action=insertarVenta" method="post">
<table>
<tr>
<th> <label><b>ID_venta:</b></label></th>
<th> <input type="text" placeholder="Enter ID_venta" class="form-control" name="ID_venta" required=""/>
</th>
</tr>
<tr>
<th><label><b>matricula:</b></label></th>
<th><input type="matricula" placeholder="Enter matricula" class="form-control" name="matricula" required=""/></th>
</tr>
<tr>
<th><label><b>propietario:</b></label></th>
<th><input type="propietario" placeholder="Enter propietario" class="form-control" name="propietario" required=""/></th>
</tr>
<tr>
<th><label><b>fecha:</b></label></th>
<th><input type="fecha" placeholder="Enter fecha" class="form-control" name="fecha" required=""/></th>
</tr>
<tr>
<th><label><b>total:</b></label></th>
<th><input type="total" placeholder="Enter total" class="form-control" name="total" required=""/></th>
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

