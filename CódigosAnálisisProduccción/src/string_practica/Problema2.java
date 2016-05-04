/**
 *Realizar una clase, que permita cargar una direcci�n de mail en el constructor, 
 luego en otro m�todo mostrar un mensaje si contiene el caracter '@'.
Cargar un String por teclado e implementar los siguientes
m�todos:
a) Imprimir la primera mitad de los caracteres de la cadena.
b) Imprimir el �ltimo caracter.
c) Imprimirlo en forma inversa.
d) Imprimir cada caracter del String separado con un gui�n.
e) Imprimir la cantidad de vocales almacenadas.
f) Implementar un m�todo que verifique si la cadena se lee igual de
izquierda a derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)
Desarrollar un programa que solicite la carga de una clave. La clase debe tener dos m�todos uno para la carga y otro que muestre si la clave es la correcta (la clave a comparar es "123abc")
Confeccionar un programa que permita cargar los nombres de 5 personas y sus mail, luego implementar los siguientes m�todos:
a) Mostrar por pantalla los datos.
b) Consulta del mail ingresando su nombre.
c) Mostrar los mail que no tienen el car�cter @.
Codifique un programa que permita cargar una oraci�n por teclado, luego mostrar cada palabra ingresada en una l�nea distinta.
 */

package string_practica;

import java.util.Scanner;

public class Problema2 {
   private String email;
   private String palabra;
   
   public Problema2(String e){
	   this.email=e;
   }
   
	public static void main(String[] args) {
		
		Problema2 p2= new Problema2("lopezgastonm@gmail.com");
		Scanner teclado= new Scanner(System.in);
		System.out.println("El eMail ingresado por constructor del Objeto Problema2, �contine el @? " + (p2.contieneArrobaElString()? "S�":"No"));
	    System.out.println("La cadena ingresada fue \"" + p2.email + "\"");
	    System.out.println("\nAhora ingrese una palabra cualquiera: ");
	    p2.palabra= teclado.next();
	    p2.mostrarPrimerMitadDeCadena();
	    p2.ultimoCaracter();
	    p2.invertirPalabra();
	    p2.separarLetrasPorGuion();
	    p2.cuentaVocales();
	    System.out.println(p2.isPalindromo()?"\nLa palabra es un PAL�NDROMO": "La palabra NO es un pal�ndromo");
	    teclado.close();
	}

	public Boolean contieneArrobaElString(){
		return email.contains("@");
	}
	
	public void mostrarPrimerMitadDeCadena(){
		Integer tama�o= palabra.length()/2;
		System.out.print("\nLa primer mitad de la palabra ingresada es: ");
		for(int i=0; i<tama�o; i++){
			System.out.print(palabra.charAt(i));
		}
	}
	
	public void ultimoCaracter(){
		Integer tama�o= palabra.length();
		System.out.print("\nEl �ltimo caracter de la palabra ingresada es: " + palabra.charAt((tama�o-1)) + "");
	}
	
	public void invertirPalabra(){
        char[] p= new char[palabra.length()];
		p= palabra.toCharArray();
		System.out.print("\nLa palabra escrita al rev�s queda \"");
        for(int i=p.length-1; i>=0; i--){
        	System.out.print(p[i]);
        }
		System.out.println("\"");
	}
	
	public void separarLetrasPorGuion(){
		char[] p= new char[palabra.length()];
		p= palabra.toCharArray();
		System.out.print("Letras separadas por guiones: ");
		int i=0;
		while(i<p.length){
			System.out.print(p[i]);
			i++;
			if(i<p.length)
			System.out.print("-");
		}
	}
	
	public void cuentaVocales(){
		Integer contador=0;
		char[] p= new char[palabra.length()];
		p= palabra.toCharArray();
		for(int i=0; i<p.length;i++){
		     if(p[i]=='a'||p[i]=='e'||p[i]=='i'||p[i]=='o'||p[i]=='u'||p[i]=='A'||p[i]=='E'||p[i]=='I'||p[i]=='O'||p[i]=='U')
		    	 contador++;
		}
		System.out.println("\nLa cantidad de vocales que contiene es " + contador);
	}
	
	public Boolean isPalindromo(){
		Boolean respuesta=false;
		char[] p= new char[palabra.length()];
		p= palabra.toCharArray();
		Integer i=0;
		Integer restador=1;
		while(i<p.length){
			if(p[i]==p[p.length-restador]){
		          respuesta=true;
			}else{respuesta=false;}
		    i++;
		    restador++;
		}
		
		return respuesta;
	}
	
}
