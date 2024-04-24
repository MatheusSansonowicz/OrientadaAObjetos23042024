package exercicios;

import java.util.Scanner;

public class PrincipalCirculo {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Circulo c = new Circulo(0);
		System.out.println("Digite o raio do circulo: ");
		double raio = teclado.nextDouble();
		c.setRaio(raio);
		System.out.println(c.calculaArea());
	}
	
}
