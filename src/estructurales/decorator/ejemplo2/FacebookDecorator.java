package estructurales.decorator.ejemplo2;

public class FacebookDecorator extends Decorator {

	public FacebookDecorator(Notificicacion componente) {
		super(componente);
	}

	public void enviarNotificacionFacebook(String texto) {
		System.out.println("Notificacion Facebook: " + texto);
	}

	@Override
	public void enviarNotificacion(String texto) {
		super.enviarNotificacion(texto);
		this.enviarNotificacionFacebook(texto);
	}	
}
