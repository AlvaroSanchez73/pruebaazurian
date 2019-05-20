package com.azurianchile.miprueba.consulta.controller;


import com.azurianchile.miprueba.consulta.model.dao.IClienteDAO;
import com.azurianchile.miprueba.consulta.model.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteDAO clienteDAO;

    @GetMapping("/clientes")
    public List<Cliente> getAll() {

        return clienteDAO.findAllClientes();
    }

}
