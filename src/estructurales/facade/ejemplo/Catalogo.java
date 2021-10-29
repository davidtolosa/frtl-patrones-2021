package estructurales.facade.ejemplo;

import java.util.List;

public interface Catalogo {
	List<String> buscaVehiculos(int precioMin,int precioMax);
}
