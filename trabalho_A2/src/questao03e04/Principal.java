package questao03e04;

import java.util.Scanner;


public class Principal {
	public static void main(String[] args) {
		Aluno[] vetor = new Aluno[10];
		for (int i = 0; i < vetor.length; i++) {
			Aluno a = Principal.lerDados();
			vetor[i] = a;
		}
		Principal.imprimir(vetor);
	}
	
	
	public static Float media(Aluno aluno) {
		float notaA1 = aluno.notaA1;
		float notaA2 = aluno.notaA2;
		float media = (notaA1 + notaA2) / 2;
		return media;
	}
	
	public static String aprovado(Aluno aluno) {
		float media = (aluno.notaA1 + aluno.notaA2) / 2;
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
			System.out.println("A média é: " + Principal.media(v[i]));
			System.out.println("Está aprovado: " + Principal.aprovado(v[i]));
			System.out.println(" ");
		}
		System.out.println("A média da turma é: " + Principal.mediaDaTurma(v));
	}
	
	public static Aluno lerDados() {
		Scanner scanner = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno:");
		aluno.nome = scanner.next();

		System.out.println("Informe o código em números da disciplina:");
		aluno.disciplina = scanner.nextInt();
	
		System.out.println("Informe a nota da primeira prova com vírgula:");
		aluno.notaA1 = scanner .nextFloat();
		
		System.out.println("Informe a nota da segunda prova com vírgula:");
		aluno.notaA2 = scanner.nextFloat();
		
		return aluno;
	}

}
