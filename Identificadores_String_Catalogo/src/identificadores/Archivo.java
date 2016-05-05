package identificadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
	private Identificador ident;
	private static String Resource1 = "Resources//Entrada//ident.in";
	
	/**
	 * Lectura y escritura de archivo.
	 *     Se graba en Array de palabras las palabras cagadas en ident.in
	 *     Luego de ser procesadas, se graban en ident.out los identificadores.
	 *   Restricciones:
	 *      Archivo <= 20 elementos (lineas con palabras)
	 *      Línea en blanco indica fin de archivo.
	 *      Dimensión de palabras <= 15 caracteres.
	 * @throws IOException 
	 */
	
	public void leerArchivo(){
		File archivo=null;
		FileReader fileR=null;
		BufferedReader bufferR=null;
		String linea= " ";
		ident=new Identificador();
		
		try{ 
			 
			 archivo=new File(Resource1);
		     fileR=new FileReader(archivo);
		     bufferR=new BufferedReader(fileR);
		     		     
		     while((linea=bufferR.readLine())!=null){
		          this.getIdent().getPalabras().add(linea); 
		          }		     
			System.out.println("\t---- Se cargo la lista de capítulos ---"); 
		}catch(Exception e){
		      e.printStackTrace();	
		}finally{
			System.out.println("Capítulos cargados:");
			this.getIdent().mostrarPalabras();
			System.out.println("\t       *** Fin de lectura ***\n");
		}			
	}

	/**
	 * getters y setters
	 * @return
	 */
	public Identificador getIdent() {
		return ident;}
	
	public void setIdent(Identificador ident) {
		this.ident = ident;}
}
