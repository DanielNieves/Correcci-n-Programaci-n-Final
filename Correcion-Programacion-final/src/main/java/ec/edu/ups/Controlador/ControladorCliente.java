/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.Controlado.ClienteDAO;
import ec.edu.ups.Modelo.Cliente;
import java.util.List;

/**
 *
 * @author
 */
public class ControladorCliente {
    private ClienteDAO clienteDAO;

    public ControladorCliente(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public void agregarCliente(Cliente cliente) {
        clienteDAO.agregarCliente(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clienteDAO.eliminarCliente(cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        clienteDAO.actualizarCliente(cliente);
    }

    public Cliente obtenerCliente(String cedula) {
        return clienteDAO.obtenerCliente(cedula);
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteDAO.obtenerTodosLosClientes();
    }
}
