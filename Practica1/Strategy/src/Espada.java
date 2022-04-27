/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */
 
 /** Clase para representar el objeto de tipo arma espada. 
  * La clase implementa los metodos de la interfaz {@link Arma}.
  */
public class Espada implements Arma{
    
		/**
		 * Imprime un mensaje como resultado de utilizar la espada.
		 */
  	@Override
    public void arma() {
      System.out.println("Se ha selecciona una espada. \n");
    }
    
    /**
     * @return string, cadena que nos dice que es una arma de tipo espada.
     */ 
    @Override
    public String tipoArma() {
       return "Tu arma es una espada. \n";
    }
       
    
    
    
}
