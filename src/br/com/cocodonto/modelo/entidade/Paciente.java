/**
 * 
 */
package br.com.cocodonto.modelo.entidade;

import java.util.Date;

/**
 * @author Jacques_64
 *
 */
public class Paciente {
	
	private long id;
	private String nome;
	private String rg;
	private String cpf;
	private Date criacao;
	private SexoType sexo;
	
	private Contato contato;
	private Endereco endereco;
	private Paciente responsavelPor;
	
	//Criando contrutores da classe
	public Paciente() {		
		criacao = new Date();
		sexo = SexoType.F;
	}

	public Paciente(long id, String nome, String rg, String cpf, SexoType sexo, Contato contato, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.contato = contato;
		this.endereco = endereco;
	}

	public Paciente(String nome, String rg, String cpf, SexoType sexo) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
	}
	
	
	//Criando getters e setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}

	public SexoType getSexo() {
		return sexo;
	}

	public void setSexo(SexoType sexo) {
		this.sexo = sexo;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Paciente getResponsavelPor() {
		return responsavelPor;
	}

	public void setResponsavelPor(Paciente responsavelPor) {
		this.responsavelPor = responsavelPor;
	}

	//Criando hashCode e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Paciente other = (Paciente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	/**
	 * Criando o método toString, utilizando métodos append que retornam uma instância do próprio buffer
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [ id= ")
				.append(id).append(", nome= ")
				.append(nome).append(", rg= ")
				.append(rg)
				.append(", cpf= ")
				.append(cpf)
				.append(", sexo= ")
				.append(sexo)
				.append(", contato= ")
				.append(contato)
				.append(", endereco= ")
				.append(endereco)
				.append(", responsavelPor= ")
				.append(responsavelPor)
				.append(" ]");
		return builder.toString();
	}
	
	
}
