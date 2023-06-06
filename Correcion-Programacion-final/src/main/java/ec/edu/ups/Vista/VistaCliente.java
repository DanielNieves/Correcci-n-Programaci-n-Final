/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Vista;

/**
 *
 * @author
 */
import ec.edu.ups.Controlador.ControladorCliente;
import ec.edu.ups.Modelo.Cliente;
import java.util.List;
import java.util.Scanner;

public class VistaCliente {

    private ControladorCliente controladorCliente;

    public VistaCliente(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
    }

    public void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú Cliente -----");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Eliminar cliente");
            System.out.println("3. Actualizar cliente");
            System.out.println("4. Obtener cliente");
            System.out.println("5. Obtener todos los clientes");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    eliminarCliente();
                    break;
                case 3:
                    actualizarCliente();
                    break;
                case 4:
                    obtenerCliente();
                    break;
                case 5:
                    obtenerTodosLosClientes();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }

    private void agregarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cédula del cliente:");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del cliente:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese la dirección del cliente:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el teléfono del cliente:");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(cedula, nombre, apellido, direccion, telefono);
        controladorCliente.agregarCliente(cliente);
        System.out.println("¡Cliente agregado correctamente!");
    }

    private void eliminarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cédula del cliente a eliminar:");
        String cedula = scanner.nextLine();

        Cliente cliente = controladorCliente.obtenerCliente(cedula);
        if (cliente != null) {
            controladorCliente.eliminarCliente(cliente);
            System.out.println("¡Cliente eliminado correctamente!");
        } else {
            System.out.println("No se encontró un cliente con la cédula especificada");
        }
    }

    private void actualizarCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cédula del cliente a actualizar:");
        String cedula = scanner.nextLine();

        Cliente cliente = controladorCliente.obtenerCliente(cedula);
        if (cliente != null) {
            System.out.println("Ingrese el nuevo nombre del cliente:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el nuevo apellido del cliente:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la nueva dirección del cliente:");
            String direccion = scanner.nextLine();

            System.out.println("Ingrese el nuevo teléfono del cliente:");
            String telefono = scanner.nextLine();

            cliente.setNombres(nombre);
            cliente.setApellidos(apellido);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);

            controladorCliente.actualizarCliente(cliente);
            System.out.println("¡Cliente actualizado correctamente!");
        } else {
            System.out.println("No se encontró un cliente con la cédula especificada");
        }
    }

    private void obtenerCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cédula del cliente:");
        String cedula = scanner.nextLine();

        Cliente cliente = controladorCliente.obtenerCliente(cedula);
        if (cliente != null) {
            System.out.println(cliente);
        } else {
            System.out.println("No se encontró un cliente con la cédula especificada");
        }
    }

    private void obtenerTodosLosClientes() {
        List<Cliente> clientes = controladorCliente.obtenerTodosLosClientes();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
