package com.leo.estruturaDeDados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// M�TODO ADICIONAR
		arrayList.add("A");
		arrayList.add("B");
		
		System.out.println(arrayList);

		// M�TODO ADICIONAR EM QUALQUER LUGAR
		// Como o array foi declarado sem tamanho na linha 9, ele � din�mico, ou seja, cresce com forme necess�rio.
		// Lembrando que �sse m�todo aloca uma nova posi��o no vetor e deslocando todos os demais uma posi��o para a direita 
		arrayList.add(2, "C");
		
		System.out.println(arrayList);
		
		// M�TODO DE BUSCA 1
		// Busc o valor
		// Esse m�todo retorna o valor(objeto) do indice buscado
		boolean existe =  arrayList.contains("A");
		
		if(existe) {
			System.out.println("Achou o A");
		}
		else {
			System.out.println("N�o achou");
			
		}
		
		// M�TODO DE BUSCA 2
		// Busca o indice
		// Esse m�todo retorna o indice do valor buscado
		// Lemabrando que ele � um boolean, ent�o retorna 1 ou -1
		int posicao = arrayList.indexOf("B");
		
		if(posicao > -1){
			System.out.println("Exixte no array, na posi��o: "+ posicao);
		}
		else {
			System.out.println("N�o existe no array");
			
		}
		
		// M�TODO AUMENTAR TAMANHO
		// Esse m�todo j� � implementado no proprio ArrayList
		// Ele faz todo o processo nativo de declara o array e um tamano, a� caso na hora de adicionar 
		//o array estiver cheio ele multiplica o tamanho do vetor.
		
		
		
		// M�TODO BUSCA 3(?)
		// Busca a posi��o (?)
		// Se a posi��o n�o existir, ele d� uma exception
		System.out.println("Posi��o: " + arrayList.get(2));
		
		// M�TODEO REMOVER/EXCLUIR 1
		// Remove o indice
		// Lenbrando que na exclus�o, todos os elementos � deslocado uma posi��o para a direita
		arrayList.remove(1);
		System.out.println("Excluindo a indice 1");
		System.out.println(arrayList);
		
		// M�TODO REMOVER/EXCLUIR 2
		// Remove o valor
		arrayList.remove("C");
		System.out.println("Ewmovendo a letra C");
		
		//M�TODO PARA RETORNAR O TAMANHO DO ARRAY
		System.out.println("Retornando o tamanho: " + arrayList.size());


	}

}


// No caso, a classe ArrayList j� cot�m todos os m�todos que foi criado na classe Lista
// Ent�o significa que essa classe utiliza todos(ou quase todos) os  m�todos de estrutura da dados.
// Na classe Lista eu criei todos os m�todos nativamente, ou seja, aprendir como se faz esses metodos.
// Mas pelo que orientado, em projetos reais j� n�o se cria mais arrays(vetores) nativamente, mas sim utiliza a classe ArrayList
// 
// ArrayList<nome>  O "nome" � o tipo da entidade que iremos ist�nciar da classe.