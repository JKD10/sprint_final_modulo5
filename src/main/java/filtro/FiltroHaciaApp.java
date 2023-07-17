package filtro;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;

/**
 * Servlet Filter implementation class FiltroSesion
 */
@WebFilter(
	dispatcherTypes = {DispatcherType.REQUEST }, 
	description = "Filtro para regular el acceso a los servlets", 
	urlPatterns = { 
			"/", 
			"/login"
	}
)
public class FiltroHaciaApp extends HttpFilter implements Filter {

    /**
     * @see HttpFilter#HttpFilter()
     */
    public FiltroHaciaApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		boolean estaConectado = false;
		String path = null;
		HttpServletRequest httpReq = (HttpServletRequest) request;
	    HttpServletResponse httpResp = (HttpServletResponse) response;
	    HttpSession sesionUsuario = httpReq.getSession();
	    path = httpReq.getRequestURI();
	    
	    if(sesionUsuario.getAttribute("estaConectado") != null) {
	    	estaConectado = (boolean) sesionUsuario.getAttribute("estaConectado");
	    }
	    
	    if (!estaConectado) {
	    	path = (path == "/app") ? "/" : path;
	    	System.out.println("path: "+path);
	    	httpReq.getRequestDispatcher(path).forward(httpReq, httpResp);
    	} else {
    		httpResp.sendRedirect(httpReq.getContextPath()+"/app");
	    }
	    
}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
