/**
 * Una empresa tiene dos turnos (ma�ana y tarde) en los que trabajan 8 empleados (4 por la ma�ana y 4 por la tarde)

Confeccionar un programa que permita almacenar los sueldos de los empleados agrupados por turno.
Imprimir los gastos en sueldos de cada turno.

 */

package vector;
import java.util.Scanner;

public class Sueldos {
	private Double[] sueldosTurnoMa�ana;
	private Double[] sueldosTurnoTarde;

	public static void main(String[] args) {
		Sueldos s= new Sueldos();
		s.calculadorGastosEnSueldosPorTurno();
	}

	public void calculadorGastosEnSueldosPorTurno(){
		sueldosTurnoMa�ana= new Double[4];
		sueldosTurnoTarde= new Double[4];
		Double montoTM=(double) 0;
		Double montoTT=(double) 0;
		Double totalTM=(double) 0;
		Double totalTT=(double) 0;
		Integer indice1=0;
		Integer indice2=0;
		Integer cantidadEmpleados=0;
		Scanner teclado= new Scanner(System.in);
		Integer turno;
		
		while(cantidadEmpleados<8){
			  System.out.println("Ingrese el turno de empleado: 1) turno ma�ana 2) turno tarde\n");
			  turno= teclado.nextInt();
			switch(turno){
			    case 1: if(indice1==4){
		                    System.out.println("** Ya complet� los sueldos de los 4 empleados del turno tarde **\n");
		    	            break;}
			    	    System.out.println((indice1+1)+" empleado de 4");
			            System.out.println("Ingrese el monto del sueldo del empleado:");
			            montoTM= teclado.nextDouble();
			            sueldosTurnoMa�ana[indice1]=montoTM;
			            cantidadEmpleados++;
			            indice1++;
			            break;
			    case 2: if(indice2==4){
			               System.out.println("** Ya complet� los sueldos de los 4 empleados del turno tarde **\n");
			    	       break;}
			    	    System.out.println((indice2+1)+" empleado de 4");
			            System.out.println("Ingrese el monto del sueldo del empleado:");
			            montoTT= teclado.nextDouble();
			            sueldosTurnoTarde[indice2]=montoTT;
			            cantidadEmpleados++;
			            indice2++;			            
			            break;
			   default: System.out.println("No es un igreso v�lido");
			            break;
			   }
		    }
		System.out.println("-----------------------------------------------------\n");
		
		 for(int i=0; i<sueldosTurnoMa�ana.length;i++){
			    totalTM+= sueldosTurnoMa�ana[i];}
		 System.out.println("Monto de los sueldos del Turno Ma�ana= $" + totalTM);
		 
		 for(int i=0; i<sueldosTurnoTarde.length;i++){
			    totalTT+= sueldosTurnoTarde[i];}
		 System.out.println("Monto de los sueldos del Turno Tarde= $" + totalTT);
		
		teclado.close();		
	}
}
