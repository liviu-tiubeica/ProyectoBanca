package proyectobanca;

public class Cliente {

    private int idcliente;
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String nif;
    private double telefono;

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

    public String GetClientes() {
        return "Cliente " + idcliente + " nombre " + nombre;
    }

}
