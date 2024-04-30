package domain;

import sequence.ClienteSequence;

public abstract class Cliente {

    private final Integer id;

    private String nombre;

    private String documento;


    public Cliente(String nombre, String documento) {
        this.id = ClienteSequence.getInstance().getNextId();
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ",tipoCliente=" + this.getClass().getSimpleName() +
                "}\n";
    }
}
