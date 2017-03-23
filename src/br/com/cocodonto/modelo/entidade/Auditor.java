/**
 * 
 */
package br.com.cocodonto.modelo.entidade;

import java.util.Date;

/**
 * @author Jacques_64
 *
 */
public class Auditor {
	
	private Date dataCriacao;
	private Date dataUltimaModificacao;
	private String modificador;
	private String criadoPor;
	
	//Criando construtores da classe	
	public Auditor(Date dataCriacao, Date dataUltimaModificacao, String modificador, String criadoPor) {
		super();
		this.dataCriacao = dataCriacao;
		this.dataUltimaModificacao = dataUltimaModificacao;
		this.modificador = modificador;
		this.criadoPor = criadoPor;
	}

	public Auditor() {
		super();		
	}

	//Criando Getters e Setters
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataUltimaModificacao() {
		return dataUltimaModificacao;
	}

	public void setDataUltimaModificacao(Date dataUltimaModificacao) {
		this.dataUltimaModificacao = dataUltimaModificacao;
	}

	public String getModificador() {
		return modificador;
	}

	public void setModificador(String modificador) {
		this.modificador = modificador;
	}

	public String getCriadoPor() {
		return criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}
	
		

}
