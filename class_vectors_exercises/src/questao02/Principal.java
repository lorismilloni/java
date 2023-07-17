package questao02;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Telefone[] vetor = new Telefone[10];
		for (int i = 0; i < vetor.length; i++) {
			Telefone p = Principal.lerDados();
			vetor[i] = p;
		}
		Principal.imprimir(vetor);
	}
	
	public static Telefone lerDados() {
		Scanner scanner = new Scanner(System.in);
		Telefone t = new Telefone();
		
		System.out.println("Informe o modelo do telefone: ");
		t.modelo = scanner.next();
		
		System.out.println("Informe a marca do telefone: ");
		t.marca = scanner.next();
		
		System.out.println("Informe o ano de fabrica��o: ");
		t.anoDeFabricacao = scanner.nextInt();
		
		System.out.println("� smartphone? 1 para SIM, 0 para N�O:");
		int resultado = scanner.nextInt();
		if	(resultado == 1) {
			t.smartphone = true;
		} else {
			t.smartphone = false;
		}
		
		System.out.println("Possui 5G? 1 para SIM, 0 para N�O:");
		resultado = scanner.nextInt();
		if	(resultado == 1) {
			t.possui5G = true;
		} else {
			t.possui5G = false;
		}
		
		System.out.println("� novo? 1 para SIM, 0 para N�O:");
		resultado = scanner.nextInt();
		if	(resultado == 1) {
			t.novo = true;
		} else {
			t.novo = false;
		}
		
		return t;
	}
	
	public static void imprimir(Telefone[] telefones) {
		for (int i = 0; i < telefones.length; i++) {
			System.out.println("Modelo: " + telefones[i].modelo);
			System.out.println("Marca: " + telefones[i].marca);
			System.out.println("anoDeFabricacao: " + telefones[i].anoDeFabricacao);
			if (telefones[i].smartphone) {
				System.out.println("� um smartphone.");
			} else {
				System.out.println("N�o � um smartphone.");
			}
			if (telefones[i].possui5G) {
				System.out.println("Possui 5G.");
			} else {
				System.out.println("N�o possui 5G.");
			}
			if (telefones[i].novo) {
				System.out.println("� novo.");
			} else {
				System.out.println("N�o � novo.");
			}
			System.out.println(" ");
		}
	}
}
