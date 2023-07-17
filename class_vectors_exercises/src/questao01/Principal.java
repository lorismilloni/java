package questao01;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer produtos[] = {0,0,0,0,0};
		Integer cen = 0;
		Integer bet = 0;
		Integer mex = 0;
		Integer aba = 0;
		Integer lar = 0;
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Digite o n�mero do produto que voc� quer comprar e aperte enter: ");
			System.out.println("Selecione o produto novamente caso queira mais de uma unidade. M�x: 15 unidades.");
			System.out.println("1 - Cenoura");
			System.out.println("2 - Beterraba");
			System.out.println("3 - Mexerica");
			System.out.println("4 - Abacate");
			System.out.println("5 - Laranja");
			System.out.println("6 - Finalizar a comprar");
			System.out.println(" ");

			int numero = scanner.nextInt();
	
			if (numero == 1) {
				if (cen >= 15) {
					System.out.println("Quantidade limite atingida.");
				} else {
					cen += 1;		
				}
			} else if (numero == 2) {
				if (bet >= 15) {
					System.out.println("Quantidade limite atingida.");
				} else {
					bet += 1;		
				}
			} else if (numero == 3) {
				if (mex >= 15) {
					System.out.println("Quantidade limite atingida.");
				} else {
					mex += 1;		
				}
			} else if (numero == 4) {
				if (aba >= 15) {
					System.out.println("Quantidade limite atingida.");
				} else {
					aba += 1;		
				}
			} else if (numero == 5) {
				if (lar >= 15) {
					System.out.println("Quantidade limite atingida.");
				} else {
					lar += 1;		
				}
			} else if (numero == 6) {
				System.out.println("O programa ser� finalizado.");
				i = 1000;
			} else {
				System.out.println("Essa op��o n�o existe, digite 6 se deseja finalizar o programa.");
			}
		}
		
		produtos[0] = cen;
		produtos[1] = bet;
		produtos[2] = mex;
		produtos[3] = aba;
		produtos[4] = lar;
		
		Produto[] vetor = new Produto[5];
		for (int i = 0; i < vetor.length; i++) {
			Produto p = new Produto();
			if (i == 0) {
				p.nome = "Cenoura";
				p.preco = 1;
				p.quantidade = cen;
			} else if (i == 1) {
				p.nome = "Beterraba";
				p.preco = 2;
				p.quantidade = bet;
			} else if (i == 2) {
				p.nome = "Mexerica";
				p.preco = 1;
				p.quantidade = mex;
			} else if (i == 3) {
				p.nome = "Abacate";
				p.preco = 4;
				p.quantidade = aba;
			} else {
				p.nome = "Laranja";
				p.preco = 2;
				p.quantidade = lar;
			}
			vetor[i] = p;
		}
		
		Principal.finalizarCompra(vetor);
	}
	
	public static void finalizarCompra(Produto[] produtos) {
		Integer total = 0;
		System.out.println("Seus pedidos foram: ");
		for (int i = 0; i < produtos.length; i++) {
			total += produtos[i].preco * produtos[i].quantidade;
			System.out.println(produtos[i].quantidade + " " + produtos[i].nome + "s, cada uma por: " + produtos[i].preco );
		}
		System.out.println("Por um total de: " + total + " reais.");
		System.out.println(" ");
	}
}
