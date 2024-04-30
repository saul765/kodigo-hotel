package domain;

import sequence.HabitacionSequence;

public abstract class Habitacion {

    private final Integer id;

    private String foto;

    private Double precio;

    private Integer cantidadPersonas;

    private Boolean isDisponible;

    public Habitacion(String foto, Double precio, Integer cantidadPersonas) {
        this.id = HabitacionSequence.getInstance().getNextId();
        this.foto = foto;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.isDisponible = true;
    }

    public Integer getId() {
        return id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Boolean getDisponible() {
        return isDisponible;
    }

    public void setDisponible(Boolean disponible) {
        isDisponible = disponible;
    }

    protected void dibujarFoto() {
        //TODO implementar obtencion de foto de habitacion desde archivo usando this.photo para obtener el path y dado que es siempre una carga
        // de archivo no es necesario implementar un metodo abstracto
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", foto='" + foto + '\'' +
                ", precio=" + precio +
                ", cantidadPersonas=" + cantidadPersonas +
                ", isDisponible=" + isDisponible +
                ",tipoHabitacion=" + this.getClass().getSimpleName() +
                "}\n";
    }
}
