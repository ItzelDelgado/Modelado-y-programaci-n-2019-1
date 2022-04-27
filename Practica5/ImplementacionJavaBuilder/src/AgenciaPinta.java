/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */
import java.util.Scanner;

/**Clase que representa la sucursal donde se realizan la accion de pintar el auto.
 * Se encarga de hacer la interaccion con el usuario para que elija el tipo de pintura 
 * que su auto tendra
 */
public class AgenciaPinta{

	/**Metodo que pinta al automovil segun la eleccion que el cliente pida.
	* @param el Automovil que va a ser pintado.
	* @return el Automovil modificado.
	*/
	public Automovil pintar(Automovil automovil){
		System.out.println("Que tipo de pintura desea?");
		System.out.println("Mate (1)");
		System.out.println("Metalica(2)");
		Scanner texto = new Scanner(System.in);
		int opcion = texto.nextInt();
		if(opcion == 1){
			automovil.setPintura("Su auto ha sido pintado con un color Mate. :3\n");
		} else{
			automovil.setPintura("Su auto ha sido pintado con un color Metalico. :3\n");
		}
		return automovil;
	}

}