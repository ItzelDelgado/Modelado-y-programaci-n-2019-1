/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase Registro que crea un registro del usuario. 
 */
public class Registro{
	/*El String que recibe el username con el que se registra un nuevo usuario.*/
	String username;
	/*El String que recibe la password con la que se registra un nuevo usuario.*/
	String password;

	/*Contructor del registro de un suario*/
	public Registro(String username, String password){

		this.username = username;
		this.password = password;

	}

	/**
	 * @param un String con el username del usuario.
	 */
	public void setUsername(String username){
		this.username = username;
	}

	/** 
	 * Metodo que nos devuelve el username.
	 * @return un string con el username.
	 */
	public String getUsername(){
		return username;
	}

	/**
	 * @param un String con el password del usuario.
	 */
	public void setPassword(){
		this.password = password;
	}

	/** 
	 * Metodo que nos devuelve la password del usuario..
	 * @return un string con la password.
	 */	
	public String getPassword(){
		return password;
	}	


	/*Sobrecarga del metodo toString para imprimir un registro.*/
	@Override
  public String toString(){
        return ("UserName: " + this.username + 
        				"\n Password: " + password);
  }

}