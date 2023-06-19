package aplicacao;

import java.util.Scanner;

public class Verificar {
	public static void main(String[] args) {
		Integer[] vetor = {1,2,3,4,5,6,7,8,9,10};
		Integer numero;
		Boolean existe = false;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Informe um número inteiro para verificar: ");
			numero = scanner.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (numero == vetor[i]) {
				existe = true;
			}			
		}

		if (existe == true) {
			System.out.println("O número " + numero + " existe!");
		} else {
			System.out.println("O número " + numero + " não existe!");
		}
	}
}
