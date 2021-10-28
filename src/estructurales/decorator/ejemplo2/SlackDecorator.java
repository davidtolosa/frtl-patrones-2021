package estructurales.decorator.ejemplo2;

public class SlackDecorator extends Decorator {

	public SlackDecorator(Notificicacion componente) {
		super(componente);
	}

	public void enviarNotificacionSlack(String texto) {
		System.out.println("Notificacion Slack: " + texto);
	}

	public void seleccionarCanalNotificacion() {
		System.out.println("Notificacion Slack: Seleccion del canal a enviar la Notificacion");
	}
	
	
	@Override
	public void enviarNotificacion(String texto) {
		super.enviarNotificacion(texto);
		this.seleccionarCanalNotificacion();
		this.enviarNotificacionSlack(texto);
	}	
}
