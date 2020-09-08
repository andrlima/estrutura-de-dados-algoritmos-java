package com.leo.estruturaDeDados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	
	}
	
	
	// METODOS DE ADICIONAR ELEMENTOS NO VETOR
	
	/* C�digo n�o muito eficiente 
	public void adiciona(String elemento) {
		
		for(int i = 0; i < this.elementos.length; i++) {
			
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	*/
	
	
	/*  Metodo com inteiro 
	public void adiciona(String elemento) throws Exception {
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			
		}
		else {
			throw new Exception("Veotor cheio");
			
		}
		
	}
	*/
	
	// M�todo para preencher o vetor 
	public boolean  adiciona(String elemento){
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++; // retorna a quantidade de elementos no vetor 
			
			return true; // para aducuibar 

		}
		
		return false; // caso n�o adicione
		
	}
	
	//Metodo de busca
	public String busca(int posicao) {
		
		//Negando todas as posi��es que n�o podem ser acessadas 
		if(!(posicao >= 0 && posicao < tamanho)) {
			
			// � uma exception especial para argumentos invalidos, no caso de for pedido uma posi��o invalida no vetor
			throw new IllegalArgumentException("A posi��o informada � invalida");
		}
		
		return this.elementos[posicao];
	}
	
	
	// Metodo para retornar o tamanho do vetor 
	public int tamanho() {
		return this.tamanho;
		
	}
	
	
	//M�todo para percorrer o vetor e s� vai mostrar os espa�o que contenha valores,
	@Override
	public String toString() {
		
		 //StringBuilder
		StringBuilder stg = new StringBuilder();
		stg.append("[");
		
		for(int i = 0; i < this.tamanho -1; i++) {
			
			stg.append(this.elementos[i]);
			stg.append(", ");
			
		}
		
		if(this.tamanho > 0) {
			stg.append(this.elementos[this.tamanho - 1]);
		}
		
		stg.append("]");
		
		return stg.toString();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
