/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 01 de Octubre de 2018
 */

/**
 * Clase que nos sirve para hacer las operaciones en Hexadecimal, pero
 * las operaciones se realizan en binario.
 * Implementa los metodos de la interfaz OperacionBinaria.
 */
public class HexaAdapter implements OperacionBinaria{

	Hexa hexa;

	public HexaAdapter(Hexa hexa){
		this.hexa = hexa;

	}

	public void sumaBinaria(){

		hexa.sumaHexa();
	}

	public void restaBinaria(){

		hexa.restaHexa();
	}
}
