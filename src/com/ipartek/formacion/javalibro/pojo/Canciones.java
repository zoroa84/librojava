package com.ipartek.formacion.javalibro.pojo;

public class Canciones {

	// atributos

	private String nombre;
	private String autor;
	private int duracion;

	// constructores

	public Canciones(String nombre, String autor, int duracion) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.duracion = duracion;
	}

	// getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	// otros metodos
	public String toString() {
		return "nombre = " + nombre + ", -> autor = " + autor + ", -> duracion = " + duracion;
	}
}
