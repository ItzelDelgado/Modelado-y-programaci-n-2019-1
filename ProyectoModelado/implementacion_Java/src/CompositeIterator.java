/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */

import java.util.ArrayList;

/**
 * Clase que implementa los metodos de la interfaz {@link Iterator},
 * y por lo tanto se nos ayudará a recorrer un ArrayList que representa la orden 
 * de los tacos del usuario.
 */

public class CompositeIterator implements Iterator {
    /* Un ArrayList que contendra como elementos los tacos que el usuario solicite*/
    ArrayList tacos;
    /* Un int que es la posicion en la que se encuentrá el iterador.*/
    /* Se inicializa desde la posicion cero*/
    int posicion = 0;

    /*Construye un iterador que tiene como parametro la estructura que 
     este recorrerá*/
    public CompositeIterator(ArrayList tacos) {
        this.tacos = tacos;
    }

    /* Nos dice si hay un elemento siguiente. */
    @Override
    public boolean hasNext() {
        if (posicion >= tacos.size() || tacos.get(posicion) == null) {
            return false;
        } else {
            return true;
        }
    }

    /* Nos da el elemento siguiente. */
    @Override
    public Object next() {
        TemplateTaco taco = (TemplateTaco) tacos.get(posicion);
        posicion = posicion + 1;
        return taco;
    }
}
