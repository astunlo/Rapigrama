package Interface;
/**
 * 
 * @author Gast�n
 *
 */

public class TestSoftware {
	public static void main(String[] args) {
		Software myCam= new MiWebCam("Te Veo",2.0f, "GML SoftWare", 1234, true);
		  //Llamada m�todo de S�perclase
          myCam.copyRight();
          //Llamada a m�todos sobreescritos de S�perclase
             myCam.cargarRequerimientosDeSistema();
		     myCam.imprimir();
		     myCam.mostrarRequerimientos();
		     myCam.cargarNumeroDeRegistroPatente(5236);
		  
		  //Llamada a m�todos espec�ficos
		   //Se castea a Subclase
		     ((MiWebCam) myCam).encenderCam();
		     ((MiWebCam) myCam).encenderMicro();
		     ((MiWebCam) myCam).desconectarCam();
		     ((MiWebCam) myCam).desconectarMicro();
	}
}
