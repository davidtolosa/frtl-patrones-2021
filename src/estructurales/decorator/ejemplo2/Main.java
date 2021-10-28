package estructurales.decorator.ejemplo2;

public class Main {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("David",true, true, true);
		u1.enviarNotificacion("Prueba Notificacion");
		
		
		Usuario u2 = new Usuario("Juan",false, false, false);
		u2.enviarNotificacion("Prueba Notificacion");
	}

}
