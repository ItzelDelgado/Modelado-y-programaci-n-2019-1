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

public class RobotEncendido implements EstadoRobot{

	private final Robot robot;
    /**
     *Constructor que inicializa el robot en el estado encendido.
     */
	public RobotEncendido(Robot robot){

		this.robot = robot;
	}
    /**
     * Nos indica que el robot esta actualmente caminando.
     */
	public void caminar(){
		System.out.println("caminando......");
	}
    /**
     * Nos indica que el robot esta actualmente cocinando.
     */
	public void cocinar(){
		System.out.println("cocinando......");
		robot.setEstadoRobot(robot.getRobotCocinando());
	}
    /**
     * Nos indica que el robot esta actualmente apagado.
     */
	public void apagado(){

		robot.setEstado(robot.getRobotApagado());
		System.out.println("El robot esta apagado");


	}
}
