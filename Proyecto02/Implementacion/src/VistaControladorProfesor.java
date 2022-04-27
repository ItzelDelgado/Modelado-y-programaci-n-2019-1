/** <p> Clase que modela la vistaControladorProfesor.</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/
import java.util.Scanner;

public class VistaControladorProfesor{

	Scanner texto = new Scanner(System.in);

	public VistaControladorProfesor(){

	}

	/** Creacion del metodo vistaMenuProfe el cual muestra 
    *   las opcione de acciones por parte del usuario.
    *
    */
	public int vistaMenuProfe(){

		boolean condicion = true;
		int respuesta = 0;
		do{
			try{
				System.out.print("\033[H\033[2J");
   				System.out.flush();
   				System.out.println("\033[32m");
				System.out.println("Tipo de usuario *PROFESOR*");
				System.out.println("Selecciona la tarea que desees realizar");
				System.out.println("Actualizar contraseña (1)");
				System.out.println("Consultar lista de alumnos por grupo (2)");
				respuesta = texto.nextInt();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("\n"+"\n"+"Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;

	}

	/** Creacion del metodo vistaContraseña el cual muestra 
    *   la opcion para ingresar contraseña.
    *
    */
	public String vistaContraseña(){

		boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[32m");
				System.out.println("Ingresa tu contraseña.");
				System.out.println("Ejemplo: 41f2f4");
				respuesta = texto.next();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo vistaAntiguaContraseña el cual muestra 
    *   la contraseña antes de ser modificada.
    *
    */
	public String vistaAntiguaContraseña(){

		boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[32m");
				System.out.println("Ingresa tu contraseña actual.");
				System.out.println("Ejemplo: 41f2f4");
				respuesta = texto.next();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo vistaActualizarContraseña el cual muestra 
    *   la opcion para modificar la contraseña.
    *
    */
	public String vistaActualizarContraseña(){

		boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[32m");
				System.out.println("Ingresa tu nueva contraseña.");
				System.out.println("Ejemplo: 41f2f4");
				respuesta = texto.next();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo nuevaOperacion el cual da la opcion 
    *   paar hacer una nueva operacion.
    *
    */
	public int nuevaOperacion(){
		boolean condicion = true;
		int respuesta = 0;
		do{
			try{
				System.out.println("\033[32m");
				System.out.println("Deseas realizar otra operación?");
				System.out.println("Pulsa cualquier número para contunuar.");
				System.out.println("Pulsa 0 para cancelar.");
				respuesta = texto.nextInt();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}
}