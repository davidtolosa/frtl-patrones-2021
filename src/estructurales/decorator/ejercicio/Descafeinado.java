package estructurales.decorator.ejercicio;

public class Descafeinado implements Cafe {

	@Override
	public String getDescripcion() {
		return "Descafeinado";
	}

	@Override
	public double costo() {
		return 50;
	}

}
