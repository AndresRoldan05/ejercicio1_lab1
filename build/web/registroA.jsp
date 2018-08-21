<%-- 
    Document   : registroA
    Created on : 19/08/2018, 11:00:23 PM
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
<form action="concesionarioservlet?action=insertarCarro" method="post">
<table>
<tr>
<th> <label><b>matricula:</b></label></th>
<th> <input type="text" placeholder="Enter matricula" class="form-control" name="matricula" required=""/>
</th>
</tr>
<tr>
<th><label><b>marca:</b></label></th>
<th><input type="marca" placeholder="Enter marca" class="form-control" name="marca" required=""/></th>
</tr>
<tr>
<th><label><b>modelo:</b></label></th>
<th><input type="modelo" placeholder="Enter modelo" class="form-control" name="modelo" required=""/></th>
</tr>
<tr>
<th><label><b>año:</b></label></th>
<th><input type="año" placeholder="Enter año" class="form-control" name="año" required=""/></th>
</tr>
<tr>
<th><label><b>valor:</b></label></th>
<th><input type="valor" placeholder="Enter valor" class="form-control" name="valor" required=""/></th>
</tr>
<tr>
<th><label><b>caracteristica:</b></label></th>
<th><input type="caracteristica" placeholder="Enter caracteristica" class="form-control" name="caracteristica" required=""/></th>
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

