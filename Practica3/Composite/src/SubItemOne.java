/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */


/**
 * Clase que extiende de @CompositeClass e implementa los metodos.
 * Clase componente o subclase. 
 */
public class SubItemOne extends CompositeClass {
    
    private String subName;

    /**
    * Constructor para el elemento itemOne 
    * @param subName nombre del itemOne
    */
    public SubItemOne(String subName) {
        this.subName = subName;
    }

    /**
    * @return regresa el nombre del sub item
    */
    @Override
    public String getCompositeName() {
        return subName;
    }

    /**
    * Metodo que imprime el objeto.
    */
    @Override
    public void print() {
        System.out.println("- " + getCompositeName());
    }
}
