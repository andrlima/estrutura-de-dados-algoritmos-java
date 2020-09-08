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

	
	
	// M�todo para preencher/adicionar dados ao vetor 
	public boolean  adiciona(String elemento){
		
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++; // retorna a quantidade de elementos no vetor 
			
			return true; // para aducuibar 

		}
		
		return false; // caso n�o adicione
		
	}
	
	//Fazendo um OverLoarding, sobrecarregando o metodo adiciona, modificando a sua assinatura
	//Esse metodo � para adicionar um valor em qualquer posi��o
	 public boolean adiciona(int posicao, String elemento) {
		 
		 //Verificando se � uma posi��o valida ou n�o
		 if(!(posicao >= 0 && posicao < tamanho)) {
			 throw new IllegalArgumentException("Posi��o informada invalida");
			 
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
		
		//Negando todas as posi��es que n�o podem ser acessadas 
		if(!(posicao >= 0 && posicao < tamanho)) {
			
			// � uma exception especial para argumentos invalidos, no caso de for pedido uma posi��o invalida no vetor
			// O tamanho real � a ultima posi��o preenchida no vetor
			throw new IllegalArgumentException("A posi��o informada � invalida");
		}
		
		return this.elementos[posicao];
	}
	
	
	// Metodo para retornar o tamanho do vetor 
	public int tamanho() {
		return this.tamanho;
		
	}
	
	
	
	//Metodo para verificar se um elemento existe em um vetor
	public int busca(String elemento) {
		
		//Algoritmo de busca sequ�ncia
		for(int i = 0; i < this.tamanho; i++) {
			
			// o equals compara os elementos, mas e case sensitive, a fun��o ignoreEqual n�o
			// compara o elemento informado para ver se � igual a algum dentro do vetor
			if(this.elementos[i].equals(elemento)) {
				
				return i;
			}
			
		}
		
		return -1;
		
		
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
