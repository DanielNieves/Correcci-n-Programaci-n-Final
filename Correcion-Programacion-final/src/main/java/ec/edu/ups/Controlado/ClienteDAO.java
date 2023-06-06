/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlado;

import ec.edu.ups.Modelo.Cliente;

/**
 *
 * @author 
 */
import java.util.List;

public interface ClienteDAO {

    public void agregarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);

    public void actualizarCliente(Cliente cliente);

    public Cliente obtenerCliente(String cedula);

    public List<Cliente> obtenerTodosLosClientes();
}
