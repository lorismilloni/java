package easy_exercises;

public class MaiorNumero {
	public static void main(String[] args) {
		Integer vetor[] = {1,2,3,4,8,76,45,13,21,35};
		Integer maior = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("O maior valor é: " + maior);
	}
}

//Faça um programa em Java para encontrar o maior valor em um vetor de inteiros.
//Crie um vetor com 10 números, imprima no console todos os valores e, em seguida, o
//maior valor.
