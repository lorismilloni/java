package exercicio01;

import java.util.Scanner;

public class ComputadorPrincipal {
	public static void main(String[] args) {
		ComputadorAtributos[] vetor = new ComputadorAtributos[2];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = ComputadorPrincipal.lerDados();
		}
		
		ComputadorPrincipal.imprimir(vetor);
	}
	
	public static void imprimir(ComputadorAtributos[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print("Marca: " +  v[i].marca);
			System.out.print("Preco: " + v[i].preco);
			System.out.print("Altura: " + v[i].altura);
			System.out.print("Largura: " + v[i].largura);
			System.out.print("É novo?: " + v[i].ehNovo);
			System.out.println(" ");
		}
	}
	
	public static ComputadorAtributos lerDados() {
		
		Scanner entrada = new Scanner(System.in);
		
		ComputadorAtributos computador = new ComputadorAtributos();
		
		System.out.println("Digite a marca do computador: ");
		computador.marca = entrada.next();
		System.out.println("Digite o preco do computador: ");
		computador.preco = entrada.nextFloat();
		System.out.println("Digite a altura do computador: ");
		computador.altura = entrada.nextInt();
		System.out.println("Digite a largura do computador: ");
		computador.largura = entrada.nextInt();
		System.out.println("O computador é novo? (Se sim digite 1, se nao digite 2)");
		int resultado = entrada.nextInt();
		if (resultado == 1) {
			computador.ehNovo = true;
		} else {
			computador.ehNovo = false;
		}
//		entrada.close();
		return computador;
	}
}
