package repository;

import domain.Cliente;
import domain.Esporadico;
import domain.Habitual;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements IClienteRepository {

    private final ArrayList<Cliente> clientes = new ArrayList<>(mockClientes());

    @Override
    public List<Cliente> getTodos() {
        if (clientes.isEmpty()) {
            throw new RuntimeException("No hay clientes");
        }
        return clientes;
    }

    @Override
    public Cliente getClienteById(int idCliente) {
        return clientes.stream()
                .filter(cliente -> cliente.getId().equals(idCliente))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
    }

    private List<Cliente> mockClientes() {
        return List.of(
                new Habitual("Juan", "12345678"),
                new Esporadico("Maria", "87654321"));
    }
}
