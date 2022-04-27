/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */


/*
 * Interfaz para las armas.Los personajes utilizaran armas.
 * Implementaran el metodo arma saber cual sera la actuacion de esta.
 * Cada arma nos devolvera un dato String para saber cual es la que se esta usando.
 */

public interface Arma {

		/*Devuelve la actuación que tiene el tipo de arma que se cree*/
     void arma();

    /** 
    *@return un string, una cadena que nos dice que tipo de arma es 
    */
     String tipoArma();
}
