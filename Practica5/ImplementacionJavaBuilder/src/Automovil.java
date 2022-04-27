/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */

/** Clase que construye un objeto de tipo automovil.
	* Modela un objeto con tipo, numero de sirie y pintura.
  **/
public class Automovil{
	/*Cadena con la descripcion del automovil*/
	String tipo;
	/*Cadena con el numero de serie del automovil*/
	String numeroSerie;
	/*Cadena con el tipo de pintura del automovil*/
	String pintura;

	public Automovil(){
	tipo = "General";
	numeroSerie = "Sin numero";
	pintura = "SIn puntura";

	}


  /** Metodo que modifica la descripción del automovil
	* @param un String con la cadena que describe al auto.
	*/
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	/**Metodo que retorna el tipo de auto
	*@return String con la cadena
	*/
	public String getTipo(){
		return tipo;
	}

	/** Metodo que modifica la el numero de serie identificador del automovil
	* @param un String numero de serie del auto.
	*/
	public void setNumeroSerie(String numeroSerie){
		this.numeroSerie = numeroSerie;
	}

	/**Metodo que retorna el tipo de auto
	*@return String con el numero de serie
	*/
	public String getNumeroSerie(){
		return numeroSerie;
	}

	/** Metodo que modifica la pintura del automovil
	* @param un String el tipo de pintura que tiene el auto.
	*/
	public void setPintura(String pintura){
		this.pintura = pintura;
	}

	/**Metodo que retorna el tipo de pintura
	*@return String con el tipo de pintura.
	*/
	public String getPintura(){
		return pintura;
	}

	/**Metodo para imprimir las caracteristicas del auto.
	*Nos ayuda a imprimir el objeto.
	*@return String la cadena con la descripcion de un auto.
	*/
	@Override 
	public String toString(){

		return "Tu automovil es: " + getTipo() + "\n" +
						"Con el numero de serie: " + getNumeroSerie() + "\n" +
						"y " + getPintura();

	}

	
}