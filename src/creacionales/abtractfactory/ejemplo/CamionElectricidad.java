package creacionales.abtractfactory.ejemplo;

public class CamionElectricidad extends Camion {

	
	public CamionElectricidad(String modelo, String color, int ejes) {
		super(modelo, color, ejes);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Camion electrico de modelo: " + modelo + " de color: " + color + " cantidad ejes: "
				+ ejes);

	}

}
