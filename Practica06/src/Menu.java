/** <p> Clase que modela el menu perteneciente al controlar</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

public class Menu{

	VistaMenu vista = new VistaMenu();
	LecturaEscrituraProductos entradaDatos = new LecturaEscrituraProductos();
	LecturaEscrituraCompras entradaDatosCompras = new LecturaEscrituraCompras();
    
    /** Creacion del metodo Bienvenida es cual tiene como funcion 
    *   mandar a imprimir el catalogo de productos.
    *
    */
	public void Bienvenida(){

        System.out.print("\033[H\033[2J");
        System.out.println("\033[31m");
		System.out.println("Hola Bienvenido Tienda Ciencias");
		imprimeCatalogo();

	}
    
    /** Creacion del metodo MenuAtivdad el cual manda a llamar 
    *   modificaComprasXml o devolucionProducto dependiendo de la 
    *   opcion elegida.
    */
	public void MenuActividad(){

		int respuesta = vista.respuestasMenu();

		if(respuesta == 1){

			entradaDatosCompras.modificaComprasXML("CompraXml.xml");
			BaseDeDatosProductos baseDatos = entradaDatos.lectura("ProductosXml.xml");
			BaseDeDatosCompras baseDeDatosCompras = entradaDatosCompras.lectura("CompraXml.xml");
			Compra imprimeUna = baseDeDatosCompras.get(baseDeDatosCompras.size()-1);
			System.out.println(imprimeUna);
		}else{

			String idCliente = vista.devolucionIdCliente();
			String idProducto = vista.devolucionIdProducto();
			entradaDatosCompras.renuevaCompraXml("CompraXml.xml", idCliente, idProducto);
		}


	}
    
    /** Creacion del metodo ImprimeCatalogo el cual manda a llamar 
    *   el metodo imprimir de la BaseDeDatosProductos.
    *
    */
	public void imprimeCatalogo(){
		
		BaseDeDatosProductos baseDeDatosProductos = entradaDatos.lectura("ProductosXml.xml");
		baseDeDatosProductos.imprimir();

	}




}