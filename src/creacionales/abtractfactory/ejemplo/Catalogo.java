package creacionales.abtractfactory.ejemplo;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);
		
		FabricaVehiculo fabrica;
		
		System.out.print("Desea utilizar " + "vehiculos electricos (1) a gasolina (2) o hibrido (3):");
		String eleccion = reader.next();
		
		if (eleccion.equals("1")) {
			fabrica = new FabricaVehiculoElectricidad();
		} else if (eleccion.equals("2"))  {
			fabrica = new FabricaVehiculoGasolina();
		}else {
			fabrica = new FabricaVehiculoHibrido();
		}
			
		
		Automovil auto = fabrica.creaAutomovil("Peugeot", "Blanco", 100, 200);
		Scooter scooter = fabrica.creaScooter("Yamaha", "Azul", 200);
		Camion camion = fabrica.crearCamion("Scania", "Negro", 8);
		
		auto.mostrarCaracteristicas();
		scooter.mostrarCaracteristicas();
		camion.mostrarCaracteristicas();
	}

}
