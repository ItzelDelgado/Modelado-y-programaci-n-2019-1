/** <p> Clase que modela el objeto Estudiante </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

public class Alumno{

	//Declaracion de la variable nombre del objeto estudiante.
	public String nombre;
	//Declaracion de la variable noCuenta del objeto estudiante
	public String noCuenta;
	//Declaracion de la variable Historial del objeto estudiante
	public Historial historial;

	/** Creacion del constructor del objeto estudiante.
    *   @param nombre define el nombre del estudiante.
    *   @param noCuenta define el numero de cuenta del estudiante.
    *   @param historial define el historial academico del estudiante.
    *
    */
	public Alumno(String nombre, String noCuenta, Historial historial){
		this.nombre = nombre;
		this.noCuenta = noCuenta;
		this.historial = historial;
	}

	/** Creacion del metodo getNombre.
    *   @return regresa el nombre del estudiante.
    *
    */
	public String getNombre(){
		return nombre;
	}

	/** Creacion del metodo getNoCuenta.
    *   @return regresa el noCuenta del estudiante.
    *
    */
	public String getNoCuenta(){
		return noCuenta;
	}

	/** Creacion del metodo getHistorial.
    *   @return regresa el Historial academico del estudiante.
    *
    */
	public Historial getHistorial(){
		return historial;
	}

	/** Creacion del metodo setNombre.
    *   @param nombre modifica el nombre del estudiante.
    *
    */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/** Creacion del metodo setNoCuenta.
    *   @param noCuenta modifica el noCuenta del estudiante.
    *
    */
	public void setNoCuenta(String noCuenta){
		this.noCuenta = noCuenta;
	}

	/** Creacion del metodo setHistorial.
    *   @param historial modifica el Historial academico del estudiante.
    *
    */
	public void setHistorial(Historial historial){
		this.historial = historial;
	}

	//Sobreescritura del metodo toString.
	@Override
    public String toString(){
        return ("Nombre del alumno : " + this.nombre+ "\n" +
         		"Numero de cuenta : " + this.noCuenta +"\n" +
         		"*Historial academico*" + "\n" +
         		this.historial);
    }

}