/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */

/**
 * Interfaz para iteradores de lista o estructura de datos que la vayan a implementar.
 * Un iterador se puede visualizar un apuntador a una posicion de la estructura.
 * Puede iniciar en una posicion cero y llegar hasta la 
 * posicion igual al tamaño de la estructura.
 */
public interface Iterator {
	
		/**
    * Nos dice si hay un elemento siguiente. El método debe regresar
    * <tt>true</tt>, excepto cuando el iterador esté en una posicion mayor al tamaño.
    * o las posicion nos apunte a un null.
    * @return <tt>true</tt> si el iterador tiene un elemento a su derecha,
    *         <tt>false</tt> en otro caso.
    */
    boolean hasNext();

  	/**
    * Regresa el elemento siguiente al iterador, y lo mueve a la derecha.
    * @return el elemento siguiente al iterador.
   	*/
  	Object next();
}
