package repository;

import domain.Cliente;

import java.util.List;

public interface IClienteRepository {

    List<Cliente> getTodos();

    Cliente getClienteById(int idCliente);
}
