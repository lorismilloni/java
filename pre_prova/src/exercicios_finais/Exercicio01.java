package exercicios_finais;

public class Exercicio01 {
	public static void main(String[] args) {
		Integer[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		Exercicio01.imprimir(vetor);
		
		Exercicio01.trocaValoresParImpar(vetor);
		
		System.out.println("");
		Exercicio01.imprimir(vetor);
	}
	
	public static void imprimir(Integer[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
	}

	public static Integer[] trocaValoresParImpar(Integer[] vet) {
		Integer aux;
		for (int i = 0; i < vet.length-1; i+=2) {
			aux = vet[i];
			vet[i] = vet[i+1];
			vet[i+1] = aux;
		}
		return vet;
	}
}
//Implemente um programa que leia um vetor de 20 posições. A
//seguir o algoritmo deve trocar os elementos de ordem ímpar
//(posições) com os de ordem par (posições) imediatamente
//seguintes. Por fim, o algoritmo deve imprimir os elementos do vetor.
//Ex: 1<->2, 3<->4, 5<->6.

// ler um vetor de 20 posições
// os elementos que estão na posição impar devem ir para a posição par imediatamente seguintes
// imprimir os elementos após a troca