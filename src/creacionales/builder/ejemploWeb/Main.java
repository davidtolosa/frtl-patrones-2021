package creacionales.builder.ejemploWeb;

public class Main {

	public static void main(String[] args) {
		//Usuario u1 = new Usuario();
	
		Usuario u1 = new UsuarioBuilder().email("davidt@mail.com").nombre("David", "T").edad(30).build();
		System.out.println(u1);
	}

}
