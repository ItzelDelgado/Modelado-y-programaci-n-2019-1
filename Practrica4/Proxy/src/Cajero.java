/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase cajero que implementa al servidor.
 * en esta clase implementamos el metodo que hace la comunciacion y espera la respuesta para 
 * hacer la devolucion del dinero. 
 */
public class Cajero implements Servidor{
	/*El int que recibe el numero de cuenta del usuario.*/
  private int numeroCuenta;
  /*El int que recibe el monto a retirar y sera verificado.*/
  private int montoRetiro;

  /**
  * Metodo contructor del cajero que recibira el numero de cuenta y el monto que se verificará.
  */
  public Cajero(int numeroCuenta, int montoRetiro){
    this.numeroCuenta = numeroCuenta;
    this.montoRetiro = montoRetiro;
    System.out.println("Realizando solicitud de transacción...");
  }

  /**
  * Implementacion del metodo solicitud del Servidor, que al tener una respuesta 
  * nos devuelve un mensaje si es que se puede retirar el saldo.
  */
  public void solicitud(String respuesta){
	 System.out.println("Realizar transaccion al numero de cuenta: "+ numeroCuenta +"\n"
                      +"Con el monto: " + montoRetiro + "\nOK!");
  }

}
