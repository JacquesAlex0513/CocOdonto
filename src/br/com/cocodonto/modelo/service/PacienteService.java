/**
 * 
 */
package br.com.cocodonto.modelo.service;

import br.com.cocodonto.modelo.dao.PacienteDao;

/**
 * @author Jacques_64
 *
 */
public class PacienteService {
	
	private PacienteDao dao;
	
	public PacienteService() {
		
		dao = new PacienteDao();
	}

}
