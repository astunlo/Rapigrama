package liquidadorDeSueldos;

public class TestLiquidarSueldo {

	public static void main(String[] args) {
		EmpleadoConHsExtras Gast�n= new EmpleadoConHsExtras("Gast�n","L�pez" , 25638349);
        System.out.println(Gast�n);
		Gast�n.cargarHorasTrabajadas();
        Gast�n.liquidarSueldo();
        }
}
