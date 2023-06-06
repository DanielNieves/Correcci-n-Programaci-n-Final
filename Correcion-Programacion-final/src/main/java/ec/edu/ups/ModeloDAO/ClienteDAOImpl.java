/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ModeloDAO;

import ec.edu.ups.Controlado.ClienteDAO;
import ec.edu.ups.Modelo.Cliente;


/**
 *
 * @author
 */
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOImpl implements ClienteDAO {
    private List<Cliente> clientes;

    public ClienteDAOImpl() {
        this.clientes = new ArrayList<>();
    }

    @Override
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
      
    }

    @Override
    public Cliente obtenerCliente(String cedula) {
       
        return null;
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return clientes;
    }
}
