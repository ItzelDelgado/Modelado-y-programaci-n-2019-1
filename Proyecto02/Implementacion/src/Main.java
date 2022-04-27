/** <p> Clase que modela la clase principal </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

public class Main{

	
	public static void main(String[] args) {

	 	VistaMain vistaMain = new VistaMain();
		int seleccion = vistaMain.menuPrincipal();
		switch(seleccion){
			case 1:
				int clave = vistaMain.administradorClave();
				if(clave == 4444){
				ControladorAdmin controladorAdministrador = new ControladorAdmin();
				controladorAdministrador.menuAdmin();
				}else{
					System.out.println("La clave del administrador es incorrecta.");
					System.out.println("No puede acceder.");
				}
					break;
				case 2:
					ControladorAlumno controladorAlumno = new ControladorAlumno();
					controladorAlumno.menuAlumno();
					break;
				case 3:
					ControladorProfesor controladorProfesor = new ControladorProfesor();
					controladorProfesor.menuProfesor();
					break;
				default:
					System.out.println("Opcion incorrecta.");
					break;
		}
	}
}