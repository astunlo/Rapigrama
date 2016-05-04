package herencia_polimorfismo;

public class EmpleadoPlantaPermanente extends Empleado {
	protected Integer antig�edad;
	protected Double $porA�oAntig�edad; 
	protected Double montoPorAntig�edadPlantPerm;
	protected Double montoTotalACobrar=0.0;
	
	EmpleadoPlantaPermanente(String apNom, Boolean cony, Integer hij, Integer hsTrab, Integer antig) {
		super(apNom, cony, hij, hsTrab);
		this.setAntig�edad(antig);
          //cobre $10 por a�o de antig�edad
		this.set$porA�oAntig�edad(10.0);
		  //cobra $30 por hora
		this.setMontoPorHora(30.0);
		  //se calcula el monto de su antig�edad
		this.setMontoPorAntig�edadPlantPerm(this.cobrarMontoAntig�edad());
	}
	
	@Override
	public Double cobrarMontoAntig�edad(){
		Double monto=this.getAntig�edad()*this.get$porA�oAntig�edad();
		return monto;	
	}
	
	@Override
	public Double cobrarSalarioFamiliar() {
		Double montoSalarioFamiliar=0.0;
		if(this.getConyuge()==false & this.getHijos()==0){			
		  }else if(this.getConyuge()==true & this.getHijos()==0){
			                montoSalarioFamiliar=Empleado.SALARIOESPOSA;
		           }else if(this.getConyuge()==true & this.getHijos()!=0){
		        	            montoSalarioFamiliar=Empleado.SALARIOESPOSA+(Empleado.SALARIOHIJO*hijos);
		                 }else if(this.getConyuge()==false & this.getHijos()!=0){ 
		                          montoSalarioFamiliar=Empleado.SALARIOHIJO*hijos;}
		return montoSalarioFamiliar;
	}
	
	//Cobra Hs trabajadas $30 + antig�edad $10 + salario
	@Override
	public void cobrarSalario() {		
		Double montoSueldo=0.0;
		montoSueldo=this.cobrarSalarioFamiliar()+(this.getHorasTrabajadas()*this.getMontoPorHora())+ this.getMontoPorAntig�edadPlantPerm();		
		this.setMontoTotalACobrar(this.getMontoTotalACobrar()+montoSueldo);
	}
	
	//getter y setter
	public Integer getAntig�edad() {
		return antig�edad;
	}

	public void setAntig�edad(Integer antig�edad) {
		this.antig�edad = antig�edad;
	}

	public Double get$porA�oAntig�edad() {
		return $porA�oAntig�edad;
	}

	public void set$porA�oAntig�edad(Double $porA�oAntig�edad) {
		this.$porA�oAntig�edad = $porA�oAntig�edad;
	}
	
	public Double getMontoPorAntig�edadPlantPerm() {
		return montoPorAntig�edadPlantPerm;
	}

	public void setMontoPorAntig�edadPlantPerm(Double montoPorAntig�edadPlantPerm) {
		this.montoPorAntig�edadPlantPerm = montoPorAntig�edadPlantPerm;
	}

	public Double getMontoTotalACobrar() {
		return montoTotalACobrar;
	}

	public void setMontoTotalACobrar(Double montoTotalACobrar) {
		this.montoTotalACobrar = montoTotalACobrar;
	}	
	
}
