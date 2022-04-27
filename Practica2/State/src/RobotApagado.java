/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 06 de Septiembre de  2018
 */

/**
 * La clase inicializa todos los estados y establece 
 * el estado actual como activado.
 */
public class RobotApagado implements EstadoRobot{

	private final Robot robot;
    /**
     *Constructor que inicializa el robot en el estado apagado.
     */
	public RobotApagado(Robot robot){

		this.robot = robot;
	}
    /**
     * Cambia el estado del robot de apagado a caminando
     *
     */
	public void caminar(){
		System.out.println("caminando.....");
		robot.setEstadoRobot(robot.getRobotEncendido());
	}
    /**
     * Nos indica las acciones que el robot no puede hacer mientras esta apagado.
     */
	public void cocinar(){
		System.out.println("El robot se encuentra apagado, por tanto no puede caminar o cocinar");
	}
    /**
     * Nos indica que el robot esta apagado.
     */
	public void apagado(){

		System.out.println("El robot esta apagado");


	}
}
