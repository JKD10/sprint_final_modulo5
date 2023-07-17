/**
 * 
 */



function editarUsuario(idUsuario) {
	
	let data = {
		idUsuario: idUsuario
	}
	
	$.get("/app/admin/usuario/editar", data);
	
}
document.addEventListener("DOMContentLoaded", function(){
	
	el = document.getElementById("btnUsuarioCancelar")
	if(el != null) {
		el.addEventListener("click", (event) => {
			location.href = "/app"		
		})		
	}
	
	el = document.getElementById("btnUsuarioCancelarEditar")
	if(el != null) {
		el.addEventListener("click", (event) => {
			location.href = "/app/admin/usuario/edicion"		
		})		
	}
	
	
})