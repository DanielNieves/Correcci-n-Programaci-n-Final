/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Main;

/**
 *
 * @author 
 */

import ec.edu.ups.Controlador.ControladorCarritoCompra;
import ec.edu.ups.Controlador.ControladorCliente;
import ec.edu.ups.Controlador.ControladorProducto;
import ec.edu.ups.Controlado.CarritoCompraDAO;
import ec.edu.ups.ModeloDAO.CarritoCompraDAOImpl;
import ec.edu.ups.Controlado.ClienteDAO;
import ec.edu.ups.ModeloDAO.ClienteDAOImpl;
import ec.edu.ups.Controlado.ProductoDAO;
import ec.edu.ups.ModeloDAO.ProductoDAOImpl;
import ec.edu.ups.Vista.VistaCarritoCompra;
import ec.edu.ups.Vista.VistaCliente;
import ec.edu.ups.Vista.VistaProducto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        CarritoCompraDAO carritoDAO = new CarritoCompraDAOImpl();
        ControladorCarritoCompra controladorCarritoCompra = new ControladorCarritoCompra(carritoDAO);

        ClienteDAO clienteDAO = new ClienteDAOImpl();
        ControladorCliente controladorCliente = new ControladorCliente(clienteDAO);

        ProductoDAO productoDAO = new ProductoDAOImpl();
        ControladorProducto controladorProducto = new ControladorProducto(productoDAO);

        VistaCliente vistaCliente = new VistaCliente(controladorCliente);
        VistaProducto vistaProducto = new VistaProducto(controladorProducto);
        VistaCarritoCompra vistaCarritoCompra = new VistaCarritoCompra(controladorCarritoCompra, controladorCliente);

        int opcion;
        do {
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Menú Cliente");
            System.out.println("2. Menú Producto");
            System.out.println("3. Menú Carrito de Compra");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    vistaCliente.mostrarMenuPrincipal();
                    break;
                case 2:
                    vistaProducto.mostrarMenu();
                    break;
                case 3:
                    vistaCarritoCompra.mostrarMenu();
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
}
