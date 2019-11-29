import java.util.List;

public class Dicionario {
	
	private List<String> palavras;

	public Dicionario() {
		carregarPalavras();
	}

	private void carregarPalavras() {
		palavras = List.of(
			"JAVA",
			"PYTHON",
			"RUBY",
			"CSHARP",
			"PASCAL",
			"FORTRAN",
			"VISUALBASIC",
			"ASSEMBLY",
			"DELPHI",
			"SWIFT"
		);
	}

	public Palavra proximaPalavra() {
		int pos = Random.gerarNumeroRandomico(0, palavras.size());
		String palavraSorteada = palavras.get(pos);
		Palavra palavra = new Palavra(palavraSorteada);
		return palavra;
	}
}