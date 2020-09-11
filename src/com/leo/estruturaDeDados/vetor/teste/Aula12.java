package com.leo.estruturaDeDados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// MÉTODO ADICIONAR
		arrayList.add("A");
		arrayList.add("B");
		
		System.out.println(arrayList);

		// MÉTODO ADICIONAR EM QUALQUER LUGAR
		// Como o array foi declarado sem tamanho na linha 9, ele é dinâmico, ou seja, cresce com forme necessário.
		// Lembrando que ésse método aloca uma nova posição no vetor e deslocando todos os demais uma posição para a direita 
		arrayList.add(2, "C");
		
		System.out.println(arrayList);
		
		// MÉTODO DE BUSCA 1
		// Busc o valor
		// Esse método retorna o valor(objeto) do indice buscado
		boolean existe =  arrayList.contains("A");
		
		if(existe) {
			System.out.println("Achou o A");
		}
		else {
			System.out.println("Não achou");
			
		}
		
		// MÉTODO DE BUSCA 2
		// Busca o indice
		// Esse método retorna o indice do valor buscado
		// Lemabrando que ele é um boolean, então retorna 1 ou -1
		int posicao = arrayList.indexOf("B");
		
		if(posicao > -1){
			System.out.println("Exixte no array, na posição: "+ posicao);
		}
		else {
			System.out.println("Não existe no array");
			
		}
		
		// MÉTODO AUMENTAR TAMANHO
		// Esse método já é implementado no proprio ArrayList
		// Ele faz todo o processo nativo de declara o array e um tamano, aí caso na hora de adicionar 
		//o array estiver cheio ele multiplica o tamanho do vetor.
		
		
		
		// MÉTODO BUSCA 3(?)
		// Busca a posição (?)
		// Se a posição não existir, ele dá uma exception
		System.out.println("Posição: " + arrayList.get(2));
		
		// MÉTODEO REMOVER/EXCLUIR 1
		// Remove o indice
		// Lenbrando que na exclusão, todos os elementos é deslocado uma posição para a direita
		arrayList.remove(1);
		System.out.println("Excluindo a indice 1");
		System.out.println(arrayList);
		
		// MÉTODO REMOVER/EXCLUIR 2
		// Remove o valor
		arrayList.remove("C");
		System.out.println("Ewmovendo a letra C");
		
		//MÉTODO PARA RETORNAR O TAMANHO DO ARRAY
		System.out.println("Retornando o tamanho: " + arrayList.size());


	}

}


// No caso, a classe ArrayList já cotém todos os métodos que foi criado na classe Lista
// Então significa que essa classe utiliza todos(ou quase todos) os  métodos de estrutura da dados.
// Na classe Lista eu criei todos os métodos nativamente, ou seja, aprendir como se faz esses metodos.
// Mas pelo que orientado, em projetos reais já não se cria mais arrays(vetores) nativamente, mas sim utiliza a classe ArrayList
// 
// ArrayList<nome>  O "nome" é o tipo da entidade que iremos istânciar da classe.