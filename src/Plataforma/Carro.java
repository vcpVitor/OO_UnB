package Plataforma;

public class Carro extends Veiculo {
	private int numPortas;
	private String carroceria;
	
	public Carro(int capacidadePessoas, int numeroRodas, String tipoCombustivel,
			int visitas, int preco, int km, int ano, String marca, boolean vendido,
			int numPortas, String carroceria) {
		this.capacidadePessoas = capacidadePessoas;
		this.numeroRodas = numeroRodas;
		this.tipoCombsutivel = tipoCombustivel;
		this.visitas = visitas; 
		this.preco = preco;
		this.km = km;
		this.ano = ano;
		this.marca = marca;
		this.vendido = vendido;
		this.numPortas = numPortas;
		this.carroceria = carroceria;
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumRodas(int numPortas) {
		this.numPortas = numPortas;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}
	
	

}
