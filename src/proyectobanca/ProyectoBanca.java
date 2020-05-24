package proyectobanca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProyectoBanca {

    static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
        
        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        ArrayList<Cuentas> Cuentas = new ArrayList<Cuentas>();
        
        Clientes.add(new Cliente(1, "Pipo", "Pipiolo", 20, "Calle Madrid", "Y0694205X", 697314054));
        Clientes.add(new Cliente(2, "Pipa", "Pipiolo", 21, "Calle Madrid", "Y5024960G", 645041379));
        Clientes.add(new Cliente(3, "Pipo", "Pipiolo", 20, "Calle Madrid", "B0420695X", 697314054));
        Cuentas.add(new Cuentas(1, 1, 500));
        Cuentas.add(new Cuentas(2, 1, 500));
        Cuentas.add(new Cuentas(1, 2, 500));
        Cuentas.add(new Cuentas(2, 2, 500));
        Cuentas.add(new Cuentas(1, 3, 500));
        boolean bucle = true;
        while (bucle) {
            mostrarMenu();
            switch (pedirNum()) {
                case 0:
                    System.out.println("Saliendo...");
                    bucle = false;
                    break;
                case 1:
                    System.out.println("Introduce el numero de cliente");
                    int idcliente = pedirNum();
                    System.out.println("Introduce su numero de cuenta");
                    int idcuenta = pedirNum();
                    for (int i = 0; i < Cuentas.size(); i++) {
                        if (Cuentas.get(i).getIdcliente() == idcliente && Cuentas.get(i).getIdcuenta() == idcuenta) {
                            System.out.println("Cuenta identificada, indique la cantidad de dinero que quiera ingresar");
                            double dinero = pedirDouble();
                            if (dinero >= 0) {
                                Cuentas.get(i).setDinero(Cuentas.get(i).getDinero() + dinero);
                                System.out.println("Dinero ingresado");
                                System.out.println("Cantidad actual de dinero: " + Cuentas.get(i).getDinero());
                                break;
                            } else {
                                System.out.println("Cantidad invalida");
                                break;
                            }
                        } else {
                            System.out.println("No se ha identificado la cuenta");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce el numero de cliente");
                    int idclienter = pedirNum();
                    System.out.println("Introduce su numero de cuenta");
                    int idcuentar = pedirNum();
                    for (int i = 0; i < Cuentas.size(); i++) {
                        if (Cuentas.get(i).getIdcliente() == idclienter && Cuentas.get(i).getIdcuenta() == idcuentar) {
                            System.out.println("Cuenta identificada, indique la cantidad de dinero que quiera retirar");
                            double dinero = pedirDouble();
                            if (Cuentas.get(i).getDinero() >= dinero && dinero >= 0) {
                                System.out.println("Retirando " + dinero + " euros");
                                Cuentas.get(i).setDinero(Cuentas.get(i).getDinero() - dinero);
                                System.out.println("Cantidad actual de dinero: " + Cuentas.get(i).getDinero());
                                break;
                            } else {
                                System.out.println("Cantidad no valida");
                                break;
                            }
                        } else {
                            System.out.println("No se ha identificado la cuenta");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Llamando gestor...");
                    System.out.println("Estara ahi en unos minutos para ayudarte.");
                    bucle = false;
                    break;
                case 4:
                    System.out.println("Introduce el nr usuario para el cual se va crear cuenta");
                    int nrusercn = pedirNum();
                    int contar = 0;
                    boolean existe = false;
                    for (int i = 0; i < Cuentas.size(); i++) {
                        if (Cuentas.get(i).getIdcliente() == nrusercn) {
                            existe = true;
                        }
                    }

                    if (!existe) {
                        System.out.println("El nr usuario no es valido o no existe");
                        break;
                    }

                    for (int i = 0; i < Cuentas.size(); i++) {
                        if (Cuentas.get(i).getIdcliente() == nrusercn) {
                            contar++;
                        }
                    }
                    int nrcuentanueva = contar + 1;
                    Cuentas.add(new Cuentas(nrcuentanueva, nrusercn, 0));
                    System.out.println("Se ha creado una nueva cuenta para " + nrusercn);
                    break;
                case 5:
                    int nrusern = 0;
                    boolean existecliente = false;

                    for (int i = 0; i < Clientes.size(); i++) {
                        if (i == Clientes.size() - 1) {
                            nrusern = i + 1;
                        }
                    }

                    if (nrusern == 0) {
                        System.out.println("Hay algun error");
                        break;
                    }

                    System.out.println("Introduce el nombre del usuario nuevo");
                    String nombreun = pedirString();

                    if (nombreun.equals("")) {
                        System.out.println("No puedes dejar el campo vacio");
                        break;
                    }

                    System.out.println("Introduce el apellido del usuario nuevo");
                    String apellidoun = pedirString();

                    if (apellidoun.equals("")) {
                        System.out.println("No puedes dejar el campo vacio");
                        break;
                    }

                    System.out.println("Introduce la edad del usuario nuevo");
                    int edadun = pedirNum();
                    System.out.println("Introduce la direccion del usuario nuevo");
                    String dirun = pedirString();

                    if (dirun.equals("")) {
                        System.out.println("No puedes dejar el campo vacio");
                        break;
                    }

                    System.out.println("Introduce tu NIF");
                    String nifun = pedirString();

                    if (nifun.equals("")) {
                        System.out.println("No puedes dejar el campo vacio");
                        break;
                    }

                    System.out.println("Introduce tu nr telefono");
                    double nrtel = pedirDouble();
                    for (int i = 0; i < Clientes.size(); i++) {
                        if (Clientes.get(i).getNombre().equals(nombreun)
                                && Clientes.get(i).getApellidos().equals(apellidoun)
                                && Clientes.get(i).getEdad() == edadun && Clientes.get(i).getDireccion().equals(dirun)
                                && Clientes.get(i).getNif().equals(nifun)
                                && Clientes.get(i).getTelefono() == nrtel) {
                            existecliente = true;
                        }
                    }
                    if (!existecliente) {
                        Clientes.add(new Cliente(nrusern, nombreun, apellidoun, edadun, dirun, nifun, nrtel));
                        System.out.println("Usuario nuevo añadido");
                    } else {
                        System.out.println("Ya existe un usuario con esos datos");
                    }
                case 6:
                    for (int i = 0; i < Cuentas.size(); i++) {
                        System.out.println(Cuentas.get(i).getCuentas());
                    }
                    break;
                case 7:
                    for (int i = 0; i < Clientes.size(); i++) {
                        System.out.println(Clientes.get(i).GetClientes());
                    }
                    break;
            }
        }
    }
/**
 * Menu
 */
    static void mostrarMenu() {
        System.out.println("0. Salir");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Llamar gestor");
        System.out.println("4. Crear cuenta");
        System.out.println("5. Registrar usuario");
        System.out.println("6. Mostrar cuentas");
        System.out.println("7. Mostrar usuarios");
    }
/**
 * Pedir numero, hecho para que vuelva a pedir numero si el usuario introduce cualquier cosa que no sea un numero
 * @return int devuelve el numero introducido por el usuario
 */
    static int pedirNum() {
        System.out.print(">");
        try {
            int num = k.nextInt();
            k.nextLine();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Caracter/es no valido/s");
            k.nextLine();
            return pedirNum();
        }
    }
/**
 * Igual que pedir numero, pero con double
 * @return string 
 */
    static double pedirDouble() {
        System.out.print(">");
        try {
            double num2 = k.nextDouble();
            k.nextLine();
            return num2;
        } catch (InputMismatchException e) {
            System.out.println("Caracter/es no valido/s");
            k.nextLine();
            return pedirDouble();
        }
    }
/**
 * Pedir string, al ser un string realmente no hace mucha falta
 * @return string devuelve como string lo que sea que haya escrito el usuario
 */
    static String pedirString() {
        return k.next();
    }

}
