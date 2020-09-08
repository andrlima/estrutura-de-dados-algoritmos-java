package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.tamanho());
		
		// imprimindo o tamanho do vetor
		System.out.println(vetor.toString());
		 
		
	}

}
