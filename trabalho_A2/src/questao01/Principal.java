package questao01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		PapagaioCinzento[] vetor = new PapagaioCinzento[5];
		for (int i = 0; i < vetor.length; i++) {
			PapagaioCinzento p = Principal.lerDados();
			vetor[i] = p;
		}
		Principal.imprimir(vetor);
	}
	
	public static void imprimir(PapagaioCinzento[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Nome: " + v[i].nome);
			System.out.println("Idade: " + v[i].idade);
			System.out.println("Altura: " + v[i].alturaEmCm);
			System.out.println("Peso: " + v[i].peso);
			System.out.println("E femea?: " + v[i].femea);
			System.out.println(" ");
		}
	}
	
	public static PapagaioCinzento lerDados() {
		Scanner scanner = new Scanner(System.in);
		PapagaioCinzento papagaio = new PapagaioCinzento();
		
		System.out.println("Informe o nome do papagaio:");
		papagaio.nome = scanner.next();

		System.out.println("Informe a idade do papagaio em meses:");
		papagaio.idade = scanner.nextInt();
	
		System.out.println("Informe a altura do papagaio em centímetros:");
		papagaio.alturaEmCm = scanner .nextFloat();
		
		System.out.println("Informe o peso do animal em kg:");
		papagaio.peso = scanner.nextFloat();
		
		System.out.println("Informe se o papagaio é fêmea, 1 para SIM, 0 para NÃO:");
		int resultado = scanner.nextInt();
		if	(resultado == 1) {
			papagaio.femea = true;
		} else {
			papagaio.femea = false;
		}
		
		return papagaio;
	}
}
