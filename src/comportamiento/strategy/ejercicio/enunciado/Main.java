package comportamiento.strategy.ejercicio.enunciado;

public class Main {

	public static void main(String[] args) {
		Envio envio = new Envio("BA", "BA", 8.7f);
		System.out.println("Coste con envío estandar:" + envio.getPrecio(1));
		System.out.println("Coste con envío FedEx :" + envio.getPrecio(2));
		System.out.println("Coste con envío UPS : " + envio.getPrecio(3));
		System.out.println("Coste con envío Correo Argentino : " + envio.getPrecio(4));
	}

}
