/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase Cancela que contiene una cancelacion del usuario. 
 */
public class Cancela{
	/*El String con el nombre del usuario*/
  String nombre;
  /*El String con el motivo de cancelacion del usuario*/
	String motivo;

	/*Contructor de la cancelacion*/
	public Cancela(String nombre, String motivo){
		this.nombre = nombre;
		this.motivo = motivo;
	}

	/** 
   * Metodo que nos devuelve el nombre del usuario.
   * @return un string con el nombre del usuario.
   */
	public String getNombre(){
		return nombre;
	}

	/** 
   * @param un string con el nombre usuario.
   */
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/** 
   * Metodo que nos devuelve el motivo de la cancelacion por parte del usuario.
   * @return un string con el nombre del usuario.
   */	
	public String getMotivo(){
		return motivo;
	}

	/** 
  * @param un string con el motivo de la cancelacion del contrato.
  */
	public void setMotivo(String motivo){
		this.motivo = motivo;
	}

	/**
	*Sobrecarga del metodo toString que imprime una cancelación.
	*/
	@Override
  public String toString(){
        return ("Nombre del cliente: " + this.nombre + 
        				"\n Motivo: " + motivo);
  }

}
