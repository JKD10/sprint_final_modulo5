<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

					<form class="g-3" method="POST" action="/app/admin/usuario/crear" id="formCrearUsuario">
					
						<div class="offset-sm-1 col-10 form-floating">
							<input autocomplete="off" type="text" class="form-control" id="inputNombre" name="inputNombre" required placeholder="data"> 
							<label for="inputNombre">Nombre</label>
						</div>
					
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input autocomplete="off" type="text" class="form-control" id="inputApellido"
								name="inputApellido" required placeholder="data"> <label
								for="inputApellido">Apellido</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input autocomplete="off" type="text" class="form-control" id="inputUsuario"
								name="inputUsuario" required placeholder="data"> <label
								for="inputUsuario">Nombre de usuario</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input autocomplete="off" type="password" class="form-control" id="inputPassword"
								name="inputPassword" required placeholder="data"> <label
								for="inputPassword">Contraseña</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input autocomplete="off" type="text" class="form-control" id="inputEmpresa"
								name="inputEmpresa" required placeholder="data"> <label
								for="inputEmpresa">Empresa</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input autocomplete="off" type="text" class="form-control" id="inputCargo"
								name="inputCargo" required placeholder="data"> <label
								for="inputCargo">Cargo</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-floating mt-2">
							<input autocomplete="off" type="email" class="form-control" id="inputMail"
								name="inputMail" placeholder="data"> <label
								for="inputMail">E-Mail</label>
						</div>
						
						<div class="offset-sm-1 col-10 form-group my-3 mt-2">
							<span>Tipo de usuario:</span>
							<select class="form-control" id="selectTipoUsuario" name="selectTipoUsuario">
							  <option value="1">Administrativo</option>
							  <option value="2">Cliente</option>
							  <option value="3">Profesional</option>
							</select>
						</div>
						

						<div class="container p-0 mt-2 ms-auto">
							<div class="row text-center">
								<div class="col-4">
									<button style="width: 30%;" class="btn btn-danger" type="button" id="btnUsuarioCancelar" name="btnUsuarioCancelar">Cancelar</button>
								</div>
								<div class="col-4">
									<button style="width: 30%;" class="btn btn-warning" type="reset" id="btnUsuarioLimpiar" name="btnUsuarioLimpiar">Limpiar</button>
								</div>
								<div class="col-4">
									<button style="width: 30%;" class="btn btn-primary" type="submit" id="btnUsuarioCrear" name="btnUsuarioCrear">Guardar</button>
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