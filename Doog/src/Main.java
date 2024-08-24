
public class Main {
		public static void main(String[] args) {
			Cachorro Rex; 
			Rex = new Cachorro("Rex", 1, "Pastor Alemao");
			
			System.out.println("Nome do meu cachorro eh "+ Rex.getNome());
			System.out.println("Eu tenho só "+ Rex.getquantidade());
			System.out.println("Sua raca eh "+ Rex.getraca());
			
			Cachorro Max = new Cachorro("Max", 2, "Pitbull");
			System.out.println("Comprei um cachorrao brabo de nome "+ Max.getNome());
			System.out.println("Agora tenho "+ Max.getquantidade());
			System.out.println("Sua raca braba eh a de "+ Max.getraca());
			
			
	}
}
