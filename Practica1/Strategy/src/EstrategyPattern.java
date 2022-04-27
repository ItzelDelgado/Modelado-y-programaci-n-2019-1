import java.util.Scanner;

/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**Usando el patrón ​ Strategy​, videojuego de aventuras,
 * en el juego tienes un personaje que puede ser el rey, una reina, un trol o un caballero.
 * Todos los personajes tienen la actividades de moverse, atacar y morir. 
 * Las armas que pueden usar son: hacha, cuchillo y espada.
 */

public class EstrategyPattern {

      public static void main(String[] args) {
        String cadena = "***********************************************************";
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona un personaje pulsando el numero correspondiente:\n" +
                                  "1 - Rey\n" +
                                  "2 - Reyna\n" + 
                                  "3 - Caballero\n" +
                                  "4 - Troll\n");
        int opcion =sc.nextInt(); 
              
        /*Menu de personajes*/
        switch(opcion){
          /*Selecciono el rey*/
          case 1:
            Rey rey= new Rey();
            rey.tipoPersonaje();
            rey.tipoArma();
            String respuesta;
            do{
              System.out.println("Quieres modificar tu arma? (escribe si/no) ");
              respuesta = sc.next(); 
              if(respuesta.equals("si")){
              /*Menu de armas para cambiar*/
                switch(seleccionaArma()){
                  case 10:
                    rey.setArma(new Espada());
                    rey.tipoArma();
                    System.out.println(cadena);
                    break;
                  case 20:
                    rey.setArma(new Cuchillo());
                    rey.tipoArma();
                    System.out.println(cadena);
                    break;
                  case 30:
                    rey.setArma(new Hacha());
                    rey.tipoArma();
                    System.out.println(cadena);
                    break;
                }                   
              } else{
                  System.out.println("Tu arma sigue siendo la misma.\n");
                  System.out.println(cadena);
              }
            } while(respuesta.equals("si"));

          break;

                
          /*Selecciono la Reyna*/
          case 2:
            Reyna reyna = new Reyna();
            reyna.tipoPersonaje();
            reyna.tipoArma();
            do{
              System.out.println("Quieres modificar tu arma? (escribe si/no) ");
              respuesta = sc.next(); 
              if(respuesta.equals("si")){
                /*Menu de armas para elegir*/
                switch(seleccionaArma()){
                case 10:
                  reyna.setArma(new Espada());
                  reyna.tipoArma();
                break;
                case 20:
                  reyna.setArma(new Cuchillo());
                  reyna.tipoArma();
                  break;
                case 30:
                  reyna.setArma(new Hacha());
                  reyna.tipoArma();
                  break;
                }
              } else{
                  System.out.println("Tu arma sigue siendo la misma.\n");
                  System.out.println(cadena);
              }
            } while(respuesta.equals("si"));
          break;
                    
          /*Selecciono el caballero*/
          case 3:
            Caballero caballero = new Caballero();
            caballero.tipoPersonaje();
            caballero.tipoArma();
            do{
              System.out.println("Quieres modificar tu arma? (escribe si/no) ");
              respuesta = sc.next(); 
              if(respuesta.equals("si")){
                /*Menu de armas*/
                switch(seleccionaArma()){
                  case 10:
                    caballero.setArma(new Espada());
                    caballero.tipoArma();
                  break;
                  case 20:
                    caballero.setArma(new Cuchillo());
                    caballero.tipoArma();
                  break;
                  case 30:
                    caballero.setArma(new Hacha());
                    caballero.tipoArma();
                  break;
                }
                        
              } else{
                  System.out.println("Tu arma sigue siendo la misma.\n");
                  System.out.println(cadena);
              }
            } while(respuesta.equals("si"));
          break;
          
          /*Selecciono el Troll*/          
          case 4:
            Troll troll = new Troll();
            troll.tipoPersonaje();
            troll.tipoArma();
            do{
              System.out.println("Quieres modificar tu arma? (escribe si/no) ");
              respuesta = sc.next(); 
              if(respuesta.equals("si")){
                /* Menu de armas a elegir */
                switch(seleccionaArma()){
                  case 10:
                    troll.setArma(new Espada());
                    troll.tipoArma();
                  break;
                  case 20:
                    troll.setArma(new Cuchillo());
                    troll.tipoArma();
                  break;
                  case 30:
                    troll.setArma(new Hacha());
                    troll.tipoArma();
                  break;
                          }
              } else{
                System.out.println("Tu arma sigue siendo la misma.\n");
                System.out.println(cadena);
              }
            } while(respuesta.equals("si"));
          break;
        
        }
    }

    
    
    /**
     * Método para la entrada del arma que se va a modificar.
     * */
    static int seleccionaArma(){
         Scanner sc = new Scanner(System.in);
         System.out.println("\nSelecciona por que arma quieres cambiar la que ya tienes pulsando el numero correspondiente:\n" +
                                "10 - Espada\n" +
                                "20 - Cuchillo\n" + 
                                "30 - Hacha\n");
        
         return  sc.nextInt(); 
    
    }  
   
}
