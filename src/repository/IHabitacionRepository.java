package repository;

import domain.Habitacion;

import java.util.List;

public interface IHabitacionRepository {

    List<Habitacion> getTodos();

    Habitacion getHabitacionById(int idHabitacion);

    List<Habitacion> getHabitacionesDisponibles();

    void updateHabitacion(int idHabitacion, Habitacion habitacion);
}
