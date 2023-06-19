package exercicios_finais;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Integer valor = 0;
		
		System.out.println("Digite um número inteiro:");
		try (Scanner scanner = new Scanner (System.in)) {
			valor = scanner.nextInt();
		}
		
		for (int i = 1; i <= valor; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("FizzBuzz");
				} else {
					System.out.println("Fizz");					
				}
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}

// input de usuário
// output lista de números
// receber o número
// testar se o número é multiplo de tres, cinco ou os dois
// escrever os números ou as palavras

// quando o usuário insere um número
// inicio um contador que vai de um até o número inserido
// enquanto esse contador incrementa eu testo se ele é multiplo
// e escrevo o número ou a palavra