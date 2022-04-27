/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */
/*
 * CLase para los objetos de tipo personaje.Los personajes utilizaran armas.
 * pueden moverse, atacar y ademas cambiar el arma que traen por defauld para empezar el juego.
 */


public class Personaje {  
    
    public Arma arma;
    
    
    /*
     * Método que indica que el personaje esta en movimiento.
     */
    public void moverse(){
        System.out.println("Tu personaje esta en movimiento. \n");
    }
   
    
    /*
     * Método con la propiedad de atacar del personaje.
     */
    public void atacar(){
        System.out.println("Has atacado a tu contrincante. \n");
    }
    
    /*
    * Método que nos permite hacer el cambio de arma.
    * @param un objeto de tipo arma. 
    */
    public void setArma(Arma arma ){
        this.arma = arma;
    }
    
    /**
    *Metodo que nos permite saber que tipo de arma uliza en ese momento.
    */
    public void tipoArma(){
        System.out.println(arma.tipoArma());
    }

    String personaje;
   
    /**
    *Metodo que imprime que personaje estas usando para jugar, dependiendo el que crees.
    */
    public void tipoPersonaje() {
       System.out.println(personaje);
    }
}
