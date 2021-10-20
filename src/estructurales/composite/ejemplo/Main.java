package estructurales.composite.ejemplo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresa1 = new EmpresaSinFilial();
		empresa1.agregaVehiculo();
		empresa1.agregaVehiculo();
		//System.out.println("Costo empresa 1: " + empresa1.calculaCosteMantenimiento());
		
		Empresa empresa2 = new EmpresaSinFilial();
		empresa2.agregaVehiculo();
		//System.out.println("Costo empresa 2: " + empresa2.calculaCosteMantenimiento());

		Empresa empresa3 = new EmpresaMadre();
		empresa3.agregaFilial(empresa1);
		empresa3.agregaFilial(empresa2);
		empresa3.agregaVehiculo();
		//System.out.println("Costo empresa 3: " + empresa3.calculaCosteMantenimiento());
		
		Empresa empresa4 = new EmpresaMadre();
		empresa4.agregaFilial(empresa3);
		empresa4.agregaVehiculo();
		empresa4.agregaVehiculo();
		System.out.println("Costo empresa 4: " + empresa4.calculaCosteMantenimiento());
		
	}

}
