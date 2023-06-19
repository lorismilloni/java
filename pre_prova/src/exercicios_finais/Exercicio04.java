package exercicios_finais;

public class Exercicio04 {
	public static void main(String[] args) {
		Integer[][] matriz = {
								{1,2,3},
								{4,5,6},
								{7,8,9}
							  };
		
		System.out.println(Exercicio04.media(matriz));
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz.length; c++) {
				if (matriz[l][c] > Exercicio04.media(matriz)) {
					System.out.println("["+l+"]["+c+"] = "+matriz[l][c]);
				}
			}
		}
	}

	public static Integer media(Integer[][] mat) {
		Integer soma = 0;
		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat.length; c++) {
				soma += mat[l][c];
			}
		}
		return soma / (mat.length * mat.length);
	}
}

//Data uma matriz 6 x 6 de números inteiros. Faça um programa que:
//a. Calcule a média dos valores; e
//b. Imprima o valor e sua posição (linha e coluna), apenas dos
//valores acima da média.
