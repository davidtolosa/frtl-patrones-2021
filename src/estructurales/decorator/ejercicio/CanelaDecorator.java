package estructurales.decorator.ejercicio;

public class CanelaDecorator extends Decorator {

	public CanelaDecorator(Cafe cafe) {
		super(cafe);
	}

	public String getDescripcion() {

		return super.getDescripcion() + ", con Canela";
	}

	public double costo() {
		return super.costo() + 5;
	}

	
}
