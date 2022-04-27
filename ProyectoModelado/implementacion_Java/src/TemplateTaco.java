/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */
/**
 * Clase abstracta de tipo platilla para la creacion de un taco. 
 * Con un String que contiene su descripcion y un int que contiene su precio.
 * Provee el método para devolver la descripcion de un taco.
 * Las clases que extiendan a Template deben implementar el método {@link
 * #getPrecio}, que devuelve el precio de un taco.
 */
public abstract class TemplateTaco{
	/*El String con la descripcion del taco*/
	String descripcion = "Plantilla de taco";
	/*El int con el valor del precio del taco*/
	int precio = 0;

	/**
   * Regresa la descripción del taco.
   * @return una cadena con la descripción del taco.
   */
	public String getDescripcion(){
		return descripcion;
	}

	/**
	 * Regresa el precio del taco.
	 * @return un int con el precio del taco.
	 */
	public abstract int getPrecio();

}