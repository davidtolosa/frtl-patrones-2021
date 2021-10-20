package estructurales.composite.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa {
	
	protected List<Empresa> filiales = new ArrayList<Empresa>();

	@Override
	public double calculaCosteMantenimiento() {
		double costoFiliales = 0.0;
		for(Empresa filial: filiales)
			costoFiliales = costoFiliales + filial.calculaCosteMantenimiento();
		
		return costoFiliales + (nVehiculos*costeUnitarioVehiculo);
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		return filiales.add(filial);
	}

}
