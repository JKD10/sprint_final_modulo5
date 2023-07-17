package modelo;

public class Usuario {

	private int id;
	private String user;
	private String pass;
	private String nombre;
	private String apellido;
	private String empresa;
	private String cargo;
	private int tipoUsuario;
	private String nombreTipoUsuario;
	private String correo;
	private boolean estaConectado;
	
	public Usuario() {}

	public Usuario(String user, String pass, String nombre, String apellido, String empresa, String cargo,int tipoUsuario, String correo) {
		this.user = user;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido = apellido;
		this.empresa = empresa;
		this.cargo = cargo;
		this.tipoUsuario = tipoUsuario;
		this.correo = correo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
		switch (tipoUsuario) {
			case 1:
				this.nombreTipoUsuario = "Administrativo";
				break;
			case 2:
				this.nombreTipoUsuario = "Cliente";
				break;
			case 3:
				this.nombreTipoUsuario = "Profesional";
				break;
		}
	}

	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEstaConectado() {
		return estaConectado;
	}

	public void setEstaConectado(boolean estaConectado) {
		this.estaConectado = estaConectado;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", user=" + user + ", pass=" + pass + ", nombre=" + nombre + ", apellido="
				+ apellido + ", empresa=" + empresa + ", cargo=" + cargo + ", tipoUsuario=" + tipoUsuario + ", correo="
				+ correo + ", estaConectado=" + estaConectado + "]";
	}
	
	

}
