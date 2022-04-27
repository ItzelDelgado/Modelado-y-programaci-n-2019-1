/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */
import java.util.Scanner;

/**
 * Clase de tipo fachada que realiza los metodos que interactuan con el usuario.
 * Tiene un objeto de tipo OrdenTacos que es la lista donde guardaremos la orden. 
 * TacoMachineFacade nos permite darle la bienvenida al usuario,
 * imprimirle un menu para que elija los ingredientes extras, aquí esta el metodo
 * que usa las clases de los ingredientes que van a decorar los tacos y tiene el metodo 
 * que crea la orden, utilizando OrdenTacos.
 */
public class TacoMachineFacade{
	/*Un scanner que nos permite recibir los datos del cliente*/
	Scanner texto = new Scanner(System.in);
	/*Una orden de tacos (lista) que guardara los tacos del usuario para manejarlos*/
	static OrdenTacos ordenTacos;
	
	/* Constructor vacio de la clase*/
	public TacoMachineFacade(){
	}

	/*Metodo que solo tiene los mensaje de bienvenida al usuario*/
	public void bienvenida(){
		String cadena = "*****************************************************************************";
		System.out.println(cadena);
		System.out.println("			^^^ TAQUERIA *TACOMACHINE* ^^^");
		System.out.println("TacoMachine es una taqueria tradicional 100% mexicana.");
		System.out.println("Tenemos a los mejores taqueros que pueden existir en este planeta.");
		System.out.println("Nuestra especialidad son los tacos al pastor. Nuestra receta es muy especial.");
		System.out.println("Pero la sorpresa es que usted puede elegir un ingrediente exótico extra que lo deleitará.");
		System.out.println("Este sistema le brindará a usted la facilidad de realizar su orden de tacos.");
		System.out.println("Lo único que debe hacer es seguir las instrucciones.");
		System.out.println(cadena);
	}

	/*Metodo que solo imprime los mensajes que forman el menu de TacoMachine*/
	public void menu(){

    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^MENU ESPECIALIDADES^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("^                         Taco de pastor    $8                        ^");
    System.out.println("^                              SUAPERRO                               ^");
    System.out.println("^                {Es otra carne especial de TacoMachine.}             ^");
    System.out.println("^              {Para sacar lo carnivoro que llevas dentro.}           ^");
    System.out.println("^                                + $7                                 ^");
    System.out.println("^                             LONGATRIPA                              ^");
    System.out.println("^{Esta hecha para los amantes de los sabores picantes, MUY picantes.} ^");
    System.out.println("^                                + $6                                 ^");
    System.out.println("^                              RICOQUESO                              ^");
    System.out.println("^            {Para los más exóticos esta este queso fundido.}         ^");
    System.out.println("^ {Originario de Oaxaca, puedes llegar a confundir tu taco con pizza.}^");
    System.out.println("^                                + $5                                 ^");
    System.out.println("^                             PIÑAJUGOSIÑA                            ^");
    System.out.println("^          {Esos que aman los sabores tropicales y agridulces.}       ^");
    System.out.println("^              {No duden en que esta sea una buena elección.}         ^");
    System.out.println("^                                + $3                                 ^");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n \n");
    System.out.println("NOTA. Su elección la hará para cada taco de su pedido.\n");


	}

	/**
	 *Metodo que realiza la decoracion para cada taco con un ingrediente especial.
	 *Haciendo una interaccion con el usuario
	 *Se realizo un do,while para poner hacer el manejo de las exepciones
	 *en el caso donde el usuario pulsa una tecla con un caracter distinto a un 
	 *numero, para hacer la seleccion del ingrediente extra y de esta manera ir al
	 *caso del switch que la contiene, para proceder a hacer la decoración del taco 
	 *y así devolvernos el taco modificado o solo taco de pastor, dependiendo la elección
	 *del cliente.
	 *@param El taco que se crea para proceder a hacerle la decoracion.
	 *@param un entero con el valor del numero de taco que es, esto lo hice 
	 *para mostrarle despues al usuario en que numero de taco va haciendo la selección.
	 *es como un identificador para cada taco.
	 *@return el taco modificado o no.
	 */

	public TemplateTaco decorarTaco(TemplateTaco taco,int numero){
		int opcion;
		/*Instrucción para borrar la terminal*/
		System.out.print("\033[H\033[2J");
    System.out.flush();
		
		do{
			taco = new TacoPastor();
			try{
				opcion = 0;
				System.out.println("Taco número (" + numero +")\n " +taco.getDescripcion() + " $" + taco.getPrecio()+"\n");
				System.out.println("¿Gusta agregarle un elemento extra?");
				System.out.println("Eliga la tecla con el número de la opción que desea agregar.");
				System.out.println("Ningún ingrediente (0)");
				System.out.println("Suaperro           (1)");
				System.out.println("Longatripa         (2)");
				System.out.println("RicoQueso          (3)");
				System.out.println("PiñaJugosiña       (4)");
				opcion = texto.nextInt();
		
		 		switch(opcion){

				 	case 1:
				 	taco = new Suaperro(taco);
				 	break;
				 	case 2:
				 	taco = new Longatripa(taco);
				 	break;
				 	case 3:
				 	taco = new RicoQueso(taco);
				 	break;
				 	case 4:
				 	taco = new PiñaJugosiña(taco);
				 	break;
				 	default:
				 	System.out.println("Elige una opción correcta.");
				 	break;
		 		}
		 		opcion = 0;
			}catch(Exception e){
				System.out.println("Entrada no valida. Intentalo de nuevo.");
				texto.nextLine();
				opcion = 1;
			}
		}while(opcion!=0);
			return taco;
	}

	/**
	 *Metodo que compone la orden, agregando los tacos ya sean modificados 
	 *o no, dependiendo de lo que el usuario haya elegido.
	 *El do,while se implemento para manejar las excepciones en el caso
	 *en el que se le pide que diga cuantos tacos querra y este pulse
	 *un caracter distinto a un número.
	 *Se le pregunta que cuantos tacos quiere, luego de esto el nombre a quien
	 *va a estar la orden, se procede a crearl la lista y despues a decorar cada
	 *uno de los tacos que el usuario pidió.
	 *Se procede a imprimir la orden si todo salió satisfactoriamente.
	 */

	public void componerOrden(){
		int numero; 
		do{
			try {
				numero = 0;
				System.out.println("¿Por cuántos tacos estará compuesta su orden?");
				System.out.println("Si usted desea cancelarla presione la tecla 0. ");
			 	numero = texto.nextInt();
			 	if(numero == 0){
			 		System.out.println("Su orden ha sido cancelada. :(");
			 	}else{
			 	System.out.println("¿A qué nombre estará?");
    		ordenTacos = new OrdenTacos(texto.next());
				int tacoNumero = 1;
    		while(numero!=0){
      		TemplateTaco tacoSolo = new TacoPastor();
         	ordenTacos.addTaco(decorarTaco(tacoSolo,tacoNumero));
        	numero--;
        	tacoNumero++;
        }
				ordenTacos.print();
     		numero = 0;
     		}
			}catch(Exception e){
				System.out.println("Ingresó un caráter distinto a un número, intentelo de nuevo.");
				texto.nextLine();
		 	 	numero = 1;
		 	
		 }
		}while(numero!=0);
	}

} 