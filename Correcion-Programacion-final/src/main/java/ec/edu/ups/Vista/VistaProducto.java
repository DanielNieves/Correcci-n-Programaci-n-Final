/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Vista;

/**
 *
 * @author
 */
import ec.edu.ups.Controlador.ControladorProducto;

import ec.edu.ups.Modelo.Producto;

import java.util.List;
import java.util.Scanner;

public class VistaProducto {

    private ControladorProducto controladorProducto;

    public VistaProducto(ControladorProducto controladorProducto) {
        this.controladorProducto = controladorProducto;
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú Producto -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Obtener producto");
            System.out.println("5. Obtener todos los productos");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    eliminarProducto();
                    break;
                case 3:
                    actualizarProducto();
                    break;
                case 4:
                    obtenerProducto();
                    break;
                case 5:
                    obtenerTodosLosProductos();
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

    private void agregarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del producto:");
        String codigo = scanner.nextLine();

        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la descripción del producto:");
        String descripcion = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        Producto producto = new Producto(codigo, nombre, descripcion, precio);
        controladorProducto.agregarProducto(producto);
        System.out.println("¡Producto agregado correctamente!");
    }

    private void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del producto a eliminar:");
        String codigo = scanner.nextLine();

        Producto producto = controladorProducto.obtenerProducto(codigo);
        if (producto != null) {
            controladorProducto.eliminarProducto(producto);
            System.out.println("¡Producto eliminado correctamente!");
        } else {
            System.out.println("No se encontró un producto con el código especificado");
        }
    }

    private void actualizarProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del producto a actualizar:");
        String codigo = scanner.nextLine();

        Producto producto = controladorProducto.obtenerProducto(codigo);
        if (producto != null) {
            System.out.println("Ingrese el nuevo nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el nuevo precio del producto:");
            double precio = scanner.nextDouble();

            producto.setNombre(nombre);
            producto.setPrecio(precio);

            controladorProducto.actualizarProducto(producto);
            System.out.println("¡Producto actualizado correctamente!");
        } else {
            System.out.println("No se encontró un producto con el código especificado");
        }
    }

    private void obtenerProducto() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el código del producto:");
        String codigo = scanner.nextLine();

        Producto producto = controladorProducto.obtenerProducto(codigo);
        if (producto != null) {
            System.out.println(producto);
        } else {
            System.out.println("No se encontró un producto con el código especificado");
        }
    }

    private void obtenerTodosLosProductos() {
        List<Producto> productos = controladorProducto.obtenerTodosLosProductos();
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
