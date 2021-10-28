package estructurales.decorator.ejemplo2;

public abstract class Decorator implements Notificicacion {
	
	protected Notificicacion componente;
	

	public Decorator(Notificicacion componente) {
		this.componente = componente;
	}

	@Override
	public void enviarNotificacion(String texto) {
		componente.enviarNotificacion(texto);
	}
}
