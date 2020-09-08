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
	public boolean adocionar(Object elemento) {
				
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho]= elementos;
			this.tamanho++; //qtd do vetor
			
			//Se adicionou
			return true;
		}
		
		//Se não adicionou
		return false;
		
		
	}

}
