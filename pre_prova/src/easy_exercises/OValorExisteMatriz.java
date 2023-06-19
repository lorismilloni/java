package easy_exercises;

import java.util.Scanner;

public class OValorExisteMatriz {
	public static void main(String[] args) {
		Integer matriz[][] = {
				{3,9,6},
				{10,1,4},
				{25,2,7}
		};
		Integer valor = 0;
		Boolean existe = false;
		
		System.out.println("Digite o número inteiro para conferir: ");
		try (Scanner scanner = new Scanner(System.in)) {
			valor = scanner.nextInt();
		}
		
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		int indexLinha = -1;
		int indexColuna = -1;
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] == valor) {
					existe = true;
					indexLinha = i;
					indexColuna = j;
				}
			}
		}
		
		if (existe) {
			System.out.println("O valor existe no índice: [" + indexLinha + "][" + indexColuna + "]");
		} else {
			System.out.println("O valor não existe na matriz.");
		}
	}
}

//Faça um programa em Java para veriﬁcar se existe um elemento em uma matriz de
//inteiros. O programa deve solicitar o valor a ser veriﬁcado e retornar se existe ou não,
//bem como o índice da matriz.
