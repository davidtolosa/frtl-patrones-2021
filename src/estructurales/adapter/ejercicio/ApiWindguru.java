package estructurales.adapter.ejercicio;

public class ApiWindguru {
		private String ciudad;

		public String seleccionarCiudad(String ciudad) {
			this.ciudad = ciudad;
			return this.ciudad;
		};

		public float obtenerTemperatura() {
			return 20;
		}

		public float obtenerHumedad() {
			return 80;
		}

		public float obtenerPresion() {
			return 1100;
		}
}
