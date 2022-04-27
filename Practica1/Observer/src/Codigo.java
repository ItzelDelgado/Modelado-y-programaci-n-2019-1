import java.util.Scanner;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Clase para representar el objeto del código. 
 * La clase implementa el único método de {@link Sistemai}, 
 * en este caso su actuación ante la notificación de la modificación del estado
 * de la alarma es tener como entrada por scanner el código que la desactiva.
 */

public class Codigo implements Sistemai{
	//Objeto de tipo scanner
	Scanner texto = new Scanner(System.in);
	//Variable para decir en que momento es correcto el código ingresado.
	boolean correcto;

	/**
	 * Imprime un mensaje para que igreses el código y desactives la alarma.
	 * Nos dice en que momento es correcto o no y hasta que ingreses el correcto
	 * la desativará.
	 */
	@Override
	public void update(){

		do{

			System.out.println("Ingresa el código de seguridad para desactivar la alarma (1234).\n");
			int codigo = texto.nextInt();
			if(codigo == 1234){
			System.out.println(" ");
			System.out.println("La alarma fue desactivada.");
			System.out.println("Las puertas se abrieron de nuevo.");
			System.out.println("Las cámaras ya no estan grabando.");
			System.out.println("El périmetro ha sido liberado.\n");
			correcto = true;
			} else {
				correcto = false;
				System.out.println(" ");
				System.out.println("El código fue incorrecto, intenta de nuevo.\n");
			} 

		}while(correcto != true);
	}

}