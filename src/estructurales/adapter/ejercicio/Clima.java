package estructurales.adapter.ejercicio;

public class Clima {
	private String ciudad;
	private float temperatura;
	private float humedad;
	private float presion;
	
	public Clima(String ciudad, float temperatura, float humedad, float presion) {
		this.ciudad = ciudad;
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.presion = presion;
	}

	@Override
	public String toString() {
		return "Clima [ciudad=" + ciudad + ", temperatura=" + temperatura + "º, humedad=" + humedad + "%, presion="
				+ presion + "hPa]";
	}
}