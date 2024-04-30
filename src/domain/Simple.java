package domain;

public class Simple extends Habitacion {

    private static final Double PRECIO = 20.00;

    private static final Integer CAPACIDAD = 1;

    private static final String FOTO_PATH = "src/assets/simple.jpg";

    public Simple() {
        super(FOTO_PATH, PRECIO, CAPACIDAD);
    }

}
