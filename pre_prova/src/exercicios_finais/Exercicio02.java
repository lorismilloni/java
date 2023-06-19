package exercicios_finais;

public class Exercicio02 {
	public static void main(String[] args) {
		Integer[] vetor = {2,-3,2,3,1,-3,4,1};
		
		Exercicio02.imprimir(vetor);
		
		// eliminar os valores repetidos com zero
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					vetor[j] = 0;
				}
			}
		}
		System.out.println("");
		Exercicio02.imprimir(vetor);
		
		Integer[] resultado = {0,0,0,0,0,0,0,0}; 
		for (int i = 0, x = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {
				resultado[x++] = vetor[i];
			}
		}
		
		System.out.println("");
		Exercicio02.imprimir(resultado);
	}
	
	public static void imprimir(Integer[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
	}
}

//Construa um programa para compactar um vetor de 30
//posições. Após a leitura dos 30 valores, a compactação é feita
//retirando-se os elementos duplicados. Sendo assim, as
//posições livres do vetor deverão apresentar o valor zero.
