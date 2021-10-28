package estructurales.decorator.ejemplo2;

public class NotificacionEmail implements Notificicacion {

	@Override
	public void enviarNotificacion(String texto) {
		System.out.println("Notificacion Email: " + texto);
	}

}
