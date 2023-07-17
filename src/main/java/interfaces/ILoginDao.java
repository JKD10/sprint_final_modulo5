package interfaces;
import modelo.Usuario;

public interface ILoginDao {
	
	Usuario buscarUsuarioPorUserYPass(String user, String pass);

}
