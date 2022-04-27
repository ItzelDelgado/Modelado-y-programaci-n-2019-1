/** <p> Clase que modela el ControladorProfesor</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

import java.util.ArrayList;
import java.util.Scanner;
public class ControladorProfesor{

public ControladorProfesor(){
	}

	Scanner texto = new Scanner(System.in);
	static VistaControladorProfesor vistaProfesor = new VistaControladorProfesor();

	/** Creacion del metodo menuProfesor el cual manda a llamar 
	*	a la vista y la realaciona con los metodos que usan 
	*	el modelo.
	*
	*/
	public void menuProfesor(){
		int repetir;

		do{

			int seleccion = vistaProfesor.vistaMenuProfe();
			switch (seleccion){
				case 1:
					System.out.println("Seleccionaste actualizar tu contraseña.");
					actualizarContraseña();

					break;
				case 2:
					System.out.println("Has decidido consultar la lista de alumnos de tu grupo.");
					consultargrupo();
				 	break;
				default:
				 	System.out.println("\n"+"\n"+"Entrada no valida.");
				break;
			}
			repetir = vistaProfesor.nuevaOperacion();

		}while(repetir != 0);
  	}

  	/** Creacion del metodo actualizarContraseña el cual realiza 
  	*	el cambio de contraseña de un profesor.
  	*
  	*/
  	public static void actualizarContraseña(){

  		String respuesta = vistaProfesor.vistaAntiguaContraseña();
  		BaseDeDatosProfesores listaProfes = new BaseDeDatosProfesores();
  		listaProfes.guarda("Profesores.xml");
  		int posicion = listaProfes.buscaPosicion(respuesta);
  		String nuevaCon = vistaProfesor.vistaActualizarContraseña();
  		listaProfes.getProfesor(posicion).setClaveAcceso(nuevaCon);
  		System.out.println(listaProfes.getProfesor(posicion) + " tu contraseña actual es: " + listaProfes.getProfesor(posicion).getClaveAcceso());
  		listaProfes.carga("Profesores.xml");
  	}

  	/**	Creacion del metodo consultargrupo el cual imprime
  	*	la base de datos del grupo de dicho profesor.
  	*
  	*/
  	public static void consultargrupo(){
  		String respuesta = vistaProfesor.vistaContraseña();
  		BaseDeDatosProfesores listaProfes = new BaseDeDatosProfesores();
  		listaProfes.guarda("Profesores.xml");
  		int posicion = listaProfes.buscaPosicion(respuesta);
  		String grup = listaProfes.getProfesor(posicion).getGrupo();
  		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
  		listaGrupo.guarda(grup+".xml");
  		listaGrupo.imprimir();
	}

}