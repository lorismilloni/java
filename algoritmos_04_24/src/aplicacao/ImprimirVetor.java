package aplicacao;

public class ImprimirVetor {

	public static void main(String[] args) {
		// faça um programa que imprima o vetor sem valores repetidos
		Integer[] vetor = {1,3,3,5,7,7,9};
		Integer[] novo = new Integer[vetor.length];
		boolean existe = false;
		int posicao = 0;
		
		for (int i = 0; i < novo.length; i++) {
			existe = false;
			for (int j = 0; j < novo.length; j++) {
				if (novo[j] != null) {
					if (vetor[i] == novo[j]) {
						existe = true;
					}
				}
			}
			if (existe == false) {
				novo[posicao] = vetor[i];
				posicao++;				
			}
		}
		
		for (int i = 0; i < novo.length; i++) {
			System.out.println(novo[i]);
		}

	}

}
