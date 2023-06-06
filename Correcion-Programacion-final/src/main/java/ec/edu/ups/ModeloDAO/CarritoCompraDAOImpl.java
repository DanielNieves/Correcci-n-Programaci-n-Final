/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ModeloDAO;

import ec.edu.ups.Controlado.CarritoCompraDAO;
import ec.edu.ups.Modelo.CarritoCompra;

/**
 *
 * @author
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarritoCompraDAOImpl implements CarritoCompraDAO {

    private List<CarritoCompra> carritos;

    public CarritoCompraDAOImpl() {
        this.carritos = new ArrayList<>();
    }

    @Override
    public void agregarCarritoCompra(CarritoCompra carrito) {
        carritos.add(carrito);
    }

    @Override
    public void eliminarCarritoCompra(CarritoCompra carrito) {
        carritos.remove(carrito);
    }

    @Override
    public void actualizarCarritoCompra(CarritoCompra carrito) {

    }

    @Override
    public CarritoCompra obtenerCarritoCompra(Date fecha) {

        return null;
    }

    @Override
    public List<CarritoCompra> obtenerTodosLosCarritosCompra() {
        return carritos;
    }
}
