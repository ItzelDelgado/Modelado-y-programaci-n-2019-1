/**
 * @author Delgado Díaz Itzel Azucena
 * @date 28 de Octubre de 2018
 */


/**Clase que representa la sucursal donde se realizan las ventas.
 * Se encarga de hacer la interaccion con el usuario para que realize su comora.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class AgenciaVentas{
	/* ArrayList que contendra los autos que compre el usuario*/
	public static ArrayList<Automovil> compraAutos = new ArrayList<>();
	

	/**Metodo que hace la venta de los autos. 
	* Interactua con el usuario ofecriendole la oportunidad de realizar la compra.
	* Si la realiza le notifica que deb hace una compra con un numero impar de 
	* elementos, en este caso de autos.
	* utiliza el metodo elegitAutomovil para realizar la eleccion y creacion de
	* cada auto y asi poder agregarlo a la lista de la compra.
	**/
	public void vender(){
		int numero; 
		System.out.println("   AGENCIA DE AUTOS   ");
		System.out.println("Bienvenido.");
		System.out.println("Desea hacer alguna compra? (S/N)");
		Scanner texto = new Scanner(System.in);
		char opcion = texto.next().charAt(0);
	  if(opcion == 's'|| opcion == 'S'){

	  	System.out.println("Solo puede realizar compras de autos donde la cantidad \n" +
	  											"sea impar. (1,3,5,7,...).\n \n");
	  		do{
					try {
						numero = 0;
						numero = 0;
						System.out.println("¿Por cuántos autos estará compuesta su compra?");
						System.out.println("Si usted desea cancelarla presione la tecla 0. ");
					 	numero = texto.nextInt();
					 	if(numero == 0){
					 		System.out.println("Su compra ha sido cancelada. :(");
					 	}else if(numero%2 ==1){
					 		int autoNumero = 1;
			    		while(numero!=0){
			      		Automovil auto = new Automovil();
			      		System.out.println("Automovil numero " + autoNumero);
			         	compraAutos.add(elegirAutomovil(auto));
			        	numero--;
			        	autoNumero++;
			        }
		     			numero = 0;
		     		}else{
			     		System.out.print("\033[H\033[2J");
			    		System.out.flush();
		     			System.out.println("Solo puede hacer compras de numeros impares.");
		     			System.out.println("Vamos a volverlo a intentar.");
		     		}
					}catch(Exception e){
						System.out.println("Ingresó un caráter distinto a un número, intentelo de nuevo.");
						texto.nextLine();
			 	 		numero = 1;
			 		}
				}while(numero!=0);
		}else{
			System.out.println("Adios :(");
		}
	}


	/**Metodo que se comunica con el usuario para realizar la eleccion del tipo
	* de automovil quen este quiere.
	* Le da las opciones y de esta manera hace la construccion
	* dependiendo la entrada que se reciba.
	* @param un Automovil vacio.
	* @return Automovil, un automovil de algun tipo en especifico.
	**/
	public Automovil elegirAutomovil(Automovil auto){
	  Automovil autom = new Automovil();
	  Scanner texto2 = new Scanner(System.in);
	  System.out.println("Que tipo de automovil desea comprar?");
	  System.out.println("Auto de ciudad (1)");
	  System.out.println("Auto de autopista (2)");
	  System.out.println("Auto de carga (3)");
	  int eleccion = texto2.nextInt();
	  ConstructorAutomovil constructor;
	  AgenciaBuilder director;
	  	switch(eleccion){
				case 1:
					constructor = new ConstructorAutomovilCiudad();
					director = new AgenciaBuilder();
					autom = director.construirAutomovil(auto,constructor);
	        System.out.println("Su auto ha sido creado.");
	        System.out.println("Vamos a proceder a pintarlo.");
	        AgenciaPinta pintar = new AgenciaPinta();
	        autom = pintar.pintar(autom);
				break;
			
				case 2:
					constructor = new ConstructorAutomovilAutopista();
					director = new AgenciaBuilder();
					autom = director.construirAutomovil(auto,constructor);
		      System.out.println("Su auto ha sido creado.");
		      System.out.println("Vamos a proceder a pintarlo.");
		      AgenciaPinta pintar2 = new AgenciaPinta();
		      autom = pintar2.pintar(autom);
				break;
				
				case 3:
					constructor = new ConstructorAutomovilCarga();
					director = new AgenciaBuilder();
					autom = director.construirAutomovil(auto,constructor);
	        System.out.println("Su auto ha sido creado.");
	        System.out.println("Vamos a proceder a pintarlo.");
	        AgenciaPinta pintar3 = new AgenciaPinta();
	        autom = pintar3.pintar(autom);
				break;
					 	
				default:
					System.out.println("Elige una opción correcta.");
				break;
			}
			
			return autom;

	  }			

	/**Metodo que nos ayuda a hacer la impresion de la compra.
	* utiliza un iterador puesto que guardamos los autos en una lista
	* para despues manejarla y saber de que tipo son cada auto.
	*/
	public void imprimirVenta(){
		Automovil autoImprime ;
		Iterator iter = compraAutos.iterator();
		int n = 1;
		while(iter.hasNext()){
	  	autoImprime = (Automovil)iter.next();
			System.out.println("Auto numero " + n);
	  	System.out.println(autoImprime.toString());
			n++;
		}
	}

}