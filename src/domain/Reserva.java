package domain;

import sequence.ReservaSequence;

import java.util.Date;

public class Reserva {

    private final Integer id;

    private Date fechaInicio;

    private Integer dias;

    private Cliente cliente;

    private Habitacion habitacion;

    public Reserva(Date fechaInicio, Integer dias, Cliente cliente, Habitacion habitacion) {
        this.id = ReservaSequence.getInstance().getNextId();
        this.fechaInicio = fechaInicio;
        this.dias = dias;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Integer getId() {
        return id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", fechaInicio=" + fechaInicio +
                ", dias=" + dias +
                ", cliente=" + cliente +
                ", habitacion=" + habitacion +
                '}';
    }
}
