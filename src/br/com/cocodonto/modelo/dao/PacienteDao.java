/**
 * 
 */
package br.com.cocodonto.modelo.dao;

import br.com.cocodonto.framework.dao.CreateDaoException;
import br.com.cocodonto.framework.dao.DaoHelper;
import br.com.cocodonto.modelo.entidade.Paciente;

/**
 * @author Jacques_64
 *
 */
public class PacienteDao {
	
	private DaoHelper daoHelper;
	
	public PacienteDao() {
		
		daoHelper = new DaoHelper();
	}
	
	public void inserir(Paciente paciente) throws CreateDaoException{
		
	}

}
