package easy_exercises;

public class MediaDoVetor {
	public static void main(String[] args) {
		Integer vetor[] = {1,2,3,4,8,76,45,13,21};
		Integer total = 0;
		Integer media;
		
		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		
		media = total / vetor.length;
		
		System.out.println("A média do vetor é: " + media);
	}
}

//Faça um programa em Java para calcular a média de um vetor de inteiros. Leia os
//números do vetor (tamanho 5) e, após a leitura, apresente a média.
