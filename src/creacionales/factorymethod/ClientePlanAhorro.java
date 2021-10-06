package creacionales.factorymethod;

public class ClientePlanAhorro extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		return new PedidoPlanAhorro(importe);
	}

}
