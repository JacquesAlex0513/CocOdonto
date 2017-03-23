package br.com.cocodonto.modelo.entidade;

public class Endereco {
	
	private long id;
	private String endereço;
	private String cidade;
	private String bairro;
	private String cep;

	//Criando construtores da classe	
	public Endereco() {
		
	}

	public Endereco(long id, String endereço, String cidade, String bairro, String cep) {
		super();
		this.id = id;
		this.endereço = endereço;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cep = cep;
	}

	//Criando getters e setters	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	//Criando hashCode e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((endereço == null) ? 0 : endereço.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (endereço == null) {
			if (other.endereço != null)
				return false;
		} else if (!endereço.equals(other.endereço))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	//Criando método toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [ id= ").append(id).append(", endereço= ").append(endereço).append(", cidade= ")
				.append(cidade).append(", bairro= ").append(bairro).append(", cep= ").append(cep).append(" ]");
		return builder.toString();
	}
	
	
	
	
}