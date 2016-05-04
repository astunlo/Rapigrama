package herencia_polimorfismo;
/**
 * @author Gast�n
 * Modele una Empresa con empleados. Una empresa conoce a todos sus empleados. Los empleados pueden
ser de planta permanente o temporaria, adem�s hay gerentes, que tambi�n son empleados de planta
permanente, pero siguen un r�gimen salarial particular.
Cuando un empleado es de planta permanente cobra la cantidad de horas trabajadas por $30, m�s
antig�edad ($10 por a�o de antig�edad), m�s salario familiar. Cuando es de planta temporaria, no cobra
antig�edad y cobra la cantidad de horas trabajadas por $20, m�s salario familiar. El salario familiar es $20
por cada hijo, los empleados casados adem�s cobran $10 por su esposa/o.
Un gerente cobra de manera similar a un empleado de planta permanente pero su hora trabajada vale $40,
por antig�edad se le pagan $15 por a�o, mientras que el salario familiar es el mismo que el de los
empleados de planta permanente y temporal.

Defina e implemente el mensaje montoTotal() en la clase Empresa, que retorna el monto total que la
empresa debe pagar en concepto de sueldos a sus empleados.
Realice la implementaci�n del sistema completo en Java.
Provea una clase TestEmpresa para instanciar y testear su sistema. En el m�todo main de esa clase cree el
siguiente escenario y env�e a la empresa el mensaje montoTotal() para obtener la liquidaci�n total.
� Una empresa, con el CUIT y Raz�n Social que desee, y con los cuatro empleados que se describen a
continuaci�n.
� Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa y sin hijos.
� Un empleado de Planta Permanente (que no sea gerente) con 80 horas trabajadas, con esposa, 2 hijos y 6
a�os de antig�edad.
� Un empleado de Planta Permanente (que no sea gerente) con 160 horas trabajadas, sin esposa, sin hijos y
con 4 a�os de antig�edad.
� Un Gerente con 160 horas trabajadas, con esposa, un hijo y 10 a�os de antig�edad
 *
 */

interface Pagable {
	Double SALARIOHIJO=20.0;
	Double SALARIOESPOSA=10.0;
	
    void cobrarSalario();
    Double cobrarMontoAntig�edad();
    Double cobrarSalarioFamiliar();
	
}
