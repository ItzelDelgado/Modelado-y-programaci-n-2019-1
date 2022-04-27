/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 06 de Septiembre de 2018
 */

/**
 * La clase inicializa todos los estados y establece 
 * el estado actual como activado.
 */

public class RobotCocinando implements EstadoRobot{

	private final Robot robot;
    /**
     *Constructor que inicializa el robot en el estado cocinando.
     */
	public RobotCocinando(Robot robot){

		this.robot = robot;
	}
    /**
     * Cambia el estado del robot de caminar a cocinar.
     *
     */
	public void caminar(){
		System.out.println("Caminando.....");
		robot.setEstadoRobot(robot.getRobotEncendido());
	}
    /**
     * Nos indica que el robot no puede caminar y cocinar al mismo tiempo.
     *
     */
	public void cocinar(){
		System.out.println("El robot no puede caminar mientras cocina");
 		robot.setEstadoRobot(robot.getRobotCocinando());
	}
    /**
     * Nos indica que el robot no se puede apagar si esta cocinando.
     *
     */
	public void apagado(){

		System.out.println("No puede apagarse mientras este cocinando");


	}
}
