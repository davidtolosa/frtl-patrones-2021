package creacionales.abtractfactory.ejercicio3;

public class FabricaProductosClassic implements FabricaProductos {

	@Override
	public CajaAhorro crearCajaAhorro() {
		return new CajaDeAhorroClassic();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		return new TarjetaDebitoClassic();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		return new TarjetaCreditoClassic();
	}

}
