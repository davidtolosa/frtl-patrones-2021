package estructurales.decorator.ejemplo1;

public class BordeDecorador extends Decorador {

	public BordeDecorador(ComponenteVisual textoaDecorar) {
		super(textoaDecorar);
	}

	@Override
	public void dibuja() {
		super.dibuja();
		System.out.println("Dibujar Borde");
	}	
}
