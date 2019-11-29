import java.util.HashSet;
import java.util.Set;

public class Jogo {

	private static final int MAX_ERROS = 5;
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		jogo.iniciar();
	}
	
	void iniciar() {
		Set<Character> letrasUsadas = new HashSet<>();
		
		int erros = 0;
		
		Dicionario dicionario = new Dicionario();
		Palavra palavra = dicionario.proximaPalavra();
		
		System.out.println("Adivinhe qual é a linguagem de programação ");
		System.out.println("A palavra tem " + palavra.tamanho() + " letras");
		
		while (true) {
			System.out.println(palavra);
			System.out.println();
			
			System.out.print("Digite uma letra: ");
			
			char letra = Console.lerLetra();
			
			if (letra == Console.LETRA_INVALIDA) {
				System.out.println("Digite uma letra válida");
				continue;
			}
			
			if (letrasUsadas.contains(letra)) {
				System.out.println("Esta letra já foi utilizada");
				continue;
			}
			
			letrasUsadas.add(letra);
			
			if (palavra.possuiLetra(letra)) {
				System.out.println("Você acertou uma letra!");
			
			} else {
				erros++;
				
				if (erros < MAX_ERROS) {
					System.out.println("Você errou! Você ainda pode errar " + (MAX_ERROS - erros) + " vezes");
				}
			}
			
			System.out.println();
			
			if (palavra.acertouPalavra()) {
				System.out.println("Parabens! Você descobriu a linguagem de programação: " + palavra.getPalavraOriginal());
				System.out.println("Fim do jogo");
				break;
			}
			
			if (erros == MAX_ERROS) {
				System.out.println("Você perdeu! A linguagem de programação era: " + palavra.getPalavraOriginal());
				break;
			}
		}
	}
}
