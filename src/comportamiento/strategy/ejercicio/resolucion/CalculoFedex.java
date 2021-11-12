package comportamiento.strategy.ejercicio.resolucion;

public class CalculoFedex implements CalculoEnvio {

	@Override
	public float calcularCostoEnvio(String origen, String destino, float peso) {
		float costoInicial = 5.00f;
		float costoPorKilo = 1.00f;
		float multiplicadorLargaDistancia = 1.33f;
		float costo;
		if (origen.equals(destino)) {
			costo = costoInicial + costoPorKilo * peso;
		} else {
			costo = costoInicial + (costoPorKilo * peso) * multiplicadorLargaDistancia;
		}
		return costo;
	}

}
