import java.util.ArrayList;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */


    /**
     * Clase que implementa los metodos de la interface @Iterator
     * que nos permite iterar una lista.
    */
public class EditorialAIterator implements Iterator {
    ArrayList libros;
    int posicion = 0;


    /*
    * @param un ArrayList 
    * Constructor de la clase 
    */
    public EditorialAIterator(ArrayList libros) {
        this.libros = libros;
    }

    @Override
    public boolean hasNext() {
        if (posicion >= libros.size() || libros.get(posicion) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Libro libro = (Libro) libros.get(posicion);
        posicion = posicion + 1;
        return libro;
    }
}
