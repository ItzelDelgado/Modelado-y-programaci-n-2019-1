/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Clase para representar el objeto de las puertas. 
 * La clase implementa el único método de {@link Sistemai}, 
 * en este caso su actuación ante la notificación de la modificación del estado
 * de la alarma es imprimir un mensaje.
 */
public class Puertas implements Sistemai{


	/**
	 *Imprime un mensaje cuando las puertas se abren.
	 */

	@Override
	public void update(){

		System.out.println("Las puertas se han cerrado.");
	}

}