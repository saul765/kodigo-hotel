package service;

import domain.Habitacion;

import java.util.List;

public interface IHotelService {

    List<Habitacion> habitacionesDisponibles();

    Double precioHabitacion(Integer idHabitacion);

    void dibujarHabitacion(Integer idHabitacion);

    void reservarHabitacion(Integer idHabitacion, Integer idCliente, Integer diasReserva);

    void eliminarReserva(Integer idReserva);

    void cambiarPrecioHabitacion(Integer idHabitacion, Double precio);

    void cambiarDescuentoCliente(Integer idCliente, Double descuento);

    void calcularGanancias();


}
