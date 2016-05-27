package pila_estatica;

public class TestPila {

	public static void main(String[] args) {
		PilaEstatica pila1= new PilaEstatica(2);
		pila1.apilar(1);
		pila1.apilar(2);
		pila1.apilar(3);
		System.out.println("Estado de la Pila: " + (pila1.isEmpty()? "Pila vacía":"Pila cargada"));
		System.out.println("El tope de la pila está en: " + (pila1.getTope()+1));
		System.out.println("Vaciado de Pila: tope= " + pila1.desapilar());
		System.out.println("Estado de la Pila: " + (pila1.isEmpty()? "Pila vacía":"Pila cargada"));
	}
}
