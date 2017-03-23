/**
 * 
 */
package br.com.cocodonto.framework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Jacques_64
 *
 */
public interface QueryMapper<T> {
	
	List<T> mapping(ResultSet rset) throws SQLException;

}
