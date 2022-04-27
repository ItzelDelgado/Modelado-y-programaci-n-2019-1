/**
 * @author Delgado Díaz Itzel Azucena
 * @date 12 de Octubre de 2018
 */
import java.util.ArrayList;

/**
 * Clase que compone la orden de tacos del cliente.
 * La orden es un ArrayList que tiene como elementos los tacos del usuario.
 * La lista de tacos nos permite agregar, eleminar , devolver el nombre del
 * usuario al que corresponde la orden e imprimirla. Para hacer dicha
 * impresion se crea un objeto de tipo CompositeIterator que nos ayudará
 * a recorrerla y devolver los elementos.
 */
public class OrdenTacos{
    
    /* El ArrayList generico de tipo tacos, donde guardamos los tacos del usuario*/
    private ArrayList<TemplateTaco> ordenTacos = new ArrayList<>();
   	/* EL String con el nombre de la orden, que en este caso
     es el nombre a quien esta hecha.*/
    private String nombreOrden;
    
    /*El entero que contiene el numero de tacos de la orden*/
    int element = 0;
    /*El entero que nos guardará y devolvera el precio total de la orden*/
    int precioTotal = 0;

    /**
     * Constructor una orden detacos con nombre.
     * @param el nombre a quien esta la orden.
     */
    public OrdenTacos(String nombreOrden) {
      this.nombreOrden = nombreOrden;
    }

    /**
     * Metodo que grega un taco a la orden para componerla.
     * @param el taco que vamos a agregar.
     */
    public void addTaco(TemplateTaco taco) {
      ordenTacos.add(taco);
    }

    /**
     * Metodo que elimina un taco de la lista.
     * @param el taco que queremos eliminar.
     */
    public void removeTaco(TemplateTaco taco) {
      ordenTacos.remove(taco);
    }


    /**
    * @return un String con el nombre de la orden(cliente o a quien se hizo).
    */
    public String getNombreOrden() {
      return nombreOrden;
    }

    /**
    * Metodo para imprimir la orden compuesta.
    * Se imprime al usuario su nombre si es el caso o el nombre de la orden.
    * Con el while se hace la suma de los precios de cada taco para sacar el total del pago, 
    * usando un acumulador y a su vez imprime los datos de cada taco. 
    * MUestra la cantidad de tacos de su orden y para finalizar le muestra 
    * el pago total que debe realizar.
    */
    public void print() {
      /*Instrucion para limpiar la terminar*/
      System.out.print("\033[H\033[2J");
      /*Instrucion para limpiar la terminar*/
      System.out.flush();
      System.out.println("La orden de tacos esta a nombre de: " + getNombreOrden());
      Iterator iterator = new CompositeIterator(ordenTacos);
      while (iterator.hasNext()) {
        TemplateTaco taquito = (TemplateTaco)iterator.next();
        System.out.println(taquito.getDescripcion() + " $" + taquito.getPrecio());
        element++;
        precioTotal = precioTotal + taquito.getPrecio();
      }
      System.out.println("La cantidad de tacos es: " + element + "\n"
        							 + "El precio total es de " + precioTotal + " pesos." );
      System.out.println("Gracias por su compra.");
      System.out.println("Fue un placer atenderlo  <<TacoMachine>> .");
      System.out.println("Al entregarle su orden recibirá limones, cebolla, cilantro y salsa (verde y roja).");
    }


}
