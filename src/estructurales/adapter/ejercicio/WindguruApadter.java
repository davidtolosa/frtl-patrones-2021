package estructurales.adapter.ejercicio;

public class WindguruApadter implements ClimaApi {
	
	ApiWindguru apiWindguru = new ApiWindguru();

	@Override
	public Clima obtenerClima(String ciudad) {
		
		String ciudadSeleccionada = apiWindguru.seleccionarCiudad(ciudad);
		float temperatura = apiWindguru.obtenerTemperatura();
		float presion = apiWindguru.obtenerPresion();
		float humedad = apiWindguru.obtenerHumedad();
		
		return new Clima(ciudadSeleccionada,temperatura,humedad,presion);
	}

}
