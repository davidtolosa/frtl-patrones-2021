package creacionales.abtractfactory.ejemplo;

public abstract class Camion {
	
	protected String modelo;
	protected String color;
	protected int ejes;
	
	public Camion(String modelo, String color, int ejes) {
		this.modelo = modelo;
		this.color = color;
		this.ejes = ejes;
	} 
	
	public abstract void mostrarCaracteristicas();
}
