/** <p> Clase que modela la BaseDeDatosCompras </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

import java.util.ArrayList;

public class BaseDeDatosCompras{

	ArrayList<Compra> baseDatosCompras;
    
     /** Creacion del constructor de BaseDeDatosCompras, que 
    *   crea una lista de compras.
    *
    */
	public BaseDeDatosCompras(){

		baseDatosCompras = new ArrayList<Compra>();
	}
    
     /** Creacion del metodo agregaCompras el cual agrega 
    *   una compra a la lista.
    *
    */
	public void agregaCompras(Compra compra){

		baseDatosCompras.add(compra);
	}
    
     /** Creacion del metodo eliminaCompra, el cual 
    *   elimina una compra de la lista.
    *
    */
	public void eliminaCompra(Compra compra){

		baseDatosCompras.remove(compra);
	}
    
    /** Creacion del metodo size el cual regresa 
    *   el tamaño de la baseDatosCompras.
    *
    */
	public int size(){
		
		return baseDatosCompras.size();
	}
    
    /** Creacion del metodo get el cual regresa 
    *   una posicion de compra.
    *
    */
	public Compra get(int i){
		return baseDatosCompras.get(i);

	}
    
    /** Creacion del metodo imprimir, el cual imprime 
    *   la lista completa de compras.
    *
    */
	public void imprimir(){
        for(int i=0; i<baseDatosCompras.size(); i++){
            System.out.println(baseDatosCompras.get(i) + "\n");
            System.out.println(" ");
        }
    }
}