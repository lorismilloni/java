package aplicacao;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Integer[] vetor = new Integer[5];
		Integer soma = 0;
		
		try (Scanner scanner = new Scanner(System.in)) {
			for (int i = 0; i < vetor.length; i++) {
				int numero = i + 1;
				System.out.println("Informe o " + numero + "º numero inteiro de " + vetor.length + " numeros.");
				vetor[i] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		Integer media = soma / vetor.length;
		System.out.println("A média é: " + media);
	}
}
