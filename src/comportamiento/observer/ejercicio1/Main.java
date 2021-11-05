package comportamiento.observer.ejercicio1;

public class Main {

	public static void main(String[] args) {
		EstadoTiempo estadoTiempo = new EstadoTiempo();
		ComponenteCondicionesActuales componenteCondicionesActuales = new ComponenteCondicionesActuales(estadoTiempo);
		CompoenteTemperaturasHistoricas compoenteTemperaturasHistoricas = new CompoenteTemperaturasHistoricas(estadoTiempo);
		ComponenteTempetaruraMaxima componenteTempetaruraMaxima = new ComponenteTempetaruraMaxima(estadoTiempo);
		
		estadoTiempo.actualizarEstadoTiempo(20, 50, 1300);
		estadoTiempo.actualizarEstadoTiempo(25, 50, 1300);
		estadoTiempo.actualizarEstadoTiempo(26, 50, 1300);
		estadoTiempo.actualizarEstadoTiempo(24, 50, 1300);
	}

}
