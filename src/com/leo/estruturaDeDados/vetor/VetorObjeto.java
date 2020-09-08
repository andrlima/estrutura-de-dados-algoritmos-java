package com.leo.estruturaDeDados.vetor;

public class VetorObjeto {
	
	private Object[] elementos;
	private int tamanho;
	
	//M�TODO CONSTRUTOR
	public VetorObjeto(int capacidade) {
		
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	
	//M�TODO ADICIONAR. Adiciona valores no vetor.
	public boolean adicionar(String elemento) {
				
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho]= elemento;
			this.tamanho++; //qtd do vetor
			
			//Se adicionou
			return true;
		}
		
		//Se n�o adicionou
		return false;
		
		
	}
	
	/*
	
	//M�TODO ADICIONAR EM QUALQUER POSI��O.
	//Esse m�todo n�o apaga um valor existente em uma posi��o, ele desloca os valores para inserir um novo.
	//Esse m�todo faz um OverLoading, ele est� sobrecarregando o m�todo adicionar, modificando sua assinatura.
	public boolean adicionar(int posicao, Object elemento) {
		
		//Verifica se � um posi��o valida no vetor
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o informda invalida");
			
		}
		
		//Movendo os elementos, s� existir outros elementos do lado direito.
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
