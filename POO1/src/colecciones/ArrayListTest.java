package colecciones;

import java.util.ArrayList;
/**
 * ArrayList<E> es Subclase de ---> AbstractList<E> ---> AbstarctCollection<E> --->Object
 * @author Gast�n
 *
 */

public class ArrayListTest{	
	public static void main(String[] args) {
	ArrayList<Integer> arregloLista = new ArrayList<Integer>();
	System.out.println("Esta vacio?: " + arregloLista.isEmpty());
	arregloLista.add(2);
	arregloLista.add(5);
	arregloLista.add(3);
	System.out.println("toString: " + arregloLista);
	System.out.println("Item removido: " + arregloLista.remove(2));
	System.out.println("toString: " + arregloLista);
	System.out.println("Esta vacio?: " + arregloLista.isEmpty());
	System.out.println("Posici�n del elemento 5: " + arregloLista.indexOf(5));
	System.out.println("Tama�o del vector: " + arregloLista.size());
	}
}
