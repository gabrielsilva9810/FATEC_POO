package Carro;

public class Dados {

	public static void main(String[] args) {
		
		//INSTANCIANDO AS CLASSES
		Onix o = new Onix();
		Camaro c = new Camaro();
		Toro t = new Toro();
		
		o.nome = "Onix";
		o.ano = 2019;
		o.combustivel = "Flex";
		o.cambio = "Automático";
		o.motorizacao = 1.4;
		o.velocidade = 70.0;
		
		o.Acelerar();
		o.Frear();
		o.Radar();
		//====================================================================//
		System.out.println("==============================================================");
		c.nome = "Camaro";
		c.ano = 2020;
		c.combustivel = "Gasolina";
		c.cambio = "Automático";
		c.motorizacao = 2.0;
		c.velocidade = 89.0;
		
		c.Acelerar();
		c.Frear();
		c.Radar();
		//====================================================================//
		System.out.println("==============================================================");
		t.nome = "Fiat Toro";
		t.ano = 2021;
		t.combustivel = "Alcool";
		t.cambio = "Manual";
		t.motorizacao = 1.2;
		t.velocidade = 120.0;
		
		t.Acelerar();
		t.Frear();
		t.Radar();
		
		//NOVAS CARACTERISTICAS
		o.velocidade = 120.0;
	}
}
