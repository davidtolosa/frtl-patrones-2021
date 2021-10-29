package estructurales.facade.ejemplo;

public class ComponenteGestionDocumento implements GestionDocumento {

	@Override
	public String documento(int indice) {
		return "Documento número " + indice;
	}

}
