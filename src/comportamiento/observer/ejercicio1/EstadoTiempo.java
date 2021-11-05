package comportamiento.observer.ejercicio1;

public class EstadoTiempo extends Sujeto {

	double temperatura;
	double humedad; 
	double presion;

	public double getTemperatura() {
		return temperatura;
	}
	public double getHumedad() {
		return humedad;
	}
	public double getPresion() {
		return presion;
	} 

	public void actualizarEstadoTiempo(double temperatura, double humedad, double presion){
		this.temperatura = temperatura;
		this.presion = presion;
		this.humedad= humedad;
		notifica();
	}
}
