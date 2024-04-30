package domain;

public class Habitual extends Cliente implements Descuento {

    private static final Double DESCUENTO = 0.10;

    public Habitual(String nombre, String documento) {
        super(nombre, documento);
    }

    @Override
    public Double aplicarDescuento() {
        return DESCUENTO;
    }
}
