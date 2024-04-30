import domain.Hotel;
import repository.*;
import service.HotelServiceImpl;
import service.IHotelService;

public class Main {

    public static void main(String[] args) {

        try {
            //Formalidad, ya que no se usa porque implemente services y repositorios
            Hotel hotel = new Hotel(0, 3);

            // Instanciando repositorios y servicios
            IClienteRepository clienteRepository = new ClienteRepositoryImpl();
            IHabitacionRepository habitacionRepository = new HabitacionRepository();
            IReservaRepository reservaRepository = new ReservaRepository();

            IHotelService hotelService = new HotelServiceImpl(habitacionRepository, reservaRepository, clienteRepository);

            // Operaciones de hotel
            System.out.println("Habitaciones disponibles: " + hotelService.habitacionesDisponibles());
            System.out.println("Precio de habitacion: con Id: 1 $" + hotelService.precioHabitacion(1));
            System.out.println("Precio de habitacion: con Id: 3 $" + hotelService.precioHabitacion(3));
            //clientes disponibles
            System.out.println("Clientes disponibles: " + clienteRepository.getTodos());
            //reservando una habitacion
            hotelService.reservarHabitacion(1, 1, 3);
            //La habitacion 1 ya no esta disponible
            System.out.println("Habitaciones disponibles: " + hotelService.habitacionesDisponibles());
            // ver reservas
            System.out.println("Reservas: " + reservaRepository.getTodos());
            //Eliminando la reserva
            hotelService.eliminarReserva(1);
            //La habitacion 1 vuelva a estar disponible
            System.out.println("Habitaciones disponibles: " + hotelService.habitacionesDisponibles());
            // ver reservas, ya no hay reservas
            System.out.println("Reservas: " + reservaRepository.getTodos());

            //Implemente gran parte de los metodos asi que lo dejare hasta aqui :)

            //Pense en usar gradle + lombok pero cuando mencionaste que se podia ya estaba empezando a hacer los POJOS hahaha
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}