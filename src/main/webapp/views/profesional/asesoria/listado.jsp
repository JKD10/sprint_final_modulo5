<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<%@ include file="/templates/meta/transversal.jsp"%>
<%@ include file="/templates/meta/app.jsp"%>


</head>
<body>

	<%@ include file="/templates/svg/app.jsp"%>

	<main>

		<%@ include file="/templates/navbar/app.jsp"%>

		<div class="container-fluid">

			<div class="vh d-grid gap-3" style="grid-template-columns: 1fr 3fr;">
				<div class="bg-light border rounded-3">
				
					<%@ include file="/templates/sidebar/transversal.jsp" %>
					
				</div>
				<div class="bg-light border rounded-3">
					
					listado
						
				</div>
			</div>
		</div>

		<%@ include file="/templates/footer.jsp"%>

	</main>
</body>
</html>