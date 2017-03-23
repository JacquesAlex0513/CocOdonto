package br.com.cocodonto.modelo.entidade;

public enum SexoType {
	
	M ("Masculino"), F("Feminino");
	
	private String descricao;
	
	//Criando o construtor
	private SexoType(String descricao) {

		this.descricao = descricao;
	}
	
	//Criando gets e settters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
