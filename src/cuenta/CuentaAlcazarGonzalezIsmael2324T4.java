package cuenta;
/**
 *Clase java del programa que define el objeto cuenta con unos parametros y realiza
 * acciones de ingresar y retirar dinero.
 * @author Ismael Alcázar González
 * @since 25/02/2024
 * @version 1.0 25/02/2024
 */

public class CuentaAlcazarGonzalezIsmael2324T4 {

/**
 * Categoria de nombre cliente.
 */
    private String nombre;
 /**
 * Categoria de numero de cuenta
 */   
    private String cuenta;
 /**
 * Categoria de saldo
 */
    private double saldo;
 /**
 * Categoria de tipo interés
 */
    private double tipoInteres;

   //CONTRUCTORES
    public CuentaAlcazarGonzalezIsmael2324T4 ()
    {
    }
   
   /**
    * Constructor para iniciar todas las propiedades de la clase cuenta
    * @param nom nombre cliente
    * @param cue numero de cuenta
    * @param sal saldo real
    * @param tipo tipo de interés real
    */
    public CuentaAlcazarGonzalezIsmael2324T4 (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInteres=tipo;
    }
   
    /**
     *Metodo para asignar nombre de la cuenta
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
  /**
   * Metodo que devuelve el nombre de cuenta
     */ 
   /**
    *Metodo que me devuelve el nombre del propietario de la cuenta
    */
    public String obtenerNombre()
    {
        return getNombre();
    }
 /**
    *Metodo que me devuelve el saldo de la cuenta
    */
     public double estado ()
    {
        return getSaldo();
    }

   /**
     * Metodo para ingresar dinero que modifica la cantidad 
     *del saldo disponible
         */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
 /**
     * Metodo para retirar dinero que modifica la cantidad 
     * del saldo disponible
         */
    
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()<= cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Devuelve la cantidad en cuenta
 * @return getCuenta()
 */
    
    public String obtenerCuenta ()
    {
        return getCuenta();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
