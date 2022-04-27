/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase Cotiza que crea una cotizacion del usuario. 
 */
public class Cotiza{

	/*El String con el tipo de seguro que solicita el usuario*/
	String tipoSeguro;
	/*EL String con la marca del auto del usuario*/
	String marca;
	/*El String con el model del auto del usuario*/
	String modelo;
	/*El int con el año del auto del usuario*/
	int anio;

	/*Contructor de una cotizacion del usuario con los datos*/
	public Cotiza(String tipoSeguro, String marca, String modelo, int anio){

		this.tipoSeguro = tipoSeguro;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;

	}

	/** 
	 * Metodo que nos devuelve el username.
	 * @return un string con el tipo de seguro que el usuario desea.
	 */
	public String getTipoSeguro(){
		return tipoSeguro;
	}


	/** 
	 * @param un string con el tipo de seguro que el usuario desea.
	 */
	public void setTipoSeguro(String tipoSeguro){
		this.tipoSeguro = tipoSeguro;
	}

	/** 
	 * Metodo que nos devuelve la marca del auto.
	 * @return un string con la marca.
	 */
	public String getMarca(){
		return marca;
	}

	/** 
	 * @param un string con la marca del auto.
	 */
	public void setMarca(String marca){
		this.marca = marca;
	}

	/** 
	 * Metodo que nos devuelve el modelo del auto.
	 * @return un string con el modelo.
	 */
	public String getModelo(){
		return modelo;
	}

	/** 
	 * @param un string con el modelo del auto del usuario.
	 */
	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	/** 
	 * Metodo que nos devuelve el año del auto.
	 * @return un int con el año del auto.
	 */
	public int getAnio(){
		return anio;
	}


	/** 
	 * @param un int con el año del auto del usuario.
	 */
	public void setAnio(int anio){
		this.anio = anio;
	}

	/**
	*Sobrecarga del metodo toString que imprime una cotizacion
	*/
	@Override
  public String toString(){
        return ("Tipo de seguro: " + this.tipoSeguro + 
        				"\n Para su auto con las siguientes caracteristicas: " +
        				"\n Marca: " + this.marca + 
        				"\n Modelo: " + modelo +
        				"\n Año: " + anio);
  }

}

