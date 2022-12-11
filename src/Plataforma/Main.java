package Plataforma;

public class Main {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor("Exemplo", 123456789, 193, "Samambaia");

		Carro c = new Carro(4, 4, "flex", 321, 40000, 145000, 2015, "Fiat", false, 4, "sedan" );
//		System.out.println(c.getTipoCombsutivel());
		
		Caminhao o = new Caminhao(3,8, "diesel", 123, 100000, 500000, 2020, "Volvo", false, 2, 45000);
//		System.out.println(o.getCapacidadeDeCarga());
		
		Moto h = new Moto(2,2,"flex", 45, 50000, 35000, 2022, "Honda", false, 800);
//		System.out.println(h.getCilindrada());

		Catalogo cat = new Catalogo(1000);
		cat.addVeiculo(c);
		cat.addVeiculo(o);
		cat.addVeiculo(h);
		
//		cat.print();
		
		o.setVendedor(v1);
		
		Comprador c1 = new Comprador("Comprador1", 78945612, 190, "Recanto");
		
		Venda b2 = new Venda(1, c1, o);
		
		System.out.println(b2);
	}

}
