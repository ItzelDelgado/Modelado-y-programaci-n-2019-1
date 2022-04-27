/** <p> Clase que modela La lectura y escritura
*       de los productos.</p>
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


public class LecturaEscrituraProductos{

    /** Creacion del metodo lectura, el cual tiene como funcion realizar
    *   la lectura del xml de productos y almacenarnos en una baseDeDatosProductos.
    *   @param nombreArchivo hace refencia al nombre del archivo xml.
    *
    */
	public BaseDeDatosProductos lectura(String nombreArchivo ){

      	BaseDeDatosProductos baseDatosProductos = new BaseDeDatosProductos();
      	Producto productoObj;

      	try{

	 	File archivo = new File(nombreArchivo);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(archivo);
		NodeList productos = doc.getElementsByTagName("productos");
		NodeList produc = doc.getElementsByTagName("producto");


		for(int i = 0; i < produc.getLength(); i++){

			Node producto = produc.item(i);

			if(producto.getNodeType() == Node.ELEMENT_NODE){

				Element producto_1 = (Element)producto;

				String id = producto_1.getAttribute("id");
				String articulo = producto_1.getElementsByTagName("articulo").item(0).getTextContent();
				String precio = producto_1.getElementsByTagName("precio").item(0).getTextContent();
				double precioCast = Double.parseDouble(precio);


				productoObj = new Producto(id,articulo,precioCast);

				baseDatosProductos.agregaProducto(productoObj);
			}
		}
	}catch(Exception e){
		e.printStackTrace();
		}//Fin de catch


		return baseDatosProductos;
	}

    /** Creacion del metodo modificaProductosXML el cual tiene como funcion
    *   realizar una modificacion de algun producto almacenado en el xml.
    *   @param nombreArchivo hace referencia al nombre del xml
    *   @param idProducto hace referencia al idProducto ingresado
    *   @param art hace referencia al nombre del articulo ingresado
    *   @param precioEntrada hace referencia al precio del articulo ingresado
    */
	public static void modificaProductosXML(String nombreArchivo,String idProducto,String art, String precioEntrada){
		Scanner texto = new Scanner(System.in);
		try{

				File archivo = new File(nombreArchivo);
				DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
				Document doc = docBuilder.parse(archivo);

				Node raiz = doc.getFirstChild();
				
				Element producto = doc.createElement("producto");
				raiz.appendChild(producto);
				Attr attr = doc.createAttribute("id");
				attr.setValue(idProducto);
				producto.setAttributeNode(attr);
					Element articulo = doc.createElement("articulo");
					articulo.appendChild(doc.createTextNode(art));
					producto.appendChild(articulo);

					Element precio = doc.createElement("precio");
					precio.appendChild(doc.createTextNode(precioEntrada));
					producto.appendChild(precio);

				raiz.appendChild(producto);

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(nombreArchivo));
				transformer.transform(source, result);
	 		
	 			}catch(Exception e){
			e.printStackTrace();
		}


	}

    /** Creacion del metodo que eliminaProductosXml que tiene como funcion
    *   eliminar un producto mediante su  id.
    *   @param nombreArchivo hace referencia al nombre del xml
    *   @param idEntrada hace referncia al id pasado por el usuario para su busqueda
    *   @return regresa el producto a elimnar
    */
	public Producto eliminaProductoXml(String nombreArchivo,String idEntrada){
		String id="";
				String articulo="";
				String precio="";
				double precioCast=0.0;
					Producto productoObj = new Producto("","",0.0);

		try{

	 	File archivo = new File(nombreArchivo);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(archivo);
		Node raiz = doc.getFirstChild();
		NodeList productos = doc.getElementsByTagName("productos");
		NodeList produc = doc.getElementsByTagName("producto");



		for(int i = 0; i < produc.getLength(); i++){

			Node producto = produc.item(i);

			if(producto.getNodeType() == Node.ELEMENT_NODE){

				Element producto_1 = (Element)producto;

				id = producto_1.getAttribute("id");
				if(id.equals(idEntrada)){
				articulo = producto_1.getElementsByTagName("articulo").item(0).getTextContent();
				precio = producto_1.getElementsByTagName("precio").item(0).getTextContent();
				precioCast = Double.parseDouble(precio);


				productoObj.setId(id);
				productoObj.setArticulo(articulo);
				productoObj.setPrecio(precioCast);

					raiz.removeChild(producto_1);
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(doc);
					StreamResult result = new StreamResult(new File(nombreArchivo));
					transformer.transform(source, result);
	 		
				}
			}
		}
	}catch(Exception e){
		e.printStackTrace();
		}//Fin de catch

		return productoObj;
	}





}