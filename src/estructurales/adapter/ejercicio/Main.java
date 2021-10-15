package estructurales.adapter.ejercicio;

public class Main {

	public static void main(String[] args) {
		//ClimaApi apiClima = new ApiServicioMeteorologicoNacional();
			
		ClimaApi apiClima = new WindguruApadter();
		
		Clima clima = apiClima.obtenerClima("Trenque Lauqen");
		System.out.println(clima);		
	}

}
