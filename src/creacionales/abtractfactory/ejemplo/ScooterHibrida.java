package creacionales.abtractfactory.ejemplo;

public class ScooterHibrida extends Scooter {

	public ScooterHibrida(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
	}

	public void mostrarCaracteristicas() {
		System.out.println(
				"Scooter hibrida de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);
	}
}
