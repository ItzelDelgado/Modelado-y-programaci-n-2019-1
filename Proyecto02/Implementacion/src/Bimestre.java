/** <p> Clase que modela el objeto Bimestre </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

public class Bimestre{

	//Declaracion de la variable bimId.
	public String bimId;
	//Declaracion de la variable español.
	public int español;
	//Declaracion de la variable matematicas.
	public int matematicas;
	//Declaracion de la variable cienciasNaturales.
	public int cienciasNaturales;
	//Declaracion de la variable cienciasSociales.
	public int cienciasSociales;
	//Declaracion de la variable educacionFisica.
	public int educacionFisica;
	//Declaracion de la variable ingles.
	public int ingles;

	/** Creacion del constructor del objeto Bimestre.
    *   @param bimId define el id del bimestre.
    *   @param español define la calificaion de español en el bimestre.
    *   @param matematicas define la calificacion de matematicas en el bimestre.
    *   @param cienciasNturales define la calificacion de cienciasNaturales en el bimestre.
    *   @param cienciasSociales define la calificacion de cienciasSociales en el bimestre.
    *   @param educacionFisica define la calificacion de educacionFisica en el bimestre.
    *   @param ingles define la calificacion de ingles en el bimestre.
    *
    */
	public Bimestre(String bimId,int español,int matematicas,int cienciasNaturales,
		            int cienciasSociales,int educacionFisica,int ingles){

		this.bimId = bimId;
		this.español = español;
		this.matematicas = matematicas;
		this.cienciasNaturales = cienciasNaturales;
		this.cienciasSociales = cienciasSociales;
		this.educacionFisica = educacionFisica;
		this.ingles = ingles;
	}

	/** Creacion del metodo getPromedioBimestre.
	*	@return regresa el promedio de todos las materias.
	*
	*/
	public double getPromedioBimestre(){

		return((español+matematicas+cienciasNaturales+cienciasSociales+educacionFisica+ingles)/6);
	}

	/** Creacion del metodo getBimId.
	*	@return regresa el id del bimestre.
	*
	*/
	public String getBimId(){
		return bimId;
	}

	/**	Creacion del metodo getEspañol.
	*	@return regresa la calificacion de la materia Español.
	*
	*/
	public int getEspañol(){
		return español;
	}

	/** Creacion del metodo getMatematicas.
    *   @return regresa la calificaion de la materia de matematicas.
    *
    */
	public int getMatematicas(){
		return matematicas;
	}

	/** Creacion del metodo getCienciasNaturales.
    *   @return regresa la calificaion de la materia de cienciasNaturales.
    *
    */
	public int getCienciasNaturales(){
		return cienciasNaturales;
	} 

	/** Creacion del metodo getCienciasSociales.
    *   @return regresa la calificaion de la materia de cienciasSociales.
    *
    */
	public int getCienciasSociales(){
		return cienciasSociales;
	}

	/** Creacion del metodo getEducacionFisica.
    *   @return regresa la calificaion de la materia de educacionFisica.
    *
    */
	public int getEducacionFisica(){
		return educacionFisica;
	} 

	/** Creacion del metodo getIngles.
    *   @return regresa la calificaion de la materia de ingles.
    *
    */
	public int getIngles(){
		return ingles; 
	}

	/** Creacion del metodo setBimId.
    *   @param bimId modifica el id del bimestre.
    *
    */
	public void setBimId(String bimId){
		this.bimId = bimId;
	}

	/** Creacion del metodo setEspañol.
    *   @param español modifica la calificacion de español.
    *
    */
	public void setEspañol(int español){
		this.español = español;
	}

	/** Creacion del metodo setMatematicas.
    *   @param matematicas modifica la calificacion de matematicas.
    *
    */
	public void setMatematicas(int matematicas){
		this.matematicas = matematicas;
	}

	/** Creacion del metodo setCienciasNaturales.
    *   @param cienciasNaturales modifica la calificacion de cienciasNaturales.
    *
    */
	public void setCienciasNaturales(int cienciasNaturales){
		this.cienciasNaturales = cienciasNaturales;
	} 

	/** Creacion del metodo setCienciasSociales.
    *   @param cienciasSociales modifica la calificacion de cienciasSociales.
    *
    */
	public void setCienciasSociales(int getCienciasSociales){
	  	this.cienciasSociales = cienciasSociales;
	}

	/** Creacion del metodo setEducacionFisica.
    *   @param educacionFisica modifica la calificacion de educacionFisica.
    *
    */
	public void setEducacionFisica(int educacionFisica){
		this.educacionFisica = educacionFisica;
	} 

	/** Creacion del metodo setIngles.
    *   @param ingles modifica la calificacion de ingles.
    *
    */
	public void setIngles(int ingles){
		this.ingles = ingles; 
	}

	//Sobreescritura del metodo toString.
	@Override
    public String toString(){
        return ("Bimestre: " + this.bimId + "\n" +
                "Español: " + this.español + "   Matematicas: " + this.matematicas + 
        	    "   Ciencias Naturales: " + this.cienciasNaturales + "   Ciencias Sociales: " + this.cienciasSociales +
        	    "   Educacion Fisica: " + this.educacionFisica + "   Ingles: " + this.ingles);
    }

}