/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Vista;

/**
 *
 * @author 
 */

import ec.edu.ups.Modelo.CarritoCompra;
import ec.edu.ups.Modelo.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ec.edu.ups.Controlador.ControladorCarritoCompra;
import ec.edu.ups.Controlador.ControladorCliente;

public class VistaCarritoCompra {

    private ControladorCarritoCompra controladorCarritoCompra;
    private ControladorCliente controladorCliente;

    public VistaCarritoCompra(ControladorCarritoCompra controladorCarritoCompra, ControladorCliente controladorCliente) {
        this.controladorCarritoCompra = controladorCarritoCompra;
        this.controladorCliente = controladorCliente;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú Carrito de Compra -----");
            System.out.println("1. Agregar carrito de compra");
            System.out.println("2. Eliminar carrito de compra");
            System.out.println("3. Actualizar carrito de compra");
            System.out.println("4. Obtener carrito de compra");
            System.out.println("5. Obtener todos los carritos de compra");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    agregarCarritoCompra();
                    break;
                case 2:
                    eliminarCarritoCompra();
                    break;
                case 3:
                    actualizarCarritoCompra();
                    break;
                case 4:
                    obtenerCarritoCompra();
                    break;
                case 5:
                    obtenerTodosLosCarritosCompra();
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

    private void agregarCarritoCompra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cédula del cliente:");
        String cedulaCliente = scanner.nextLine();

        // Obtener el cliente del controlador de clientes
        Cliente cliente = controladorCliente.obtenerCliente(cedulaCliente);
        if (cliente == null) {
            System.out.println("No se encontró un cliente con la cédula especificada");
            return;
        }

        CarritoCompra carrito = new CarritoCompra(cliente);
        controladorCarritoCompra.agregarCarritoCompra(carrito);
        System.out.println("¡Carrito de compra agregado correctamente!");
    }

    private void actualizarCarritoCompra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha del carrito de compra a actualizar (en formato dd/MM/yyyy):");
        String fechaString = scanner.nextLine();

    
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = dateFormat.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
            return;
        }

        CarritoCompra carrito = controladorCarritoCompra.obtenerCarritoCompra(fecha);
        if (carrito != null) {
            // Implementa la lógica para actualizar un carrito de compra

            controladorCarritoCompra.actualizarCarritoCompra(carrito);
            System.out.println("¡Carrito de compra actualizado correctamente!");
        } else {
            System.out.println("No se encontró un carrito de compra con la fecha especificada");
        }
    }

    private void obtenerCarritoCompra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha del carrito de compra (en formato dd/MM/yyyy):");
        String fechaString = scanner.nextLine();

        // Aquí puedes realizar la conversión de la cadena de fecha a un objeto Date según el formato
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = dateFormat.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
            return;
        }

        CarritoCompra carrito = controladorCarritoCompra.obtenerCarritoCompra(fecha);
        if (carrito == null) {
            System.out.println("No se encontró un carrito de compra para la fecha especificada");
        } else {
            System.out.println(carrito);
        }
    }

    private void obtenerTodosLosCarritosCompra() {
        List<CarritoCompra> carritos = controladorCarritoCompra.obtenerTodosLosCarritosCompra();
        for (CarritoCompra carrito : carritos) {
            System.out.println(carrito);
        }
    }

    private void eliminarCarritoCompra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha del carrito de compra a eliminar (en formato dd/MM/yyyy):");
        String fechaString = scanner.nextLine();

        // Aquí puedes realizar la conversión de la cadena de fecha a un objeto Date según el formato
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = dateFormat.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto");
            return;
        }

        CarritoCompra carrito = controladorCarritoCompra.obtenerCarritoCompra(fecha);
        if (carrito != null) {
            controladorCarritoCompra.eliminarCarritoCompra(carrito);
            System.out.println("¡Carrito de compra eliminado correctamente!");
        } else {
            System.out.println("No se encontró un carrito de compra con la fecha especificada");
        }
    }
}
