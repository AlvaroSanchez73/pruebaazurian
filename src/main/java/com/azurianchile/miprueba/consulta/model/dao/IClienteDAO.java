package com.azurianchile.miprueba.consulta.model.dao;



import com.azurianchile.miprueba.consulta.model.entity.Cliente;

import java.util.List;

public interface IClienteDAO {

    public List<Cliente> findAllClientes();



}
