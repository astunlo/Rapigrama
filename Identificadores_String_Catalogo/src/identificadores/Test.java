package identificadores;

public class Test {

	public static void main(String[] args) {
		Archivo archivo1= new Archivo();
		
		archivo1.leerArchivo();
		archivo1.getIdent().reconocerIdentificadores();
		archivo1.getIdent().compararFonemas();
	}
}
