package br.com.fecaf.controller;

import br.com.fecaf.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {

    // Necessario criar lista para armazenar clientes
    List<Cliente> clienteList = new ArrayList<>();


    // Add client na lista
    public void addClientList (Cliente cliente) {
        clienteList.add(cliente);
    }

    // Pesquisar Cliente
    public Cliente pesquisarCliente (String cpf) {
        for (Cliente cliente : clienteList) {
            if (cliente.getCpf().equals(cpf)){
                System.out.println("Cliente Encontrado");
                return cliente;
            }
        }
        System.out.println("Cliente " + cpf + "  não cadastrado");
        return null;
    }






}
