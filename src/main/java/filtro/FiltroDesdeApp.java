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

/**
 * Servlet Filter implementation class FiltroDesdeApp
 */
@WebFilter(
		dispatcherTypes = {DispatcherType.REQUEST },
		description = "Este filtro sacara los usuasrios sin sesion o sin permisos", 
		urlPatterns = { 
				"/app",
				"/app/*"
		}
)
public class FiltroDesdeApp extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public FiltroDesdeApp() {
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

		// pass the request along the filter chain
		// pass the request along the filter chain
		boolean estaConectado = false;
		boolean reemplazar = false;
		int tipoUsuario = 0;
		String path = null;
		HttpServletRequest httpReq = (HttpServletRequest) request;
	    HttpServletResponse httpResp = (HttpServletResponse) response;
	    HttpSession sesionUsuario = httpReq.getSession();
	    path = httpReq.getRequestURI();
	    
	    if(sesionUsuario.getAttribute("estaConectado") != null) {
	    	estaConectado = (boolean) sesionUsuario.getAttribute("estaConectado");
	    }
	    if(sesionUsuario.getAttribute("tipoUsuario") != null) {
	    	tipoUsuario = (int) sesionUsuario.getAttribute("tipoUsuario");
	    }
	    
	    if (!estaConectado) {
	    	httpResp.sendRedirect("/");	
    	} else {
    		reemplazar = reemplazar || ((path.startsWith("/app/admin")) && (tipoUsuario != 1));
    		reemplazar = reemplazar || ((path.startsWith("/app/cliente")) && (tipoUsuario != 2));
    		reemplazar = reemplazar || ((path.startsWith("/app/profesional")) && (tipoUsuario != 3));
    		if(reemplazar) {    			
    			httpResp.sendRedirect("/app");
    		} else {
    			httpReq.getRequestDispatcher(path).forward(httpReq, httpResp);
    		}
	    }
	    
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
