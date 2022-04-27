/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */
 /** Clase para representar el objeto de tipo arma hacha. 
  * La clase implementa los metodos de la interfaz {@link Arma}.
  */

public class Hacha implements Arma {

   /**
		 * Imprime un mensaje como resultado de utilizar la hacha.
		 */
    @Override
    public void arma() {
      System.out.println("Seleccionaste el hacha. \n");
    }
    
  /**
    * @return string, cadena que nos dice que es una arma de tipo hacha.
    */ 
    @Override
    public String tipoArma() {
       return "Tu arma es un hacha. \n";
    }
       
 
}
