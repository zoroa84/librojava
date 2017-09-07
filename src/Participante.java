
public class Participante {

	// atributos

	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;

	// constructores (se llaman igual que la clase)
	

	public Participante() {
		super();
		this.nombre="";
		this.usuarioGit="";
		this.email ="";
	}

	public Participante(String nombre, String usuarioGit) {
		super();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		this.email = "";
		this.trabajador = false;
	}

	// getters y setters

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuarioGit() {
		return usuarioGit;
	}

	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTrabajador() {
		return trabajador;
	}

	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}

	// otros metodos

	String getLinkGitHub() {
		return "https://github.com/" + this.usuarioGit;
	}

}
