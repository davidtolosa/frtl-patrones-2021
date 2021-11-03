package comportamiento.observer.ejemplo;

public class VistaVehiculo implements Observador {

	protected Vehiculo vehiculo;
	protected String texto = "";

	public VistaVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
		actualizaTexto();
	}

	protected void actualizaTexto() {
		texto = "VISTA VEHICULO - Descripcion " + vehiculo.getDescripcion() + " Precio: " + vehiculo.getPrecio();
	}

	public void actualiza() {
		actualizaTexto();
		this.redibuja();
	}

	public void redibuja() {
		if(vehiculo.getDescripcion()=="")
		{
			System.out.println("Cargando Datos Vehiculo...");
		}else {
			System.out.println(texto);
		}	
	}

}
