package creacionales.factorymethod;

public class PedidoCredito extends Pedido {

	public PedidoCredito(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		// TODO Auto-generated method stub
		return (importe>= 1000) && (importe <= 5000);
	}

	@Override
	public void paga() {
		System.out.println("Se realizo el pago del pedido a credito: " + importe);

	}

}
