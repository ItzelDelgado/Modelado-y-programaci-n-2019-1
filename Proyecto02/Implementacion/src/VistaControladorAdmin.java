/** <p> Clase que modela la vistaControladorAdmin.</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/
import java.util.Scanner;
public class VistaControladorAdmin{

	Scanner texto = new Scanner(System.in);

	public VistaControladorAdmin(){

	}

	/** Creacion del metodo vistaMenuAdmin el cual muestra 
    *   las opcione de acciones por parte del usuario.
    *
    */
	public int vistaMenuAdmin(){
		boolean condicion = true;
		int respuesta = 0;
		do{
			try{
		System.out.println("\033[34m");
		System.out.println("Tipo de usuario *ADMINISTRADOR*");
		System.out.println("Selecciona la tarea que desees realizar");
		System.out.println("Consultar lista de alumnos por grupo con su respectivo profesor (1)");
		System.out.println("Consultar lista  de profesores (2)");
		System.out.println("Graduar un alumno (3)");
		System.out.println("Inscribir un alumno (4)");
		System.out.println("Dar de baja un alumno (5)");

		respuesta = texto.nextInt();
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
				System.out.println("\033[34m");
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

	/** Creacion del metodo vistaSeleccionGrupo el cual muestra 
    *   la opcion para elegir el grupo al cual se va a modificar.
    *
    */
	public String vistaSeleccionGrupo(){
		boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[34m");
				System.out.println("Ingresa el grupo:");
				System.out.println("Ejemplo: 4A ");
			 	respuesta = texto.next();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	
	} 

	/** Creacion del metodo vistaSacaAlumno el cual 
	*   da la opcion para elegir un alumno mediante su id.
    *
    */
	public String vistaSacaAlumno(){

			boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[34m");
				System.out.println("Ingresa el Id del alumno");
		 		respuesta = texto.next();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;

}

	/** Creacion del metodo daNombre el cual 
	*   regresa a un alumno buscado por nombre.
    *
    */
	public String daNombre(){
		System.out.println("\033[34m");
		System.out.println("Nombre del estudiante");
		String respuesta = texto.next();
		return respuesta;
	}
	
	/** Creacion del metodo daCuenta el cual 
	*   regresa a un alumno buscado por id.
    *
    */
	public String daCuenta(){

		boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[34m");
				System.out.println("Ingresa el numero de cuenta:");
			 	respuesta = texto.next();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo daNumAños el cual 
	*   regresa el año actual del alumno.
    *
    */
	public int daNumAños(){
		System.out.println("\033[34m");
		System.out.println("Año actual de estudios");
		int respuesta = texto.nextInt();
		return respuesta;
	}

	/** Creacion del metodo daGrado el cual 
	*   regresa el grado actual del alumno.
    *
    */
	public String daGrado(){
		System.out.println("\033[34m");
		System.out.println("Que grado deseas calificar");
		String respuesta = texto.next();
		return respuesta;
	}

	/** Creacion del metodo daBimestres el cual 
	*   regresa los bimestres del alumno.
    *
    */
	public int daBimestres(){
		System.out.println("\033[34m");
		System.out.println("Ingresa el numero de bimestres");
		int respuesta = texto.nextInt();
		return respuesta;
	} 

	/** Creacion del metodo daBimestre el cual 
	*   regresa el bimestre actual del alumno.
    *
    */
	public String daBimestre(){
		System.out.println("\033[34m");
		System.out.println("¿A que bimestre daras calificacion?");
		String respuesta = texto.next();
		return respuesta;
	}


}