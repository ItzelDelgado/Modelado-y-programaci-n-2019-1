/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Clase para representa las camaras. 
 * La clase implementa el único método de {@link Sistemai}, 
 * en este caso su actuación ante la notificación de la modificación del estado
 * de la alarma es mandar un mensaje.
 */



public class Camaras implements Sistemai{
	//Metodo que imprime el mensaje cuando las camaras son notificadas.
	@Override
	public void update(){

		System.out.println("Las cámaras han empezado a grabar.");
	}

}