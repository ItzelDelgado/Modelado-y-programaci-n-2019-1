import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**
 * Clase para representar el objeto alarma. 
 * La clase implementa los metodos de la interface {@link Alarmai}, 
 * agrega los sistemas a una lista y les notifica el cambio de estado del sujeto(alarma).
 */

public class Alarma {

	//Lista genérica para guardar los sistemas.
	private List<Sistemai> sistemas;

	/**Agrega los sistemas a una lista para poder iterar y notificar
	 * que se activo la alarma
	 */
	public void agregarSistema(Sistemai sistema){

		if(sistemas == null){
		   sistemas = new ArrayList<>();
		}
		sistemas.add(sistema);
	}

	/**Recorre la lista anunciando a cada elemento que la lista se activo
		*tomando un pequeño lapso de tiempo.
	*/
	public void activarAlarma(){
		System.out.println("La alarma fue activada.\n");
		try {
    Thread.sleep(2000);
    }catch (InterruptedException ex) {
       Logger.getLogger(Alarma.class.getName()).log(Level.SEVERE, null, ex);
    }
    for (Sistemai sistema : sistemas){
    	sistema.update();
    }
	}

}