package herencia_programa;
/**
 * 
 * @author Gast�n
 *
 */

public class TestSoftware {

	public static void main(String[] args) {
		MiWebCam myCam= new MiWebCam("Te Veo",2.0f, "GML SoftWare", 1234, true);
		Software sftw= myCam;
          //Llamada m�todo de S�perclase
          sftw.copyRight();
          //Llamada a m�todos sobreescritos Class MiWebCam
		  myCam.cargarRequerimientosDeSistema();
		  myCam.imprimir();
		  myCam.mostrarRequerimientos();
		  myCam.cargarNumeroDeRegistroPatente(5236);
		  //Llamada a m�todos espec�ficos
		  myCam.encenderCam();
		  myCam.encenderMicro();
		  myCam.desconectarCam();
		  myCam.desconectarMicro();
	}
}
