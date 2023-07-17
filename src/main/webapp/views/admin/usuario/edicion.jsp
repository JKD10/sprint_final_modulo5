<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="modelo.Usuario" %>
<!DOCTYPE html>
<html>
<head>

<%@ include file="/templates/meta/transversal.jsp"%>
<%@ include file="/templates/meta/app.jsp"%>
<%@ include file="/templates/meta/admin.jsp"%>


</head>
<body>

	<%@ include file="/templates/svg/app.jsp"%>

	<main>

		<%@ include file="/templates/navbar/app.jsp"%>

		<div class="container-fluid">

			<div class="vh d-grid gap-3" style="grid-template-columns: 1fr 3fr;">
				<div class="bg-light border rounded-3">

					<%@ include file="/templates/sidebar/transversal.jsp"%>

				</div>
				<div class="bg-light border rounded-3">

					<table class="table table-striped">
						<thead>
							<tr>
								<th scope="col">#ID</th>
								<th scope="col">Nombre</th>
								<th scope="col">Apellido</th>
								<th scope="col">Usuario</th>
								<th scope="col">Empresa</th>
								<th scope="col">Cargo</th>
								<th scope="col">Correo</th>
								<th scope="col">Tipo usuario</th>
								<th scope="col">&nbsp;</th>
							</tr>
						</thead>
						<tbody>
							<% 
							
							ArrayList<Usuario> usuarios = (ArrayList<Usuario>) request.getAttribute("usuarios"); 

							for (int i = 0; i < usuarios.size(); i++) {
								out.print("<tr>");
								out.print("<th scope=&quote;row&quote;>" + usuarios.get(i).getId() + "</th>");								
								out.print("<td>" + usuarios.get(i).getNombre() + "</td>");
								out.print("<td>" + usuarios.get(i).getApellido() + "</td>");
								out.print("<td>" + usuarios.get(i).getUser() + "</td>");
								out.print("<td>" + usuarios.get(i).getEmpresa() + "</td>");
								out.print("<td>" + usuarios.get(i).getCargo() + "</td>");
								out.print("<td>" + usuarios.get(i).getCorreo() + "</td>");
								out.print("<td>" + usuarios.get(i).getNombreTipoUsuario() + "</td>");
								out.print("<td><a href='/app/admin/usuario/editar?idUsuario="+usuarios.get(i).getId()+"' class='btn btn-primary'>Editar</a></td>");
								out.print("</tr>");
							}
							%>
						</tbody>
					</table>

				</div>
			</div>
		</div>

		<%@ include file="/templates/footer.jsp"%>

	</main>
</body>
</html>