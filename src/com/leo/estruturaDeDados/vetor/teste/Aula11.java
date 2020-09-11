package com.leo.estruturaDeDados.vetor.teste;

import com.leo.estruturaDeDados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		
		Lista<Contato> vetor = new Lista<Contato>(2);
		
		
		
		// Para poder-mos adicionar um calor que n�o seja uma String, precisamos converte-la. isso porque criamos uma passe que faz isso.
		// vetor.adicionar("Elemento");
		// vetor.adicionar(1); <-- � necess�rio converter para String para poder adicionar
			
		
		Contato cont1 = new Contato("Contato 1", 1111-1111, "contato1@email.com");
		
		vetor.adicionar(cont1);
		
		System.out.println(vetor);
		
	}

}


// Um vetor � aestrutura de dadas mais simples que existe.
// Um vetor armazena uma seque�nia de valores onde todos s�o do mesmo timo.