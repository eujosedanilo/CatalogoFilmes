import java.util.Scanner;

public class CatalogoDeFilmes {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("==== CATALOGO DE FILMES =====");
		Linha();
		
		System.out.println("Você deseja assistir que estilo de Filme: ");
		
		Estilo_filme();
		
		System.out.print("Escolha uma Opção: ");
		Integer OpcaoFilme = scanner.nextInt();
		
		String opcao = OpcaodeFilme(OpcaoFilme);
		
	    System.out.println("Você escolheu a opção: " + opcao);
		
		String [] Catalogo = LisOpcoes(OpcaoFilme);
		System.out.println("Temos essas Opções de Filme: " );
		
		for (int i = 0; i < Catalogo.length; i++) {
			
			System.out.println( i + " - " + Catalogo [i]);
			
		}
		
		System.out.print("Qual Opção de Filme de Sua preferência: ");
		Integer SelecioneFilme = scanner.nextInt();
		
		String Filme = SelecaodeFilme(OpcaoFilme, SelecioneFilme);
		
		System.out.println("Você escolheu a opção: " + Filme + ", Bom Filme!!!");
		
		
		
		
		
		scanner.close();
	}
	
	static void Linha() {
		System.out.println("=====================================================");
	}
	
	static void Estilo_filme () {
		String [] EstilodeFilmes = {"Terror", "Comedia", "Romance", "Suspense", "Ficção Cientifica"};
		
		for (int i = 0; i < EstilodeFilmes.length; i++) {
			System.out.println(i + " - " + EstilodeFilmes[i]);
		}
	}
	
	static String OpcaodeFilme(Integer OpcaoFilme) {	
		String CatalogoFilme = null;
		
		String [] EstilodeFilmes = {"Terror", "Comedia", "Romance", "Suspense", "Ficção Cientifica"};
		
		switch (OpcaoFilme) {
		case 0:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme];
			break;
		case 1:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme];
			break;
		case 2:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme];
			break;
		case 3:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme];
			break;
		case 4:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme];
			break;
		default:
			System.err.println("Digite uma Opção Valida! Entre 0 e 4!");
			System.exit(0);
		}
		return CatalogoFilme;
	}
	
	static String[] LisOpcoes (Integer OpcaoFilme) {	
		
		
		String [] Terror = {"O Chamado", "Panico", "Mansão Blair", "Olhos Famintos"};
		String [] Comedia = {"As Branquelas", "Deby e Loide", "Vovozona", "American pie"};
		String [] Romance = {"Querido jhon", "Um Lugar Chamado Nothing Hill", "Mama Mia", "Lalaland"};
		String [] Suspense = {"MA", "Corra", "Eu cuido de Você", "Bird Box"};
		String [] Ficcao_cientifica = {"Vingadores", "Harry Potter", "Batman", "Homem de Ferro"};
		
		String [][] EstilodeFilmes = {Terror, Comedia, Romance, Suspense, Ficcao_cientifica};
		
			
	    return EstilodeFilmes[OpcaoFilme];
					
	}
	
	static String SelecaodeFilme(Integer OpcaoFilme, Integer SelecioneFilme) {
		
		String CatalogoFilme = null;
		
		String [] Terror = {"O Chamado", "Panico", "Mansão Blair", "Olhos Famintos"};
		String [] Comedia = {"As Branquelas", "Deby e Loide", "Vovozona", "American pie"};
		String [] Romance = {"Querido jhon", "Um Lugar Chamado Nothing Hill", "Mama Mia", "Lalaland"};
		String [] Suspense = {"MA", "Corra", "Eu cuido de Você", "Bird Box"};
		String [] Ficcao_cientifica = {"Vingadores", "Harry Potter", "Batman", "Homem de Ferro"};
		
		String [][] EstilodeFilmes = {Terror, Comedia, Romance, Suspense, Ficcao_cientifica};
		
		switch (SelecioneFilme) {
		case 0:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme][SelecioneFilme];
			break;
		case 1:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme][SelecioneFilme];
			break;
		case 2:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme][SelecioneFilme];
			break;
		case 3:
			CatalogoFilme = EstilodeFilmes[OpcaoFilme][SelecioneFilme];
			break;
		default:
			System.err.println("Digite uma Opção Valida! Entre 0 e 3!");
			System.exit(0);
		}
		return CatalogoFilme;
		
	}
	
	
	
	

}
