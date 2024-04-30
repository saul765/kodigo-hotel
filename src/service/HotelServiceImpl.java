package service;

import domain.Cliente;
import domain.Habitacion;
import domain.Reserva;
import repository.IClienteRepository;
import repository.IHabitacionRepository;
import repository.IReservaRepository;

import java.util.Date;
import java.util.List;

public class HotelServiceImpl implements IHotelService {

    private final IHabitacionRepository habitacionRepository;

    private final IReservaRepository reservaRepository;

    private final IClienteRepository clienteRepository;

    public HotelServiceImpl(IHabitacionRepository habitacionRepository, IReservaRepository reservaRepository, IClienteRepository clienteRepository) {
        this.habitacionRepository = habitacionRepository;
        this.reservaRepository = reservaRepository;
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Habitacion> habitacionesDisponibles() {
        return habitacionRepository.getHabitacionesDisponibles();
    }

    @Override
    public Double precioHabitacion(Integer idHabitacion) {
        return habitacionRepository.getHabitacionById(idHabitacion).getPrecio();
    }

    @Override
    public void dibujarHabitacion(Integer idHabitacion) {
        Habitacion habitacion = habitacionRepository.getHabitacionById(idHabitacion);
        habitacion.getFoto();
        // TODO agregar una libreria de utils para leer archivos y renderizr la foto al obtener el stream
    }

    @Override
    public void reservarHabitacion(Integer idHabitacion, Integer idCliente, Integer diasReserva) {

        Cliente cliente = clienteRepository.getClienteById(idCliente);
        Habitacion habitacion = habitacionRepository.getHabitacionById(idHabitacion);
        if (habitacion.getDisponible()) {
            habitacion.setDisponible(false);
            habitacionRepository.updateHabitacion(habitacion.getId(), habitacion);
            Reserva reserva = new Reserva(new Date(), diasReserva, cliente, habitacion);
            reservaRepository.agregarReserva(reserva);
        } else {
            throw new RuntimeException("Habitacion no disponible");
        }

    }

    @Override
    public void eliminarReserva(Integer idReserva) {
        Reserva reserva = reservaRepository.getReservaById(idReserva);
        Habitacion habitacion = habitacionRepository.getHabitacionById(reserva.getHabitacion().getId());
        habitacion.setDisponible(true);
        habitacionRepository.updateHabitacion(habitacion.getId(), habitacion);
        reservaRepository.eliminarReserva(idReserva);
    }

    @Override
    public void cambiarPrecioHabitacion(Integer idHabitacion, Double precio) {

    }

    @Override
    public void cambiarDescuentoCliente(Integer idCliente, Double descuento) {

    }

    @Override
    public void calcularGanancias() {

    }
}
