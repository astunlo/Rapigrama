package Interface;
/**
 * 
 * @author Gastón
 *
 */

import java.util.Scanner;

public interface Programable {
	static Scanner entrada=new Scanner(System.in);
    
    void cargarRequerimientosDeSistema();
}
