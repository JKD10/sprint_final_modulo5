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
				<h1 class="h1 mb-3 fw-normal"><% out.println(request.getAttribute("tituloResultado")); %></h1>
				<h1 class="h3 mb-3 fw-normal"><% out.println(request.getAttribute("detalleResultado")); %></h1>
				<div class="container p-0 mt-2 ms-auto">
					<div class="row text-center">
						<div class="col-12">
							<button class="btn btn-primary" type="button" id="btnGoHome"
								name="btnCancelar">ir al inicio</button>
						</div>
					</div>
				</div>
			</div>
		</div>


		<%@ include file="/templates/footer.jsp"%>

	</main>

</body>

</html>