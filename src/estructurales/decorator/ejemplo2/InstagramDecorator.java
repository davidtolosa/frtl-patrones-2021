package estructurales.decorator.ejemplo2;

public class InstagramDecorator extends Decorator {

	public InstagramDecorator(Notificicacion componente) {
		super(componente);
	}

	public void enviarNotificacionInstagram(String texto) {
		System.out.println("Notificacion Instagram: " + texto);
	}

	@Override
	public void enviarNotificacion(String texto) {
		super.enviarNotificacion(texto);
		this.enviarNotificacionInstagram(texto);
	}	
}
