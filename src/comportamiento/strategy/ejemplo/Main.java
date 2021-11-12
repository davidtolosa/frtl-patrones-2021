package comportamiento.strategy.ejemplo;

public class Main {

	public static void main(String[] args) {
		
		final String UNO_POR_LINEA = "UNO_POR_LINEA";
		final String TRES_POR_LINEA = "TRES_POR_LINEA";
		
		DibujaCatalogo estrategia;
		String tipoEstrategia =  UNO_POR_LINEA;
		
		if(tipoEstrategia == UNO_POR_LINEA) {
			estrategia = new DibujaUnVehiculoPorLinea();
		}else if (tipoEstrategia == TRES_POR_LINEA) {
			estrategia = new DibujaTresVehiculosPorLinea();
		}else {
			estrategia = new DibujaCuatroVehiculosPorLinea();
		}
		
		VistaCatalogo catalogo = new VistaCatalogo(estrategia);
		catalogo.dibuja();
	}

}
