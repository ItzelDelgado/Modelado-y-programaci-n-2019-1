/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */


/**
	* Clase principal que imprime el inventario de la libreria
	*Coof Coof, separado por las cuatro distintas editoriales
	* que se venden ahi.
*/
public class CoofCoof {
    public static void main(String[] args) {
        EditorialA editorialA = new EditorialA();
        EditorialB editorialB = new EditorialB();
        EditorialC editorialC = new EditorialC();
        EditorialD editorialD = new EditorialD();
        
        Inventario inventario = new Inventario(editorialA,editorialB,	editorialC, editorialD);
        System.out.println("\n********** LIBRERIA Coof Coof **********\n");
        System.out.println("Gran promocion de libros. :D\n");
        inventario.printInventario();
    }
}
