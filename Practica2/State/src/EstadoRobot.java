/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 06 de septiembre de 2018
 */


/*
 * Interfaz para modelar el comportamiento del robot.
 * Implementaran el comportamiento dependiendo del estado en que se
 * encuentre el robot.
 * Cada estado nos devolvera el comportamiento actual
 */
public interface EstadoRobot{

	public void caminar();
	public void cocinar();
	public void apagado();
}
