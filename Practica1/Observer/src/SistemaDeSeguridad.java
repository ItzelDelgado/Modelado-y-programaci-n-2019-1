/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 30 de Agosto 2018
 */

/**Clase que represente un sistema de seguridad que cuando se active la alarma,
 * cierre puertas, encienda las luces, establezca un perímetro de visibilidad,
 * encenderá cámaras e identificará el código para desactivar la alarma.
*/
public class SistemaDeSeguridad{
	
	/**Método principal del sistema de seguridad.
	 * crea los objetos que serán los sitemas y serán notificados
	 * los agrega al sistema, le avisa que se activo la alarma
	 * y luego pide que ingreses el codigo para desactivarla.
	 */
	
	public static void main(String[] args) {
		Puertas puerta = new Puertas();
		Camaras camara = new Camaras();
		Perimetro perimeto = new Perimetro();
		Alarma alarma = new Alarma();
		alarma.agregarSistema(puerta);
		alarma.agregarSistema(camara);
		alarma.agregarSistema(perimeto);
		alarma.activarAlarma();
		Codigo codigo = new Codigo();
		codigo.update();


	}
}