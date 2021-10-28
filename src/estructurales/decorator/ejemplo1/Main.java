package estructurales.decorator.ejemplo1;

public class Main {

	public static void main(String[] args) {
		ComponenteVisual texto = new Texto();
		texto = new BordeDecorador(texto);			
		
		
		texto.dibuja();

	}

}
