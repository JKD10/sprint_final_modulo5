package controlador.admin.usuario;

import modelo.Usuario;
import dao.admin.usuario.UsuarioDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CrearServlet
 */
@WebServlet("/app/admin/usuario/crear")
public class CrearServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/views/admin/usuario/crear.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UsuarioDao usuarioDao = new UsuarioDao();
		String user = request.getParameter("inputUsuario");
		String pass = request.getParameter("inputPassword");
		String nombre = request.getParameter("inputNombre");
		String apellido = request.getParameter("inputApellido");
		String empresa = request.getParameter("inputEmpresa");
		String cargo = request.getParameter("inputCargo");
		String correo = request.getParameter("inputMail");
		int tipoUsuario = (int) Integer.parseInt(request.getParameter("selectTipoUsuario"));		
		Usuario usuario = new Usuario(user, pass, nombre, apellido, empresa, cargo, tipoUsuario, correo);
		if(usuarioDao.CrearUsuario(usuario)) {
			request.setAttribute("tituloResultado", "Operación realizada correctamente");
			request.setAttribute("detalleResultado", "El usuario fue agregado a la aplicación");
			getServletContext().getRequestDispatcher("/views/resultado.jsp").forward(request, response);
			response.sendError(response.SC_OK);
		} else {
			request.setAttribute("tituloResultado", "Error en la operación");
			request.setAttribute("detalleResultado", "No fue posible generar al usuario, intentelo nuevamente");
			getServletContext().getRequestDispatcher("/views/resultado.jsp").forward(request, response);
			response.sendError(response.SC_INTERNAL_SERVER_ERROR);
		}
		
	}

}
