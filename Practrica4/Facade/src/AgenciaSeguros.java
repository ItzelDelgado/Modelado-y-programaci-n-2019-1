/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/** 
 * Clase principal del sistema de la agencia de seguros.
	*Solo cntiene el metodo principal que crea un objeto de tipo AgenciaFacade y lo inicializa.
 */
public class AgenciaSeguros{

	public static void main(String[] args) {
		AgenciaFacade agencia = new AgenciaFacade();
		agencia.atenderUsuario(); 
}


}