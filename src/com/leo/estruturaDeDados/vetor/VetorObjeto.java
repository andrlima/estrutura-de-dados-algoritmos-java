package com.leo.estruturaDeDados.vetor;

public class VetorObjeto {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObjeto(int capacidade) {
		
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	

}
