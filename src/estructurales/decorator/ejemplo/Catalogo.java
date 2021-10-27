package estructurales.decorator.ejemplo;

public class Catalogo {

	public static void main(String[] args) {
		
		ComponenteGraficoVehiculo vehiculo1 = new VistaVehiculo();
		
		vehiculo1 = new MarcaDecorador(vehiculo1);
		vehiculo1 = new PrecioDecorador(vehiculo1);
		
		
		vehiculo1.visualiza();
	}

}
