package estructurales.composite.ejercicio;

public class Main {

	public static void main(String[] args) {
		DetallePedido d1 = new DetallePedido("P1", 10, 10);
		DetallePedido d2 = new DetallePedido("P2", 1, 10);
		
		
		Pedido pedido1 = new PedidoSimple();
		pedido1.agregarProducto(d1);
		pedido1.agregarProducto(d2);
		//System.out.println("Total Pedido 1: " + pedido1.calcularTotalPedido());
		
		Pedido pedido2 = new PedidoSimple();
		pedido2.agregarProducto(d1);
		//System.out.println("Total Pedido 2: " + pedido2.calcularTotalPedido());
		
		
		Pedido pedido3 = new PedidoCompuesto();
		pedido3.agregarSupedido(pedido1);
		pedido3.agregarSupedido(pedido2);
		
		System.out.println("Total Pedido 3: " + pedido3.calcularTotalPedido());
	}

}
