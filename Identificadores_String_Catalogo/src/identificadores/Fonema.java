package identificadores;

import java.util.ArrayList;

public class Fonema {
	private ArrayList<?>[] fonemasVector;
	private Integer tope;
	private Integer indiceDeCarga;

	public Fonema(Integer tope){
		this.setTope(tope);
		this.setFonemasVector(new ArrayList<?>[tope]);
		this.setIndiceDeCarga(0);
		for(int i=0; i<fonemasVector.length;i++)
			this.getFonemasVector()[i]=null;
	}

	/**
	 * Método de carga de vector
	 */
	public void cargarVector(ArrayList<?> a){
		if(this.getIndiceDeCarga()<this.getFonemasVector().length){
			this.getFonemasVector()[this.getIndiceDeCarga()]=a;
		    this.indiceDeCarga++;
		}else{ throw new IndexOutOfBoundsException("*** Vector lleno ***");}
	}
	
	
	public void mostrarVector(){
		System.out.println("\nVector:");
		for(int i=0; i<this.getFonemasVector().length;i++){
			  if((this.getFonemasVector()[i])!=null){
				 System.out.println("Array [" + i + "]");
			     for(int j=0; j<this.getFonemasVector()[i].size();j++){
			             System.out.println(fonemasVector[i].get(j));
			        }
			  }
		}
	}
	
	/**	 * getters y setters
	 */
	public ArrayList<?>[] getFonemasVector() {
		return fonemasVector;
	}

	public void setFonemasVector(ArrayList<?>[] fonemasVector) {
		this.fonemasVector = fonemasVector;
	}

	public Integer getTope() {
		return tope;
	}

	public void setTope(Integer tope) {
		this.tope = tope;
	}
	
	public Integer getIndiceDeCarga() {
		return indiceDeCarga;
	}

	public void setIndiceDeCarga(Integer indiceDeCarga) {
		this.indiceDeCarga = indiceDeCarga;
	}
	
}
