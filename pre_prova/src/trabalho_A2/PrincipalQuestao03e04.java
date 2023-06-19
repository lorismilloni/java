package trabalho_A2;

import java.util.Scanner;

public class PrincipalQuestao03e04 {
	public static void main(String[] args) {
		Aluno[] vetor = new Aluno[3];
		for (int i = 0; i < vetor.length; i++) {
			Aluno a = PrincipalQuestao03e04.lerDados();
			vetor[i] = a;
		}
		PrincipalQuestao03e04.imprimir(vetor);
	}
	
	
	public static Float media(Aluno aluno) {
		float notaA1 = aluno.notaA1;
		float notaA2 = aluno.notaA2;
		float media = (notaA1 + notaA2) / 2;
		return media;
	}
	
	public static String aprovado(Aluno aluno) {
		float media = PrincipalQuestao03e04.media(aluno);
		if (media >= 6) {
			return "SIM";
		}
		return "NÃO";
	}
	
	public static Float mediaDaTurma(Aluno[] aluno) {
		float vetor[] = new float[aluno.length];
		float soma = 0;
		for (int i = 0; i < aluno.length; i++) {
			float media = (aluno[i].notaA1 + aluno[i].notaA2) / 2;
			vetor[i] = media;
		}
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		float mediaDaTurma = soma / vetor.length;
		return mediaDaTurma;
	}
	
	public static void imprimir(Aluno[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Nome: " + v[i].nome);
			System.out.println("Disciplina: " + v[i].disciplina);
			System.out.println("Nota da A1: " + v[i].notaA1);
			System.out.println("Nota da A2: " + v[i].notaA2);
			System.out.println("A média é: " + PrincipalQuestao03e04.media(v[i]));
			System.out.println("Está aprovado: " + PrincipalQuestao03e04.aprovado(v[i]));
			System.out.println(" ");
		}
		System.out.println("A média da turma é: " + PrincipalQuestao03e04.mediaDaTurma(v));
	}
	
	public static Aluno lerDados() {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno:");
		aluno.nome = scanner.next();

		System.out.println("Informe o código em números da disciplina:");
		aluno.disciplina = scanner.nextInt();
	
		System.out.println("Informe a nota da primeira prova com vírgula:");
		aluno.notaA1 = scanner.nextFloat();
		
		System.out.println("Informe a nota da segunda prova com vírgula:");
		aluno.notaA2 = scanner.nextFloat();
		
		return aluno;
	}

}

//Implemente um programa que armazene e imprima um vetor de 10 posições da classe
//Aluno com as seguintes informações: nome, disciplina, notaA1 e notaA2. O programa
//deve construir/u9lizar os 3 métodos de Classe abaixo:
//a) public sta9c Float media(Aluno aluno);
//b) public sta9c String aprovado(Aluno aluno);
//c) public sta9c void imprimir(Aluno aluno);
//Ao imprimir deve apresentar todas as informações do aluno, bem como sua média e se
//está aprovado ou não.

//Em relação à questão anterior implemente um método para calcular a média geral da
//turma. O método recebe como parâmetro o vetor de alunos e retorna um valor Float
//contendo a média da turma. U9lize esse método ao ﬁnal do programa anterior.
