package dao;

import java.sql.Connection;
import modelo.Usuario;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexion.ConnBD;
import interfaces.ILoginDao;

public class LoginDao implements ILoginDao{
 
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int resultInsertUpdatesDeletes;
	private String query;

	public LoginDao() {
	}
 
    @Override
    public Usuario buscarUsuarioPorUserYPass(String userParam, String passParam) {
    	Usuario user = new Usuario();
        try {
           	// buscar conexion
        	conn = ConnBD.getConnection();
        	
        	// armar consulta
        	query = "select * from usuarios where user = ? and pass = ?;";
        	
        	// preparar plan de ejecución
        	pstmt = conn.prepareStatement(query);
        	
        	// preparar parametros
            pstmt.setString(1, userParam);
            pstmt.setString(2, passParam);
            
            // ejecutar consulta
            rs = pstmt.executeQuery();
            
            // evaluar resultado
            if (rs.next()) {
            	user.setId(rs.getInt(rs.findColumn("id")));
            	user.setNombre(rs.getString(rs.findColumn("nombre")));
            	user.setTipoUsuario(rs.getInt(rs.findColumn("tipo_usuario")));
            	user.setEstaConectado(true);
            }
            
            // cerrando recursos de memoria invocados
            ConnBD.close(rs);
            ConnBD.close(pstmt);
        	ConnBD.close();
        	
        } catch (SQLException e) {
        	e.printStackTrace();
        } 
        return user;
    }
}