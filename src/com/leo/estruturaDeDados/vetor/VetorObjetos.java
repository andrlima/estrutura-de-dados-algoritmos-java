package com.leo.estruturaDeDados.vetor;

import java.util.Arrays;

public class VetorObjetos {
	
	private Object[] elementos;
	private int tamanho;
	
	//MÉTODO CONSTRUTOR
	public VetorObjetos(int capacidade) {
		
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
		
	}
		
	//MÉTODO ADICIONAR. Adiciona valores no vetor.
	public boolean adicionar(Object elemento) {
		
		//aumenta o vetor se estiver cheio
		this.aumentandoVetor();
				
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho]= elemento;
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
	public boolean adicionar(int posicao, Object elemento) {
		
		//Verifica se é um posição valida no vetor
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posição informda é invalida");
			
		}
		
		//aumenta o vetor se estiver cheio
		this.aumentandoVetor();
		
		//Movendo os elementos, sé existir outros elementos do lado direito.
		//No caso, move todos os elementos da direita do valor inserido.
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
			
			Object[] novoVetor = new Object[this.elementos.length * 2];
			
			//Percorre o vetor cheio e passa os valores para o novo vetor.
			for(int i = 0; i < this.elementos.length; i++) {
				novoVetor[i] = this.elementos[i];
				
			}
			
			this.elementos = novoVetor;
			
		}
				
	}
	
	// MÉTODO DE BUSCA 1
	// Esse método retorna o valor da posição informada
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
	public int buscar(Object elemento) {
		
		for(int i = 0; i < this.tamanho; i++) {
			
			if(this.elementos[i].equals(elemento)) {
				
				return 1;
			}
			
		}
		
		return -1;
		
	}

}
