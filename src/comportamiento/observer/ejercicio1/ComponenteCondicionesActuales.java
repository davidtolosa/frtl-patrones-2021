package comportamiento.observer.ejercicio1;


public class ComponenteCondicionesActuales implements Observador {
	
	private double temperatura;
	private double humedad;
	private double presion;
	
	EstadoTiempo estadoTiempo;	

	public ComponenteCondicionesActuales(EstadoTiempo estadoTiempo) {
		this.estadoTiempo = estadoTiempo;
		this.estadoTiempo.agrega(this);
	}
	
	public void actualiza() {
		this.temperatura = estadoTiempo.getTemperatura();
		this.humedad = estadoTiempo.getHumedad();
		this.presion = estadoTiempo.getPresion();
		
		mostrarCondicionesActuales();
	}

	private void mostrarCondicionesActuales() {
		System.out.println("CONDICIONES ACTUALES, Temperatura: " + this.temperatura + " Humedad: " + this.humedad  + " Presion: " + this.presion);
	}
}
