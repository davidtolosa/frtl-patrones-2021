package creacionales.singleton.ejemplo;

public class Comercial {
	
	private String nombre;
	private String direccion;
	private String email;
	
	private static Comercial _instance = null;
	
	public static Comercial Instance(String nombre, String direccion, String email) {
		if (_instance == null)
		{
			_instance = new Comercial(nombre, direccion, email);
		}
			
		return _instance;
	}
	
	private Comercial(String pNombre, String pDireccion, String pEmail) {
		System.out.println("SE CREO  OBJETO-");
	    nombre = pNombre;
	    direccion = pDireccion;
		email = pEmail; 
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nobre) {
		this.nombre = nobre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void visualizar() {
		System.out.println("Nombre: " + nombre + "   Direccion: "+ direccion + "   Email:" + email);
	}	
}
