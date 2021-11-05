package comportamiento.observer.ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class CompoenteTemperaturasHistoricas implements Observador {

	private List<Double> temperaturas = new ArrayList<Double>();
	EstadoTiempo estadoTiempo;	
	

	public CompoenteTemperaturasHistoricas(EstadoTiempo estadoTiempo) {
		this.estadoTiempo = estadoTiempo;
		this.estadoTiempo.agrega(this);
	}
	
	
	public void actualiza() {
		this.temperaturas.add(estadoTiempo.getTemperatura());
		this.display();
		
	}
	
	public void display() {
		System.out.println("Historial de temperaturas:");
		for (Double temperatura:temperaturas){
			System.out.println(" --"+temperatura+ " ºC");
		}
	}

}
