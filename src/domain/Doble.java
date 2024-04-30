package domain;

public class Doble extends Habitacion {

    private static final Double PRECIO = 40.00;

    private static final Integer CAPACIDAD = 2;

    private static final String FOTO_PATH = "src/assets/doble.jpg";


    public Doble() {
        super(FOTO_PATH, PRECIO, CAPACIDAD);
    }

}
