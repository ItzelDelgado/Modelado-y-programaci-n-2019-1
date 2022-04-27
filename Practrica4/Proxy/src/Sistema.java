/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase Sistema que es el sistema original del banco, que implementa al servidor, para realizar 
 * la comunicación con el cajero.
 * Este sistema nos devolvera la resupuesta si tiene o no saldo y se puede 
 * realizar la transacción.
 */
public class Sistema implements Servidor{
  /* EL cajero del sistema que interactua con el cliente*/     
  Cajero cajero;
  /*El int que recibe el numero de cuenta del usuario.*/
  private int numeroCuenta;
  /*El int que recibe el monto a retirar y sera verificado.*/
  private int montoRetiro;

  /*Constructor del sistema del banco*/ 
  public Sistema(int numeroCuenta, int montoRetiro){
    this.numeroCuenta=numeroCuenta;
    this.montoRetiro=montoRetiro;
    cajero=null;
  	System.out.println("Cargando Sistema...");
  }

  /**
  * Implementacion del metodo solicitud del Servidor, que al tener una respuesta 
  * nos devuelve un mensaje si es que se puede retirar el saldo.
  */
  public void solicitud(String respuesta){
            if(!isRestricted(respuesta)){
	            if(cajero == null){
					cajero = new Cajero(this.numeroCuenta,this.montoRetiro);
				}
				cajero.solicitud(respuesta);
			}
			else
		        System.out.println("No puede retirar dinero, no cuenta con el saldo suficiente.");
		}

		public boolean isRestricted(String respuestaServ){
	        return !respuestaServ.equals("NO");
		}
}

  
