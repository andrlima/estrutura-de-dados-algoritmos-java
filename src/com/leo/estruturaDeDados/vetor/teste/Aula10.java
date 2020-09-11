package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato cont1 = new Contato("Contato 1", 1111-1111, "contato1@email.com");
		Contato cont2 = new Contato("Contato 2", 2222-2222, "contato2@email.com");
		Contato cont3 = new Contato("Contato 3", 3333-3333, "contato3@email.com");
		
		Contato cont4 = new Contato("Contato 4", 4444-4444, "contato3@email.com");
		
		vetor.adicionar(cont1);
		vetor.adicionar(cont2);
		vetor.adicionar(cont3);

		System.out.println("Tamanho = " + vetor.tamanho());
		
		
		int pos = vetor.buscar(cont4);
		if(pos > -1) {
			System.out.println("\nElemento existe no vetor");
			
		}
		else {
			System.out.println("Elemento não existe no vetor!");
		}
		
		System.out.println("teste\n" +vetor);
		

	}

}
