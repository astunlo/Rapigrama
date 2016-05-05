package identificadores;
/**
 * Una agencia de publicidad está diseñando un catálogo, organizado en capítulos. Para
hacer más atractivo el diseño gráfico, en cada página quiere poner un fondo en un color
suave que contenga una secuencia de letras que, sin ser el nombre completo del
capítulo, ni una letra aislada, lo identifique sin ambigüedad, cuando esto fuera posible.
Por ejemplo, si un capítulo fuera pincel y otro pipa, se podrían utilizar como fondo
secuencias como pin, pinc, pince, pip, ipa, etc. Por el contrario, no se
podrían utilizar secuencias como pi por ser ambiguas. Llamaremos identificadores de
las palabras a las secuencias más básicas que identifican sin ambigüedad a un capítulo.
En el ejemplo que dimos, pin, pip e ipa son identificadores. pinc y pince no lo
son, dado que se forman agregando letras a secuencias más cortas.
 */

import java.util.ArrayList;

public class Identificador {
	private ArrayList<String> identificadores;
	private ArrayList<String> palabras;
	private Fonema fonemas;
	private final Integer LIMITE=20;
	
	public Identificador(){
		this.setIdentificadores(new ArrayList<String>());	
		this.setPalabras(new ArrayList<String>());
		this.setFonemas(new Fonema(LIMITE));
	}

	/**
	 * Métodos de clase
	 */

	public void mostrarIdentificadores(){
		for(String i:this.getIdentificadores())
			System.out.println(i);}

	public void mostrarPalabras(){
		for(String p:this.getPalabras())
			System.out.println(p);}

	public void reconocerIdentificadores(){
		String palabraAux=null;
		String fonemaAux=null;
		ArrayList<String> fonemas =null;
		
		for(int i=0; i<this.getPalabras().size();i++ ){
			Integer indice=2;
			Integer pos=0;
			palabraAux=this.getPalabras().get(i);
            fonemas=new ArrayList<String>();
			while(pos<palabraAux.length()-2){
				  fonemaAux=palabraAux.substring(0,indice);
				  fonemas.add(fonemaAux);
				  indice++;
			      pos++;
			}
			this.getFonemas().cargarVector(fonemas);
			//fonemas.clear();
	    }
		this.getFonemas().mostrarVector();
	}
	
	public void compararFonemas(){
		ArrayList<String> identificadoresAux= null;
		Fonema fonemasAux=new Fonema(LIMITE);
			
		for(int i=0; i<this.getFonemas().getFonemasVector().length;i++){
			identificadoresAux=new ArrayList<String>();
			  if(this.getFonemas().getFonemasVector()[i]!=null){
			     for(int j=0; j<this.getFonemas().getFonemasVector()[i].size();j++){
			    	 for(int k=0; k<this.getFonemas().getFonemasVector()[j].size();k++){
			                if(this.getFonemas().getFonemasVector()[i].get(j)!=this.getFonemas().getFonemasVector()[i+1].get(k)){
			                    identificadoresAux.add((String) this.getFonemas().getFonemasVector()[i].get(j));     
			                }
			          }
			      }
			  }
			fonemasAux.cargarVector(identificadoresAux);  
		}
		fonemasAux.mostrarVector();
	}

	/**
	 * getters y setters
	 * @return
	 */
	public ArrayList<String> getIdentificadores() {
		return identificadores;}

	public void setIdentificadores(ArrayList<String> identificadores) {
		this.identificadores = identificadores;}

	public ArrayList<String> getPalabras() {
		return palabras;}

	public void setPalabras(ArrayList<String> palabras) {
		this.palabras = palabras;}

	public Fonema getFonemas() {
		return fonemas;
	}

	public void setFonemas(Fonema fonemas) {
		this.fonemas = fonemas;
	}
	

}
