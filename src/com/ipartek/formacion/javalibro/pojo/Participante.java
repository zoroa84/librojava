
public class Participante {

	// atributos

	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	private int edad;

	// constructores (se llaman igual que la clase)
	

	public Participante() {
		super();
		this.nombre="";
		this.usuarioGit="";
		this.email ="";
		this.edad=0;
	}

	public Participante(String nombre, String usuarioGit) {
		this();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		
	}
	public Participante(String nombre, int edad) throws ParticipanteException {
		this();
		this.nombre = nombre;
		
		//this.edad = edad;
		this.setEdad(edad);
		
		
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

	
	String getLinkGitHub() {
		return "https://github.com/" + this.usuarioGit;
	}

	public int getEdad() {
		return edad;
	}
// otros metodos

	public void setEdad(int edad) throws ParticipanteException {
		if(edad<0) {
			throw new ParticipanteException(ParticipanteException.EXCEPTION_MENOR_CERO);
		}
		else if(edad>100) {
			throw new ParticipanteException(ParticipanteException.EXCEPTION_MAYOR_CIEN);
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", usuarioGit=" + usuarioGit + ", email=" + email + ", trabajador="
				+ trabajador + ", edad=" + edad + "]";
	}

	
	
	
}
