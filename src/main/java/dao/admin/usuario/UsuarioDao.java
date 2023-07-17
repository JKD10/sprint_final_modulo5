package dao.admin.usuario;

import java.sql.Connection;
import modelo.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import conexion.ConnBD;
import interfaces.IUsuarioDao;

public class UsuarioDao implements IUsuarioDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private int resultInsertUpdatesDeletes;
	private String query;

	public UsuarioDao() {
	}

	@Override
	public boolean CrearUsuario(Usuario user) {
		boolean resp = false;
		try {
			// buscar conexion
			conn = ConnBD.getConnection();

			// armar consulta
			query = "insert into usuarios(nombre, apellido, user, pass, tipo_usuario, empresa, cargo, correo) values(?, ?, ?, ?, ?, ?, ?, ?);";

			// preparar plan de ejecución
			pstmt = conn.prepareStatement(query);

			// preparar parametros
			pstmt.setString(1, user.getNombre());
			pstmt.setString(2, user.getApellido());
			pstmt.setString(3, user.getUser());
			pstmt.setString(4, user.getPass());
			pstmt.setInt(5, user.getTipoUsuario());
			pstmt.setString(6, user.getEmpresa());
			pstmt.setString(7, user.getCargo());
			pstmt.setString(8, user.getCorreo());

			// ejecutar consulta
			resultInsertUpdatesDeletes = pstmt.executeUpdate();

			// evaluar resultado
			resp = (resultInsertUpdatesDeletes == 1);

			// cerrando recursos de memoria invocados
			ConnBD.close(rs);
			ConnBD.close(pstmt);
			ConnBD.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resp;
	}

	@Override
	public ArrayList<Usuario> ObtenerUsuarios() {
		ArrayList<Usuario> resp = new ArrayList<Usuario>();
		Usuario user = null;
		try {
			// buscar conexion
			conn = ConnBD.getConnection();

			// armar consulta
			query = "select * from usuarios;";

			// preparar plan de ejecución
			pstmt = conn.prepareStatement(query);

			// ejecutar consulta
			rs = pstmt.executeQuery();

			// evaluar resultado
			 while (rs.next()) {
				 	user = new Usuario();
	            	user.setId(rs.getInt(rs.findColumn("id")));
	            	user.setNombre(rs.getString(rs.findColumn("nombre")));
	            	user.setApellido(rs.getString(rs.findColumn("apellido")));
	            	user.setUser(rs.getString(rs.findColumn("user")));
	            	user.setPass(rs.getString(rs.findColumn("pass")));
	            	user.setEmpresa(rs.getString(rs.findColumn("empresa")));
	            	user.setCargo(rs.getString(rs.findColumn("nombre")));
	            	user.setTipoUsuario(rs.getInt(rs.findColumn("tipo_usuario")));
	            	user.setCorreo(rs.getString(rs.findColumn("correo")));
	            	user.setEstaConectado(true);
	            	resp.add(user);
	            }

			// cerrando recursos de memoria invocados
			ConnBD.close(rs);
			ConnBD.close(pstmt);
			ConnBD.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resp;
	}
	
	@Override
	public Usuario ObtenerUsuario(int idUsuario) {
		Usuario resp = new Usuario();
		try {
			// buscar conexion
			conn = ConnBD.getConnection();

			// armar consulta
			query = "select * from usuarios where id = ?;";

			// preparar plan de ejecución
			pstmt = conn.prepareStatement(query);
			
			// preparar parametros
			pstmt.setInt(1, idUsuario);

			// ejecutar consulta
			rs = pstmt.executeQuery();

			// evaluar resultado
			 while (rs.next()) {
				 	resp.setId(rs.getInt(rs.findColumn("id")));
				 	resp.setNombre(rs.getString(rs.findColumn("nombre")));
				 	resp.setApellido(rs.getString(rs.findColumn("apellido")));
				 	resp.setUser(rs.getString(rs.findColumn("user")));
				 	resp.setPass(rs.getString(rs.findColumn("pass")));
				 	resp.setEmpresa(rs.getString(rs.findColumn("empresa")));
				 	resp.setCargo(rs.getString(rs.findColumn("nombre")));
				 	resp.setTipoUsuario(rs.getInt(rs.findColumn("tipo_usuario")));
				 	resp.setCorreo(rs.getString(rs.findColumn("correo")));
	            	resp.setEstaConectado(true);
	            }

			// cerrando recursos de memoria invocados
			ConnBD.close(rs);
			ConnBD.close(pstmt);
			ConnBD.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resp;
	}
	
	@Override
	public boolean ActualizarUsuario(Usuario user) {
		boolean resp = false;
		try {
			// buscar conexion
			conn = ConnBD.getConnection();

			// armar consulta
			query = "update usuarios set nombre = ?, apellido = ?, pass = ?, empresa = ?, cargo = ?, correo = ? where id = ?;";

			// preparar plan de ejecución
			pstmt = conn.prepareStatement(query);

			// preparar parametros
			pstmt.setString(1, user.getNombre());
			pstmt.setString(2, user.getApellido());
			pstmt.setString(3, user.getPass());
			pstmt.setString(4, user.getEmpresa());
			pstmt.setString(5, user.getCargo());
			pstmt.setString(6, user.getCorreo());
			pstmt.setInt(7, user.getId());

			// ejecutar consulta
			resultInsertUpdatesDeletes = pstmt.executeUpdate();

			// evaluar resultado
			resp = (resultInsertUpdatesDeletes == 1);

			// cerrando recursos de memoria invocados
			ConnBD.close(rs);
			ConnBD.close(pstmt);
			ConnBD.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resp;
	}
	
}