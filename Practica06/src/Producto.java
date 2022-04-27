/** <p> Clase que modela el objeto Producto </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

public class Producto{
	
	//Declaracion de la variable id del producto.
	public String id;
	//Declaracion de la variable articulo del producto.
	public String articulo;
	//Declaracion de la variable precio del producto.
	public double precio;
    
    /** Creacion del constructor de producto.
    *   @param id define el id del producto.
    *   @param articulo define el articulo del producto.
    *   @param precio  define el precio del producto.
    */
	public Producto(String id, String articulo, double precio){

		this.id = id;
		this.articulo = articulo;
		this.precio = precio;
	}

	/** Creacion del metodo getArticulo.
	*   @return regresa un articulo del producto.
	*
	*/
	public String getArticulo(){
		return articulo;
	}
    
    /** Creacion del metodo getId.
    *   @return regresa un id del producto.
    *
    */
	public String getId(){
		return id;
	}
    
    /** Creacion del metodo getPrecio.
    *   @return regresa un precio del producto.
    *
    */
	public double getPrecio(){
		return precio;
	}
    
    /** Creacion del metodo setArticulo.
    *   @param articulo modifica un articulo del producto.
    *
    */
	public void setArticulo(String articulo){
		this.articulo = articulo;
	}
    
    /** Creacion del metodo setId. 
    *   @param id modifica un id del producto.
    *
    */
	public void setId(String id){
		this.id = id;
	}
    
    /** Creacion del metodo setPrecio.
    *   @param precio modifica el precio del producto.
    *
    */
	public void setPrecio(double precio){
		this.precio = precio;
	}
    
    //sobreescritura del metodo toString.
	@Override
    public String toString(){
        return ("id del Producto: " + this.id + "   nombre del articulo: " + this.articulo +
         "    Precio del articulo: " + this.precio);
    }


}