package pila_estatica;

public class Garage implements Apilable {

	private Object [] parcelaGarage;
	private Integer tope;
	private Integer dimensionInicialGarage;


	public Garage(Integer dimensionInicialGarage){
		this.setParcelaGarage(new Object [dimensionInicialGarage]);
		this.setTope(-1);
	}

	@Override
	public void resize(){}//no se utiliza

	@Override
	public void apilar(Object patente){		
		if(this.getTope()<parcelaGarage.length-1){
			this.setTope(this.getTope()+1);
			this.getParcelaGarage()[this.getTope()]=patente;
			System.out.println("SE ESTACIONÓ CORRECTAMENTE PATENTE= " + patente);
		}
		else{
			System.out.println("** No hay más lugares en el garage **");
		}
	}

	@Override
	public Integer desapilar(){
		if(this.isEmpty()==false){
			for(int i=this.getTope(); i>-1;i--){
				this.getParcelaGarage()[i]=null;
				this.setTope(this.getTope()-1);
			}			
		}
		return this.getTope();
	}

	@Override
	public Boolean isEmpty() {
		Boolean respuesta=false;		
		if(this.getTope()==-1)
			respuesta=true;		
		return respuesta;
	}

	/**
	 * Método de clase Garage
	 */
	public void sacarAuto(Object patente){
		Boolean esta=this.estaPatenteEnGarage(patente);
		if(esta){
			System.out.println("***  Se la retira del garage ***");
			Garage garageAux=new Garage(this.getTope()+1);
			System.out.println("Se reacomodaron en Garage Auxiliar las patentes: ");		
			for(int i=this.getTope();i>-1;i--){
			      if(this.getParcelaGarage()[i].equals(patente))
				     this.getParcelaGarage()[i]=null;
			      else garageAux.apilar(this.getParcelaGarage()[i]);
			}
			
			//Vacío Garage
			this.desapilar();

			System.out.println("\nSe volvieron a estacionar en Garage de origen: ");
			//Se vuelven a apilar en Garage los autos sacados momentáneamente
			for(int i=garageAux.getTope(); i>-1;i--){
				this.apilar(garageAux.getParcelaGarage()[i]);
			}
		}
		
		System.out.println("\nQué el garage con las siguiente patentes: ");
		this.verPila();
	}

	public void verPila(){
		for(int i=0; i<this.getTope()+1; i++)
			System.out.println(this.getParcelaGarage()[i]);
	}
	
	public Boolean estaPatenteEnGarage(Object patente){
		Boolean respuesta=false;
		for(int i=this.getTope(); i>-1;i--){
			if(this.getParcelaGarage()[i].equals(patente))
				respuesta= true;
		}
		System.out.println(respuesta?"La patente " + patente + " se encontró": "** La patente " + patente + " no está en el garage **");
		return respuesta;
	}

	/**
	 * Getters y Setters
	 * @return
	 */
	public Object[] getParcelaGarage() {
		return this.parcelaGarage;
	}

	public void setParcelaGarage(Object[] parcelaGarage) {
		this.parcelaGarage = parcelaGarage;
	}

	public Integer getTope() {
		return this.tope;
	}

	public void setTope(Integer tope) {
		this.tope = tope;
	}

	public Integer getDimensionInicialGarage() {
		return dimensionInicialGarage;
	}

	public void setDimensionInicialGarage(Integer dimensionInicialGarage) {
		this.dimensionInicialGarage = dimensionInicialGarage;
	}

}
