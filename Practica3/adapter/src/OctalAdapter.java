/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 01 de Octubre de 2018
 */

/**
 * Clase que nos sirve para hacer las operaciones en Octal, pero
 * las operaciones se realizan en binario.
 * Implementa los metodos de la interfaz OperacionBinaria.
 */
public class OctalAdapter implements OperacionBinaria{

	Octal octal;

	public OctalAdapter(Octal octal){
		this.octal = octal;

	}

	public void sumaBinaria(){

		octal.sumaOctal();
	}

	public void restaBinaria(){

		octal.restaOctal();
	}
}
