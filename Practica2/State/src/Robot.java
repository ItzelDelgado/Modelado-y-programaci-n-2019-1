/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 06 de Septiembre de 2018
 */

/**
 * La clase Robot implementa la interfaz estado robot 
 * La clase contiene todos los estados posibls en los que
 * puede estar el robot.
 */
public class Robot {

	private EstadoRobot robotEncendido;
	private EstadoRobot robotCocinando;
	private EstadoRobot robotApagado;

	private EstadoRobot estado;
    /**
     *Crea los atributos de un nuevo robot.
     */
	public Robot(){

		this.robotEncendido = new RobotEncendido(this);
		this.robotCocinando = new RobotCocinando(this);
	 	this.robotApagado = new RobotApagado(this);

		this.estado = robotEncendido;
	}
    /**
     *@param recibe un objeto del tipo EstadoRobot
     *Metodo que nos indica en que estado se encuentra actualmente el robot
     */
	public void setEstadoRobot(EstadoRobot estado){

		this.estado = estado;
	}
    /**
     *Metodo que nos indica que el robot se encuentra caminando.
     */
	public void caminar(){
		estado.caminar();
	}
     /**
     *Metodo que nos indica que el robot se encuentra cocinando.
     */
	public void cocinar(){
		estado.cocinar();
	}
     /**
     *Metodo que nos indica que el robot se encuentra apagado.
     */
	public void apagado(){
		estado.apagado();
	}
     /**
     *@return regresa el estado en el que el robot esta encendido.
     */
	public EstadoRobot getRobotEncendido(){

		return robotEncendido;
	}
    /**
     *@param recibe un objeto del tipo EstadoRobot
     *Metodo que nos indica que el robot se encuentra actualmente caminando.
     */
	public void setRobotEncendido(EstadoRobot robotEncendido){

		this.robotEncendido = robotEncendido;

	}
    /**
     *@return regresa el estado en el que el robot esta cocinando.
     */
	public EstadoRobot getRobotCocinando() {

		return robotCocinando;
	}
    /**
     *@param recibe un objeto del tipo EstadoRobot
     *Metodo que nos indica que el robot se encuentra actualmente cocinando.
     */
	public void setRobotCocinando(EstadoRobot robotCocinando){

		this.robotCocinando = robotCocinando;
	}
    /**
     *@return regresa el estado en el que el robot esta apagado.
     */
	public EstadoRobot getRobotApagado(){

		return robotApagado;

	}
    /**
     *@param recibe un objeto del tipo EstadoRobot
     *Metodo que nos indica que el robot se encuentra actualmente apagado.
     */

	public void setRobotApagado(EstadoRobot robotApagado){

		this.robotApagado = robotApagado;

	}
    /**
     *@return regresa el estado en el el robot se encuentra actualmente.
     */
	public EstadoRobot getEstado(){

		return estado;
	}
    /**
     *@param recibe un objeto del tipo EstadoRobot
     *Metodo que nos indica que estado esta actualmente establecido.
     */

	public void setEstado(EstadoRobot estado){

		this.estado = estado;
	}
}
