package estructurales.adapter.ejemplo;

public class WordAdapter implements Documento {
	
	HerramientaWord herramientaWord = new HerramientaWord();

	@Override
	public void setContenido(String contenido) {
		herramientaWord.cargarContenido(contenido);

	}

	@Override
	public void dibuja() {
		herramientaWord.darFormatoContenido();
	}

	@Override
	public void imprime() {
		herramientaWord.enviaImpresora();
	}

}
