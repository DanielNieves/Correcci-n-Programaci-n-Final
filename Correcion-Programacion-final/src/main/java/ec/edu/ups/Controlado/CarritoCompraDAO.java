/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlado;

import ec.edu.ups.Modelo.CarritoCompra;

/**
 *
 * @author 
 */
import java.util.Date;
import java.util.List;


public interface CarritoCompraDAO {

    public void agregarCarritoCompra(CarritoCompra carrito);

    public void eliminarCarritoCompra(CarritoCompra carrito);

    public void actualizarCarritoCompra(CarritoCompra carrito);

    public CarritoCompra obtenerCarritoCompra(Date fecha);

    public List<CarritoCompra> obtenerTodosLosCarritosCompra();
}
