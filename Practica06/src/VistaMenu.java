/** <p> Clase que modela la vista.</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

import java.util.Scanner;

public class VistaMenu{

	Scanner	texto = new Scanner(System.in);
    
    /** Creacion del metodo respuestasMenu el cual muestra 
    *   las opcione de acciones por parte del usuario.
    *
    */
	public int respuestasMenu(){
		
		System.out.println("Que deseas realizar");
		System.out.println("Compra: (1) ");
		System.out.println("Devolucion: (2)");

		int respuesta = texto.nextInt();

		return respuesta;
	}
    
    /** Creacion del metodo devolucionIDCliente el cual 
    *   regresa la respuesta del id del cliente ingresado.
    *
    */
	public String devolucionIdCliente(){

		System.out.println("Escribe es id del cliente");
		String respuesta = texto.next();
		return respuesta;

	}
    
    /** Creacion del metodo devolucionIdProducto, el cual
    *   solicita al usuario el id del producto a devolver.
    *
    */
	public String devolucionIdProducto(){

		System.out.println("Escribe es id del producto que vas a devolver");
		String respuesta = texto.next();
		return respuesta;
	}
}