/**
 * 
 */
package br.com.cocodonto.modelo.entidade;

/**
 * @author Jacques_64
 *
 */
public class Odontograma {
	
	private int id;
	
	//Criando construtores da classe
	public Odontograma(int id) {
		super();
		this.id = id;
	}
	
	public Odontograma() {
		super();
	}

	//Criando getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//Criando hashCode e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Odontograma other = (Odontograma) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
