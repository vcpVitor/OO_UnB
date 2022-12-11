package Plataforma;

public class Moto extends Veiculo{
	private int cilindrada;
	
	public Moto(int capacidadePessoas, int numeroRodas, String tipoCombustivel,
	int visitas, int preco, int km, int ano, String marca, boolean vendido,int cilindrada) {
		this.capacidadePessoas = capacidadePessoas;
		this.numeroRodas = numeroRodas;
		this.tipoCombsutivel = tipoCombustivel;
		this.visitas = visitas; 
		this.preco = preco;
		this.km = km;
		this.ano = ano;
		this.marca = marca;
		this.vendido = vendido;
		this.cilindrada = cilindrada;
	}
	
	
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	

}
