package estructurales.decorator.ejemplo2;

public class Usuario {
	String nombre;
	boolean notificacionFacebook;
	boolean notificacionSlack;
	boolean notificacionInstagram;

	public Usuario(String nombre, boolean notificacionFacebook, boolean notificacionSlack,
			boolean notificacionInstagram) {
		super();
		this.nombre = nombre;
		this.notificacionFacebook = notificacionFacebook;
		this.notificacionSlack = notificacionSlack;
		this.notificacionInstagram = notificacionInstagram;
	}

	public void enviarNotificacion(String Texto) {
		Notificicacion notificacion = new NotificacionEmail();

		if(this.notificacionFacebook)
			notificacion = new FacebookDecorator(notificacion);	

		if(this.notificacionInstagram)
			notificacion = new InstagramDecorator(notificacion);

		if(this.notificacionSlack)
			notificacion = new SlackDecorator(notificacion);

		notificacion.enviarNotificacion(this.nombre + " - Prueba Notificacion");
	}
}
