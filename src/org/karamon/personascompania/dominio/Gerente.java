package org.karamon.personascompania.dominio;

public final class Gerente extends Empleado {
    private Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, Double presupuestoIngresado) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion);

        if (presupuestoIngresado == null || presupuestoIngresado <= 9000) {
            this.presupuesto = 1000D;
        } else {
            this.presupuesto = presupuestoIngresado;
        }

    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto += presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() +
                "presupuesto=" + presupuesto +
                '}';
    }
}
