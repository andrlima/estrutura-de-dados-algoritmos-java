package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
	
		Vetor vetor = new Vetor(6);
		
		vetor.adiciona("A");
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E"); 
		
		System.out.println(vetor);
		
		vetor.remove(3);
		
		System.out.println("Removido o indice 3");
		
		System.out.println(vetor);
		
		System.out.println("Removendo o elemento C");
		
		// removendo um valor do vetor e não sua posição 
		int pos = vetor.busca("C");
		if(pos > -1) {
			vetor.remove(pos);
		}
		else {
			
			System.out.println("Elemento não exixte no vetor");
			
		}
		
		System.out.println(vetor);
		
	}

}
