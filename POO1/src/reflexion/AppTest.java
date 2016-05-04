package reflexion;

/**
 * @author Gast�n
 * Se declara una clase llamada "AppTest".
 * Esta clase de Java y sus m�todos ser�n llamadas en tiempo de ejecuci�n m�s tarde
 */

public class AppTest{
	//Atributo
	private Integer contador; 
	
	public void imprimirEsto(){ 
		System.out.println("imprimirEsto(): sin par�metros"); 
	} 
	
	public void imprimirUnString(String temp){ 
		System.out.println("imprimirUnString(String): " + temp); 
	} 
	
	public void imprimirEntero(Integer temp){ 
		System.out.println("imrpimirEntero(Integer) : " + temp); 
	} 
	
	public void setContador(Integer counter){ 
		this.contador = counter; 
		System.out.println("setContador(Integer) carga a la variable \"contador\": " + counter); 
	}
	
	public void imprimirContador(){ 
		System.out.println("imprimirContador() : " + this.contador); 
	}

	@Override
	public String toString() {
		return "AppTest [contador=" + contador + "]";
	} 
	
} 
