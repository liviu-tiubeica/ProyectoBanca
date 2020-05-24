package proyectobanca;

public class Cuentas {

    private int idcuenta;
    private int idcliente;
    private double dinero;

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

    public String getCuentas() {
        return "Cuenta con id '" + idcuenta + "' pertenece al idcliente '" + idcliente + "'";
    }
    
}
