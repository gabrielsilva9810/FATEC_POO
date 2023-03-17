package Estadios;

public class Seguranca {

	public static void main(String[] args) {
		
		//NEO QUIMICA ARENA
		Arena nqa = new Arena();
		nqa.nome = "Neo Quimica Arena";
		nqa.capacidade = 47605;
		nqa.anoInauguracao = 2014;
		nqa.gramado = "Grama Natural";
		nqa.proprietario = "Sport Club Corinthians Paulista";
				
		nqa.AbrirPortao();
		System.out.println("=============================================");
		
		nqa.AnunciarGol();
		System.out.println("=============================================");
		
		nqa.FecharPortao();
		System.out.println("=============================================");

		//ALLIANZ PARQUE
		AllianzParque ap = new AllianzParque();
		ap.nome = "Allianz Parque";
		ap.capacidade = 43713;
		ap.anoInauguracao = 2014;
		ap.gramado = "Grama Sintética";
		ap.proprietario = "Sociedade Esportiva Palmeiras";

		ap.AbrirPortao();
		System.out.println("=============================================");
		
		ap.AnunciarGol();
		System.out.println("=============================================");
		
		ap.FecharPortao();
		System.out.println("=============================================");
		
		//MORUMBI
		Morumbi mb = new Morumbi();
		mb.nome = "Estadio Cicero Pompeu de Toledo | Morumbi";
		mb.capacidade = 77011;
		mb.anoInauguracao = 1960;
		mb.gramado = "Grama Natural";
		mb.proprietario = "São Paulo Futebol Clube";
		
		mb.AbrirPortao();
		System.out.println("=============================================");
		
		mb.AnunciarGol();
		System.out.println("=============================================");
		
		mb.FecharPortao();
		System.out.println("=============================================");
	}

}
