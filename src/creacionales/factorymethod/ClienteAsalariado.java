package creacionales.factorymethod;

public class ClienteAsalariado extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		return new PedidoAsalariado(importe);
	}

}
