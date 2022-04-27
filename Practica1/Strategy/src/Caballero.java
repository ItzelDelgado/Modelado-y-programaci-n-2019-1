/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */
/**
 * Clase de tipo caballero que hereda de Personaje, se trae consigo los metodos
 * y solo asignamos el arma con el que se inicializa el personaje, ademas de que tipo es.
 */

public class Caballero extends Personaje {

	/**
   * Constructor del caballero, con arma predefinida y asignando el valor a la variable 
   * de la clase padre (personaje), donde decimos de que tipo es el personaje.
   */
    
  public Caballero(){
  	//Metodos de la clase personaje
  	super();
		//Arma predefinida por nosotros. 
		arma = new Espada();
    personaje = "Tu personaje es un caballero. ";
  }
 
}
