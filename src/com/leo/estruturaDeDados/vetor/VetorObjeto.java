package com.leo.estruturaDeDados.vetor;

public class VetorObjeto {
	
	private Object[] elementos;
	private int tamanho;
	
	//MÉTODO CONSTRUTOR
	public VetorObjeto(int capacidade) {
		
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	
	//MÉTODO ADICIONAR. Adiciona valores no vetor.
	public boolean adicionar(String elemento) {
				
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho]= elemento;
			this.tamanho++; //qtd do vetor
			
			//Se adicionou
			return true;
		}
		
		//Se não adicionou
		return false;
		
		
	}
	
	/*
	
	//MÉTODO ADICIONAR EM QUALQUER POSIÇÃO.
	//Esse método não apaga um valor existente em uma posição, ele desloca os valores para inserir um novo.
	//Esse método faz um OverLoading, ele está sobrecarregando o método adicionar, modificando sua assinatura.
	public boolean adicionar(int posicao, Object elemento) {
		
		//Verifica se é um posição valida no vetor
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição informda invalida");
			
		}
		
		//Movendo os elementos, sé existir outros elementos do lado direito.
		//No caso, move todos os elementos da direita do valor inserido.
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
			
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
		
		
	}
	
	*/

}
