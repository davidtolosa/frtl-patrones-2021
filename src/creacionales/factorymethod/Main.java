package creacionales.factorymethod;

public class Main {

	public static void main(String[] args) {
		Cliente david = new ClienteContado();		
		david.nuevoPedido(100);
		david.nuevoPedido(200);
		
		Cliente pedro;
		pedro = new ClienteCredito();
		pedro.nuevoPedido(2000);
		pedro.nuevoPedido(3000);
		
		Cliente juan;
		juan = new ClienteAsalariado();
		juan.nuevoPedido(200000);
		
		
		Cliente diego;
		diego = new ClientePlanAhorro();
		diego.nuevoPedido(1000);
	}

}
