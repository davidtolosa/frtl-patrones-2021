package creacionales.abtractfactory.ejemplo;

public abstract class Camioneta {
	protected String modelo;
	protected String color;
	protected int potencia;
	protected double espacio;

	public Camioneta(String modelo, String color, int potencia, double espacio) {
		this.modelo = modelo;
		this.color = color;
		this.potencia = potencia;
		this.espacio = espacio;
	}

	public abstract void mostrarCaracteristicas();
}
