package creacionales.abtractfactory.ejemplo;

public class AutomovilHibrido extends Automovil {

	public AutomovilHibrido(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	public void mostrarCaracteristicas() {
		System.out.println("Automovil hibrido de modelo: " + modelo + " de color: " + color + " de potencia: "
				+ potencia + " de espacio: " + espacio);
	}

}
