package estructurales.decorator.ejemplo;

public class MarcaDecorador extends Decorador {

	public MarcaDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);
	}
	
	protected void visualizaLogo() {
		System.out.println("Logotipo de la marca -- CLASE: MARCADECORATOR");
	}

	public void visualiza() {
		super.visualiza();
		this.visualizaLogo();
	}

}
