package estructurales.decorator.ejercicio;

public class Main {

	public static void main(String[] args) {
		
		//Cafe cafe = new Descafeinado();
		//cafe = new CremaDecorator(cafe);
		//cafe = new CanelaDecorator(cafe);
		Cafe cafe = new Latte();
		cafe = new ChocolateDecorator(cafe);
		

		System.out.println(cafe.getDescripcion());
		System.out.println(cafe.costo());		
	}

}
