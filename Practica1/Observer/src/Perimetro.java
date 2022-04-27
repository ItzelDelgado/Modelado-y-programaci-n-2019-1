/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Clase para representar el objeto del périmetro. 
 * La clase implementa el único método de {@link Sistemai}, 
 * en este caso su actuación ante la notificación de la modificación del estado
 * de la alarma es imprimir un mensaje.
 */
public class Perimetro implements Sistemai{

	/**
	 *Imprime un mensaje cuando el périmetro es definido.
	 */
	@Override
	public void update(){

		System.out.println("Se ha establecido el périmetro.");
	}

}