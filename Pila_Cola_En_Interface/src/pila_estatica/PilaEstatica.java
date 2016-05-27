package pila_estatica;

public class PilaEstatica implements Apilable {
	private Object [] pilaEstatica;
	private Integer tope;
	private Integer dimensionInicialPila;


	public PilaEstatica(Integer dimensionInicialPila){
		this.setPilaEstatica(new Object [dimensionInicialPila]);
		this.setTope(-1);
	}

	/**
     * Overwride de Apilable
     */
	public void resize(){
		 
		 Object [] pilaEstaticaAux= new Object [pilaEstatica.length * 2 ];
		 for (int i=0; i < pilaEstatica.length; i++){
			 pilaEstaticaAux[i]=pilaEstatica[i];
			 
		 }
		 pilaEstatica= pilaEstaticaAux; 
	}
	
	public void apilar(Object o){		
		if(this.getTope()< pilaEstatica.length -1){
			this.setTope(tope+1);
			pilaEstatica[tope]=o;
			System.out.println("SE APILO CORRECTAMENTE= " + o);
		}
		else{
		this.resize();
		this.setTope(tope+1);
		pilaEstatica[tope]=o;
		System.out.println("SE INCREMENTO EL TAMAÑO DE LA PILA, y se pudo apilar " + o);
		}
	}

	
	//ver
	@Override
	public Integer desapilar(){
		if(this.isEmpty()==false){
			for(int i=this.getTope(); i>-1;i--){
				this.getPilaEstatica()[i]=null;
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
	 * Getters y Setters
	 * @return
	 */
	public Object[] getPilaEstatica() {
		return this.pilaEstatica;
	}

	public void setPilaEstatica(Object[] pilaEstatica) {
		this.pilaEstatica = pilaEstatica;
	}

	public Integer getTope() {
		return this.tope;
	}

	public void setTope(Integer tope) {
		this.tope = tope;
	}

	public Integer getDimensionInicialPila() {
		return dimensionInicialPila;
	}

	public void setDimensionInicialPila(Integer dimensionInicialPila) {
		this.dimensionInicialPila = dimensionInicialPila;
	}
	

}
