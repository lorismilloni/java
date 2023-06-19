package trabalho_A2;

import java.util.Scanner;

public class PrincipalQuestao02 {
	public static void main(String[] args) {
		PapagaioCinzento[][] matriz = new PapagaioCinzento[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				PapagaioCinzento p = PrincipalQuestao02.lerDados();
				matriz[i][j] = p;				
			}
		}
		PrincipalQuestao02.imprimir(matriz);
	}
	
	public static void imprimir(PapagaioCinzento[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.println("Nome: " + m[i][j].nome);
				System.out.println("Idade: " + m[i][j].idade);
				System.out.println("Altura: " + m[i][j].alturaEmCm);
				System.out.println("Peso: " + m[i][j].peso);
				System.out.println("E femea?: " + m[i][j].femea);
				System.out.println(" ");				
			}
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

//Em relação a questão anterior, u9lize uma matriz 3x3 e leia os dados preenchendo
//toda a matriz. Após a leitura deve imprimir todos os dados u9lizando o método abaixo:
//public sta9c void imprimir(SuaClasse[][] matriz);
