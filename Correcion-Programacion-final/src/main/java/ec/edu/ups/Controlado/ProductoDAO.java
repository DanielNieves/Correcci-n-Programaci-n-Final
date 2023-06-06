/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlado;

import ec.edu.ups.Modelo.Producto;

/**
 *
 * @author 
 */
import java.util.List;

public interface ProductoDAO {

    public void agregarProducto(Producto producto);

    public void eliminarProducto(Producto producto);

    public void actualizarProducto(Producto producto);

    public Producto obtenerProducto(String codigo);

    public List<Producto> obtenerTodosLosProductos();
}
