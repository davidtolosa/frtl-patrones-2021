package creacionales.abtractfactory.ejemplo;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
        Scanner reader = new Scanner(System.in);
		
		FabricaVehiculo fabrica;
		
		System.out.print("Desea utilizar " + "vehiculos electricos (1) o a gasolina (2):");
		String eleccion = reader.next();
		
		if (eleccion.equals("1")) {
			fabrica = new FabricaVehiculoElectricidad();
		} else {
			fabrica = new FabricaVehiculoGasolina();
		}
		
		Automovil auto = fabrica.creaAutomovil("Peugeot", "Blanco", 100, 200);
		Scooter scooter = fabrica.creaScooter("Yamaha", "Azul", 200);
		
		auto.mostrarCaracteristicas();
		scooter.mostrarCaracteristicas();
	}

}
