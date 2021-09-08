package creacionales.abtractfactory.ejemplo;

public class CamionetaElectricidad extends Camioneta {

	public CamionetaElectricidad(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Camioneta electrica de modelo: " + modelo + " de color: " + color + " de potencia: "
				+ potencia + " de espacio: " + espacio);
	}

}
