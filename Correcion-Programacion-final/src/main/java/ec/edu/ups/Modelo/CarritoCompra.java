/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Modelo;



/**
 *
 * @author 
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarritoCompra {

    private Date fecha;
    private double subtotal;
    private double iva;
    private double total;
    private Cliente cliente;
    private List<Producto> productos;

    public CarritoCompra(Cliente cliente) {
        this.fecha = new Date();
        this.subtotal = 0;
        this.iva = 0;
        this.total = 0;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getIva() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        subtotal += producto.getPrecio();
        calcularTotal();
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
        subtotal -= producto.getPrecio();
        calcularTotal();
    }

    private void calcularTotal() {
        iva = subtotal * 0.12;
        total = subtotal + iva;
    }
}
