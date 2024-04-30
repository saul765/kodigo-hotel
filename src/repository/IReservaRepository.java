package repository;

import domain.Reserva;

import java.util.List;

public interface IReservaRepository {

    List<Reserva> getTodos();

    Reserva getReservaById(int idReserva);

    void eliminarReserva(int idReserva);

    void agregarReserva(Reserva reserva);
}
