package proyectobanca;

public class Cuentas {

    private int idcuenta;
    private int idcliente;
    private double dinero;
/**
 * Constructor de cuentas.
 * @param idcuenta el id de la cuenta es automatico
 * @param idcliente indicar el id del usuario al que pertenece la cuenta
 * @param dinero el dinero que tiene esa cuenta.
 */
    public Cuentas(int idcuenta, int idcliente, double dinero) {
        this.idcuenta = idcuenta;
        this.idcliente = idcliente;
        this.dinero = dinero;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
/**
 * Muestra los las cuentas y el id del usuario al que pertenece
 * @return un string por cada cuenta
 */
    public String getCuentas() {
        return "Cuenta con id '" + idcuenta + "' pertenece al idcliente '" + idcliente + "'";
    }

}
