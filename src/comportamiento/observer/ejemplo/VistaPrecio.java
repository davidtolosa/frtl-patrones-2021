package comportamiento.observer.ejemplo;

public class VistaPrecio implements Observador {

	protected Vehiculo vehiculo;
	protected String texto = "";

	public VistaPrecio(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
		actualizaTexto();
	}

	protected void actualizaTexto() {
		texto = "VISTA PRECIO -  Precio: " + vehiculo.getPrecio();
	}

	public void actualiza() {
		actualizaTexto();
		this.redibuja();
	}

	public void redibuja() {
		if(vehiculo.getDescripcion()=="")
		{
			System.out.println("Cargando Precio...");
		}else {
			System.out.println(texto);
		}	
	}

}
