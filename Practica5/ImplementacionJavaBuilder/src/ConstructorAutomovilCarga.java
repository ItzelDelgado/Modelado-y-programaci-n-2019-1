/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */


/**Clase que construye un automovil de tipo Carga.
 *Extiende de la clase constructorAutomovil e implementa el metodo construirTipo,
 *que es distinto para cada auto.
 */
public class ConstructorAutomovilCarga extends ConstructorAutomovil{

	public String construirTipo(){
		return " ***Auto de carga***\n" + 
					"Tiene una parte trasera compuesta por una plataforma descubierta\n" +
					"destinada a la carga, especialmente útil para transportar objetos\n"+ 
					"voluminosos. La plataforma de carga esta cubierta por una estructura\n" + 
					"de fibra.";

	}

}