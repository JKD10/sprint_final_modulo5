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
				<h1 class="h1 mb-3 fw-normal">Oops!..</h1>
				<h1 class="h3 mb-3 fw-normal">Parece que a alguien se le olvido
					la contraseña >.&lt;</h1>
				<div class="container p-0 mt-2 ms-auto">
					<div class="row text-center">
						<div class="col-12">
							<button class="btn btn-warning" type="button" id="btnGoHome"
								name="btnCancelar">Dejame intentarlo nuevamente</button>
						</div>
					</div>
				</div>
			</div>
		</div>


		<%@ include file="/templates/footer.jsp"%>

	</main>

</body>

</html>