package estructurales.adapter.ejemplo;

public class ServidorWeb {

	public static void main(String[] args) {
		Documento documento1;
		documento1 = new DocumentoHtml();
		documento1.setContenido("Diseño de Sistemas");
		documento1.dibuja();
		System.out.println();
		documento1.imprime();
		
		System.out.println();
		
		Documento documento2; 
		documento2 = new DocumentoPdf();
		documento2.setContenido("Adapter");
		documento2.dibuja();
		documento2.imprime();
	}

}
