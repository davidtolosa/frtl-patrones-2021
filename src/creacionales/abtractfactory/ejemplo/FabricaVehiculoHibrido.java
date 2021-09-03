package creacionales.abtractfactory.ejemplo;

public class FabricaVehiculoHibrido implements FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilHibrido(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterHibrida(modelo, color, potencia);
	}

	@Override
	public Camion crearCamion(String modelo, String color, int ejes) {
		return new CamionHibrido(modelo, color, ejes);
	}

}
