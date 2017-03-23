package br.com.cocodonto.modelo.entidade;

public class Endereco {
	
	private long id;
	private String endere�o;
	private String cidade;
	private String bairro;
	private String cep;

	//Criando construtores da classe	
	public Endereco() {
		
	}

	public Endereco(long id, String endere�o, String cidade, String bairro, String cep) {
		super();
		this.id = id;
		this.endere�o = endere�o;
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
	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
		result = prime * result + ((endere�o == null) ? 0 : endere�o.hashCode());
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
		if (endere�o == null) {
			if (other.endere�o != null)
				return false;
		} else if (!endere�o.equals(other.endere�o))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	//Criando m�todo toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [ id= ").append(id).append(", endere�o= ").append(endere�o).append(", cidade= ")
				.append(cidade).append(", bairro= ").append(bairro).append(", cep= ").append(cep).append(" ]");
		return builder.toString();
	}
	
	
	
	
}