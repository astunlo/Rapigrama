package manejo_excepciones_ej1;

import java.util.Scanner;

/*
 * Ejercicio 1: Cree una clase con un m�todo main() que genere un objeto de
   la clase Exception dentro de un bloque try. Proporcione al constructor de
   Exception un argumento String. Capture la excepci�n dentro de una
   cl�usula catch e imprima el argumento String. A�ada una clausula finally
   e imprima un mensaje para demostrar que pas� por all�.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		try{
			Exception e= new Exception("Lanz� una Excepci�n");
			throw e;
		}catch( Exception e){
			System.out.println(e.getMessage());
		}finally{System.out.println("** Fin **");}
	}
}
