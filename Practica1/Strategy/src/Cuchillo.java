/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

 /** Clase para representar el objeto de tipo arma cuchillo. 
  * La clase implementa los metodos de la interfaz {@link Arma}.
  */
public class Cuchillo implements Arma {

		/**
		 * Imprime un mensaje como resultado de utilizar el cuchillo.
		 */
    @Override
    public void arma() {
      System.out.println("Has seleccionado el cuchillo.");
    }
    
    
    /**
     * @return string, cadena que nos dice que es una arma de tipo cuchillo.
     */ 
    @Override
    public String tipoArma() {
       return "Tu arma es un cuchillo";
    }
       
    
    
}
