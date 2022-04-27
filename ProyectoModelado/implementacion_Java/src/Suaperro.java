/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */

/**
 * Clase que implementa el ingrediente con el que se decorará
 * el taco que queremos modificar. En este caso el ingrediente es 
 * Suaperro..
 */ 
public class Suaperro extends Ingrediente{
	
	/* Un taco con descripción y precio*/
	TemplateTaco taco;


	/*Construye un taco decorado con Suaperro con descripción y precio*/
	/*@param el taco que vamos a decorar*/
	public Suaperro(TemplateTaco taco){
		this.taco = taco;
	}

	/*Devuelve la descripción del taco que recibio más el nuevo ingrediente.*/
	public String getDescripcion(){
		return taco.getDescripcion() + " + Suaperro.";
	}

	/*Devuelve el precio del taco que recibio 
	  más el precio extra del nuevo ingrediente.*/
	public int getPrecio(){
		return taco.getPrecio() + 7;
	}

}