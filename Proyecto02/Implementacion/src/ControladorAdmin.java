/** <p> Clase que modela el ControladorAdmin</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorAdmin{


	public ControladorAdmin(){
	}

	Scanner texto = new Scanner(System.in);
	static VistaControladorAdmin vistaAdmin = new VistaControladorAdmin();

	/** Creacion del metodo menuAdmin el cual manda a llamar 
	*	a la vista y la realaciona con los metodos que usan 
	*	el modelo.
	*
	*/
	public void menuAdmin(){
		int repetir;

		do{

			int seleccion = vistaAdmin.vistaMenuAdmin();
			switch (seleccion){
				case 1:
					System.out.println("Seleccionaste consultar lista de alumnos por grupo con su respectivo profesor.");
					consultargrupo();
					break;
				case 2:
					System.out.println("Has decidido consultar lista  de profesores.");
					BaseDeDatosProfesores baseProfes = new BaseDeDatosProfesores();
					baseProfes.guarda("Profesores.xml");
					baseProfes.imprimir();
				 	break;
				case 3:
					System.out.println("Has elegido graduar un alumno.");
					graduarAlumno();
					
					break;
				case 4:
					System.out.println("Vas a inscribir un alumno.");
					inscribirAlumno();
					break;
				case 5:
					System.out.println("Tu selección hasido dar de baja a un alumno.");
					darDeBajaAlumno();
					break;
				default:
				 	System.out.println("\n"+"\n"+"Entrada no valida.");
					break;
			}
			repetir = vistaAdmin.nuevaOperacion();
		}while(repetir != 0);
	}

	/** Creacion del metodo consultagrupo el cual, imprime la lista 
	*	de alumnos del grupo solicitado.
	*
	*/
  	public static void consultargrupo(){
		boolean intento;
		String respuesta = vistaAdmin.vistaSeleccionGrupo();
		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
		listaGrupo = devolverBase(respuesta);
		listaGrupo.imprimir();
  	}

  	/** Creacion del metodo graduarAlumno, el cual elimina un 
  	*	alumno de la base de datos, buscado por su numero de 
  	*	cuenta.
  	*/
  	public static void graduarAlumno(){

  		String respuesta = vistaAdmin.vistaSeleccionGrupo();
		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
		listaGrupo = devolverBase(respuesta);
		listaGrupo.imprimir();
		System.out.println("Que alumno vas a graduar?");
		System.out.println("Ingresa:");
		String cuenta = vistaAdmin.daCuenta();
		listaGrupo.eliminaPorNumCuenta(cuenta);
		System.out.println("El alumno se ha graduado!!!!");
		listaGrupo.carga(respuesta+".xml");
 	}

 	/** Creacion del metodo inscribirAlumno el cual registra un 
 	*	alumno a la base de datos, lo hace con sus recpectivos datos
 	*	de registro de alumno.
 	*/
  	public static void inscribirAlumno(){

		String respuesta = vistaAdmin.vistaSeleccionGrupo();
		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
		listaGrupo = devolverBase(respuesta);
		String nombre = vistaAdmin.daNombre();
		String nCuenta = vistaAdmin.daCuenta();
		Bimestre bim=new Bimestre("1",0,0,0,0,0,0);
		ArrayList<Bimestre> bimestres = new ArrayList<Bimestre>();
		bimestres.add(bim);
		Año año = new Año(respuesta,1,bimestres);
		ArrayList<Año> años = new ArrayList<Año>();
		años.add(año);
		Historial historial = new Historial(1,años);
		Alumno nuevo = new Alumno(nombre,nCuenta,historial);
		System.out.println("El alumno ha sido inscrito.");
		listaGrupo.agrega(nuevo);
		listaGrupo.carga(respuesta+".xml");
		listaGrupo.imprimir();
  	}	

  	/** Creacion del metodo darDeBajaAlumno el cual se encarga de 
  	*	eliminar un alumno asi como todos sus registros e historial 
  	*	de la base de datos.
  	*/
 	public static void darDeBajaAlumno(){

  		String respuesta = vistaAdmin.vistaSeleccionGrupo();
  		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
  		listaGrupo = devolverBase(respuesta);
  		listaGrupo.imprimir();
  		System.out.println("Que alumno vas a graduar?");
  		System.out.println("Ingresa:");
  		String cuenta = vistaAdmin.daCuenta();
  		listaGrupo.eliminaPorNumCuenta(cuenta);
  		System.out.println("El alumno fue dado de baja de la institución.");
  		listaGrupo.carga(respuesta+".xml");
  	}	

  	/** Creacion del metodo devolverBase el cual se encarga de devolver 
  	*	la base de datos del xml ingresado.
  	*
  	*/
 	public static BaseDeDatosAlumnos devolverBase(String grupo){

  		BaseDeDatosAlumnos baseDeDatos = new BaseDeDatosAlumnos();
  		boolean intento = true;
  	do{
  		intento = true;
	  	if(grupo.equals("1A")||grupo.equals("1B")||grupo.equals("1C")||
	  		 grupo.equals("2A")||grupo.equals("2B")||grupo.equals("2C")||
	  		 grupo.equals("3A")||grupo.equals("3B")||grupo.equals("3C")||
	  		 grupo.equals("4A")||grupo.equals("4B")||grupo.equals("4C")||
	  		 grupo.equals("5A")||grupo.equals("5B")||grupo.equals("5C")||
	  		 grupo.equals("6A")||grupo.equals("6B")||grupo.equals("6C")){

	  		baseDeDatos.guarda(grupo+".xml");
	  		intento = true;
	  	}else{
	  		System.out.println("Ingresaste el nombre del grupo incorrecto, intenta escribirlo de nuevo.");
	  			intento = false;
	  	}

	  }while(intento!=true);

	  return baseDeDatos;
  }

}