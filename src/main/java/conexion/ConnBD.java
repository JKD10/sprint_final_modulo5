package conexion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnBD  {

	private static ConnBD instance = new ConnBD();
	private static Connection conn = null;
	private static String URL = "jdbc:mysql://localhost:3306/prevencion_riesgos";
	private static String USER = "root";
	private static String PASS  = "3909";

	private ConnBD() {
		// carga del driver JDBC en runtime/memoria
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
		} catch(ClassNotFoundException ex) {
			System.out.println("Error: No fue posible cargar el driver JDBC!");
			System.exit(1);
		}
	}
	
	private Connection createConnection() {
		try {
			if ((conn == null) || conn.isClosed()) {
				conn = DriverManager.getConnection(URL, USER, PASS);
			}
		} catch (SQLException e) {
        	System.out.println("Error: No fue posible conectarse a la BD!" );

		}
        return conn;
    }	
	
	public static Connection getConnection() {
        return instance.createConnection();
	}
	
	public static void close() {
        try {
        	if (!conn.isClosed()) {
        		conn.close();
        	}
        } catch (SQLException e) {
            System.out.println("Warning: No fue posible cerrar conexion a BD");
        }
    }
 
    public static void close(PreparedStatement pstmt) {
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println("Warning: No fue posible cerrar Statement");
            }
        }
    }
 
    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                System.out.println("Warning: No fue posible cerrar ResultSet");
            }
        }
    }
	
	
	
	
	
	
}
