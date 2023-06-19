package trabalho_A2;

import java.util.Scanner;

public class PrincipalQuestao01 {
	public static void main(String[] args) {
		PapagaioCinzento[] vetor = new PapagaioCinzento[5];
		for (int i = 0; i < vetor.length; i++) {
			PapagaioCinzento p = PrincipalQuestao01.lerDados();
			vetor[i] = p;
		}
		PrincipalQuestao01.imprimir(vetor);
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
		papagaio.alturaEmCm = scanner.nextFloat();
		
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

//1) Pense em um tema para uma Classe em Java e deﬁna 5 atributos, contendo os
//seguintes 9pos: Integer, String, Float e Boolean. Construa uma nova classe (Principal)
//que leia 5 vezes os dados da classe deﬁnida anteriormente. Armazene esses 5 objetos
//em um vetor e logo após faça a impressão de todos os dados. Esse programa deve u9lizar
//2 métodos, lerDados para obter as informações e imprimir para apresentar as
//informações no console:
//public sta9c "SuaClasse" lerDados();
//publci sta9c void imprimir(SuaClasse suaClasse);
//* "SuaClasse" é a classe deﬁnida para essa questão.
