package estructurales.decorator.ejercicio;

public class ChocolateDecorator extends Decorator {

	public ChocolateDecorator(Cafe cafe) {
		super(cafe);
	}

	public String getDescripcion() {

		return super.getDescripcion() + ", con Chocolate";
	}

	public double costo() {
		return super.costo() + 17;
	}

	
}
