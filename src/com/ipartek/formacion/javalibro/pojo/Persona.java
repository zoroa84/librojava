package com.ipartek.formacion.javalibro.pojo;

public class Persona {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String edad;
	private String email;
	private String dni;
	private String puesto;

	//constructor	
	
	public Persona(String nombre, String apellido1, String apellido2, String edad, String email, String puesto,
			String dni) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.email = email;
		this.dni = dni;
		this.puesto = puesto;
	}
	
	//getter y seters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	//to string
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", email=" + email +  ", dni=" + dni + ", puesto=" + puesto +"]";
	}

}
