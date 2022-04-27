/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */
/**
 * Clase abstracta de tipo ingrediente para la creacion de los ingredientes.
 * que van a decorar los tacos de pastor, si es que el usuario elige alguno extra. 
 * Las clases que extiendan a Ingrediente deben implementar el método {@link
 * #getDescripcion}, que devuelve una cadena con la nueva descriocion del 
 * taco despues de agregarle el igrediente extra y deben implementar el método {@link
 * #getPrecio} el precio de un taco despues de agregarle el ingrediente extra.
 */
public abstract class Ingrediente extends TemplateTaco{
	
	/**
   * Regresa la descripción del taco despues de ser decorado.
   * @return una cadena con la descripción del taco.
   */
	public abstract String getDescripcion();

	/**
	 * Regresa el precio del taco despues de ser decorado.
	 * @return un int con el precio del taco.
	 */
	public abstract int getPrecio();

}