package creacionales.abtractfactory.ejercicio3;

public class FabricaProductosPlatiniun implements FabricaProductos {

	@Override
	public CajaAhorro crearCajaAhorro() {
		return new CajaAhorroPlatinium();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		return new TarjetaDebitoPlatinium();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		return new TarjetaCreditoPlatinium();
	}

}
