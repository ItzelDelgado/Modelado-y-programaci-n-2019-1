/** <p> Clase que modela la vista.</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

import java.util.Scanner;

public class VistaLecturaEscrituraCompras{

	Scanner texto = new Scanner(System.in);
    
    /** Creacion del metodo vistaIDCliente el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return idCliente.
    */
	public String vistaIDCliente(){

		System.out.println("Cual es el ID del cliente?");
		String idCliente = texto.next();

		return idCliente;
	}
    
    /** Creacion del metodo vistaPago el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return PagoTotal
    */
	public String vistaPago(){

		System.out.println("Cuanto fue el pago total del cliente?");
		String pagoTotal = texto.next();
		return pagoTotal;
	}
    
    /** Creacion del metodo vistaFecha el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return fecha.
    */
	public String vistaFecha(){

		System.out.println("Cual es la fecha?");
		String fecha = texto.next();
		return fecha;
	}
      /** Creacion del metodo vistaEntrega el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return entrega.
    */
 	public String vistaEntrega(){	
		System.out.println("Cuanto fue la seleccion de la entrega?");
		String entrega = texto.next();
		return entrega;
	}

	  /** Creacion del metodo vistaFormaPago el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return formaPago.
    */
	public String vistaFormaPago(){
		System.out.println("Forma de pago:\n"+
							"Si es en efectivo pulsa (E/e)\n"
							+"Si es con tarjeta de cretido pulsa (C/c)");
		String formaPago = texto.next();
		return formaPago;
	}
    
    /** Creacion del metodo vistaFecha el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return numCon.
    */
	public String vistaTotalProductos(){
		System.out.println("Cuantos productos se vendieron?");
		String numCon = texto.next();
		return numCon;

	}
    
    /** Creacion del metodo vistaFecha el cual 
    *   tiene como funcion imprimir una pregunta y guardar
    *   una respuesta.
    *   @return idProducto.
    */
	public String vistaIDProducto(){
		System.out.println("Cual es el ID del producto?");
		String idProducto = texto.next();
		return idProducto;
	}
			

}