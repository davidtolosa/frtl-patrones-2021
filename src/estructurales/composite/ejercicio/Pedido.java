package estructurales.composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido {
	protected List<DetallePedido> productos = new ArrayList<DetallePedido>();
	
	public void agregarProducto(DetallePedido detallePedido) {
		productos.add(detallePedido);
	}
	
	public abstract double calcularTotalPedido();
	public abstract boolean agregarSupedido(Pedido pedido);
}
