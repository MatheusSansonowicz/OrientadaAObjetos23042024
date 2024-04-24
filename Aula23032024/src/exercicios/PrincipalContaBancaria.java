package exercicios;

import java.util.Scanner;

public class PrincipalContaBancaria {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ContaBancaria novaConta = new ContaBancaria(990, 1000);
		
		System.out.println("Saldo atual: " +novaConta.getSaldo());
		System.out.println("Limtie atual: "+novaConta.getLimite());
		System.out.println("Digite o valor que deseja sacar: ");
		
		double valorSaque = teclado.nextDouble();
		if (valorSaque>novaConta.getLimite()) {
			System.out.println("O valoré maior que seu limite atual!");
		}
		else if (valorSaque> novaConta.getSaldo()) {
			System.out.println("Saldo insuficiente!");
		}
		else {
			System.out.println("Imprimindo...");
			novaConta.setSaldo(novaConta.getSaldo()-valorSaque);
			System.out.println("Saldo atual: "+novaConta.getSaldo());
		}
	}
}
