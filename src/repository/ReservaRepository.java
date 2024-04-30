package repository;

import domain.Reserva;

import java.util.ArrayList;
import java.util.List;

public class ReservaRepository implements IReservaRepository {

    private final ArrayList<Reserva> reservas = new ArrayList<>();

    @Override
    public List<Reserva> getTodos() {
        if (reservas.isEmpty()) {
            throw new RuntimeException("No hay reservas");
        }
        return reservas;
    }

    @Override
    public Reserva getReservaById(int idReserva) {
        return reservas.stream()
                .filter(reserva -> reserva.getId().equals(idReserva))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Reserva no encontrada"));
    }

    @Override
    public void eliminarReserva(int idReserva) {
        reservas.removeIf(reserva -> reserva.getId().equals(idReserva));
    }

    @Override
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}
