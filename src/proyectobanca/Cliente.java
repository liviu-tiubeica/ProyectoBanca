package proyectobanca;

public class Cliente {

    private int idcliente;
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String nif;
    private double telefono;

    /**
     * Contrusctor, crea el objeto a partir de las variables que se le pasan
     * @param idcliente el nr de cliente, esto es automatico
     * @param nombre el nombre del cliente
     * @param apellidos el apellido del cliente
     * @param edad la edad del cliente
     * @param direccion la direccion del cliente
     * @param nif el nif del cliente
     * @param telefono  el telefono del cliente
     */
    public Cliente(int idcliente, String nombre, String apellidos, int edad, String direccion, String nif, double telefono) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.nif = nif;
        this.telefono = telefono;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNif() {
        return nif;
    }

    public double getTelefono() {
        return telefono;
    }
/**
 * Devuelve las cuentas y el numero de los clientes sin mostrar el dinero
 * @return string devuelve el id de la cuenta y del usuario.
 */
    public String GetClientes() {
        return "Cliente '" + idcliente + "' nombre '" + nombre + "'";
    }

}
