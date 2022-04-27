/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */
import java.util.Random;

/*Clase abstracta que se implementara para construir los autos de diferentes tipos.*/
abstract class ConstructorAutomovil{

	/**Metodo que construye el mensaje con la cadena que describe el tipo de auto
	*Cuando se implemente este metodo, va a variar dependiendo el tipo de auto que se cree.
	*@return String la cadena con la descripcion.
	*/
	public abstract String construirTipo();


	/**Metodo que construye el numero de serie de un automovil.
		*Este metodo no es abstracto puesto que todos los autos 
		*tienen el numero de serie con las mismas caracteristicas.
		*@return String la cadena con el numero de serie que se pasara al constructor del auto.
		*/
	public String construirNumeroSerie(){
		Random numero = new Random();
		String numeroSerie = "";
		int n = 1+numero.nextInt(6);
		int n2 = n+1;
		int n3 = n+2;
		int n4 = n+3;
		numeroSerie = numeroSerie + n + n2 + n3 + n4;
		int nrepetidos = numero.nextInt(9);
		numeroSerie = numeroSerie + nrepetidos + nrepetidos;
		int nrepetidos2 = numero.nextInt(2);
		int nImpar = (nrepetidos2*2) + 1;
		int nImpar2 = nImpar + 2;
		numeroSerie = numeroSerie + nImpar + nImpar2;
		int nPar = nrepetidos2*2;
		int nPar2 = nPar + 2;
		numeroSerie = numeroSerie + nPar + nPar2;
		return numeroSerie;

	}


}