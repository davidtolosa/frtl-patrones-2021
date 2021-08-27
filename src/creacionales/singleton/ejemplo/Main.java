package creacionales.singleton.ejemplo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comercial comercial1 = Comercial.Instance();
		comercial1.setNombre("David");
		comercial1.setDireccion("Villegas 199");
		comercial1.setEmail("email@gmail.com");
		
		System.out.println("Comercial1");
		comercial1.visualizar();
		
		
		Comercial comercial2 = Comercial.Instance();
		comercial2.setNombre("David2");
		comercial2.setDireccion("Villegas 2");
		comercial2.setEmail("email2@gmail.com");
		
		
		System.out.println("Comercial2");
		comercial2.visualizar();		
		
		System.out.println("Comercial1");
		comercial1.visualizar();
	}

}
