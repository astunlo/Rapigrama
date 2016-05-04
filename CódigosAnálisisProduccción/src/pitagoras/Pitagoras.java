package pitagoras;

import java.util.Scanner;

public class Pitagoras {
	//variable de ingreso por teclado. Static para que la use toda la clase
    static Scanner entrada = new Scanner(System.in);
    //variables para ser cargadas con datos del usuario
    private Double a;
	private Double b;
	private Double h;

	public static void main(String[] args) {
		//Instanciaci�n de objeto de clase
        Pitagoras triangulo = new Pitagoras();
        //variable de continuidad del do-while
       	String respuesta;
    	//do-while
    	do{ 
             triangulo.pantallaInicialyCalculos();
             System.out.println("�Desea continuar calculando? (si/no)");
 	         respuesta = entrada.next();
 	      }while(respuesta.equals("si")||respuesta.equals("Si")||respuesta.equals("SI"));//fin de while
    	
    	System.out.println("��Gracias por usar el programa!!");
	}//fin de main

	//m�todo de c�lculos
	public void pantallaInicialyCalculos(){
	   	String imprime;	
		imprime = "*****************  Teorema de Pit�goras  *****************\n";
		imprime+= "Calcule la Hipotenusa, cateto A o cateto B de un tri�ngulo\n";
		imprime+= "----------------------------------------------------------\n";
		imprime+= "Ingrese la opci�n deseada:\n";
		imprime+= "1) Calcular la Hipotenusa\n";
		imprime+= "2) Calcular cateto A\n";
		imprime+= "3) Calcular cateto B\n";
		imprime+= "Su opci�n = ";		
		System.out.println(imprime);
		Integer o = entrada.nextInt();

		switch(o){
		case 1: System.out.println("Ingrese el valor del cateto A: ");
		        a = entrada.nextDouble();
		        System.out.println("Ingrese el valor del cateto B: ");
		        b = entrada.nextDouble();
		        h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		        System.out.println("El valor de la Hipotenusa es: " + h);
		        break;
		case 2: System.out.println("Ingrese el valor de la Hipotenusa: ");
		        h = entrada.nextDouble();
		        System.out.println("Ingrese el valor del cateto B: ");
		        b = entrada.nextDouble();
		        a = Math.sqrt(Math.pow(h, 2) - Math.pow(b, 2));
		        System.out.println("El valor del cateto A es: " + a);
		        break;
		case 3: System.out.println("Ingrese el valor de la Hipotenusa: ");
                h = entrada.nextDouble();
                System.out.println("Ingrese el valor del cateto A: ");
                a = entrada.nextDouble();
                b = Math.sqrt(Math.pow(h, 2) - Math.pow(a, 2));
                System.out.println("El valor del cateto B es: " + b);
                break;
		default: System.out.println("Valor incorrecto");
		        break;
		}//cierre del switch
	 }//fin de m�todo
}//fin de clase
