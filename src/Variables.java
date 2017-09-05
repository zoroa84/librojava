import java.text.NumberFormat;

/**
 * ejercicio para probar las clases de java
 * @author mikel
 *
 */
public class Variables {
	
	
	
	public static boolean pregunta (boolean quess){
		
		 return false;
	 }

	public static void main(String[] args) {
		System.out.println("ejercicio con variables");
		
		System.out.println("enteros, reales, booleanas, char");
		
		System.out.println("enteros");
		//TODO terminar de poner el resto
		System.out.println("int" + Integer.BYTES +" 4 bytes entero" + Integer.MIN_VALUE + Integer.MAX_VALUE);
		
		
		System.out.println("reales");
		float sueldoMesGerman = 1200.25f;
		float sueldoMesLander = (float)2400.50;
		System.out.println("german cobra " + NumberFormat.getInstance().format(sueldoMesGerman)  + " € al mes");
		
		
		System.out.println("booleanas");
		boolean verdad = true;
		System.out.println("esta diciendo la verdad?? " + verdad);
		
		System.out.println("char");
		char letra = 'a';
		System.out.println("el caracter es: " + letra);
		
		
		
		char a ='a';
		char f ='F';
		char tres =3;
		char j ='j';
		
		System.out.println("digito   letra   mayus   minus");
		System.out.println(Character.isDigit(a)+ "    "+  Character.isLetter(a)+"    " +Character.isUpperCase(a)+"   "+Character.isLowerCase(a) +"  a");
		System.out.println(Character.isDigit(f)+ "    "+  Character.isLetter(f)+"    " +Character.isUpperCase(f)+"    "+Character.isLowerCase(f) +" F");
		System.out.println(Character.isDigit(tres)+ "    "+  Character.isLetter(tres)+"   " +Character.isUpperCase(tres)+"   "+Character.isLowerCase(tres) +" 3");
		System.out.println(Character.isDigit(j)+ "    "+  Character.isLetter(j)+"    " +Character.isUpperCase(j)+"   "+Character.isLowerCase(j) +"  j");
		
		
		
		//TODO declarar una variable primitiva de cada tipo y usar su wrapper
	}

}
