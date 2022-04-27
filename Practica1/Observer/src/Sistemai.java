/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Interfaz para los sistemas sistemas. Los sistemas deben de implementar el 
 * método update el cual realiza la actuación que tienen ante anuncio
 * que da el sujeto(alarma) de que ha sido modificado.
 */
public interface Sistemai{

	/**
	 * Actuación que realiza cada sistema cuando es avisado
	 * de que la alarma fue activada.
	 */
	public void update();

}