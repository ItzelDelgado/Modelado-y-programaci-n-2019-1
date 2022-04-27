/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */
public class AgenciaBuilder{

	/**Metodo que se encarga de hacer la construccion del automovil.
	* En realidad recibe un automovil vacio y este se encarga de hacer 
	* la construccion del automovil de tipo especifico que el usuario eligio.
	* @param un Automovil vacio.
	* @param el Constructor que se encargara de hacer el auto de un tipo en 
	* especifico.
	* @return el Automovil que ya es del tipo que el usuario selecciono.
	**/
	public Automovil construirAutomovil(Automovil automovil,ConstructorAutomovil constructor){
		automovil.setTipo(constructor.construirTipo());
		automovil.setNumeroSerie(constructor.construirNumeroSerie());
		return automovil;
	}

}