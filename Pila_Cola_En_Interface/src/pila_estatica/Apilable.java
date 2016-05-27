package pila_estatica;

public interface Apilable {
	void apilar(Object o);
 	Integer desapilar();
	Boolean isEmpty();
	void resize(); 
}
