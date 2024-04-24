package exercicios;

public class ContaBancaria {
	
	/*1 - Crie uma classe ContaBancaria que possua os atributos saldo e limite.
	Proteja os atributos utilizando encapsulamento. Crie os métodos get e set
	para cada atributo. Crie um método saque que permita ao usuário sacar um
	valor da conta, desde que não ultrapasse o limite da conta. Faça leitura pelo
	teclado.*/
	
	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		this.limite = limite;
		this.saldo = saldo;
	}
	
	public double getLimite() {
		return limite;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void setSaldo(double saldo) {
	this.saldo = saldo;
	}	
}
