package creacionales.singleton.ejemplo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comercial comercial1 = Comercial.Instance("David", "Villegas", "email");
		comercial1.visualizar();
				
		Comercial comercial2 = Comercial.Instance("David2", "Pellegrini", "email2");
		comercial2.visualizar();		
}

}
