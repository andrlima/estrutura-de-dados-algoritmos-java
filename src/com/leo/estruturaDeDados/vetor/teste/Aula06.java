package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 01");
		vetor.adiciona("elemento 02");
		vetor.adiciona("elemento 03");
		
		//Haverar um retorno 1, pois o elemento existe
		System.out.println(vetor.busca("elemento 1"));
	
		//Vai retorna -1, pois o elemento não existe
		System.out.println(vetor.busca("Elemento 1"));
		
		
		
	}

}
