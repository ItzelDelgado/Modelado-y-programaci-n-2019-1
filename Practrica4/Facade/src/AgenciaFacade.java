/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

import java.util.Scanner;
/**
 * Clase AgenciaFacade que realiza todos los metodos del sistema. 
 */
public class AgenciaFacade{

	/*Un registro para el usuario*/
	Registro registro;
	/*Una cotizacion para el usuario*/
	Cotiza cotiza;
	/*Una contratacionpara el usuario*/
	Contrata contrata;
	/*Una cancelacion para el usuario*/
	Cancela cancela;
	/*Scanner para recibir los datos del usuario*/
	Scanner texto = new Scanner(System.in);

	/*Metodo que solo tiene los mensaje de bienvenida del sistema al usuario*/
	public void bienvenida(){
		String cadena = "*****************************************************************************";
		System.out.println("			^^^ AGECIA DE SEGUROS DE AUTOS* ^^^");
		System.out.println("En esta agencia nos dedicamos a la venta de seguros para autos.");
		System.out.println("Este es el sistema de atencion a clientes.\n" +
												"Usted puede registrarse, cotizar un seguro, contratar un seguro y darse de baja.");
		System.out.println("Para proceder a alguna actividad debe registrarse: ");

	}

	/*Metodo que sirve para interactuar con el usuario y llenar el objeto de registro*/
	public void registrarUsuario(){
		System.out.println("UserName: ");
		String username = texto.next();
		System.out.println("Password: ");
		String password = texto.next();
		registro = new Registro(username,password);
	}

	/*Metodo para imprimir el Registro hecho por el usuario*/
	public void imprimirRegistro(){
		System.out.println("REGISTRO EXITOSO.");
		System.out.println(registro.toString());
	}

	/*Metodo que interactua con el usuario para que realize una cotizacion
	* y reciba los datos*/
	public void cotizarSeguro(){
		System.out.println("¿Que tipo de seguro desea cotizar?");
		System.out.println("* Cobertura amplia(1)\n " +
											"* Daños a terceros(2) \n" +
											"* Cobertura limitada(3) \n "+
											"* Cobertura Extendida(4) \n");
		int tipo = texto.nextInt();
		
		switch(tipo){

			case 1:
			System.out.println("Marca: ");
			String marcaAuto = texto.next();
			System.out.println("Modelo: ");
			String modeloAuto = texto.next();
			System.out.println("Año: ");
			int anio = texto.nextInt();
			cotiza = new Cotiza("Cobertura amplia, precio de 2000 pesos al mes.", marcaAuto,modeloAuto,anio);
			break;
			case 2:
			System.out.println("Marca: ");
			String marcaAuto2 = texto.next();
			System.out.println("Modelo: ");
			String modeloAuto2 = texto.next();
			System.out.println("Año: ");
			int anio2 = texto.nextInt();
			cotiza = new Cotiza("Daños a terceros, precio de 2300 pesos al mes.", marcaAuto2,modeloAuto2,anio2);
			break;
			case 3:
			System.out.println("Marca: ");
			String marcaAuto3 = texto.next();
			System.out.println("Modelo: ");
			String modeloAuto3 = texto.next();
			System.out.println("Año: ");
			int anio3 = texto.nextInt();
			cotiza = new Cotiza("Cobertura limitada, precio de 1600 pesos al mes.", marcaAuto3,modeloAuto3,anio3);
			break;
			case 4:
			System.out.println("Marca: ");
			String marcaAuto4 = texto.next();
			System.out.println("Modelo: ");
			String modeloAuto4 = texto.next();
			System.out.println("Año: ");
			int anio4 = texto.nextInt();
			cotiza = new Cotiza("Cobertura Extendida, precio de 3000 pesos al mes.", marcaAuto4,modeloAuto4,anio4);
			break;

		}
	}

	/*Metodo que imprime la cotizacion hecha del usuario*/
	public void imprimirCotizacion(){
		System.out.println("COTIZACION EXITOSA.");
		System.out.println(cotiza.toString());
	}

	/*Metodo para llenar el formulario de contratacion del usuario*/
	public void contratarSeguro(){
		System.out.println("Llena el siguiente formulario para contratar.");
		System.out.println("Nombre del cliente: ");
		String nombre = texto.next();
    System.out.println("Tipo de seguro: "); 
    String tipo = texto.next();
    System.out.println("Marca: ");
    String marca = texto.next();
    System.out.println("Modelo: ");
    String modelo = texto.next();
    System.out.println("Año: ");
    int anio = texto.nextInt();
    System.out.println("Forma de pago: ");
    String pago = texto.next();

    contrata = new Contrata(nombre,tipo,marca,modelo,anio,pago);

	}

	/*Metodo que imprime la cotizacion si se realizo de manera exitosa*/
	public void imprimirContratacion(){
		System.out.println("CONTRATACION EXITOSA.");
		System.out.println(contrata.toString());
	}

	/*Metodo para llenar el formulario de cancelacion del servicio por parte del usuario.*/
	public void cancelarServicio(){

	System.out.println("Nombre completo: ");
	String nombre = texto.next();
	System.out.println("Motivo de cancelacion: ");
	String motivo = texto.next();
	cancela = new Cancela(nombre,motivo);

 	}

	/*Metodo que imprime el mensaje de cancelacion exitosa*/
 	public void imprimirCancelacion(){
		System.out.println("CANCELACION EXITOSA.");
		System.out.println(cancela.toString());
	}


	/*Metodo principal que hace la interaccion completa con el usuario,
	* que muestra la bienvenida, el registro, la cotizacion, la contratacion
	* y la cancelacion en dado caso*/
 	public void atenderUsuario(){
 		bienvenida();
 		registrarUsuario();
 		imprimirRegistro();
 		System.out.println("\n \n Desea hacer una cotizacion? S/N");
 		char respuesta = texto.next().charAt(0);
		if(respuesta == 'S'|| respuesta == 's'){
			System.out.println("Llenar el siguiente formulario: ");
			cotizarSeguro();
			imprimirCotizacion();
		}else{
			System.out.println("Adios. :(");

		}

		System.out.println("\n \n Desea proceder a una contratacion? S/N");

		char con = texto.next().charAt(0);
		if(con == 'S'|| con == 's'){
			contratarSeguro();
			imprimirContratacion();
		}else{
		System.out.println("Adios :(");
		}


		System.out.println("\n \n Desea hacer una cancelacion? S/N");

		char can = texto.next().charAt(0);
		if(can == 'S'|| can == 's'){
			cancelarServicio();
			imprimirCancelacion();
		}else{
		System.out.println("Adios :)");
		}

 	}

}