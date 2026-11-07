package org.karamon.personascompania.dominio;

public class Cliente extends Persona {
    private static int ultimoId;
    private int id;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.id = ++ultimoId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                "id=" + id +
                '}';
    }
}
