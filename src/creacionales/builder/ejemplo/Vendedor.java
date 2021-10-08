package creacionales.builder.ejemplo;

public class Vendedor {
	protected ConstructorDocumentacionVehiculo constructor;

	public Vendedor(ConstructorDocumentacionVehiculo constructor)
	{
	this.constructor = constructor;
	}

	public Documentacion construye(String nombreCliente) {
		constructor.construyeSolicitudPedido(nombreCliente);
		constructor.construyeSolicitudMatriculacion(nombreCliente);
		constructor.construyeSolicitudEntrega(nombreCliente);
		Documentacion documentacion = constructor.resultado();
		return documentacion;
	}
}
