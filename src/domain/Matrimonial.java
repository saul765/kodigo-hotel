package domain;

public class Matrimonial extends Habitacion {

    private static final Double PRECIO = 40.00;

    private static final Integer CAPACIDAD = 3;

    private static final String FOTO_PATH = "src/assets/matrimonial.jpg";

    public Matrimonial() {
        super(FOTO_PATH, PRECIO, CAPACIDAD);
    }



}
