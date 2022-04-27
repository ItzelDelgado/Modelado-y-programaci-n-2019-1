/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */
/** Clase de tipo interface que crea un iterador para 
  * recorrer la estructura de datos. 
	*/

public interface Iterator {
    /**
    	*@return un valor de tipo boolean que te devuelve 
    	* true si hay sifuiente o false si no hay.
    	*/
    boolean hasNext();
    
    /**
     *@return clase que te devuelve el objeto siguiente guardado en la estructura.
     */ 
    Object next();
}
