package exercicio;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("---- Operação Divisão ----");
		System.out.print("Digite o primeiro valor: ");
		float valor1 = scan.nextFloat();
		System.out.print("Digite o segundo valor: ");
		float valor2 = scan.nextFloat();
		
		System.out.println("Resultado: " + (valor1/valor2));
	}

}
