package identificadores;
/**
 * Una agencia de publicidad est� dise�ando un cat�logo, organizado en cap�tulos. Para
hacer m�s atractivo el dise�o gr�fico, en cada p�gina quiere poner un fondo en un color
suave que contenga una secuencia de letras que, sin ser el nombre completo del
cap�tulo, ni una letra aislada, lo identifique sin ambig�edad, cuando esto fuera posible.
Por ejemplo, si un cap�tulo fuera pincel y otro pipa, se podr�an utilizar como fondo
secuencias como pin, pinc, pince, pip, ipa, etc. Por el contrario, no se
podr�an utilizar secuencias como pi por ser ambiguas. Llamaremos identificadores de
las palabras a las secuencias m�s b�sicas que identifican sin ambig�edad a un cap�tulo.
En el ejemplo que dimos, pin, pip e ipa son identificadores. pinc y pince no lo
son, dado que se forman agregando letras a secuencias m�s cortas.
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
	 * M�todos de clase
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
		ArrayList<String> identif_detectados= null;
		Fonema fonemasAux=new Fonema(LIMITE);

		//for 1:Recorre posiciones del vector
		for(int i=0; i<this.getFonemas().getFonemasVector().length;i++){//length=5
			//crea un Array de identificadores a partir de los fonemas en el Array en esa posicion
			identif_detectados=new ArrayList<String>();
			//evalua que el elemento No sea null
			if(this.getFonemas().getFonemasVector()[i]!=null){
				//for 2:Recorre los indices del Array contenido en cada posici�n del vector.
				for(int j=0; j<this.getFonemas().getFonemasVector()[i].size();j++){//size=cant de elementos de Array en i
					//genero una variable que carga el String que est� cargado en esa posici�n del Array
					String dato=(String) this.getFonemas().getFonemasVector()[i].get(j);//i=0, j=0
					//for 3:Recorre los indices del Array en esa posici�n i+1 
					for(int k=0; (k+1)<this.getFonemas().getFonemasVector()[k+1].size();k++){//size del Array de la posici�n i+1 del vector
						//eval�a que el dato no sea igual a otros datos de otras posiciones de otros Array del vector
						if((dato!=this.getFonemas().getFonemasVector()[j+1].get(k)))//i=1, k=0
							identif_detectados.add(dato);
				       }
				  }
				fonemasAux.cargarVector(identif_detectados);
				//this.setIdentificadores(identif_detectados);
   			}
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
