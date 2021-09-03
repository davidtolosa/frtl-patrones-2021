package creacionales.abtractfactory.ejemplo;

public class CamionHibrido extends Camion {

	public CamionHibrido(String modelo, String color, int ejes) {
		super(modelo, color, ejes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Camion hibrido de modelo: " + modelo + " de color: " + color + " cantidad ejes: "
				+ ejes);
	}
}
