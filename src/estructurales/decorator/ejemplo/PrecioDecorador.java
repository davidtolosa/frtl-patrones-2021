package estructurales.decorator.ejemplo;

public class PrecioDecorador extends Decorador {

	public PrecioDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);
	}

	public void mostraPrecioVehiculo() {
		System.out.println("Precio del Vehiculo -- CLASE: PRECIODECORATOR");
	}	
	
	public void visualiza() {
		super.visualiza();
		this.mostraPrecioVehiculo();
	}
	
	

}
