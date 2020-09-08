package com.leo.estruturaDeDados.vetor;

import java.util.Arrays;

public class VetorObjetos {
	
	private Object[] elementos;
	private int tamanho;
	
	//M�TODO CONSTRUTOR
	public VetorObjetos(int capacidade) {
		
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
		
	}
		
	//M�TODO ADICIONAR. Adiciona valores no vetor.
	public boolean adicionar(Object elemento) {
		
		//aumenta o vetor se estiver cheio
		this.aumentandoVetor();
				
		if(this.tamanho < this.elementos.length) {
			
			this.elementos[this.tamanho]= elemento;
			this.tamanho++; //qtd do vetor
			
			//Se adicionou
			return true;
		}
		
		//Se n�o adicionou
		return false;
		
	}
	
	// M�TODO toString PARA OS ARRAYS.
	// Quando se trabalha com Arrays no java, precisamos SEMPRE declarar o m�todo toString, pois ele � que vai permitir
	// visualizar o conte�do dos arrays, ou seja, ele faz uma sobre escrita para a sa�da dos dados, se n�o utilizar ele, quando
	// for mostrar o vetor, retornara o endere�o hexadecimal da vari�vel.
	// O metodo toString percorre o vetor e s� mostrar os campos que contenha valor,  ao invez de mostrar "nulls", s� mostrar�.
	// os campos que comt�m valores no array

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

	
	//M�TODO ADICIONAR EM QUALQUER POSI��O.
	//Esse m�todo n�o apaga um valor existente em uma posi��o, ele desloca os valores para inserir um novo.
	//Esse m�todo faz um OverLoading, ele est� sobrecarregando o m�todo adicionar, modificando sua assinatura.
	public boolean adicionar(int posicao, Object elemento) {
		
		//Verifica se � um posi��o valida no vetor
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("A posi��o informda � invalida");
			
		}
		
		//aumenta o vetor se estiver cheio
		this.aumentandoVetor();
		
		//Movendo os elementos, s� existir outros elementos do lado direito.
		//No caso, move todos os elementos da direita do valor inserido.
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
			
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
		
	}
	
	
	//M�TODO PARA AUMENTAR O TAMANHO DO VETOR
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
	
	// M�TODO DE BUSCA 1
	// Esse m�todo retorna o valor da posi��o informada
	public Object buscar(int posicao) {
		
		//Nega todas �s posi��es que n�o possue dados, ou seja, n�o acessa as posi��es vazia no vetor, somente as que posuem valores nela.
		if(!(posicao >= 0 && posicao < tamanho)) {
			
			
			// IllegalArgumentException � uma exception(exce��o) especial para argumentos invalidos,
			// no caso se for informado uma posi��o invalida, que o vetor n�o possue.
			// Ele sempre trabalha com o valor real do vetor.
			// O valor real do vetor � a ultima posi��o preenchida com dados.
			throw new IllegalArgumentException("A posi��o informada n�o � valida.");
		}
		
		return this.elementos[posicao];
		
	}
	
	// M�TODO DE BUSCA 2
	public int buscar(Object elemento) {
		
		for(int i = 0; i < this.tamanho; i++) {
			
			if(this.elementos[i].equals(elemento)) {
				
				return 1;
			}
			
		}
		
		return -1;
		
	}

}
