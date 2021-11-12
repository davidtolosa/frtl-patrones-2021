package comportamiento.strategy.ejercicio.resolucion;


public class Main {

	public static void main(String[] args) {
		
		CalculoEnvio estrategia =  new CalculoFedex();
		
		Envio envio = new Envio("BA", "BA", 8.7f, estrategia);
		System.out.println("Coste con envío : " + envio.getPrecio());
	}

}
