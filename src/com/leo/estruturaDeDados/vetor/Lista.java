
// Essa clase, é uma classe generica que só pode comporta elementos do mesmo tipo

package com.leo.estruturaDeDados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;
	
	// MÉTODO CONSTRUTOR com os parâmetros
	public Lista(int capacidade) {
		
		// Solução 1 ( é a melhor solução )
		// Instânciando o vetor de forma generica, cria o vetor do tipo objeto e depois faz o cast do tipo que foi declarado
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
		
	}
	  
	//MÉTODO CONSTRUTOR com os parâmetros
	public Lista(int capacidade, Class<T> tipoClasse) { 
		
		// Solução 2
		// Feto o cast para poder instânciar um vetor dinâmicamente
		// passado o tipo de componente( que é o tipo da classe) e passando a capacidade do vetor
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade); 
		this.tamanho = 0;
		
	}
		
	//MÉTODO ADICIONAR. Adiciona valores no vetor.
	public boolean adicionar(T elemento) {
		
		//aumenta o vetor se estiver cheio
		this.aumentandoVetor();
				
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho] = elemento;
			this.tamanho++; //qtd do vetor
			
			//Se adicionou
			return true;
		}
		
		//Se não adicionou
		return false;
		
	}
	
	// MÉTODO toString PARA OS ARRAYS.
	// Quando se trabalha com Arrays no java, precisamos SEMPRE declarar o método toString, pois ele é que vai permitir
	// visualizar o conteúdo dos arrays, ou seja, ele faz uma sobre escrita para a saída dos dados, se não utilizar ele, quando
	// for mostrar o vetor, retornara o endereço hexadecimal da variável.
	// O metodo toString percorre o vetor e só mostrar os campos que contenha valor,  ao invez de mostrar "nulls", só mostrará.
	// os campos que comtém valores no array

	@Override
	public String toString() {
		
		StringBuilder stg = new StringBuilder();
		stg.append("[ ");
			
			for(int i = 0; i < this.tamanho - 1; i++) {
				
				stg.append(this.elementos[i]);
				stg.append(", ");
				
			}
			
			if(this.tamanho > 0) {
				stg.append(this.elementos[this.tamanho - 1]);
			}
		
		stg.append(" ]");
		
		return stg.toString();
		
	}

	
	//MÉTODO ADICIONAR EM QUALQUER POSIÇÃO.
	//Esse método não apaga um valor existente em uma posição, ele desloca os valores para inserir um novo.
	//Esse método faz um OverLoading, ele está sobrecarregando o método adicionar, modificando sua assinatura.
	public boolean adicionar(int posicao, T elemento) {
		
		//Verifica se é um posição valida no vetor
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posição informda é invalida");
			
		}
		
		//aumenta o vetor se estiver cheio
		this.aumentandoVetor();
		
		//Movendo os elementos a direita do valor inserido..
		//No caso, move todos os elemento  uma posição para a direita do valor inserido.
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
			
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
		
	}
	
	
	//MÉTODO PARA AUMENTAR O TAMANHO DO VETOR
	//Aumenta a capacidade do vetor se ele estiver cheio quando for inserir novos valores;
	private void aumentandoVetor() {
		
		if(this.tamanho == this.elementos.length) {
			
							// Continua instâmciando um vetor de objetos mas faz um cast para a classe
			T[] novoVetor = (T[]) new Object[this.elementos.length * 2];
			
			//Percorre o vetor cheio e passa os valores para o novo vetor.
			for(int i = 0; i < this.elementos.length; i++) {
				novoVetor[i] = this.elementos[i];
				
			}
			
			this.elementos = novoVetor;
			
		}
				
	}
	
	// MÉTODO DE BUSCA 1
	// Esse método retorna o VALOR da posição informada
	public Object buscar(int posicao) {
		
		//Nega todas às posições que não possue dados, ou seja, não acessa as posições vazia no vetor, somente as que posuem valores nela.
		if(!(posicao >= 0 && posicao < tamanho)) {
			
			
			// IllegalArgumentException é uma exception(exceção) especial para argumentos invalidos,
			// no caso se for informado uma posição invalida, que o vetor não possue.
			// Ele sempre trabalha com o valor real do vetor.
			// O valor real do vetor é a ultima posição preenchida com dados.
			throw new IllegalArgumentException("A posição informada não é valida.");
		}
		
		return this.elementos[posicao];
		
	}
	
	// MÉTODO DE BUSCA 2
	// Esse método retorna a POSIÇÂO do valor informado
	// Método que busca um valor no vetor, ou seja, ele verifica se o valor existe.
	public int buscar(T elemento) {
		
		// Algoritmo de busca sequêncial
		for(int i = 0; i < this.tamanho; i++) {
			
			if(this.elementos[i].equals(elemento)) {
				 
				// Está retornnando o indice do elemento
				return i;
			}
			
		}
		
		return -1;
		
	}
	
	// MÉTODO REMOVER
	// Esse método remove uma posição do vetor
	public void remover(int posicao) {
		
		
		// Verifica se o valor informado é valido
		// O IllegalArgumentException sempre trabalha com o valor real, ou seja, o ultimo elemento adicionado no vetor.
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posição informada é invalida");
			
		}
		
		// Move todos os elementos para a esquerda.
		// Quando remove um elemento, os elementos desloca um possição para a esqueda.
		// Assim não deixando lacunas no vetor
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
			
		}
		
		// Decrementa o vetor
		this.tamanho--;
		
	}
	
	// MÉTODO TAMANHO DO VETOR
	// Retorna o tamanho do vetor
	public int tamanho() {
		
		return this.tamanho;
	}
	

}
