package prova;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		int valor;
		int nota100 = 0;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int nota5 = 0;
		int nota2 = 0;
		
		System.out.println("Informe um valor: ");
		try (Scanner leia = new Scanner(System.in)) {
			valor = leia.nextInt();
		}
		
		int declarado = valor;

		for (boolean i = true; i == true;) {
			if (valor >= 100) {
				valor -= 100;
				nota100 += 1;
			} else if (valor >= 50) {
				valor -= 50;
				nota50 += 1;
			} else if (valor >= 20) {
				valor -= 20;
				nota20 += 1;
			} else if (valor >= 10) {
				valor -= 10;
				nota10 += 1;
			} else if (valor >= 5) {
				valor -= 5;
				nota5 += 1;
			} else if (valor >= 2) {
				valor -= 2;
				nota2 += 1;
			} else {
				i = false;
			}
		}
		System.out.println("O valor informado foi " + declarado + ". A quantidade de notas de 100 foi: " + nota100 + ". A quantidade de notas de 50 foi: " + nota50 + ". A quantidade de notas de 20 foi: " + nota20 + ". A quantidade de notas de 10 foi: " + nota10 + ". A quantidade de notas de 5 foi: " + nota5 + ". E a quantidade de notas de 2 foi: " + nota2);
	}

}
