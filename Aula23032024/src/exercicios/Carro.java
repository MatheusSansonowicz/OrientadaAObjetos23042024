package exercicios;

public class Carro {
	/*4 - Crie uma classe Carro que possua os atributos marca, modelo e ano.
	Proteja os atributos utilizando encapsulamento. Crie os métodos get e set
	para cada atributo. Crie um método exibeDetalhes que exibe os detalhes do
	carro. Faça leitura pelo teclado dos valores.*/
	private String marca;
	private String modelo;
	private String ano;
	
	public String getAno() {
		return ano;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
