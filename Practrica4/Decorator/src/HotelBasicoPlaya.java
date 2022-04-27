/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase que implementa al hotel con el que se decorará
 * el hotel basico que queremos modificar.
 */ 
public class HotelBasicoPlaya extends Hotel{
	
	/* Un hotel con descripción y precio*/
	Hotel hotelBasico;


	/*Construye un hotelBasico decorado con con descripción y precio*/
	/*@param el hotel que vamos a decorar*/
	public HotelBasicoPlaya(Hotel hotelBasico){
		this.hotelBasico = hotelBasico;
	}

	/*Devuelve la descripción del thotel que recibio más el los nuevos servicios.*/
	public String getDescripcion(){
		return hotelBasico.getDescripcion() 
			+" d. Room Service \n";
	}

	/*Devuelve el precio del hotel que recibio 
	  más el precio extra del hotel con los nuevos servicios.*/
	public int getPrecio(){
		return hotelBasico.getPrecio() + 500;
	}

	/*Metodo que hace el descuento para el cliente si cumple con hospedarse mas de 5 días.
	* Nos devuelve el total a pagar en caso de haberse hecho un descuento.
	*/
	public double descuento(int dias){
		double total = getPrecio() * dias;
		double descu = (total) * 0.20;
		return total - descu;
	}

}