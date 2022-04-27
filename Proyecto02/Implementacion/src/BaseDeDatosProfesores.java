/** <p> Clase que modela la base de datos de profesores </p>
* @author Miguel Angel Martinez Mendoza 
* @author Luis Angel Rojas Espinoza
* @author Itzel Azucena Delgado Díaz
* @version 20/11/2018
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

public class BaseDeDatosProfesores{
	//declaracion de la lista de profesores.
	static ArrayList<Profesor> profesores;

	/** Creacion del constructor el cual incializa 
	*	la lista de profesores.
	*
	*/
	public BaseDeDatosProfesores(){

		profesores = new ArrayList<Profesor>();
	}

	/** Creacion del metodo size el cual regresa el tamaño 
	*	de la lista de profesores.
	*
	*/
	public int size(){

		return profesores.size();
	}

	/** Creacion del metodo getProfesor el cual regresa 
	*	un unico profesor.
	*	@param profesor hace referencia a un profesor.
	*
	*/
	public Profesor getProfesor(int profesor){

		return profesores.get(profesor);
	}

	public void imprimir(){

		for (int i=0; i<profesores.size(); i++){

			System.out.println(profesores.get(i));
		}
	}

	public int buscaPosicion(String claveAcceso){
		int tmp =0;
		for(int i=0; i<profesores.size(); i++){
			if(claveAcceso.equals(profesores.get(i).getClaveAcceso())){
				tmp =i;
			}
		}
		return tmp;
	}

	public void guarda(String nombreArchivo){

		Profesor profesorObj;

		try{

			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);
			NodeList listaProfesores = doc.getElementsByTagName("ListaProfesores");
			NodeList profesor_1 = doc.getElementsByTagName("Profesor");
			
			for(int i = 0; i < 18; i++){
				
				Node profesor_2 = profesor_1.item(i);
			
				if(profesor_2.getNodeType() == Node.ELEMENT_NODE){

				Element profesor_3 = (Element)profesor_2;
				String nombreProfesor = profesor_3.getAttribute("nombreProfesor");
				String claveAcceso = profesor_3.getAttribute("claveAcceso");
				String grupo = profesor_3.getAttribute("grupo");

				profesorObj = new Profesor(nombreProfesor,claveAcceso,grupo);
				profesores.add(profesorObj);
				
				}
			}
		
			}catch(Exception e){
				e.printStackTrace();
		}//Fin de catch
	}


	public static void limpiaXml(String nombreArchivo){

    	try{

			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);

			Node raiz = doc.getFirstChild();
			NodeList grupoLimpia = doc.getElementsByTagName("ListaProfesores");

			Node grupoLimpia_1 = grupoLimpia.item(0);

			if(grupoLimpia_1.getNodeType() == Node.ELEMENT_NODE){

				Element grupoLimpia_2 = (Element)grupoLimpia_1;
				raiz.removeChild(grupoLimpia_2);

				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(doc);
				StreamResult result = new StreamResult(new File(nombreArchivo));
				transformer.transform(source, result);
    		}
		}catch(Exception e){
				e.printStackTrace();
		}
	}

	public void carga(String nombreArchivo){
		limpiaXml(nombreArchivo);

		try{

			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);

			Node raiz = doc.getFirstChild();
			Element listaAlumnos = doc.createElement("ListaProfesores");
			raiz.appendChild(listaAlumnos);

			for(int j= 0; j < profesores.size(); j++){
			Element profesor = doc.createElement("Profesor");

			Attr nombreProfesor = doc.createAttribute("nombreProfesor");
			nombreProfesor.setValue(profesores.get(j).getNombreProfesor());
			profesor.setAttributeNode(nombreProfesor);

			Attr claveAcceso = doc.createAttribute("claveAcceso");
			claveAcceso.setValue(profesores.get(j).getClaveAcceso());
			profesor.setAttributeNode(claveAcceso);
			listaAlumnos.appendChild(profesor);

			Attr grupoAtt = doc.createAttribute("grupo");
			grupoAtt.setValue(profesores.get(j).getGrupo());
			profesor.setAttributeNode(grupoAtt);
			listaAlumnos.appendChild(profesor);
		}

			raiz.appendChild(listaAlumnos);
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(nombreArchivo));
			transformer.transform(source, result);

		}catch(Exception e){
			e.printStackTrace();
		}


	}

}