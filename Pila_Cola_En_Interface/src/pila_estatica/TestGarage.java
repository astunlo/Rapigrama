package pila_estatica;

public class TestGarage {

	public static void main(String[] args) {
		Garage g1=new Garage(4);
		
		g1.apilar("ABC123");
		g1.apilar("VAJ520");
		g1.apilar("KWK330");
		g1.apilar("DHG523");
		
		System.out.println(g1.isEmpty());
//		System.out.println(g1.desapilar());
//		System.out.println(g1.isEmpty());
		
		g1.sacarAuto("VAJ520");
	}
}
