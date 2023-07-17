package controlador.admin.usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.admin.usuario.UsuarioDao;
import modelo.Usuario;

/**
 * Servlet implementation class EdicionServlet
 */
@WebServlet("/app/admin/usuario/edicion")
public class EdicionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EdicionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UsuarioDao usuarioDao = new UsuarioDao();
		ArrayList<Usuario> usuarios = usuarioDao.ObtenerUsuarios();
		request.setAttribute("usuarios", usuarios);
		getServletContext().getRequestDispatcher("/views/admin/usuario/edicion.jsp").forward(request, response);
	}


}
