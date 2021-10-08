package creacionales.builder.ejemplo;

public class DocumentacionDOC extends Documentacion {

	public void agregaDocumento(String documento) {
		if (documento.startsWith("<DOC>"))
			contenido.add(documento);
	}

	public void imprime() {
		System.out.println("Documentacion DOC");

		for (String s : contenido)
			System.out.println(s);
	}

}
