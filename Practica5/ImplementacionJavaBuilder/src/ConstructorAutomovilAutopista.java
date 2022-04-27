/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */


/**Clase que construye un automovil de tipo Autopista.
 *Extiende de la clase constructorAutomovil e implementa el metodo construirTipo,
 *que es distinto para cada auto.
 */
public class ConstructorAutomovilAutopista extends ConstructorAutomovil{
	public String construirTipo(){

		return "   ***Auto de autopista***\n" + 
				"Pensado para circular a altas velocidades. Tiene un motor más potentes,\n" + 
				"mayor velocidad máxima, así como mejor aceleración y adherencia.\n" +
				"Su carrocería más habitual es la cupé o descapotable, y el número \n"+ 
				"de asientos es de dos con dos asientos traseros más pequeños.\n" + 
				"está adaptado para conducir sobre el asfalto (tiene menor peso que\n" + 
				"un todoterreno y mayor capacidad de flexión y torsión.";
	}
}