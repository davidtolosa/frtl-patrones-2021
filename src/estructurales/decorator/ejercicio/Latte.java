package estructurales.decorator.ejercicio;

public class Latte implements Cafe {

	@Override
	public String getDescripcion() {
		return "Latte";
	}

	@Override
	public double costo() {
		return 76;
	}

}
