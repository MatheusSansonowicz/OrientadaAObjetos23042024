package exercicios;

public class Circulo {
	/*2 - Crie uma classe Circulo que possua o atributo raio. Proteja o atributo
utilizando encapsulamento. Crie os métodos get e set para o atributo. Crie
um método calculaArea que calcule a área do círculo e retorne o resultado.
Faça leitura pelo teclado dos valores.*/
	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea(){
		return raio*3.14;
	}

}
