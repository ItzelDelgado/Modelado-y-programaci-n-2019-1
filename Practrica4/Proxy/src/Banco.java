/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase principal del Banco.
 */
public class Banco{

	public static void main(String [] args){
		    /*Ingresamos el numero de cuenta y la cantidad a solicitar*/
		    Servidor cajero = new Sistema(123456,3000);
		    /*Cuando le decimos que si hay dinero*/
		    cajero.solicitud("SI");
		    /*Cuando le decimos que no hay dinero*/
		    cajero.solicitud("NO");
	}
}
