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
	
	/* Código não muito eficiente 
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

	
	
	// Método para preencher/adicionar dados ao vetor 
	public boolean  adiciona(String elemento){
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++; // retorna a quantidade de elementos no vetor 
			
			return true; // para aducuibar 

		}
		
		return false; // caso não adicione
		
	}
	
	//Fazendo um OverLoarding, sobrecarregando o metodo adiciona, modificando a sua assinatura
	//Esse metodo é para adicionar um valor em qualquer posição
	 public boolean adiciona(int posicao, String elemento) {
		 
		 //Verificando se é uma posição valida ou não
		 if(!(posicao >= 0 && posicao < tamanho)) {
			 throw new IllegalArgumentException("Posição informada invalida");
			 
		 }
		 // Movendo os elementos 
		 for(int i = this.tamanho - 1; i >= posicao; i--) {
			 this.elementos[i + 1] = this.elementos[i];
		 }
		 
		 this.elementos[posicao] = elemento;
		 this.tamanho++;
		 
		 
		 return true;
		 
	 }

	
	//Metodo de busca
	public String busca(int posicao) {
		
		//Negando todas as posições que não podem ser acessadas 
		if(!(posicao >= 0 && posicao < tamanho)) {
			
			// è uma exception especial para argumentos invalidos, no caso de for pedido uma posição invalida no vetor
			// O tamanho real é a ultima posição preenchida no vetor
			throw new IllegalArgumentException("A posição informada é invalida");
		}
		
		return this.elementos[posicao];
	}
	
	
	// Metodo para retornar o tamanho do vetor 
	public int tamanho() {
		return this.tamanho;
		
	}
	
	
	
	//Metodo para verificar se um elemento existe em um vetor
	public int busca(String elemento) {
		
		//Algoritmo de busca sequência
		for(int i = 0; i < this.tamanho; i++) {
			
			// o equals compara os elementos, mas e case sensitive, a função ignoreEqual não
			// compara o elemento informado para ver se é igual a algum dentro do vetor
			if(this.elementos[i].equals(elemento)) {
				
				return i;
			}
			
		}
		
		return -1;
		
		
	}
	
	
	//Método para percorrer o vetor e só vai mostrar os espaço que contenha valores,
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
