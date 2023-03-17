package Carro;

public class Toro {
	
	//CARACTERISTICAS
		public String nome;
		public int ano;
		public String combustivel;
		public String cambio;
		public Double motorizacao;
		public Double velocidade;
		
		//COMPORTAMENTOS
		public void Acelerar() {
			System.out.println("O carro " + nome + " está acelerando!");
		}
		
		public void Frear() {
			System.out.println("O carro " + nome + " está freiando!");
		}
		
		public void Radar() {
			int kmRadar = 90;
			
			if(velocidade > kmRadar) {
				System.out.println("Por favor diminua a velocidade. Você está acima do permitido.");
			} else {
				System.out.println("Siga em Frente! Sua velocidade atual é de: " + velocidade);
			}
		}
}
