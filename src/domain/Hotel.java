package domain;

import service.IHotelService;

import java.util.List;

public class Hotel implements IHotelService {

    // Coloque los metodos de la interfaz IHotelService porque lo requiere el diagarama de clases sin embargo
    // no es necesario ya que la logica de la adminitracion se delega al HotelServiceImpl
    // ocupadas y disponible no se usan ya que se tiene el repositorio de habitaciones y reservas

    private Integer ocupadas;

    private Integer disponibles;

    public Hotel(Integer ocupadas, Integer disponibles) {
        this.ocupadas = ocupadas;
        this.disponibles = disponibles;
    }

    public Integer getOcupadas() {
        return ocupadas;
    }

    public void setOcupadas(Integer ocupadas) {
        this.ocupadas = ocupadas;
    }

    public Integer getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(Integer disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public List<Habitacion> habitacionesDisponibles() {
        return List.of();
    }

    @Override
    public Double precioHabitacion(Integer idHabitacion) {
        return 0.0;
    }

    @Override
    public void dibujarHabitacion(Integer idHabitacion) {

    }

    @Override
    public void reservarHabitacion(Integer idHabitacion, Integer idCliente, Integer diasReserva) {

    }

    @Override
    public void eliminarReserva(Integer idReserva) {

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
