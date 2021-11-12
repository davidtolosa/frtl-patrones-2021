package comportamiento.strategy.ejercicio.resolucion;

public class CalculoEstandar implements CalculoEnvio {

	@Override
	public float calcularCostoEnvio(String origen, String destino, float peso) {
		float precioLocalPorKilo = 0.089f;
		float precioLargaDistanciaPorKilo = 0.123f;
		float precioTotal = 0;

		if (destino.equals(origen)) {
			precioTotal = precioLocalPorKilo;
		} else {
			precioTotal = precioLargaDistanciaPorKilo;
		}
		return peso * precioTotal;
	}

}
