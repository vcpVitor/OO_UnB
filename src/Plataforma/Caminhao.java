package Plataforma;

public class Caminhao extends Veiculo {
	private int numPortas;
	private int capacidadeDeCarga;
	
	public Caminhao(int capacidadePessoas, int numeroRodas, String tipoCombustivel,
	int visitas, int preco, int km, int ano, String marca, boolean vendido,
	int numPortas, int capacidadeDeCarga) {
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
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	

}
