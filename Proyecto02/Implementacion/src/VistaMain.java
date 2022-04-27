/** <p> Clase que modela la VistaMaia </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

import java.util.Scanner;

public class VistaMain{
	
	Scanner texto = new Scanner(System.in);

	public VistaMain(){
	}

	/** Creacion del metodo menuPrincipal el cual imprime un menu.
	*	@return regresa una respuesta entera.
	*
	*/
	public int menuPrincipal(){

		boolean condicion = true;
		int respuesta = 0;
		do{
			try{
		System.out.print("\033[H\033[2J");
   		System.out.flush();
 		System.out.println("\033[36m");
		System.out.println("ESCUELA PRIMARIA ***AHAU KIN***");
		System.out.println("Selecciona que tipo de usuario eres.");
		System.out.println("Administrador....(1)");
		System.out.println("Alumno...........(2)");
		System.out.println("Profesor.........(3)");
		respuesta = texto.nextInt();
		condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("\n"+"\n"+"Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;

	}

	/** Creacion del metodo administradorClave el cual 
	*	imprime solicita la autentificacion del administrador.
	*	@return regresa una respuesta entera.
	*/
	public int administradorClave(){
			boolean condicion = true;
		int respuesta = 0;
		do{
			try{

		System.out.println("Ingresa la clave del administrador.");
		System.out.println("(Se encuentra en el pdf)");
		respuesta = texto.nextInt();
		condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("\n"+"\n"+"Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}
}