package repository;

import domain.Doble;
import domain.Habitacion;
import domain.Matrimonial;
import domain.Simple;

import java.util.ArrayList;
import java.util.List;

public class HabitacionRepository implements IHabitacionRepository {

    private final ArrayList<Habitacion> habitaciones = new ArrayList<>(mockHabitaciones());


    @Override
    public List<Habitacion> getTodos() {
        if (habitaciones.isEmpty()) {
            throw new RuntimeException("No hay habitaciones");
        }
        return habitaciones;
    }

    @Override
    public Habitacion getHabitacionById(int idHabitacion) {
        return habitaciones.stream()
                .filter(habitacion -> habitacion.getId().equals(idHabitacion))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Habitacion no encontrada"));
    }

    @Override
    public List<Habitacion> getHabitacionesDisponibles() {
        return habitaciones.stream()
                .filter(Habitacion::getDisponible)
                .toList();
    }

    @Override
    public void updateHabitacion(int idHabitacion, Habitacion habitacion) {

    }

    private List<Habitacion> mockHabitaciones() {
        return List.of(
                new Simple(),
                new Doble(),
                new Matrimonial());
    }
}
