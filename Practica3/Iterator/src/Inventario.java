/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */

/**Clase Inventario que construye el inventario total de las cuatro editoriales
*/
public class Inventario {
    //Lista de la editorialA
    EditorialA editorialA;
    //Lista de la editorialB
    EditorialB editorialB;
    //Lista de la editorialC
    EditorialC editorialC;
    //Lista de la editorialD
    EditorialD editorialD;

    /**Constructor del inventario que tiene como parametros las listas de las editoriales.
    */
    public Inventario(EditorialA editorialA, EditorialB editorialB,
    				  EditorialC editorialC, EditorialD editorialD) {
        this.editorialA = editorialA;
        this.editorialB = editorialB;
        this.editorialC = editorialC;
        this.editorialD = editorialD;
    }

    /**Metodo que implime el inventario*/
    public void printInventario() {
        Iterator aIterator = editorialA.createIterator();
        Iterator bIterator = editorialB.createIterator();
        Iterator cIterator = editorialC.createIterator();
        Iterator dIterator = editorialD.createIterator();
        System.out.println("Inventario de libros\n**********************\n \n   Editorial A\n");
        printInventario(aIterator);
        System.out.println("\n \n   Editorial B\n");
        printInventario(bIterator);
        System.out.println("\n \n   Editorial C\n");
        printInventario(cIterator);
        System.out.println("\n \n   Editorial D\n");
        printInventario(dIterator);

    }

    /**Metodo privado que crea el iterador que recorre las listas de las editoriales.
    */
    private void printInventario(Iterator iterator) {
        while (iterator.hasNext()) {
            Libro libro = (Libro) iterator.next();
            System.out.println(libro.getTitulo() + ", ");
            System.out.println(libro.getAutor() + ", ");
            System.out.println(libro.getYear() + ". ");
            System.out.println(" ");
        }
    }
}
