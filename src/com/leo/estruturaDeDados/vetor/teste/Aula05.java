package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		// As posi��es validas s�o do primeiro valor at� o tamanho real do vetor
		System.out.println(vetor.busca(2));
		

	}

}
