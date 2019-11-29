import java.util.HashSet;
import java.util.Set;

public class Palavra {
	private static final char CARACTERE_SECRETO = '*';
	
	private String palavraOriginal;
	private Set<Character> caracteresEncontrados = new HashSet<>();

	public Palavra(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal;
	}
	
	public int tamanho() {
		return palavraOriginal.length();
	}
	
	public String getPalavraOriginal() {
		return palavraOriginal;
	}
	
	public boolean possuiLetra(char letra) {
		int pos = palavraOriginal.indexOf(letra);
		
		if (pos >= 0) {
			caracteresEncontrados.add(letra);
			return true;
		}
		
		return false;
	}
	
	public boolean acertouPalavra() {
		char[] letrasArray = palavraOriginal.toCharArray();
		
		Set<Character> letras = new HashSet<>();
		
		for (int i = 0; i < letrasArray.length; i++) {
			letras.add(letrasArray[i]);
		}
		
		return letras.equals(caracteresEncontrados);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		char[] letrasArray = palavraOriginal.toCharArray();
		
		for (int i = 0; i < letrasArray.length; i++) {
			char c = letrasArray[i];
			
			if (caracteresEncontrados.contains(c)) {
				sb.append(c);
			} else {
				sb.append(CARACTERE_SECRETO);
			}
		}
		
		return sb.toString();
	}
}
