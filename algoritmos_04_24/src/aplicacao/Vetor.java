package aplicacao;

import java.util.Random;

public class Vetor {

	public static void main(String[] args) {
		// instancia (criacao) de um vetor
		Integer[] vetor = new Integer[10];
		
		int soma = 0;
		
		System.out.println(vetor.length);
		
		Random gerador = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(100);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		System.out.println("Soma: " + soma);
	}

}
