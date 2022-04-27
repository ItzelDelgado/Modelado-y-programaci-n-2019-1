/** <p> Clase que modela la vistaControladorAlumno.</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/
import java.util.Scanner;

public class VistaControladorAlumno{

	Scanner texto = new Scanner(System.in);

	public VistaControladorAlumno(){

	}

	/** Creacion del metodo vistaSeleccionGrupo el cual muestra 
    *   las opcione de acciones por parte del usuario.
    *
    */
	public String vistaSeleccionGrupo(){

			boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[33m");
				System.out.println("Ingresa el grupo al que perteneces:");
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

	/** Creacion del metodo vistaMenuAlumno el cual muestra 
    *   las opcione de acciones por parte del usuario.
    *
    */
	public int vistaMenuAlumno(){

		
			boolean condicion = true;
		int respuesta = 0;
		do{
			try{
				System.out.print("\033[H\033[2J");
    			System.out.flush();
    			System.out.println("\033[33m");
				System.out.println("Tipo de usario *ALUMNO*");
				System.out.println("seleccina la tarea que deseea realizar");
				System.out.println("Consultar historial academico (1)");
				System.out.println("Consultar promedio general (2)");
				System.out.println("Consultar promedio bimestral (3)");
				System.out.println("Consultar calificaciones de materias por año (4)");
				respuesta = texto.nextInt();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
				System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo vistaIngresaCuenta el cual permite.
    *   buscar un alumno por cuenta
    *
    */
	public String vistaIngresaCuenta(){
			boolean condicion = true;
		String respuesta = "";
		do{
			try{
				System.out.println("\033[33m");
				System.out.println("Ingresa tu numero de cuenta:");
				System.out.println("Ejemplo: 1234 ");
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
				System.out.println("\033[33m");
				System.out.println("Deseas realizar otra operación?");
				System.out.println("Pulsa cualquier número para contunuar.");
				System.out.println("Pulsa 0 para cancelar.");
				respuesta = texto.nextInt();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("\n"+"\n"+"Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo vistaConsultaAño el cual muestra 
    *   la opcion para elegir el año de un alumno.
    *
    */
	public int vistaConsultaAño(){

			boolean condicion = true;
		int respuesta = 0;
		do{
			try{
				System.out.println("\033[33m");
				System.out.println("Ingresa el grado:");
				System.out.println("Ejemplo: 1 ");
				respuesta = texto.nextInt();
				condicion=false;

			}catch(Exception e){
				texto.nextLine();
			System.out.println("Entrada no válida, intentalo de nuevo.");
		}
	}while(condicion);

	return respuesta;
	}

	/** Creacion del metodo vistaConsultaBimestre el cual muestra 
    *   la opcion para elegir el bimestre que se va a consultar.
    *
    */
	public int vistaConsultaBimestre(){
					boolean condicion = true;
		int respuesta = 0;
		do{
			try{
				System.out.println("\033[33m");
				System.out.println("Ingresa el bimestre:");
				System.out.println("Ejemplo: 1 ");
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