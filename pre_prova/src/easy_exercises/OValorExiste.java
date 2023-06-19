package easy_exercises;

import java.util.Scanner;

public class OValorExiste {
	public static void main(String[] args) {
		Integer vetor[] = {1,2,3,4,8,76,45,13,21};
		Integer valor = 0;
		Integer index = 0;
		Boolean existe = false;
		
		
		System.out.println("Digite um número para verificar se existe:");
		try (Scanner scanner = new Scanner(System.in)) {
			valor = scanner.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (valor == vetor[i]) {
				existe = true;
				index = i;
			}
		}
		if (existe) {
			System.out.println("O valor existe no vetor no index: " + index);			
		} else {
			System.out.println("O valor não existe.");	
		}
	}
}

//Faça um programa em Java para veriﬁcar se existe um elemento em um vetor de
//inteiros. O programa deve solicitar o valor a ser veriﬁcado e retornar se existe ou não,
//bem como o índice do vetor.
