package aplicacao;

import java.util.Random;

public class Ordenar {
	public static void main(String[] args) {
		Integer quantidade;
		
		Random gerador = new Random();
		quantidade = gerador.nextInt(10 - 3) + 3;
		System.out.println("Quantidade: " + quantidade);
		
		Integer[] vetor = new Integer[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(100);
			System.out.println(vetor[i]);
		}
		

		for (int i = 0; i < vetor.length; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int valor = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = valor;
				}
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);			
		}
		
	}
}
