/**
 * 
 */
package br.com.cocodonto.framework.dao;

/**
 * @author Jacques_64
 *
 */
public class DeleteDaoException extends RuntimeException {

	//Criando construtores da classe
	public DeleteDaoException() {
		super();		
	}

	public DeleteDaoException(String message, Throwable cause) {
		super(message, cause);		
	}

	public DeleteDaoException(String message) {
		super(message);		
	}

	public DeleteDaoException(Throwable cause) {
		super(cause);		
	}	

}
