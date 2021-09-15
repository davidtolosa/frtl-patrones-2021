package creacionales.abtractfactory.ejercicio3;

public class FabricaProductosGold implements FabricaProductos {

	@Override
	public CajaAhorro crearCajaAhorro() {
		return new CajaAhorroGold();
	}

	@Override
	public TarjetaDebito crearTarjetaDebito() {
		return new TarjetaDebitoGold();
	}

	@Override
	public TarjetaCredito crearTarjetaCredito() {
		return new TarjetaCreditoGold();
	}
}
