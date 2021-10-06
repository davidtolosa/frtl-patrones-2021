package creacionales.factorymethod;

public class PedidoPlanAhorro extends Pedido {

	public PedidoPlanAhorro(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		System.out.println("LOG:" + importe);
		System.out.println(importe<600000);
		return importe<600000;
	}

	@Override
	public void paga() {
		System.out.println("Pedido Plan Ahorro. Monto: " + importe);
	}

}
