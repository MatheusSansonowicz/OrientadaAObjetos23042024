package exercicios;

import java.util.Scanner;

public class PrincipalRetângulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Retângulo R = new Retângulo();
		System.out.println("Digite a base do retângulo: ");
		R.setBase(teclado.nextDouble());
		System.out.println("Digite a altura do retângulo: ");
		R.setAltura(teclado.nextDouble());
		System.out.println("A area do retangulo é: "+R.calculaArea());

	}

}
