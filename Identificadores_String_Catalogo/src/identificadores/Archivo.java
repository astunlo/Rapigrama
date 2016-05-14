package identificadores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {
	private Identificador ident;
	private static String Resource1 = "Resources//Entrada//ident.in";
	private static String ResourceOut= "Resources//Salida//ident.out";
		
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
		File archivoIn=null;
		FileReader fileR=null;
		BufferedReader bufferR=null;
		String linea= " ";
		ident=new Identificador();
		
		try{ 
			 
			 archivoIn=new File(Resource1);
		     fileR=new FileReader(archivoIn);
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
	
	
	public void grabarArchivo(){
		FileWriter fileW=null;
		PrintWriter pW=null;
		String linea= "Hola";
		ident=new Identificador();
		
		try{
		     fileW= new FileWriter (ResourceOut);
		     pW= new PrintWriter(fileW);
		     
		     pW.println(linea); 	     
		     
		}catch(Exception e){
			e.printStackTrace();
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
