package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * mostrar la fecha actual del sistema
 * @author Administrador
 *
 */
public class VerFechaActual {

	public static void main(String[] args) {
		final String[] diasSemana = new String[]{//empieza en 1 los dias de la semana
				"Domingo",
				"Lunes",
				"Martes",
				"Miercoles",
				"Jueves",
				"Viernes",
				"Sabado"};
		
		final String[] MESES = new String[]{//desde cero empieza
				"Enero",
				"Febebro",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};
		
		
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		int anyo =gc.get(Calendar.YEAR);
		int mes=gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int diaSemana = gc.get(Calendar.DAY_OF_WEEK)-1;
		 
	
		
		
		
		System.out.println(anyo+" "+mes+" "+ dia +" "+diaSemana);
		
		
		
		
		

	}

}
