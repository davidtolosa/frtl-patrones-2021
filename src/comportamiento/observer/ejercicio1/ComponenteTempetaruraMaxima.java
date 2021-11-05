package comportamiento.observer.ejercicio1;


public class ComponenteTempetaruraMaxima implements Observador {

	private double temperatura = 0;

	EstadoTiempo estadoTiempo;	

	public ComponenteTempetaruraMaxima(EstadoTiempo estadoTiempo) {
		this.estadoTiempo = estadoTiempo;
		this.estadoTiempo.agrega(this);
	}


	public void actualiza() {
		if(estadoTiempo.getTemperatura() > temperatura) {
			temperatura = estadoTiempo.getTemperatura();
			System.out.println("Nueva temperatura Maxima: " + this.temperatura);
		}
	}
}