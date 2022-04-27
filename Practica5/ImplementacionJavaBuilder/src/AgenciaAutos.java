/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */

/**Clase principal del sistema de la Agencia de Automoviles.
 * El usuario puede realizar una compra de automoviles, 
 * con la regla espedifica de que solo puede comprar un numero impar
 * de automoviles.
 * Ademas de esto podra elegir de que tipo sera cada uno.
 * Tiene tambien como resticcion la creacion del numero de serie,
 * los 4 primeros numeros son sucesivos, los siguentes 2 son repetidos,
 * los otros 2 son impares sucesivos y los ultimos dos son pares sucesivos.
 * La agencia realiza la venta y se la imprime.
 */
public class AgenciaAutos{

	public static void main(String[] args){
		AgenciaVentas venta = new AgenciaVentas(); 
		venta.vender();
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("--------------------------------------------------------------------");
		venta.imprimirVenta();

	}

}