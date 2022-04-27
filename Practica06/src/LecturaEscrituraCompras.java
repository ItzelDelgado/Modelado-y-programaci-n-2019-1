/** <p> Clase que modela La lectura y escritura
*       de las compras.</p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 09/11/2018
*/

import java.io.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.Attr;
import java.util.Scanner;
import javax.xml.transform.*;
import java.util.ArrayList;

public class LecturaEscrituraCompras{
    
    //Creacion de un objeto de tipo LecturaEsctrituraCompras.
	static LecturaEscrituraProductos entradaDatosProductos = new LecturaEscrituraProductos();
    //Creacion de un objeto del tipo vistaLecturaEscriruraCompras.
	static VistaLecturaEscrituraCompras vistaLecturaEscrituraCompras = new VistaLecturaEscrituraCompras();

    /** Creacion del metodo lectura, el cual se encarga de realizar la 
    *   lectura de las compras registradas en un xml mediante el uso dom.
    *   @param nombreArchivo hace referencia al nombre del archivo xml
    *
    */
	public BaseDeDatosCompras lectura(String nombreArchivo){
        //Creacion de un objeto de tipo BaseDatrosCompras.
		BaseDeDatosCompras baseDatosCompras = new BaseDeDatosCompras();
		//variable del tipo compra.
      	Compra compraObj;
      	//lista de productos.
      	ArrayList<Producto> listaProductos; 
      	//viable del tipo producto
      	Producto prod;
      	//varible id de compra 
		String idProducto;
		//variable articulo de compra
		String articulo;
		//varible precio de compra
		String precio;
		//variable de precio convertida a string
		double precioCast;

		try{
			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);
			NodeList compras = doc.getElementsByTagName("compras");
			NodeList compra1 = doc.getElementsByTagName("compra");
			NodeList productos1 = doc.getElementsByTagName("productos");
			NodeList producto1 = doc.getElementsByTagName("producto");

			for(int i = 0; i < compra1.getLength(); i++){

				Node compra = compra1.item(i);
			    Node productoss = productos1.item(i);

			    if(compra.getNodeType() == Node.ELEMENT_NODE){
			    	Element com = (Element)compra;
			    	Element prodElem = (Element)productoss;

					String idCliente = com.getAttribute("idCliente");
					String pagoTotal = com.getAttribute("pagoTotal");
					Double pagoTotalCast = Double.parseDouble(pagoTotal);
					String fecha = com.getAttribute("fecha");
					String entrega = com.getAttribute("entrega");
					String formaPago = com.getAttribute("formaPago");
					String totalProductos = prodElem.getAttribute("totalProductos");
					int totalProductosCast = Integer.parseInt(totalProductos);
				    listaProductos = new ArrayList<Producto>();

				    for( int a = 0; a < totalProductosCast; a++){

				    	idProducto = prodElem.getAttribute("idProducto");
						articulo = prodElem.getElementsByTagName("articulo").item(a).getTextContent();
						precio = prodElem.getElementsByTagName("precio").item(a).getTextContent();
						precioCast = Double.parseDouble(precio);
						
						prod = new Producto(idProducto,articulo,precioCast);
						listaProductos.add(prod);
					}
					compraObj = new Compra(idCliente,fecha,pagoTotalCast,totalProductosCast,formaPago,entrega,listaProductos);
					baseDatosCompras.agregaCompras(compraObj);
				}
			}
		}catch(Exception e){
				e.printStackTrace();
		}//Fin de catch
		return baseDatosCompras;
	}
    
    /** Creacion del metodo modificaComprasXML, el cual tiene como funcion 
    *   crear nuevas compras y agregarlas al xml correspondiente.
    *   @param hace referencia al nombre del archio xml.
    *
    */
	public static void modificaComprasXML(String nombreArchivo){

		Scanner texto = new Scanner(System.in);
		double pagoTotalDinero = 0.0;
		double pagoDescueto = 0.0;
		try{
			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);

			Node raiz = doc.getFirstChild();
				
			Element compra = doc.createElement("compra");
			raiz.appendChild(compra);
			String idCliente = vistaLecturaEscrituraCompras.vistaIDCliente();
			Attr attr = doc.createAttribute("idCliente");
			attr.setValue(idCliente);
			compra.setAttributeNode(attr);
			
			String fecha = vistaLecturaEscrituraCompras.vistaFecha();
			Attr attr2 = doc.createAttribute("fecha");
			attr2.setValue(fecha);
			compra.setAttributeNode(attr2);
			String entrega = vistaLecturaEscrituraCompras.vistaEntrega();
			Attr attr5 = doc.createAttribute("entrega");
			attr5.setValue(entrega);
			compra.setAttributeNode(attr5);
				
			Element productos = doc.createElement("productos");
			String numCon = vistaLecturaEscrituraCompras.vistaTotalProductos();
			Attr aproductos = doc.createAttribute("totalProductos");
			aproductos.setValue(numCon);
			productos.setAttributeNode(aproductos);
			int m = Integer.parseInt(numCon);
			for(int j = 1; j <= m; j++){

				Element producto = doc.createElement("producto");
				String idProducto = vistaLecturaEscrituraCompras.vistaIDProducto();
				Attr aidProducto = doc.createAttribute("idProducto");
				aidProducto.setValue(idProducto);
				producto.setAttributeNode(aidProducto);
				Producto productoEliminado = entradaDatosProductos.eliminaProductoXml("ProductosXml.xml",idProducto);

				Element articulo = doc.createElement("articulo");
				String art = productoEliminado.getArticulo();
				articulo.appendChild(doc.createTextNode(art));
				producto.appendChild(articulo);

				Element precio = doc.createElement("precio");
				double precioContador = productoEliminado.getPrecio();
				pagoTotalDinero = pagoTotalDinero + precioContador;

				precio.appendChild(doc.createTextNode(precioContador + ""));
				producto.appendChild(precio);
				productos.appendChild(producto);
			}
			String formaPago = vistaLecturaEscrituraCompras.vistaFormaPago();
			switch(formaPago){
				case "E":
				pagoDescueto = pagoTotalDinero;
				Attr attr4 = doc.createAttribute("formaPago");
				attr4.setValue("Efectivo");
				compra.setAttributeNode(attr4);
				case "e":
				pagoDescueto = pagoTotalDinero;
				Attr attr4e = doc.createAttribute("formaPago");
				attr4e.setValue("Efectivo");
				compra.setAttributeNode(attr4e);
				case "C":
					pagoDescueto = pagoTotalDinero - (pagoTotalDinero*.10);
				Attr attr4C = doc.createAttribute("formaPago");
				attr4C.setValue("Credito con descunento 10%");
				compra.setAttributeNode(attr4C);
				case "c":
				pagoDescueto = pagoTotalDinero - (pagoTotalDinero*.10);
				Attr attr4c = doc.createAttribute("formaPago");
				attr4c.setValue("Credito con descunento 10%");
				compra.setAttributeNode(attr4c);
			}
			String pagoTotal = ""+ pagoDescueto;
			Attr attr3 = doc.createAttribute("pagoTotal");
			attr3.setValue(pagoTotal);
			compra.setAttributeNode(attr3);

			compra.appendChild(productos);

			raiz.appendChild(compra);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(nombreArchivo));
			transformer.transform(source, result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    
    /** Creacion del metodo renuevaCompraXml, el cual tiene como funcion
	*   realizar una eliminacion de productos en el xml de compras, asi como 
	*   su reintegracion del producto eliminado a la lista de xml productos.
	*   @param nombreArchivo hace referencia al nombre del xml.
	*   @param idClienteEntrada hace refencia al idCliente pero ingresado por el usuario.
	*   @param idProductoEntrada hace referencia al idProducto pero al ingresado por el usuario.
	*/
	public void renuevaCompraXml(String nombreArchivo, String idClienteEntrada, String idProductoEntrada){

		BaseDeDatosCompras baseDatosCompras = new BaseDeDatosCompras();
      	Compra compraObj;
      	ArrayList<Producto> listaProductos; 
      	Producto prod;
		String idProducto;
		String articulo;
		String precio;
		double precioCast;
		String pagoTotal;
		Double pagoTotalCast;
		String fecha;
		String entrega;
		String formaPago;
		String totalProductos;
		int totalProductosCast;

		try{
			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);
			Node raiz = doc.getFirstChild();
			NodeList compras = doc.getElementsByTagName("compras");
			NodeList compra1 = doc.getElementsByTagName("compra");
			NodeList productos1 = doc.getElementsByTagName("productos");
			NodeList producto1 = doc.getElementsByTagName("producto");

			for(int i = 0; i < compra1.getLength(); i++){
				
				Node compra = compra1.item(i);
				Node productoss = productos1.item(i);

				if(compra.getNodeType() == Node.ELEMENT_NODE){

					Element com = (Element)compra;
					Element prodElem = (Element)productoss;

					String idCliente = com.getAttribute("idCliente");

					pagoTotal = com.getAttribute("pagoTotal");
					pagoTotalCast = Double.parseDouble(pagoTotal);
					fecha = com.getAttribute("fecha");
					entrega = com.getAttribute("entrega");
					formaPago = com.getAttribute("formaPago");
					totalProductos = prodElem.getAttribute("totalProductos");
					totalProductosCast = Integer.parseInt(totalProductos);

					if(idCliente.equals(idClienteEntrada)){

						for( int a = 0; a <totalProductosCast; a++){

							Node productoElimina = producto1.item(a);
							Element producto_1 = (Element)productoElimina;

							idProducto = producto_1.getAttribute("idProducto");
							articulo = prodElem.getElementsByTagName("articulo").item(a).getTextContent();
							precio = prodElem.getElementsByTagName("precio").item(a).getTextContent();

							if(idProducto.equals(idProductoEntrada)){

								Attr aproductos = doc.createAttribute("totalProductos");
				    			aproductos.setValue((totalProductosCast-1)+"");
				   				prodElem.setAttributeNode(aproductos);

								productoss.removeChild(producto_1);
							
							
								TransformerFactory transformerFactory = TransformerFactory.newInstance();
								Transformer transformer = transformerFactory.newTransformer();
								DOMSource source = new DOMSource(doc);
								StreamResult result = new StreamResult(new File(nombreArchivo));
								transformer.transform(source, result);
								entradaDatosProductos.modificaProductosXML("ProductosXml.xml",idProducto,articulo,precio);
								System.out.println("Se devolvio el producto:" + "IDProducto" + idProducto +"\n"
									+ "Nombre: " + articulo + " Precio:" + precio+ "\n" 
									+ "Al criente con el idCliente:" + idCliente + "\n");
							}
						}//fin del for para leer los productos por usuario
					}
				}//fin de if cliente
			}//fin del for de compra
		}catch(Exception e){
				e.printStackTrace();
		}//Fin de catch
	}
}