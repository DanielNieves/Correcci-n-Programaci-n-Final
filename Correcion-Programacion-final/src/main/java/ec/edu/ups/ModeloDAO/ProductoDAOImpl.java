/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ModeloDAO;

import ec.edu.ups.Controlado.ProductoDAO;
import ec.edu.ups.Modelo.Producto;

/**
 *
 * @author 
 */
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {
    private List<Producto> productos;

    public ProductoDAOImpl() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        // Implementa la lógica para actualizar un producto en la lista de productos
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        // Implementa la lógica para obtener un producto por su código
        return null;
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productos;
    }
}
