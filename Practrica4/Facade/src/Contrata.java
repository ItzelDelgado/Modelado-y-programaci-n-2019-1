/**
 * @author Delgado Díaz Itzel Azucena
 * @date 19 de Octubre de 2018
 */

/**
 * Clase hace una contratacion por parte del usuario. 
 */
public class Contrata{
  /*El String con el nombre del usuario*/
  String nombre;
  /*El String con el tipo de seguro que solicita el usuario*/
  String tipoSeguro;
  /*EL String con la marca del auto del usuario*/
  String marca;
  /*El String con el model del auto del usuario*/
  String modelo;
  /*El int con el año del auto del usuario*/
  int anio;
  /*El String con la forma de pago del usuario*/
  String formaPago;

  /**
  * Clase hace una contratacion por parte del usuario. 
  */
  public Contrata(String nombre, String tipoSeguro, String marca, 
                  String modelo, int anio, String formaPago){

    this.nombre = nombre;
    this.tipoSeguro = tipoSeguro;
    this.marca = marca;
    this.modelo = modelo; 
    this.anio = anio;
    this.formaPago = formaPago;
  }

  /** 
   * Metodo que nos devuelve el nombre del usuario.
   * @return un string con el nombre del usuario.
   */
  public String getNombre(){
    return nombre;
  }

  /** 
   * @param un string con el nombre usuario.
   */
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  /** 
   * Metodo que nos devuelve el username.
   * @return un string con el tipo de seguro que el usuario desea.
   */
  public String getTipoSeguro(){
    return tipoSeguro;
  }

  /** 
   * @param un string con el tipo de seguro que el usuario desea.
   */
  public void setTipoSeguro(String tipoSeguro){
    this.tipoSeguro = tipoSeguro;
  }

  /** 
   * Metodo que nos devuelve la marca del auto.
   * @return un string con la marca.
   */
  public String getMarca(){
    return marca;
  }

  /** 
   * @param un string con la marca del auto.
   */
  public void setMarca(String marca){
    this.marca = marca;
  }

   /** 
   * Metodo que nos devuelve el modelo del auto.
   * @return un string con el modelo.
   */
  public String getModelo(){
    return modelo;
  }

  /** 
   * @param un string con el modelo del auto del usuario.
   */
  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  /** 
   * Metodo que nos devuelve el año del auto.
   * @return un int con el año del auto.
   */
  public int getAnio(){
    return anio;
  }

  /** 
   * Metodo que nos devuelve la forma de pago.
   * @return un string con la forma de pago.
   */
  public String getFormaPago(){
    return formaPago;
  }

  /**
  *Sobrecarga del metodo toString que imprime una cotizacion
  */
  @Override
  public String toString(){
    return ("Nombre del cliente: " + nombre +
            "Tipo de seguro: " + this.tipoSeguro + 
            "\n Marca: " + this.marca + 
            "\n Modelo: " + modelo +
            "\n Año: " + anio+
            "\n Forma de pago: " + formaPago);
  }
}
