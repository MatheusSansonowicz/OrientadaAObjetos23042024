package exercicios;

public class Retângulo {
	
	/*3 - Crie uma classe Retangulo que possua os atributos base e altura. Proteja
os atributos utilizando encapsulamento. Crie os métodos get e set para cada
atributo. Crie um método calculaArea que calcule a área do retângulo e
retorne o resultado. Faça leitura pelo teclado dos valores.*/
	private double base;
	private double altura;
	
	public double getAltura() {
		return altura;
	}
	
	public double getBase() {
		return base;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setBase(double base) {
	this.base = base;
	}	

	public double calculaArea(){
		return base*altura;
	}
}
