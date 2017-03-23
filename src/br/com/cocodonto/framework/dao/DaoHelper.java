/**
 * 
 */
package br.com.cocodonto.framework.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Jacques_64
 *
 */
public class DaoHelper {
	
	private static final ThreadLocal<Connection> context = new ThreadLocal<Connection>();
	
	/**
	 * Fornecer conexão ao banco de dados
	 * 
	 * @return Connection
	 * @throws SQLException
	 */
	
	public Connection getConnection() throws SQLException {
		
		Connection conn = null;
		try {
			
			Class.forName("org.apache.derby.jdbc.ClienteDriver");
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/coc", "app", "app");
			
		} catch (ClassNotFoundException e) {
			// TODO: refatorar para dar suporte e resorcenbundle
			throw new ConnectionFailureDaoException("Não foi possível realizar a conexão!!!", e);
		}
		
		return conn;		
	}

}
