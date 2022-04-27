import java.util.ArrayList;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */

/**
* Esta clase crea una lista la lista de la EditorialC del tipo libro
*/
public class EditorialD {

    //Un ArrayList de objetos libro.
    ArrayList<Libro> librosD;

    /**
    * Constructor de la clase, con los datos de los libros.
    */
    public EditorialD() {
        librosD = new ArrayList<>();
        addItem("Como agua para chocolate",
                "Laura Esquivel",
                1989);
        addItem("La pasion turca",
                "Antonio Gala",
                1993);
        addItem("Azul",
                "Rosa Rega",
                1994);
        addItem("Las mascaras del heroe",
                "Juan Manuel de Prada",
                1996);
        addItem("La hija del canibal",
                "Rosa Montero",
                1997);
    }

    /**
    * Iterador usado para recorrer las lista 
    */
    public Iterator createIterator() {
        return new EditorialAIterator(librosD);
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
        librosD.add(libro);
    }
}
