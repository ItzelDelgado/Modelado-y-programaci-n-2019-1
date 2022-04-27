/** <p> Clase que modela el ControladorAlumno</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

import java.util.ArrayList;
public class ControladorAlumno{

	public ControladorAlumno(){
	}
	//declaracion de la vista alumno.
	static VistaControladorAlumno vistaAlumno = new VistaControladorAlumno();

	/** Creacion del metodo menuAlumno el cual manda a llamar 
	*	a la vista y la realaciona con los metodos que usan 
	*	el modelo.
	*
	*/
	public void menuAlumno(){
		int repetir;

		do{

			int seleccion = vistaAlumno.vistaMenuAlumno();
			switch (seleccion){
				case 1:
					System.out.println("Seleccionaste consultar tu historial academico");
					consultarHistorial();
					break;
				case 2:
					System.out.println("Has decidido consultar tu promedio general.");
					consultarPromedioGeneral();
		
				 	break;
				case 3:
				 	System.out.println("Vas a consultar tu promedio bimestral.");
				 	consultarPromedioSemestral();
					
				break;
				case 4:
				 	System.out.println("Vas a consultar tus calificaciones de materias por año.");
					consultarMateriasAño();

				break;
				default:
				 	System.out.println("\n"+"\n"+"Entrada no valida.");
				break;
			}
				repetir = vistaAlumno.nuevaOperacion();
		}while(repetir != 0);
  	}

  	/**	Creacion del metodo consultarHistorial el cual imprime la base 
  	*	datos mostando unicamente la informacion del usuario actual.
  	*
  	*/
 	public static void consultarHistorial(){
 
  		String respuesta = vistaAlumno.vistaSeleccionGrupo();
  		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
  		listaGrupo = devolverBase(respuesta);
  		int pos = listaGrupo.buscaPosicion(vistaAlumno.vistaIngresaCuenta());

  		System.out.println(listaGrupo.getAlumno(pos));

  	}

  	/** Creacion del metodo consultarMateriasAño, este metodo
  	*	imprime la calificacion de las materias del alumno 
  	*	por año.
  	*/
    public static void consultarMateriasAño(){
  		String respuesta = vistaAlumno.vistaSeleccionGrupo();
  		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
  		listaGrupo = devolverBase(respuesta);
  		int pos = listaGrupo.buscaPosicion(vistaAlumno.vistaIngresaCuenta());
  		int añoSelec = vistaAlumno.vistaConsultaAño();

  		System.out.println(listaGrupo.getAlumno(pos).getHistorial().getAño(añoSelec-1));
  		System.out.println("Promedio general del año: " + listaGrupo.getAlumno(pos).getHistorial().getAño(añoSelec-1).getPromedioAño());
  	}

  	/** Creacion del metodo consultar PromedioGeneral el cual 	
  	*	tiene imprime el promedio general de un alumno.
  	*
  	*/
    public static void consultarPromedioGeneral(){
  		String respuesta = vistaAlumno.vistaSeleccionGrupo();
  		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
  		listaGrupo = devolverBase(respuesta);
  		int pos = listaGrupo.buscaPosicion(vistaAlumno.vistaIngresaCuenta());

  		System.out.println("Promedio:  " + listaGrupo.getAlumno(pos).getHistorial().getPromedioHistorial());

 	}

 	/** Creacion del metodo consultarPromedioSemestral el cual
 	*	imprime el promedo semestral de un alumno.
 	*
 	*/
  	public static void consultarPromedioSemestral(){
  		String respuesta = vistaAlumno.vistaSeleccionGrupo();
  		BaseDeDatosAlumnos listaGrupo = new BaseDeDatosAlumnos();
  		listaGrupo = devolverBase(respuesta);
  		int pos = listaGrupo.buscaPosicion(vistaAlumno.vistaIngresaCuenta());
  		int añoSelec = vistaAlumno.vistaConsultaAño();
  		int bimSelec = vistaAlumno.vistaConsultaBimestre();

  		System.out.println("Promedio del bimestre "+bimSelec + " del " + " grado "+ añoSelec + " : " +
  		 listaGrupo.getAlumno(pos).getHistorial().getAño(añoSelec-1).getBimestre(bimSelec-1).getPromedioBimestre());
  	}

  	/** Creacion del metodo devolverBase el cual tiene 
  	*	regresa la base de datos del grupo.
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
