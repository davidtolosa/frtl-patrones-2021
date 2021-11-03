package estructurales.decorator.ejercicio;

public class Capuchino implements Cafe {

	@Override
	public String getDescripcion() {
		return "Capuchino";
	}

	@Override
	public double costo() {
		return 80;
	}

}
