package creacionales.singleton.ejemplo;

public class Comercial {
	
	private String nombre;
	private String direccion;
	private String email;
	
	private static Comercial _instance = null;
	
	public static Comercial Instance() {
		if (_instance == null)
		{
			_instance = new Comercial();
		}
			
		return _instance;
	}
	
	private Comercial() {
		System.out.println("-----SE CREO UN OBJETO----");
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
