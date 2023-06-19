package prova;

public class Questao01 {

	public static void main(String[] args) {
		int valorA = -17;
		int valorB = 25;
		int valorC = 5;
		int valorD = 12;
		boolean resultado = false;
		
		resultado = (valorA - valorB) > 0 || valorD != 0;
		System.out.println(resultado);
		
		resultado = (valorB * -1) <= 0 && valorA % 2 == 0;
		System.out.println(resultado);
		
		resultado = !((valorC * valorA) > 0 || (valorB + valorD) < 0);
		System.out.println(resultado);
		
		resultado = (valorC % 2 == 1) && (valorA > valorB) || valorD > 10;
		System.out.println(resultado);
	}

}
