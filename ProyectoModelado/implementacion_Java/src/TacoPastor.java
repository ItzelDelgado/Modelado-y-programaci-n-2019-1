/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */

/**
 *Clase para crear un taco específicamente de pastor.
 */
public class TacoPastor extends TemplateTaco{
	
	/*Construye un taco de pastor con descripción y precio*/
	public TacoPastor(){
		descripcion = "Taco al pastor";
		precio = 8;
	}

	/*Devuelve la cadena con la descripción*/
	public String getDescripcion(){
		return descripcion;
	}

	/*Devuelve el entero con el precio del taco*/
	public int getPrecio(){
		return precio;
	}

}