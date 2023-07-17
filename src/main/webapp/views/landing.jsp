<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
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
				<h1 class="text-body-emphasis">Prevención de riesgos</h1>
				<p class="col-lg-8 mx-auto fs-5">Utilice sus credenciales para
					entrar a la app</p>
				<div class="d-inline-flex gap-2 mb-5">
					<button id="btnLogin"
						class="d-inline-flex align-items-center btn btn-primary"
						type="button">Iniciar sesión</button>
				</div>
			</div>
		</div>

		<%@ include file="/templates/footer.jsp"%>

	</main>

</body>
</html>