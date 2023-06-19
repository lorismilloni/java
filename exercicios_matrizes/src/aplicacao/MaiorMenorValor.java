package aplicacao;

import java.util.Random;

public class MaiorMenorValor {
	public static void main(String[] args) {
		Integer[] vetor = new Integer[10];
		Integer maior = 0;
		Integer menor = 0;
		
		Random gerador = new Random();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(100);;
			System.out.println(vetor[i]);
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			} else {
				menor = vetor[i];
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior valor é: " + maior + ". E o menor é: " + menor + ".");
	}
}
