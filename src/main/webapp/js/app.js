/**
 * Posibles funciones globales
 */

function AgregarEstadoActivoElementosAnchor() {
	let path = document.location.pathname
	Array.from(document.getElementsByTagName('a')).forEach(a => {
	    a.classList.remove("active")
		if(path == a.pathname) {
		    a.classList.add('active')
		}
    })
}

document.addEventListener("DOMContentLoaded", function(){
	// posibles funcionees del landing
	AgregarEstadoActivoElementosAnchor()
})