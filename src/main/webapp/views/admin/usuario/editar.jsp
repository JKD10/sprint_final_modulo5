<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				<div class="p-3 bg-light border rounded-3">

					<form class="g-3" method="POST" action="/app/admin/usuario/editar" id="formCrearUsuario">
						 <% Usuario user = (Usuario) request.getAttribute("usuario"); %>
						<input hidden value="<% out.print(user.getId()); %>" autocomplete="off" type="text" class="form-control" id="inputIdUsuario" name="inputIdUsuario" required placeholder="data">
						<div class="offset-sm-1 col-10 form-floating">
							<input value="<% out.print(user.getNombre()); %>" autocomplete="off" type="text" class="form-control" id="inputNombre" name="inputNombre" required placeholder="data"> 
							<label for="inputNombre">Nombre</label>
						</div>
					
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input value="<% out.print(user.getApellido()); %>" autocomplete="off" type="text" class="form-control" id="inputApellido"
								name="inputApellido" required placeholder="data"> <label
								for="inputApellido">Apellido</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input value="<% out.print(user.getPass()); %>" autocomplete="off" type="password" class="form-control" id="inputPassword"
								name="inputPassword" required placeholder="data"> <label
								for="inputPassword">Contraseña</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input value="<% out.print(user.getEmpresa()); %>" autocomplete="off" type="text" class="form-control" id="inputEmpresa"
								name="inputEmpresa" required placeholder="data"> <label
								for="inputEmpresa">Empresa</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input value="<% out.print(user.getCargo()); %>" autocomplete="off" type="text" class="form-control" id="inputCargo"
								name="inputCargo" required placeholder="data"> <label
								for="inputCargo">Cargo</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input value="<% out.print(user.getCorreo()); %>" autocomplete="off" type="email" class="form-control" id="inputMail"
								name="inputMail" placeholder="data"> <label
								for="inputMail">E-Mail</label>
						</div>
						
						<div class="container p-0 mt-2 ms-auto">
							<div class="row text-center">
								<div class="col-6">
									<button style="width: 30%;" class="btn btn-danger" type="button" id="btnUsuarioCancelarEditar" name="btnUsuarioCancelar">Cancelar</button>
								</div>
								<div class="col-6">
									<button style="width: 30%;" class="btn btn-primary" type="submit" id="btnUsuarioGuardarEditar" name="btnUsuarioCrear">Guardar</button>
								</div>
							</div>
						</div>
					
					</form>


				
				</div>
			</div>
		</div>

		<%@ include file="/templates/footer.jsp"%>

	</main>
</body>
</html>