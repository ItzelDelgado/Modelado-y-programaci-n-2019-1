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
public class EditorialC{
    //Un ArrayList de objetos libro.
    ArrayList<Libro> librosC;

    /**
    * Constructor de la clase, con los datos de los libros.
    */
    public EditorialC() {
        librosC = new ArrayList<>();
        addItem("Galindez",
                "Manuel Vazquez Montalban",
                1990);
        addItem("Las edades de Lulu",
                "Almudena Grandes",
                1980);
        addItem("La sonrisa etrusca",
                "Jose Luis Samopedro",
                1985);
        addItem("La torre herida por el rayo",
                "Fernando Arrabal",
                1983);
        addItem("La ciudad de los prodigios",
                "Eduardo Mendoza",
                1986);
    }

    /**
    * Iterador usado para recorrer las lista 
    */
    public Iterator createIterator() {
        return new EditorialAIterator(librosC);
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
        librosC.add(libro);
    }
}
