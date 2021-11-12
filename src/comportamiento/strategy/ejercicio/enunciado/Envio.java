package comportamiento.strategy.ejercicio.enunciado;

public class Envio {
	private String origen;
	private String destino;
	private float peso;

	public Envio(String origen, String destino, float peso) {
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
	}

	public float getPrecio(int tipo) {
		switch (tipo) {
		case 2:
			return this.calcularFedEx();
		case 3:
			return this.calcularUPS();
		case 4:
			return this.calcularCorreoArgentino();
		case 1:
			return this.calcularEstandar();
		default:
			return this.calcularEstandar();
		}
	}

	private float calcularEstandar() {
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

	private float calcularFedEx() {
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

	private float calcularUPS() {
		float costoPorKilo = 2.00f;
		return costoPorKilo * peso;
	}

	private float calcularCorreoArgentino() {
		return 100;
	}
}
