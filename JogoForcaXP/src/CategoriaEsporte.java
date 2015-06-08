import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CategoriaEsporte {

	private static List<String> listaDePalavras;

	private static List<String> getListaDePalavras() {
		if (listaDePalavras == null) {
			listaDePalavras = new ArrayList<>();
			listaDePalavras.add("A T L E T I S M O");
			listaDePalavras.add("A U T O M O B I L I S M O");
			listaDePalavras.add("B A S Q U E T E");
			listaDePalavras.add("C I C L I S M O");
			listaDePalavras.add("F U T E B O L");
			listaDePalavras.add("H A N D E B O L");
			listaDePalavras.add("I A T I S M O");
			listaDePalavras.add("R U G B Y");
			listaDePalavras.add("T E N I S");
			listaDePalavras.add("V O L E I");
		}
		return listaDePalavras;
	}

	public static String selecionaAleatorio() {
		String selecao;
		Random aleatorio = new Random();
		selecao = getListaDePalavras().get(aleatorio.nextInt(9));
		return selecao;
	}

}
