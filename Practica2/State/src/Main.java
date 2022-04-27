/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 06 de Septiembre de 2018
 */
/** 
  * La clase representa el coportamiento del robot 
  * depediendo del estado que se ha llamado.
  */
public class Main{

    /**
     * Metodo principal que crea un objeto del tipo robot
     * y le agrega sus estados.
     */
	public static void main(String[] args) {
		
		Robot robot = new Robot();

		robot.apagado();
	      	robot.cocinar();
		robot.caminar();
       		robot.cocinar();

		robot.cocinar();
		robot.caminar();
		robot.caminar();
		robot.apagado();
		
	}
}
