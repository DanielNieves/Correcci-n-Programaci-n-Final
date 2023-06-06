/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlador;

/**
 *
 * @author 
 */

import ec.edu.ups.Controlado.CarritoCompraDAO;
import ec.edu.ups.Modelo.CarritoCompra;

import java.util.Date;
import java.util.List;

public class ControladorCarritoCompra {

    private CarritoCompraDAO carritoDAO;

    public ControladorCarritoCompra(CarritoCompraDAO carritoDAO) {
        this.carritoDAO = carritoDAO;
    }

    public void agregarCarritoCompra(CarritoCompra carrito) {
        carritoDAO.agregarCarritoCompra(carrito);
    }

    public void eliminarCarritoCompra(CarritoCompra carrito) {
        carritoDAO.eliminarCarritoCompra(carrito);
    }

    public void actualizarCarritoCompra(CarritoCompra carrito) {
        carritoDAO.actualizarCarritoCompra(carrito);
    }

    public CarritoCompra obtenerCarritoCompra(Date fecha) {
        return carritoDAO.obtenerCarritoCompra(fecha);
    }

    public List<CarritoCompra> obtenerTodosLosCarritosCompra() {
        return carritoDAO.obtenerTodosLosCarritosCompra();
    }
}
