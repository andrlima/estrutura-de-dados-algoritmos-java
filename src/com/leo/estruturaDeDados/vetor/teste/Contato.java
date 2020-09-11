package com.leo.estruturaDeDados.vetor.teste;

public class Contato {
	
	private String nome;
	private int telefone;
	private String email;
	
	//MÉTODO CONSTRUTOR DA SUPER CLASSE
	public Contato() {
		
	}
	
	// MÉTODO CONSTRUTOR COM PARÂMETROS
	public Contato(String nome, int telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	// MÉTOD toString 
	// Para sobrescrever a saída do array, sem esse método, quando for utilizar o comando para escrever na tela(escreva)
	// vai ser impresso o endereço de memoria de cada posição do vetor
	public String toString() {
		
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
		
	}
	
	
	// MÉTODO equals
	// Eesse método vai comparar os elementos em um vetor
    // Como os dados de um vetor estão em referências(posições) diferente na memórias, nunca conseguiremos comparalos;
	// Então precisamos implementar o metódo equals, ele vai compara a referência de memória com o obejeto que estamos passando.
	// Assim conseguimos verificar se o objetos que estamos procurando está ou não no vetor
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

	//MEÉTODOS GETS E SETS
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
