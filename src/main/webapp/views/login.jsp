<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/templates/meta/transversal.jsp"%>
</head>
<body>

	<%@ include file="/templates/svg/landing.jsp"%>

	<main>

		<%@ include file="/templates/navbar/landing.jsp"%>

		<div class="container-fluid">
			<div class="vh p-5 text-center bg-light border rounded-3">
			
				<form class="form-signin w-50 m-auto" method="POST"
					action="/login">
					<h1 class="text-body-emphasis">Iniciar sesión</h1>
					<div class="form-floating">
						<input type="text" class="form-control" id="inputUser"
							name="inputUser" required placeholder="99888777-6"> <label
							for="inputUser">Usuario</label>
					</div>
					<div class="form-floating mt-2">
						<input type="password" class="form-control" id="inputPassword"
							name="inputPassword" required placeholder="Contraseña"> <label
							for="inputPassword">Contraseña</label>
					</div>
					<div class="container p-0 mt-2 ms-auto">
						<div class="row text-center">
							<div class="col-6">
								<button style="width: 100%;" class="btn btn-danger"
									type="button" id="btnGoHome" name="btnCancelar">Cancelar</button>
							</div>
							<div class="col-6">
								<button style="width: 100%;" class="btn btn-primary"
									type="submit" id="btnSubmit" name="btnSubmit">Iniciar
									sesión</button>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>


		<%@ include file="/templates/footer.jsp"%>

	</main>

</body>

</html>