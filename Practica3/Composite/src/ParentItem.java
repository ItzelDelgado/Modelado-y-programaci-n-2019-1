/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase compuesta por otra subclase secundaria en la cual las dos extienden de @CompositeClass
 */
public class ParentItem extends CompositeClass {
    //ArrayList generico de tipo CompositeClass, donde guardaremos las subclases.
    private ArrayList<CompositeClass> subItems = new ArrayList<>();
   	
    private String parentName;
    int element = 0;

    /**
     * Constructor para el elemento parent.
     *
     * @param parentName nombre del item padre
     */
    public ParentItem(String parentName) {
        this.parentName = parentName;
    }

    /**
     * Metodo que grega un componente al arrayList,
     * y de esta manera compone a ParentItem.
     * @param un elemento de tipo CompositeClass.
     */
    public void addSubItem(CompositeClass subItem) {
        subItems.add(subItem);
    }

    /**
     * Metodo que elimina un CompositeClass del array.
     * @param el objeto de tipo Composite Class que queremos eliminar.
    */
    public void removeSubItem(CompositeClass subItem) {
        subItems.remove(subItem);
    }


    /**
    * @return un String con el nombre del componente.
    */
    @Override
    public String getCompositeName() {
        return parentName;
    }
    

    /*
    * Metodo para imprimir la clase. Especificamente la lista con los componentes de esta.
    * Usando un iterador, se estan imprimiendo los nombres de los sub-items. 
    */
    @Override
    public void print() {
        System.out.println("Tipo de figura: " + getCompositeName());

        
        Iterator<CompositeClass> iterator = subItems.iterator();
        
        while (iterator.hasNext()) {
            CompositeClass sub = iterator.next();
            sub.print();
            element++;

        }

        System.out.println("Es una figura compuesta por: " + element + " lineas.");
    }


}
