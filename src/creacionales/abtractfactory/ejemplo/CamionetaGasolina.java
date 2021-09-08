package creacionales.abtractfactory.ejemplo;

public class CamionetaGasolina extends Camioneta {

	public CamionetaGasolina(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Camioneta de gasolina de modelo: " + modelo + " de color: " + color + " de potencia: "
				+ potencia + " de espacio: " + espacio);

	}

}
