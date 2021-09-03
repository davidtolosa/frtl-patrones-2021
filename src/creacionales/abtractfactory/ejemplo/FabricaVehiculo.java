package creacionales.abtractfactory.ejemplo;

public interface FabricaVehiculo {
	
	Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);
    Scooter creaScooter(String modelo, String color, int potencia);
    Camion crearCamion(String modelo, String color, int ejes);
}
