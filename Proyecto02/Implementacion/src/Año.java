/** <p> Clase que modela el objeto Año </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 15/11/2018
*/

import java.util.ArrayList;

public class Año{

	//Declaracion de la variale grado del año.
	public String grado;
	//Declaracion de la variable numBim del año.
	public int numBim;
	//Declaracion de la varable bimestres.
	public ArrayList<Bimestre> bimestres;

	/**	Creacion del constructor de Año.
	*	@param grado define el grado del año.
	*	@param numBim define el numBim del año.
	*	@param bimestres define los bimestres del año.
	*/
	public Año(String grado,int numBim, ArrayList<Bimestre> bimestres){

		this.grado = grado;
		this.numBim = numBim;
		this.bimestres = bimestres;
		
	}

	/**	Creacion del metodo getPromedioAño, el cual regresa
	*	el promedio de la suma de todos los bimestres del alumno.
	*
	*/
	public double getPromedioAño(){
		double suma = 0;
		for(int i =0 ; i < numBim ; i++){
			 suma = suma + bimestres.get(i).getPromedioBimestre();
		}
		return suma/numBim;
	}

	/**	Creacion del metodo getGrado.
	*	@return regresa el grado escolar.
	*
	*/
	public String getGrado(){
		return grado;
	}

	/** Creacion del metodo getNumBim.
	*	@return regresa el numBim totales.
	*
	*/
	public int getNumBim(){
		return numBim;
	} 

	/** Creacion del metodo getBimestres.
	*	@return regresa una lista de bimestres.
	*
	*/
	public ArrayList<Bimestre> getBimestres(){
		return bimestres;
	}

	/** Creacion del metodo getTamaño.
	*	@return regresa el tamaño de los bimestres.
	*
	*/
	public int getTamaño(){
		return bimestres.size();
	}

	/** Creacion del metodo getBimestre.
	*	@return regresa un bimestre.
	*
	*/
	public Bimestre getBimestre(int i){

		return bimestres.get(i);
	}

	/** Creacion del metodo setGrado.
	*	@param grado modifica el grado escolar.
	*
	*/
	public void setGrado(String grado){
		this.grado = grado;
	}

	/** Creacion del metodo setNumBim.
	*	@param numBim modifica el numBim.
	*
	*/
	public void setNumBim(int numBim){
		this.numBim = numBim;

	}

	/** Creacion del metodo setBimestres.
	*	@param bimestres modifica los bimestres.
	*
	*/
	public void setBimestres(ArrayList<Bimestre> bimestres){
		this.bimestres = bimestres;
	}

	//sobreescritura del metodo toString.
	@Override
    public String toString(){
        return ("Grado: " + this.grado +"\n"
        	  + "Bimestres : " + this.bimestres);
    }
}