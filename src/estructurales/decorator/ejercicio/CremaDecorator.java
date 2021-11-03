package estructurales.decorator.ejercicio;

public class CremaDecorator extends Decorator {

	public CremaDecorator(Cafe cafe) {
		super(cafe);
	}

	public String getDescripcion() {

		return super.getDescripcion() + ", con Crema";
	}

	public double costo() {
		return super.costo() + 10;
	}

	
}
