package cuentas;


/**
 * Esta clase almacena datos de la Cuenta Corriente
 * @author Juan Mario Hernando
 */

public class CCuenta {

    /**
     * Devuelve el nombre de la cuenta corriente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Incluye el nombre en la cuenta corriente
     * @param nombre el nombre a incluir
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el IBAN de la cuenta corriente
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Incluye el IBAN en la cuenta corriente
     * @param cuenta IBAN a incluir en la cuenta corriente
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta corriente
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Incluye el saldo en la cuenta corriente
     * @param saldo el saldo a incluir en la cuenta corriente
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el interes de la cuenta corriente
     * @return tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Incluye el Tipo de Interés en la cuenta corriente
     * @param tipoInterés Tipo de interés a incluir en la cuenta corriente
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de CCuenta sin parametros
     */
    public CCuenta()
    {
    }

    /**
     * Cosntructor de CCuenta con parámetros
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    
    /**
     * Devuelve el saldo de la Cuenta Corriente
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta corriente, si es un valor negativo, envía un error.
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta corriente, si es un valor negativo da un error.
     * @param cantidad
     * @throws Exception 
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
