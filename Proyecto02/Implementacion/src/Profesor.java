/** <p> Clase que modela la clase Profesor </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 15/11/2018
*/
public class Profesor{

	//Declaracion de la variable nombreProfesor.
	String nombreProfesor;
	//Declaracion de la variable claveAcceso.
	String claveAcceso;
	//Declaracion de la variable grupo.
	String grupo;

	/** Creacion del constructor del objeto Profesor.
	*	@param nombreProfesor define el nombre del profesor.
	*	@param claveAcceso define al claveAcceso del profesor.
	*	@param grupo define el grupo asignado al profesor.
	*/
	public Profesor(String nombreProfesor, String claveAcceso, String grupo){
		this.nombreProfesor = nombreProfesor;
		this.claveAcceso = claveAcceso;
		this.grupo = grupo;
	}

	/** Creacion del metodo getNombreProfesor. 
	*	@return regresa el nombre del profesor.
	*
	*/
	public String getNombreProfesor(){

		return nombreProfesor;
	}

	/** Creacion del metodo getClaveAcceso.
	*	@return regresa la clave de acceso del profesor.
	*
	*/
	public String getClaveAcceso(){

		return claveAcceso;
	}

	/**	Creacion del metodo getGrupo.
	*	@return regresa el grupo del profesor.
	*
	*/
	public String getGrupo(){

		return grupo;
	}

	/** Creacion del metodo setNombreProfesor.
	*	@param nombreProfesor modifca el nombre del profesor.
	*
	*/
	public void setNombreProfesor(String nombreProfesor){

		this.nombreProfesor = nombreProfesor;
	}

	/**	Creacion del metodo setClaveAcceso.
	*	@param claveAcceso modifica la clave de acceso del profesor.
	*
	*/
	public void setClaveAcceso(String claveAcceso){

		this.claveAcceso = claveAcceso;
	}

	/** Creacion del metodo setGrupo.
	*	@param grupo modifica el grupo asignado al profesor.
	*
	*/
	public void setGrupo(String grupo){

		this.grupo = grupo;
	}


	//Sobreescribe el metodo toString.
	@Override
    public String toString(){
        return (this.nombreProfesor + "  Grupo: " + grupo);
    }
}