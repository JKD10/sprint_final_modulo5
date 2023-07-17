package interfaces;
import java.util.ArrayList;

import modelo.Usuario;

public interface IUsuarioDao {
	
	 boolean CrearUsuario(Usuario user);
	 ArrayList<Usuario> ObtenerUsuarios();
	 Usuario ObtenerUsuario(int idUsuario);
	 boolean ActualizarUsuario(Usuario user);

}
