package comportamiento.observer.ejemplo;

public class Main {

	public static void main(String[] args) {

		Vehiculo vehiculo = new Vehiculo();		
		//Observadores	
		VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
		VistaPrecio vistaPrecio = new VistaPrecio(vehiculo);
		
		vehiculo.setDatosVehiculio("", 0.0);
		
		vehiculo.setDatosVehiculio("Ford Ka",2000000.0);	
	}

}
