
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

	public static final char LETRA_INVALIDA = '|';

	public static char lerLetra() {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new InputStreamReader(System.in));

			String linha = reader.readLine();

			if (linha.trim().isEmpty()) {
				return LETRA_INVALIDA;
			}

			if (linha.length() > 1) {
				return LETRA_INVALIDA;
			}
			
			char letra = linha.toUpperCase().charAt(0);

			if (!Character.isLetter(letra)) {
				return LETRA_INVALIDA;
			}

			return letra;

		} catch (IOException e) {
			return LETRA_INVALIDA;
		}
	}
}
