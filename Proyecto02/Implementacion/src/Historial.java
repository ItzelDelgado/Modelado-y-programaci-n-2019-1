/** <p> Clase que modela el objeto Historial </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
*/

import java.util.ArrayList;

public class Historial{

	//Declaracion de la variable numAños de la clase Historial.
	int numAños;
	//Declaracion de la lista años de la clase Historial.
	ArrayList<Año> años;

	/**	Creacion del constructor de Historial.
	*	@param numAños define el numero de años totales.
	*	@param Años define la lista de años.
	*
	*/
	public Historial(int numAños,ArrayList<Año> años){
		this.numAños = numAños;
		this.años = años;
	}

	/**	Creacion del metodo getNumAños.
	*	@return regresa el numero de años.
	*
	*/
	public int getNumAños(){
		return numAños;
	}

	/**	Creacion del metodo getTamaño.
	*	@return regresa el tamaño de la lista de años.
	*
	*/
	public int getTamaño(){
		return años.size();

	}

	/**	Creacion del metodo getPromedioHistorial.
	*	@return regresa la suma de los promedios de todos los años.
	*
	*/
	public double getPromedioHistorial(){
		double suma = 0;
		for(int i =0 ; i < numAños ; i++){
			 suma = suma + años.get(i).getPromedioAño();
		}
		return suma/numAños;
	}

	/**	Creacion del metodo getAños.
	*	@return regresa la lista de años.
	*
	*/
	public ArrayList<Año> getAños(){
		return años;
	}

	/**	Creacion del metodo getAño.
	*	@return regresa un año en especifico.
	*
	*/
	public Año getAño(int i){

		return años.get(i);
	}

	/** Creacion del metodo setNumAños.
	*	@param numAños modifica el numero de años.
	*
	*/
	public void setNumAños(int numAños){
		this.numAños = numAños;
	}

	/** Creacion del metodo setAños.
	*	@param años modifica la lista de años.
	*
	*/
	public void setAños(ArrayList<Año> años){
		this.años = años;
	}

	//Sobreescribe el metodo toString.
	@Override
    public String toString(){
        return ("-Años-" +"\n" + this.años);
    }
}