/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */
/**
 * Clase abstracta la plantilla para la creacion de los hoteles. 
 * Con un String que contiene su descripcion del hotel y un int que contiene su precio.
 * Provee el método para devolver la descripcion del hotel.
 * Las clases que extiendan a Hotel deben implementar el método {@link
 * #getPrecio}, que devuelve el precio de un taco, y el método {@link
 * #getDescuento} que devuelve el descuento que se le aplica al cliente si cumple los requicitos.
 */
public abstract class Hotel{
	
	/*El String con la descripcion del hotel*/
	String descripcion = "Hotel";
	/*EL int con el precio del hotel*/
	int precio = 0;

	/*Devuelve el String con la descripcion del hotel.*/
	public String getDescripcion(){
		return descripcion;
	}

	/*Devuelve el entero con el precio del hotel*/
	public abstract int getPrecio();

	/*Devuenve un numero de tipo double con la cantidad total a
	* pagar por parte del usuario si se le hizo un descuento
	*/
	public abstract double descuento(int dias);

}
