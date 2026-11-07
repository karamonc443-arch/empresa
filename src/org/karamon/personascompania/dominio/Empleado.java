package org.karamon.personascompania.dominio;

public class Empleado extends Persona {
    private static int ultimoId;
    private int id;
    private Double remuneracion;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.id = ++ultimoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getId() {
        return id;
    }

    public void aumentarRemuneracion(int porcentaje) {
        this.remuneracion += ((this.remuneracion * porcentaje) / 100);
    }

    public void aumentarRemuneracion(double porcentaje) {
        this.remuneracion += ((this.remuneracion * porcentaje) / 100);
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() +
                "id=" + id +
                ", remuneración=" + remuneracion +
                '}';
    }
}
