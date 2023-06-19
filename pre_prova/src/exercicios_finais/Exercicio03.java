package exercicios_finais;

public class Exercicio03 {
	public static void main(String[] args) {
		Integer[] va = {1,2,3,4,5,6,7,8,9,10};
		Integer[] vb = {1,2,33,4,55,6,77,8,99,10};
		Integer[] r = {0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0, x = 0; i < vb.length; i++) {
			boolean existe = existeValor(vb[i], va);
			if (!existe) {
				r[x++] = vb[i];
			}
		}
		 
		Exercicio03.imprimir(va);
		System.out.println("");
		Exercicio03.imprimir(vb);
		System.out.println("");
		Exercicio03.imprimir(r);
	}
	
	public static boolean existeValor(Integer valor, Integer vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			if (valor == vetor[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void imprimir(Integer[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}
	}
}

//Desenvolva um programa que leia dois vetores (A e B) de 10
//inteiros e gere um terceiro vetor (R) de 10 inteiros, cujos elementos
//são os valores de B que não estão em A. Caso R não seja
//totalmente preenchido, as demais posições deverão conter o valor zero.