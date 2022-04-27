/** <p> Clase que modela la BasedeDatosProductos</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

import java.util.ArrayList;
/**
 * Clase para bases de datos de pizzas.
 */
public class BaseDeDatosProductos{

    ArrayList<Producto> baseDatosProductos;
    
    /** Creacion del constructor de la BaseDeDatosProductos
    *   que crea una lista del tipo Producto.
    *
    */
    public BaseDeDatosProductos(){

    baseDatosProductos = new ArrayList<Producto>();

    }
    
    /** Creacion del metodo agregaProducto el cual agrega
    *   un producto a la lista.
    *   @param producto hace referencia al producto.
    *
    */
    public void agregaProducto(Producto producto){

        baseDatosProductos.add(producto);
    } 

    /** Creacion del metodo eliminaProducto el cual elimina
    *   un producto de la lista.
    *   @param id hace referencia al id del producto.
    */
    public void eliminaProducto(String id){

        for(Producto temporal: baseDatosProductos){

            if (id.equals(temporal.getId())){
                baseDatosProductos.remove(temporal);
            }else{
                System.out.println("Ese productos no existe en la base de datos");
            }

        }
    }

    /** Creacion del metodo imprimir, el cual imprime la 
    *   base de datos de productos.
    *
    */
    public void imprimir(){
        for(int i=0; i<baseDatosProductos.size(); i++){
            System.out.println(baseDatosProductos.get(i) + "\n");
            System.out.println(" ");
        }
    }
  
}
