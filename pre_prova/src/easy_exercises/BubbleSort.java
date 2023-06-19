package easy_exercises;

public class BubbleSort {
	public static void main(String[] args) {
		Integer vetor[] = {1,2,3,4,8,76,45,13,21,35};
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		int n = vetor.length;
		// loop do vetor
		for (int i = 0; i < (n - 1); i++) {
			// loop dos valores
			for (int j = 0; j < (n - i - 1); j++) {
				if (vetor[j] > vetor[j + 1]) {
					// troca de valores
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}

//Faça um programa em Java para ordenar os valores de um vetor de inteiros. O
//programa deve imprimir os valores iniciais e os valores ordenados.
