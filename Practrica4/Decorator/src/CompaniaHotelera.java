/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */
import java.util.Scanner;

/**Clase principal de la compañia hotelera, que hace la interacción con el usuario.
	*en esta se crean los menus con la bienvenida y se le permite hacer una reservacion al usuario, 
	*si cumple con las condiciones se le aplica un descuento y al final le dice una descripcion de 
	*su reservacion
*/
public class CompaniaHotelera{


public static void main(String[] args) {
	
	System.out.println("        **COMPAÑIA HOTELERA**\n");
	System.out.println("	 -Hotel Básico-");	
	Hotel hotelBasico = new HotelBasico();
	System.out.println(hotelBasico.getDescripcion() + 
			"\n Precio por noche: " + hotelBasico.getPrecio());
	System.out.println("\n 	-Hotel Básico en la Playa-");	
	Hotel hotelBasicoPlaya = new HotelBasicoPlaya(hotelBasico);
	System.out.println(hotelBasicoPlaya.getDescripcion() + 
			"\n Precio por noche: " + hotelBasicoPlaya.getPrecio());
	System.out.println("\n 	-Hotel VIP en la playa-");	
	Hotel vip = new VIPPlaya(hotelBasicoPlaya);
	System.out.println(vip.getDescripcion() + 
			" \n Precio por noche: " + vip.getPrecio());


	System.out.println("\n \nNOTA. En temporada alta, la compañía hace descuentos:\n"+
	"Hoteles básicos en la playa hospedaje por más de 5 noches, descuento del 20%.\n"+
	"Hoteles con cuartos VIP en la playa hospedaje por más de 4 noche, descuento del 25%.\n"+
	"Hotel básico, hospedaje por más de 5 días, descuento del 10%.\n");

	System.out.println("¿Gustas hacer una reservación (S/N)?");
	Scanner texto = new Scanner(System.in);	
	char respuesta = texto.next().charAt(0);
	if(respuesta == 'S'|| respuesta == 's'){

		System.out.println("¿A qué nombre estará la reservación?");
		String nombre = texto.next();

		System.out.println("Que hotel va a seleccionar y por cuántos días?\n" 
			                  + " Hotel Básico (1)\n"
											  + " Hotel Básico en la Playa (2)\n"
											  + " Hotel VIP en la playa(3) \n");	
		Scanner texto2 = new Scanner(System.in);	
		int opcion = texto2.nextInt();
		int dias = texto2.nextInt();

		switch(opcion){

			case 1:
				if(dias > 5){
					System.out.println("Tu reservación quedo a nombre de : " + nombre);
					System.out.println("Seleccionaste un Hotel Básico por " + dias
																+ " días, por lo que tienes un descuento.");
					System.out.println("Tu pago total es : " + hotelBasico.descuento(dias));
				}else{
					System.out.println("Tu reservación quedo a nombre de : " + nombre);
					System.out.println("Seleccionaste un Hotel Básico por " + dias
																+ " días, no tienes descuento :(.\n" + "Tu pago es de : "
																+ hotelBasico.getPrecio()*dias);
				}
			break;
			case 2: 
				if(dias > 5){
				  System.out.println("Tu reservación quedo a nombre de : " + nombre);
					System.out.println("Seleccionaste un Hotel Básico en la Playa por " + dias
																+ " días, por lo que tienes un descuento.");
					System.out.println("Tu pago total es : " + hotelBasicoPlaya.descuento(dias));
				}else{
					System.out.println("Tu reservación quedo a nombre de : " + nombre);
					System.out.println("Seleccionaste un Hotel Básico por " + dias
																+ " días, no tienes descuento :(.\n" + "Tu pago es de : "
																+ hotelBasico.getPrecio()*dias);
					}
			break;
			case 3:
				if(dias > 4){
				  System.out.println("Tu reservación quedo a nombre de : " + nombre);
					System.out.println("Seleccionaste un Hotel Básico en la Playa por " + dias
																+ " días, por lo que tienes un descuento.");
					System.out.println("Tu pago total es : " + vip.descuento(dias));
				}else{
					System.out.println("Tu reservación quedo a nombre de : " + nombre);
					System.out.println("Seleccionaste un Hotel Básico por " + dias
																+ " días, no tienes descuento :(.\n" + "Tu pago es de : "
																+ hotelBasico.getPrecio()*dias);
				}
			break;
			default:
				System.out.println("Ese hotel no existe.");
			}
		}else{
			System.out.println("Bye amiguito.");
	}
}

}
