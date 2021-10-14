package estructurales.adapter.ejemplo;

public class HerramientaWord {
	protected String contenido;

	public void cargarContenido(String contenido) {
		this.contenido = contenido;
	}

	public void darFormatoContenido() {
		System.out.println("Formanteando Contenido");
	}
		
	public void enviaImpresora() {
		System.out.println("Imprimiendo documento Word: " + contenido);
	}
}
