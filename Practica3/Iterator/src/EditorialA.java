import java.util.ArrayList;
/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */


/**
* Esta clase crea una lista la lista de la EditorialA del tipo libro
*/
public class EditorialA {
    //Un ArrayList de objetos libro.
    ArrayList<Libro> librosA;


    /**
    * Constructor de la clase, con los datos de los libros.
    */
    public EditorialA() {
        librosA = new ArrayList<>();
        addItem("Cañas y barro",
                "Vicente Blasco Ibañez",
                1902);
        addItem("Tirano Banderas",
                "Ramon Maria",
                1926);
        addItem("La colmena",
                "Camilo Jose Cela",
                1969);
         addItem("Señor presidente",
                "Miguel Angel Asturias",
                1946);
          addItem("Pedro Paramo",
                "Juan Rulfo",
                1955);
    }

    /**
    * Iterador usado para recorrer las lista 
    */
    public Iterator createIterator() {
        return new EditorialAIterator(librosA);
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
        librosA.add(libro);
    }
}
