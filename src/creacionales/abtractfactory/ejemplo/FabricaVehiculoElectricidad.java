package creacionales.abtractfactory.ejemplo;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilElectricidad(modelo, color, potencia, espacio);
	}

	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterElectricidad(modelo, color, potencia);
	}

	public Camion crearCamion(String modelo, String color, int ejes) {
		return new CamionElectricidad(modelo, color, ejes);
	}

	public Camioneta creaCamioneta(String modelo, String color, int potencia, double espacio) {
		return new CamionetaElectricidad(modelo, color, potencia, espacio);
	}
}
