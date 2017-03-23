/**
 * 
 */
package br.com.cocodonto.framework.dao;

/**
 * @author Jacques_64
 *
 */
public class UpdateDaoException extends RuntimeException {

	//Criando construtores
	public UpdateDaoException() {
		super();		
	}

	public UpdateDaoException(String message, Throwable cause) {
		super(message, cause);		
	}

	public UpdateDaoException(String message) {
		super(message);		
	}

	public UpdateDaoException(Throwable cause) {
		super(cause);		
	}
}
