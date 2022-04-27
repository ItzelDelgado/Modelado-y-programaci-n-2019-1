/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Clase de tipo rey que hereda de Personaje, se trae consigo los metodos
 * y solo asignamos el arma con el que se inicializa el personaje, ademas de que tipo es.
 */

public class Rey extends Personaje {
  /**
   * Constructor del rey, con arma predefinida y asignando el valor a la variable 
   * de la clase padre (personaje), donde decimos de que tipo es el personaje.
   */
  public Rey(){
    //Metodos de la clase personaje
    super();
    //Arma predefinida por nosotros.
    arma = new Hacha();
    personaje = "Tienes un rey. \n";
  }
   
    
}
