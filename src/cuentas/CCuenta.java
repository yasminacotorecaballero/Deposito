/**
 * @author Yasmina Cotoré Caballero
 */

package cuentas;

/** 
* La clase  CCuenta 
*/  
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**  
    * Esto es un constructor
    */ 
    public CCuenta()
    {
    }
    
    /**
     * Este es otro constructor que cuenta con los siguientes parámetros: 
     * 
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo 
     * @param tipo tipo de interés
     */
    
     public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Este método obtiene el nombre
     * @return nombre devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este método establece el nombre
     * @param nombre el nombre a fijar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método obtiene la cuenta
     * @return cuenta devuelve la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Este método establece la cuenta
     * @param cuenta la cuenta a fijar
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Este método obtiene el saldo de la cuenta
     * @return saldo devuevle el saldo de la cuenta 
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Este método establece el saldo
     * @param saldo el saldo a fijar
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método obtiene el tipo de interés
     * @return tipoInterés devuelve el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Este método establece el tipo de interés
     * @param tipoInterés el tipo de interés a fijar
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    /**  
    * Este método devuelve el saldo de la cuenta
     * @return saldo devuelve el saldo disponible en la cuenta
    */ 
    public double estado()
    {
        return saldo;
    }

    /**
     * Este método ingresa una cantidad en la cuenta
     * @param cantidad cantidad que se va a ingresar
     * @throws Exception en el caso de que la cantidad a ingresar sea negativa 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    } 
    
    /**
     * Este método retira una cantidad 
     * @param cantidad cantidad que se va a retirar
     * @throws Exception en el caso de que la cantidad sea 0 o negativa 
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
