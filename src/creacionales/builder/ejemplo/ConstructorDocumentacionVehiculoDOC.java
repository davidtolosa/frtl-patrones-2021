package creacionales.builder.ejemplo;

public class ConstructorDocumentacionVehiculoDOC extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoDOC() {
		documentacion = new DocumentacionDOC();
	}

	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<DOC>Solicitud de pedido Cliente: " + nombreCliente + "</DOC>";
		documentacion.agregaDocumento(documento);
	}

	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<DOC>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</DOC>";
		documentacion.agregaDocumento(documento);
	}

	@Override
	public void construyeSolicitudEntrega(String nombreSolicitante) {
		String documento;
		documento = "<DOC>Solicitud de Etrenga: " + nombreSolicitante + "</DOC>";
		documentacion.agregaDocumento(documento);
	}
}
