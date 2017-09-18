package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.pojo.interfaces.Vendible;

public class LibroElectronico  extends Libro implements Vendible {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2388599755358010905L;
	private int tamanyo;
	
	public static final float DESCUENTO_DIGITAL =5;

	public LibroElectronico(String titulo) {
		super(titulo);
		this.tamanyo =0;
		
	}

	

	public int getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(int tamanyo) {
		this.tamanyo = tamanyo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "LibroElectronico [tamanyo=" + tamanyo + "]";
	}
	
	
	public float getprecio() {
		float resultado=0;
		if (resultado < 0 ) {
			resultado = Vendible.PRECIO_MINIMO;
		}
		resultado = super.getprecio()- DESCUENTO_DIGITAL;
		
		
		return resultado;
		
	}
}
