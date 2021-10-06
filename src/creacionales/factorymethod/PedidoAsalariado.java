package creacionales.factorymethod;

public class PedidoAsalariado extends Pedido {

	public PedidoAsalariado(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		return importe<4000000;
	}

	@Override
	public void paga() {
		System.out.println("Pedido Asalariado por el monto de: " + importe);
	}

}
