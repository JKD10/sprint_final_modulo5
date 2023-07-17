<%
switch ((int) session.getAttribute("tipoUsuario")) {
case 1:
%>
<%@ include file="/templates/sidebar/admin.jsp"%>
<%
break;
case 2:
%>
<%@ include file="/templates/sidebar/cliente.jsp"%>
<%
break;
case 3:
%>
<%@ include file="/templates/sidebar/profesional.jsp"%>
<%
}
%>