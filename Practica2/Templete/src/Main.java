import java.util.Scanner;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 11 de Septiembre de 2018
 */


/**
 * Clase principal del proyecto que muestra el catalogo de casas de una empresa. 
 * Se crean los objetos de los diferentes tipos de casas, nos muestra el menu,
 * el usuario elige que casa quiere que lo muestre y el programa nos manda el mensaje
 * con el precio.
 */

public class Main{



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CasaDeMadera casademadera= new CasaDeMadera();
		CasaDeVidrio casadevidrio= new CasaDeVidrio();
		CasaDeConcreto casadeconcreto= new CasaDeConcreto();


		System.out.println("Bienvenido a Infonavit");

		

		System.out.println("CATALOGO DE CASAS\n" + "***********************************\n" 
			               + "Presiona (1) para casa de Madera\n" + "Presiona (2) para casa de Vidrio \n"
			               + "Presiona (3) para casa de Concreto");

    int opcion =sc.nextInt();

		switch(opcion){

			case 1:
				casademadera.muestraPrecio();
				break;
		  case 2: 
		  	casadevidrio.muestraPrecio();
		  	break;
		  case 3:
		  	casadevidrio.muestraPrecio();
		  	break;

		}
	}
}