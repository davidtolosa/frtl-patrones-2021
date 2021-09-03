package creacionales.abtractfactory.ejemplo;

public class CamionGasolina extends Camion {

	public CamionGasolina(String modelo, String color, int ejes) {
		super(modelo, color, ejes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Camion a gasolina de modelo: " + modelo + " de color: " + color + " cantidad ejes: "
				+ ejes);
	}

}
