package estructurales.decorator.ejercicio;

public abstract class Decorator implements Cafe {

	protected Cafe cafe;
	
	
	public Decorator(Cafe cafe) {
		this.cafe = cafe;
	}

	public String getDescripcion() {
		return cafe.getDescripcion();
	}

	public double costo() {
		return cafe.costo();
	}
}
