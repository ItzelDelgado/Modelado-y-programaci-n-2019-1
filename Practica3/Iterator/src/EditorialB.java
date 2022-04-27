import java.util.ArrayList;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */

/**
* Esta clase crea una lista la lista de la EditorialB del tipo libro
*/
public class EditorialB {
    //Un ArrayList de objetos libro.
    ArrayList<Libro> librosB;

    /**
    * Constructor de la clase, con los datos de los libros.
    */
    public EditorialB() {
        librosB = new ArrayList<>();
        addItem("La tregua",
                "Mario Bennedetti",
                1960);
        addItem("El coronel no tiene quien le escriba",
                "Gabriel Garcia Marquez",
                1961);
        addItem("Rayuela",
                "Julio Cortazar",
                1963);
        addItem("El beso de la mujer araña",
                "Manuel Puig",
                1976);
         addItem("La casa de los espiritus",
                "Isabel Allende",
                1982);
         

    }

    /**
    * Iterador usado para recorrer las lista 
    */
    public Iterator createIterator() {
        return new EditorialAIterator(librosB);
    }

    /**
    * metodo que agrega los objetos libro a la lista a la lista
    *@param String titulo el titulo del libro
    *@param String autor el nombre del autor
    *@param int year el a;o de publicacion del libro.
    * Los parametros de entrada son los atributos de los ojetos libro.
    */
    private void addItem(String titulo, String autor, int year) {
        Libro libro = new Libro(titulo, autor, year);
        librosB.add(libro);
    }
}
