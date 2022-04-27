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
public class Troll extends Personaje {
     
	public Troll(){
  	//Metodos de la clase personaje
  	super();
  	//Arma predefinida por nosotros.
    arma = new Hacha();
    personaje = "Tu personaje es un troll. \n";
  }
    
    
}
