package easy_exercises;

public class MatrizIdentidade {
	public static void main(String[] args) {
		Integer matriz[][] = {
				{1,0,0},
                {0,1,0},
                {0,0,1},
		};
		Boolean eIdentidade = true;
		int linhas = matriz.length;
		int colunas = matriz[0].length;
		
		if (linhas != colunas) {
			System.out.println("Não é uma matriz quadrada.");
			eIdentidade = false;
		} else {
			System.out.println("É uma matriz quadrada.");
		}
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (i == j && matriz[i][j] != 1) {
					eIdentidade = false;
				} else if (i != j && matriz[i][j] != 0) {
					eIdentidade = false;
				}
			}
		}
		
		if (eIdentidade) {
			System.out.println("É uma matriz identidade.");
		} else {
			System.out.println("Não é uma matriz identidade.");
		}
	}
}

//Faça um programa em Java que veriﬁque se uma matriz quadrada é uma matriz
//idenPdade. Uma matriz idenPdade possui os elementos da diagonal principal iguais a 1
//e os demais iguais a 0.
