package estructurales.adapter.ejemplo;

public class ServidorWeb {

	public static void main(String[] args) {
		
		int herramientaSeleccionada = 3;
		
		Documento documento = null; 
		
		if(herramientaSeleccionada==1) {
			documento = new DocumentoHtml();
		}else if(herramientaSeleccionada == 2) {
			documento = new DocumentoPdf();
		}else {
			documento = new WordAdapter();
		}
		
		documento.setContenido("Diseño de Sistemas");
		documento.dibuja();
		System.out.println();
		documento.imprime();
		
		/*Documento documento1;
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
		
		
		Documento documento3 = new HerramientaWord();*/
	}

}
