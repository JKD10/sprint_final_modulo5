package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;
import modelo.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginDao loginDao = new LoginDao();
		Usuario user = null;		
		String userParam = request.getParameter("inputUser");
		String passParam = request.getParameter("inputPassword");
		
		user = loginDao.buscarUsuarioPorUserYPass(userParam, passParam);
		
		if(user.isEstaConectado()) {
			HttpSession sesionUsuario = request.getSession();
			sesionUsuario.setAttribute("tipoUsuario", user.getTipoUsuario());
			sesionUsuario.setAttribute("nombreUsuario", user.getNombre());
			sesionUsuario.setAttribute("estaConectado", user.isEstaConectado());			
			response.sendRedirect(request.getContextPath()+"/app");
		} else {
			getServletContext().getRequestDispatcher("/views/errorLogin.jsp").forward(request, response);
		}
	}

}
