/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Interfaz para el servidor que interactua entre el cajero y el sistema del banco. 
 */
public interface Servidor{
	/**
	 * Metodo que se implementará para la comunicación entre Cajero y Sistema del banco.
	 */
	public void solicitud(String respuesta);

}
