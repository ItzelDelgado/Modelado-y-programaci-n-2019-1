/** <p> Clase que modela el objeto compra </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/
import java.util.ArrayList;

public class Compra{

	//Declaracion de la variable idCliente de la compra.
	public String idCliente;
	//Declaracion de la variable fecha de la compra.
	public String fecha;
	//Declaracion de la variable pagoTotal de la compra.
	public double pagoTotal;
	//Declaracion de la variable totalProductos de la compra.
	public int totalProductos;
	//Declaracion de la variable formaPago de la compra.
	public String formaPago;
	//Declaracion de la variable entrega de la compra.
	public String entrega;
	//Declaracion de la variable productos de la compra.
	public ArrayList<Producto> productos;
    
    /** Creacion del constructor del objeto compra.
    *   @param idCliente define el id de compra.
    *   @param fecha define el fecha de compra.
    *   @param pagoTotal define la fechaTotal de compra.
    *   @param totalProductos define el totalProductos de compra.
    *   @param formaPago define la formaPago de compra.
    *   @param entrega define la entrega de compra.
    *   @param productos define la productos de compra.
    *
    */
	public Compra(String idCliente, String fecha, double pagoTotal,int totalProductos,String formaPago, String entrega,ArrayList<Producto> productos){

		this.idCliente = idCliente;
		this.fecha = fecha;
		this.pagoTotal = pagoTotal;
		this.totalProductos = totalProductos;
		this.formaPago = formaPago;
		this.entrega = entrega;
		this.productos = productos;

	} 

    /** Creacion del metodo getIdCliente.
    *   @return regresa el IdCliente de compra.
    *
    */
	public String getIdCliente(){
		return idCliente;
	}
    
    /** Creacion del metodo getFecha.
    *   @return regresa la fecha de compra.
    *
    */
	public String getFecha(){
		return fecha;
	} 
    
    /** Creacion del metodo getPagoTotal.
    *   @return regresa el pagoTotal de compra.
    *
    */
	public double getPagoTotal(){
		return pagoTotal;
	}
    
    /** Creacion del metodo getTotalProductos.
    *   @return regresa el totalProductos de compra.
    *
    */
	public int getTotalProductos(){
		return totalProductos;
	}
    
    /** Creacion del metodo getProductos.
    *   @return regresa los productos de compra.
    *
    */
	public ArrayList<Producto> getProductos(){
		return productos;
	}
    
    /** Creacion del metodo getFormaPago.
    *   @return regresa la forma de pago de compra.
    *
    */
	public String getFormaPago(){
		return formaPago;
	}
    
    /** Creacion del metodo getEntrega.
    *   @return regresa la entrega de compra.
    *
    */
	public String getEntrega(){
		return entrega;
	}
    
    /** Creacion del metodo setIdCliente.
    *   @param idCliente modifica el idCliente de compra.
    *
    */
	public void setIdCliente(String idCliente){
		this.idCliente = idCliente;
	}
    
    /** Creacion del metodo setFecha.
    *   @param fecha modifica la fecha del compra.
    *
    */
	public void setFecha(String fecha){
		this.fecha = fecha;

	}
    
    /** Creacion del metodo setPagoTotal.
    *   @param pagoTotal modifica el pagoTotal de compra.
    *
    */
	public void setPagoTotal(double pagoTotal){
		this.pagoTotal = pagoTotal;
	}
    
    /** Creacion del metodo setTotalProductos.
    *   @param totalProductos modifica el totalProductos de compra.
    *
    */
	public void setTotalProductos(int totalProductos){
		this.totalProductos = totalProductos;
	}
    
    /** Creacion del metodo setProdutos.
    *   @param productos modifica los productos de compra.
    *
    */
	public void setProductos(ArrayList<Producto> productos){
		this.productos = productos;
	}

    /** Creacion del metodo setFormaPago.
    *   @param formaPago modifica la formaPago de compra.
    *
    */
	public void setFormaPago(String formaPago){
		this.formaPago = formaPago;
	}
    
    /** Creacion del metodo setEntrega.
    *   @param entrega modifica la entrega de compra.
    *
    */
	public void setEntrega(String entrega){
		this.entrega = entrega;
	}
    
    //Sobreescritura del metodo toString.
	@Override
    public String toString(){
        return ("id del cliente: " + this.idCliente + "   Fecha de compra: " + this.fecha +
         "Pago total de la compra:  " + this.pagoTotal + " Total de productos: " + this.totalProductos
         + "Forma de pago: " + this.formaPago + " Forma de entrega: " + this.entrega +" \n"+ this.productos);
    }
}