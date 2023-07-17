package controlador.admin.usuario;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.admin.usuario.UsuarioDao;
import modelo.Usuario;

/**
 * Servlet implementation class EditarServlet
 */
@WebServlet("/app/admin/usuario/editar")
public class EditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario user = usuarioDao.ObtenerUsuario(Integer.valueOf(request.getParameter("idUsuario")));
		request.setAttribute("usuario", user);
		System.out.println(user.toString());
		getServletContext().getRequestDispatcher("/views/admin/usuario/editar.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioDao usuarioDao = new UsuarioDao();
		int idUsuario = Integer.valueOf(request.getParameter("inputIdUsuario"));
		String nombre = request.getParameter("inputNombre");
		String apellido = request.getParameter("inputApellido");
		String pass = request.getParameter("inputPassword");
		String empresa = request.getParameter("inputEmpresa");
		String cargo = request.getParameter("inputCargo");
		String correo = request.getParameter("inputMail");
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setPass(pass);
		usuario.setEmpresa(empresa);
		usuario.setCargo(cargo);
		usuario.setCorreo(correo);
		usuario.setId(idUsuario);
		
		if(usuarioDao.ActualizarUsuario(usuario)) {
			request.setAttribute("tituloResultado", "Operación realizada correctamente");
			request.setAttribute("detalleResultado", "El usuario fue actualizado");
			getServletContext().getRequestDispatcher("/views/resultado.jsp").forward(request, response);
			response.sendError(response.SC_OK);
		} else {
			request.setAttribute("tituloResultado", "Error en la operación");
			request.setAttribute("detalleResultado", "No fue posible actualizar al usuario, intentelo nuevamente");
			getServletContext().getRequestDispatcher("/views/resultado.jsp").forward(request, response);
			response.sendError(response.SC_INTERNAL_SERVER_ERROR);
		}
	}

}
