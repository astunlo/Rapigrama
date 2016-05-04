package mapas;
/**
 * SubClass of Collection that implements Interface Map. Otras clases importantes: "TreeMap" y "LinkedHashMap"
 * Interfaz que extiende a otra interfaz (Hashtable)
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gast�n
 * Mapas: estructuras de datos para almacenar pares "clave-->valor".
 * Por debajo implementan toda la teor�a de las estructuras de datos de los �rboles:
 *     AVL, B, B+, B*
 * que permiten a�adir, eliminar y modificar elementos de forma transparente para el programador.
 * Las claves pueden ser de cualquier tipo de objetos, aunque las m�s utilizadas son los tipo objetos 
 * predefinidos por Java como String, Integer, Double...
 * ---->!!! Cuicado, los mapas NO permiten datos at�micos.
 * 
 *                                 Map extiende a Hastable(Interfaz) 
 *                            HashMap<K,V>---> extiende a AbstractMap<K,V>
 */

public class MisMapas {
	private Map<Integer, String> mapa1= new HashMap<Integer, String>();
	
	//M�todos de los Map:
	void mostrarM�todos(){
		 System.out.println("Mapa vac�o?:");
	     System.out.println(mapa1.isEmpty());//true si est� vac�o, false si tiene al menos un elemento
	     System.out.println("Se agrega Gaston en clave 0");
	     mapa1.put(0, "Gast�n");//(Key clave, Values valor)
	     System.out.println("Se muestra el valor");
	     System.out.println(mapa1.get(0));//Devuelve el valor de la clave que se indica. Null si no tiene valor asignado
	     System.out.println("Se pideque muestre el valor de clave 1, que NO est� cargado");
	     System.out.println(mapa1.get(1));
	     System.out.println("Se borra todo el contenido del mapa, y se carga con otros valores");
	     mapa1.clear();//Borra todo el contenido del Map
	     mapa1.put(0,"Vanesa");
	     mapa1.put(1,"Maitena");
	     mapa1.put(2,"Gast�n");
	     mapa1.put(3,"Eva");
	     System.out.println("Tama�o:");
	     System.out.println(mapa1.size());//Devuelve el n�mero de elementos en el Map
	     System.out.println("Se muestra el contenido en forma de colecci�n:");
	     System.out.println(mapa1.values());//devuelve una "colecci�n" con los valores del Map
	     System.out.println("Se remueve el contenido de clave 3");
	     mapa1.remove(3);
	     System.out.println("Se muestra nuevo tama�o, y contenido");
	     System.out.println(mapa1.size());//Devuelve el n�mero de elementos en el Map
	     System.out.println(mapa1.values());//devuelve una "colecci�n" con los valores del Map
	     System.out.println("Existe clave 1?");
	     System.out.println(mapa1.containsKey(1));//true si existe esa clave
	     System.out.println("Existe valor Maitena?");
	     System.out.println(mapa1.containsValue("Maitena"));//true si existe ese valor	          
	}
	
	public static void main(String[] args) {
		new MisMapas().mostrarM�todos();
	}
}


