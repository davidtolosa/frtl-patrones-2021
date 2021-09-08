package creacionales.abtractfactory.ejemplo;

public class CamionetaHibrido extends Camioneta {

	public CamionetaHibrido(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Camioneta hibrida de modelo: " + modelo + " de color: " + color + " de potencia: "
				+ potencia + " de espacio: " + espacio);
	}

}
