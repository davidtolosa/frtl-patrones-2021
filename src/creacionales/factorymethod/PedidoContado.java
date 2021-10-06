package creacionales.factorymethod;

public class PedidoContado extends Pedido {

	public PedidoContado(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		return true;
	}

	@Override
	public void paga() {
		System.out.println("Se realizo el pago de: " + importe);
	}

}
