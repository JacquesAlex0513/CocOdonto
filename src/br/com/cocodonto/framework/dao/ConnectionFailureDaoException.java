/**
 * 
 */
package br.com.cocodonto.framework.dao;

/**
 * @author Jacques_64
 *
 */
public class ConnectionFailureDaoException extends RuntimeException {

	public ConnectionFailureDaoException() {
		super();		
	}

	public ConnectionFailureDaoException(String message, Throwable cause) {
		super(message, cause);	
	}

	public ConnectionFailureDaoException(String message) {
		super(message);		
	}

	public ConnectionFailureDaoException(Throwable cause) {
		super(cause);		
	}
}
