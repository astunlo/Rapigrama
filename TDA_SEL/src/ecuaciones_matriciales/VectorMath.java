/**
 * Universidad Nacional del Oeste
 * Programaci�n con Objetos II, comisi�n (7034) Turno Noche
 * 1er cuatrimestre 2016
 *                            "TP S.E.L."
 *                            
 * @author Gast�n M. L�pez y Eugenio Puente Perazzo
 *         GRUPO: 6.
 */

package ecuaciones_matriciales;
import java.util.Arrays;

public class VectorMath {
	private Integer dimensionVector;
	private Double[] vector;
	
	/**
	 * Constructor de VectorMath que crea objeto tipo Vector y lo inicializa.
	 * @param dimension
	 */
	public VectorMath(Integer dimension){
		this.setDimensionVector(dimension);
	    this.setVector(new Double[dimensionVector]);	
	    for(int i=0; i<vector.length; i++)
	    	vector[i]=0.0;
	}
	
	/**
	 * M�todo de carga de VectorMath
	 * @param cCoordenada
	 * @param cComponente
	 */
	public void cargarVectorArchivo(Integer cCoordenada, Double cComponente){
		vector[cCoordenada]=cComponente;
	}
	
	/**
	 * M�todo de impresi�n de VectorMath
	 */
	public void imprimirVector(){
		System.out.println("\nVector cargado: ");
		for(int i=0; i<vector.length; i++)
			System.out.println(vector[i] + " ");
	}	
	
	/**
	 * Getters y Setters
	 * @return
	 */
	public Integer getDimensionVector() {
		return dimensionVector;
	}
	public void setDimensionVector(Integer dimensionVector) {
		this.dimensionVector = dimensionVector;
	}
	public Double[] getVector() {
		return vector;
	}
	public void setVector(Double[] vector) {
		this.vector = vector;
	}

	@Override
	public String toString() {
		return "Vector = " + Arrays.toString(vector) + " ";
	}

	
}


