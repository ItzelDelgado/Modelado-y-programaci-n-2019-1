/** <p> Clase que modela la Base de datos de alumnos </p>
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


public class BaseDeDatosAlumnos{

 	static ArrayList<Alumno> alumnos;
 	static String profesor;
 	static String grupoId;
 	static int numAlumnos;

	/** Creacion del constructor de la base de datos el cual 
	*   inicializa el la lista de alumnos.
	*	
	*/
 	public BaseDeDatosAlumnos(){
 		
 		alumnos = new ArrayList<Alumno>();
 	}

	public void agrega(Alumno alumno){
		alumnos.add(alumno);
	}

	public void elimina(Alumno alumno){

		alumnos.remove(alumno);
	}

	/** Creacion del metodo eliminaPorNumCuenta el cual busca 
	*	por numero de cuenta a un alumno y lo elimina de la 
	*	lista de alumnos.
	*	@param numCuenta hace referencia al numero de cuenta del alumno. 
	*
	*/
	public void eliminaPorNumCuenta(String numCuenta){
		int temp = buscaPosicion(numCuenta);
		alumnos.remove(getAlumno(temp));
	}

	/** Creacion del metodo size el cual regresa el tamaño
	*   de la lista de alumnos.
	*
	*/
	public int size(){
		return alumnos.size();
	}

	/** Creacion del metodo getAlumnos el cual regresa un unico
	*   alumno de la lista.	
	*	@param alumno hace referencia a un alumno.
	*/
	public Alumno getAlumno(int alumno){

		return alumnos.get(alumno);
	}

	/** Creacion del metodo buscaPosicion el cual busca la posicion 
	*	por numero de cuenta de un alumno.
	*	@param numCuenta hace referencia a numero de cuenta del alumno.
	*
	*/
	static public int buscaPosicion(String numCuenta){
        int tmp =0;
		for(int i =0 ;i<alumnos.size(); i++){
			
			if(numCuenta.equals(alumnos.get(i).getNoCuenta())){
				
				tmp = i;	 
			}
		}
		return tmp;
	}

	/** Creacion del metodo imprimir el cual imprime al grupo en general 
	*	con su respectivo profesor y su lista de alumnos.
	*/
	public void imprimir(){

		System.out.println("Lista de Alumnos:\n" + "Grupo:" + this.grupoId + "   Profesor:" 
			               + this.profesor + "   Numero de alumnos:" + alumnos.size() + "\n");
		for(int i=0; i<alumnos.size(); i++){

			System.out.println(alumnos.get(i).getNombre() + "   " + alumnos.get(i).getNoCuenta());
			

		}

	}

	/**	Creacion del metodo guarda que tiene como funcion realizar la lectura
	*	de un xml y extraer los datos para posteriormente almacenarlos en una lista
	*	para su futuro manejo.
	*	@param nombreArchivo hace referecia al nombre del xml.
	*/
	public void guarda(String nombreArchivo){

		Bimestre bimestreObj;
		Año añoObj;
		ArrayList<Bimestre> bimestreList;
		Historial historialObj;
		ArrayList<Año> añoList;
		Alumno alumnoObj;

		try{
			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);
			NodeList listaAlumnos = doc.getElementsByTagName("ListaAlumnos");
			NodeList grupo_1 = doc.getElementsByTagName("Grupo");
			NodeList alumno_1 = doc.getElementsByTagName("Alumno");
			NodeList historial_1 = doc.getElementsByTagName("Historial");
			NodeList año_1 = doc.getElementsByTagName("Año");
			NodeList bimestre_1 = doc.getElementsByTagName("Bimestre");

			Node grupo_2 = grupo_1.item(0);

			if(grupo_2.getNodeType() == Node.ELEMENT_NODE){
					

				Element grupo_3 =(Element)grupo_2;
			
		 		this.grupoId     = grupo_3.getAttribute("grupoId");
		 		this.profesor    = grupo_3.getAttribute("profesor");
		 		String numAlumnosS  = grupo_3.getAttribute("numAlumnos");
		 		this.numAlumnos = Integer.parseInt(numAlumnosS);
		 		

 				for(int a = 0; a < numAlumnos; a++){

					Node alumno_2 = alumno_1.item(a);
					Element alumno_3 =(Element)alumno_2;
			 		String cuenta   = alumno_3.getAttribute("cuenta");
			 		String nombre   = alumno_3.getAttribute("nombre");
			 		
			 		

					Node historial_2 = historial_1.item(0);
					Element historial_3 =(Element)historial_2;
					String numAños  = historial_3.getAttribute("numAños");
					int numAñosCast = Integer.parseInt(numAños);
					añoList = new ArrayList<Año>();
					for( int e = 0; e < numAñosCast; e++){
			
						Node año_2 = año_1.item(e);
						Element año_3 =(Element)año_2;
						String grado   = año_3.getAttribute("grado");
						String numBim  = año_3.getAttribute("numBim");
						//System.out.println("prueba grados" + grado);
						int numBimCast = Integer.parseInt(numBim);
						bimestreList = new ArrayList<Bimestre>();
						for( int i = 0; i < numBimCast; i++){
			
							Node bimestre_2 = bimestre_1.item(i);
							Element bimestre_3 =(Element)bimestre_2;


							String bimId = bimestre_3.getAttribute("bimId");
							int bimIdCast = Integer.parseInt(bimId);
							
							String esp   = bimestre_3.getAttribute("esp");
							int espCast = Integer.parseInt(esp);
							String mat   = bimestre_3.getAttribute("mat");
							int matCast = Integer.parseInt(mat);
							String cnat  = bimestre_3.getAttribute("cnat");
							int cnatCast = Integer.parseInt(cnat);
							String csoc  = bimestre_3.getAttribute("csoc");
							int csocCast = Integer.parseInt(csoc);
							String edfis = bimestre_3.getAttribute("edfis");
							int edfisCast = Integer.parseInt(edfis);
							String ing   = bimestre_3.getAttribute("ing");
							int ingCast = Integer.parseInt(ing);
							
							bimestreObj = new Bimestre(bimId,espCast, matCast,cnatCast,csocCast,edfisCast,ingCast);
							bimestreList.add(bimestreObj);
							
						}
						añoObj = new Año(grado,numBimCast,bimestreList);
						añoList.add(añoObj);
						
					}
					historialObj = new Historial(numAñosCast,añoList);
				
					alumnoObj = new Alumno(nombre,cuenta,historialObj);
					alumnos.add(alumnoObj);
								}
			}
		}catch(Exception e){
				e.printStackTrace();
		}//Fin de catch
	}
    
    /** Creacion del metodo limpiaXml el cual elimina todo el contenido de un xml 
    *	a exepcion de la etiqueta raiz.
    *	@param nombreArchivo hace referencia al nombre del xml.
    */
    public static void limpiaXml(String nombreArchivo){

    	try{

			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);

			Node raiz = doc.getFirstChild();
			NodeList grupoLimpia = doc.getElementsByTagName("Grupo");

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


	/** Creacion del metodo carga el cual se encarga de sobreescribir los datos 
	*	del xml cargado.
	*	@param nombreArchivo hace referencia al nombre del xml.
	*
	*/
	public void carga(String nombreArchivo){
 					limpiaXml(nombreArchivo);

		try{

			File archivo = new File(nombreArchivo);
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(archivo);


			Node raiz = doc.getFirstChild();
            
			Element grupo = doc.createElement("Grupo");
			raiz.appendChild(grupo); 
            
			Attr grupoId_1 = doc.createAttribute("grupoId");
			grupoId_1.setValue(this.grupoId);
			grupo.setAttributeNode(grupoId_1);
            
			Attr profesor_1 = doc.createAttribute("profesor");
			profesor_1.setValue(this.profesor);
			grupo.setAttributeNode(profesor_1);

			
			String numeroAlumnos = String.valueOf(alumnos.size());
			Attr numAlumnos_1 = doc.createAttribute("numAlumnos");
			numAlumnos_1.setValue(numeroAlumnos);
			grupo.setAttributeNode(numAlumnos_1);
			int j;
			int k;

			for(j = 0; j < alumnos.size(); j++){

				Element alumno = doc.createElement("Alumno");

				Attr cuenta_1 = doc.createAttribute("cuenta");
				cuenta_1.setValue(alumnos.get(j).getNoCuenta());
				alumno.setAttributeNode(cuenta_1);

				Attr nombre_1 = doc.createAttribute("nombre");
				nombre_1.setValue(alumnos.get(j).getNombre());
				alumno.setAttributeNode(nombre_1);

				Element historial = doc.createElement("Historial");

				Attr numAños = doc.createAttribute("numAños");
				int numerAñosInt = alumnos.get(j).getHistorial().getNumAños();
				String valorNumeroAños = String.valueOf(numerAñosInt);
				numAños.setValue(valorNumeroAños);
				historial.setAttributeNode(numAños);
	            int numAñosParse = alumnos.get(j).getHistorial().getNumAños();

				for(k = 0; k < numAñosParse; k++){


					Element año = doc.createElement("Año");
						
					Attr grado = doc.createAttribute("grado");
					grado.setValue(alumnos.get(j).getHistorial().getAño(k).getGrado());
					año.setAttributeNode(grado);

					Attr numBim = doc.createAttribute("numBim");
					int numBimInt = alumnos.get(j).getHistorial().getAño(k).getNumBim();
					String numBimCast = String.valueOf(numBimInt);
					numBim.setValue(numBimCast);
					año.setAttributeNode(numBim);

/*--------*/
					for(int i = 0; i < numBimInt; i++){

						Element bimestre = doc.createElement("Bimestre");

						Attr bimId = doc.createAttribute("bimId");
						bimId.setValue(alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getBimId());
						bimestre.setAttributeNode(bimId);

						Attr cnat = doc.createAttribute("cnat");
						int cienNatInt = alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getCienciasNaturales();
						String cienNat = String.valueOf(cienNatInt);
						cnat.setValue(cienNat);
						bimestre.setAttributeNode(cnat);

						Attr csoc = doc.createAttribute("csoc");
						int cienSosInt = alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getCienciasSociales();
						String cienSos = String.valueOf(cienSosInt);
						csoc.setValue(cienSos);
						bimestre.setAttributeNode(csoc);

						Attr edfis = doc.createAttribute("edfis");
						int educFiscInt = alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getEducacionFisica();
						String educFisc = String.valueOf(educFiscInt);
						edfis.setValue(educFisc);
						bimestre.setAttributeNode(edfis);

						Attr esp = doc.createAttribute("esp");
						int españolInt = alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getEspañol();
						String español = String.valueOf(españolInt);
						esp.setValue(español);
						bimestre.setAttributeNode(esp);

						Attr ing = doc.createAttribute("ing");
						int inglesInt = alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getIngles();
						String ingles = String.valueOf(inglesInt);
						ing.setValue(ingles);
						bimestre.setAttributeNode(ing);

						Attr mat = doc.createAttribute("mat");
						int matematicasInt = alumnos.get(j).getHistorial().getAño(k).getBimestre(i).getMatematicas();
						String matematicas = String.valueOf(matematicasInt);
						mat.setValue(matematicas);
						bimestre.setAttributeNode(mat);
						año.appendChild(bimestre);
					}
					historial.appendChild(año);
					alumno.appendChild(historial);
				}
				grupo.appendChild(alumno);
			}
			raiz.appendChild(grupo);
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
