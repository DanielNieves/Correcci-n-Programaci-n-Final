/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.Controlado.ProductoDAO;
import ec.edu.ups.Modelo.Producto;
import java.util.List;

/**
 *
 * @author 
 */
public class ControladorProducto {
    private ProductoDAO productoDAO;

    public ControladorProducto(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public void agregarProducto(Producto producto) {
        productoDAO.agregarProducto(producto);
    }

    public void eliminarProducto(Producto producto) {
        productoDAO.eliminarProducto(producto);
    }

    public void actualizarProducto(Producto producto) {
        productoDAO.actualizarProducto(producto);
    }

    public Producto obtenerProducto(String codigo) {
        return productoDAO.obtenerProducto(codigo);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoDAO.obtenerTodosLosProductos();
    }
}
