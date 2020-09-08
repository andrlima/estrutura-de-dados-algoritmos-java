package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.VetorObjetos;

public class ClasseTeste {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(6);
		
		
		vetor.adicionar("1");
		vetor.adicionar("2");
		vetor.adicionar("3");
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("D");
		
		
		System.out.println("Deu bom!");
		System.out.println("Vetor inicial com 6 posições");
		System.out.println(vetor);
		
		System.out.println("\nAdicionando A em um lugar especifico");
		vetor.adicionar(3, "A");
		System.out.println(vetor);
		
		System.out.println("\nAumentando o tamanho do vetor");
		vetor.adicionar("F");
		System.out.println(vetor);
		
		System.out.println("\nInformando o valor da posição do vetor: " + vetor.buscar(7));
		
		System.out.println("\nBuscando um valor especifico no vetor: "+ vetor.buscar("B")); 
		
		System.out.println("\nRemovendo um valor do vetor ");
		vetor.remover(5);
		System.out.println(vetor);
		
		System.out.println("\nMostrando o tamano do vetor: "+ vetor.tamanho());


	}

}
