package prova;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		int quantidade;
		int primeiro = 0;
		int segundo = 1;
		int auxiliar = 0;
		
		System.out.println("Informe um número: ");
		try (Scanner leia = new Scanner(System.in)) {
			quantidade = leia.nextInt();
		}
		System.out.println(quantidade);
		
		if (quantidade < 1) {
			System.out.println("Informe um número válido: ");
		} else if (quantidade == 1) {
			System.out.println("Fibonacci: " + primeiro);
		} else if (quantidade == 2) {
			System.out.println("Fibonacci: " + primeiro + ", " + segundo);
		} else {
			System.out.print("Fibonacci: " + primeiro + ", " + segundo);
			for (int i = 2; i < quantidade; i++) {
				System.out.print(", " + (primeiro + segundo));
				auxiliar = primeiro;
				primeiro = segundo;
				segundo = auxiliar + segundo;
			}
		}

	}

}
