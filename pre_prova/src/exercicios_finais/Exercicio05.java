package exercicios_finais;

public class Exercicio05 {
	public static void main(String[] args) {
		Integer[][] matriz = {
								{1 ,2 ,3 ,10},
								{4 ,5 ,6 ,11},
								{7 ,8 ,9 ,12},
								{16,15,14,13}
							  };

		Integer somaP = 0;
		for (int i = 0; i < matriz.length; i++) {
			somaP += matriz[i][i];
		}
		System.out.println("A soma da diagonal principal é: " + somaP);
		
		Integer somaS = 0;
		for (int l = 0, c = matriz.length - 1; l < matriz.length; l++,c--) {
			somaS += matriz[l][c];
		}
		System.out.println("A soma da diagonal secundária é: " + somaS);
	}
}

//Faça um programa que some os valores da diagonal principal e
//secundária de uma matriz 7 x 7. Após o processamento imprima a
//soma de cada diagonal.
