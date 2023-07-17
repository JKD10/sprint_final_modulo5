/**
 * 
 */
document.addEventListener("DOMContentLoaded", function(){
	
	el = document.getElementById("btnLogin")
	if(el != null) {
		el.addEventListener("click", (event) => {
			location.href = "/login"		
		})		
	}
	
	el = document.getElementById("btnGoHome")
	if(el != null) {
		el.addEventListener("click", (event) => {
			location.href = "/"		
		})		
	}
	
})