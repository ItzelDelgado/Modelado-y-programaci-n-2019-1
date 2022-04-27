public class HotelBasico extends Hotel{
	String descripcion;
	int precio;
	
	public HotelBasico(){
	descripcion = " Servicios: \n"
											+" a.Televisión por cable \n"
											+" b. WiFi \n" 
											+" c. Aire acondicionado \n";
  precio = 700;


	}

	public String getDescripcion(){
		return descripcion;
	}

	public int getPrecio(){
		return precio;
	}

	public double descuento(int dias){
		double total = precio*dias;
		double descu = (total) * 0.10;

		return total - descu;
	}

}