import javax.swing.JOptionPane;

public class Jogo {

	private String palavraGerada;
	private String tracos = "";
	private String palavraDaForca;
	private String letra;
	private Integer tentativas = 0;

	public static void main(String[] args) {

		System.out.println("Categoria: ESPORTES");
		Jogo jgo = new Jogo();
		jgo.palavraGerada = CategoriaEsporte.selecionaAleatorio();
		System.out.println("palavraGerada: " + jgo.palavraGerada);
		jgo.palavraDaForca = jgo.transformaEmTracos();
		System.out.println();
		System.out.println(jgo.palavraDaForca);

		do {
			jgo.letra = JOptionPane.showInputDialog("Digite a letra")
					.toUpperCase();
			System.out.print("Letra: " + jgo.letra);
			jgo.validaTentativa(jgo.letra);

			System.out.println();
			System.out.println(jgo.palavraDaForca);
			System.out.println("Tentativa " + jgo.tentativas + " de 5");

		} while (jgo.tentativas < 5);
	}

	public String transformaEmTracos() {
		for (int i = 0; i < palavraGerada.length(); i++) {
			if (palavraGerada.charAt(i) != ' ')
				tracos = tracos + "_";
			else
				tracos = tracos + " ";
		}
		return tracos;
	}

	public void validaTentativa(String chute) {
		boolean temLetra = false;
		StringBuilder sb = new StringBuilder(palavraDaForca);
		
		
		for (int i = 0; i < palavraGerada.length(); i++) {				
			if (palavraGerada.charAt(i) != ' ' && chute.charAt(0) == palavraGerada.charAt(i)) {
				temLetra = true;					
				sb.setCharAt(i, chute.charAt(i));
				palavraDaForca = sb.toString();		
			}
		if (!temLetra) {
			tentativas++;
		}
	}
	}
}
