package com.ipartek.formacion.javalibro.excepciones;
/**
 * Exception personalizada para el POJO el participante
 * 
 * @see https://es.wikipedia.org/wiki/Plain_Old_Java_Object
 * @author Administrador
 *
 */
public class ParticipanteException extends Exception {

	public ParticipanteException(String MessageException) {
		super(MessageException);
	}

	private static final long serialVersionUID = -3514779290734173581L;

	public final static String EXCEPTION_MENOR_CERO = "La edad no puede ser menor que 0";
	//siempre que keramos usar un metodo o un atributo de una clase sin instanciar un objeto, ese atributo o objeto deve ser static 
	public final static String EXCEPTION_MAYOR_CIEN = "Eres demasiado viejo, no puedes tener mas de 100 años";

	

}
