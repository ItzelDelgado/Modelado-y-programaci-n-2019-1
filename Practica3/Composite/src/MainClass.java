/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */


import java.util.Scanner;

//Clase Principal
public class MainClass {
    //Objeto de tipo ParentItem
    static ParentItem parentItem2;
    //Objeto de tipo SibItemOne 
    static SubItemOne subItemOne1; 
    

    /**
     * Metodo Main
     * @param args argumenos de string
     */
    public static void main(String[] args) {
      
        processCompositeItems(0,3,"Triangulo");
        processCompositeItems(0,4,"Cuadrado");
        processCompositeItems(0,5,"Pentagono");
    }

    /**
     * Metodo que compone las figuras compuestas de tipo ParentItem.
     * Con figuras mas simples de tipo SubItemOne. 
     */
    private static void processCompositeItems(int cero,int lineas,String nombre) {
      
      parentItem2 = new ParentItem(nombre);
			while(cero != lineas){

        subItemOne1 = new SubItemOne("Linea " + (cero+1));
      	parentItem2.addSubItem(subItemOne1);
        cero++;
    }
        parentItem2.print();
    }
}
