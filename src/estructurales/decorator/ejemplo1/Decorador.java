package estructurales.decorator.ejemplo1;

public abstract class Decorador implements ComponenteVisual {

	protected ComponenteVisual textoaDecorar;

	public Decorador(ComponenteVisual textoaDecorar) {
		this.textoaDecorar = textoaDecorar;
	}

	@Override
	public void dibuja() {
		textoaDecorar.dibuja();
	}

}
