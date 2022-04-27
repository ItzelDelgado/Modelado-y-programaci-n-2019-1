/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */


/**Clase que construye un automovil de tipo Ciudad.
 *Extiende de la clase constructorAutomovil e implementa el metodo construirTipo,
 *que es distinto para cada auto.
 */
public class ConstructorAutomovilCiudad extends ConstructorAutomovil{

	public String construirTipo(){
		return "  ***Auto de ciudad(familiar)***\n" + 
					" Es una carrocería de dos volúmenes simples en la que el acceso al maletero\n" + 
					" es una puerta vidrio trasero, el máximo espacio disponible a un precio \n" + 
					" muy ajustado. Con un generoso maletero de 520 litros de fácil acceso y un\n" + 
					" habitáculo bastante amplio, para gastar lo mínimo y acceder a un coche completo\n"+ 
					"y razonable.\n";
	}

}