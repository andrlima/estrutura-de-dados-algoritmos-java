package com.leo.estruturaDeDados.vetor.teste;

public class Contato {
	
	private String nome;
	private int telefone;
	private String email;
	
	//M�TODO CONSTRUTOR DA SUPER CLASSE
	public Contato() {
		
	}
	
	// M�TODO CONSTRUTOR COM PAR�METROS
	public Contato(String nome, int telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	// M�TOD toString 
	// Para sobrescrever a sa�da do array, sem esse m�todo, quando for utilizar o comando para escrever na tela(escreva)
	// vai ser impresso o endere�o de memoria de cada posi��o do vetor
	public String toString() {
		
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
		
	}
	
	
	// M�TODO equals
	// Eesse m�todo vai comparar os elementos em um vetor
    // Como os dados de um vetor est�o em refer�ncias(posi��es) diferente na mem�rias, nunca conseguiremos comparalos;
	// Ent�o precisamos implementar o met�do equals, ele vai compara a refer�ncia de mem�ria com o obejeto que estamos passando.
	// Assim conseguimos verificar se o objetos que estamos procurando est� ou n�o no vetor
	// Epor fim ele compara todos os elementos.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + telefone;
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
		Contato other = (Contato) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}

	//ME�TODOS GETS E SETS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
}
