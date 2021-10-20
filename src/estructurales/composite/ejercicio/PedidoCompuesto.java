package estructurales.composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class PedidoCompuesto extends Pedido {
	
	List<Pedido> subPedidos =  new ArrayList<Pedido>();

	@Override
	public double calcularTotalPedido() {
		
		double totalSubpedidos = 0;
		
		for(Pedido pedido: subPedidos) {
			totalSubpedidos = totalSubpedidos + pedido.calcularTotalPedido();
		}
		
		double totalPedido = 0;

		for (DetallePedido producto : productos) {
			totalPedido = totalPedido + (producto.cantidad * producto.precioUnitario);
		}
		
		return totalPedido + totalSubpedidos;
	}

	@Override
	public boolean agregarSupedido(Pedido pedido) {
		return subPedidos.add(pedido);
	}

}
