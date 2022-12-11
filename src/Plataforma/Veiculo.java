package Plataforma;

public abstract class Veiculo {
	protected int capacidadePessoas;
	protected int numeroRodas;
	protected String tipoCombsutivel;
	protected int visitas;
	protected int preco;
	protected int km;
	protected int ano;
	protected String marca;
	protected boolean vendido;
	protected Vendedor vendedor;
	
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String toString(){
		return "Marca: " + marca + "\nAno: " + ano + "\nPreco: " + preco + "\n\nVendedor: \n" + vendedor;
	}
	
	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}
	
	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	
	public int getNumeroRodas() {
		return numeroRodas;
	}
	
	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	
	public String getTipoCombsutivel() {
		return tipoCombsutivel;
	}
	
	public void setTipoCombsutivel(String tipoCombsutivel) {
		this.tipoCombsutivel = tipoCombsutivel;
	}
	
	public int getVisitas() {
		return visitas;
	}
	
	public void setVisitas(int visitas) {
		this.visitas = visitas;
	}
	
	public int getPreco() {
		return preco;
	}
	
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean isVendido() {
		return vendido;
	}
	
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	
}
