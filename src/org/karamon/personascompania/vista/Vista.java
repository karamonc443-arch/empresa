package org.karamon.personascompania.vista;

import org.karamon.personascompania.dominio.Cliente;
import org.karamon.personascompania.dominio.Empleado;
import org.karamon.personascompania.dominio.Gerente;

public class Vista {
    public static void main(String[] args) {
        Empleado lucas = new Empleado("Lucas", "Gonzalez", "012345687D", "Otra calle", 1700D);
        System.out.println(lucas);
        Gerente gerente = new Gerente("Greg", "Roe", "12.345.678-9D", "Agustinas 3322", 2000D, 67000D);
        gerente.aumentarRemuneracion(2.5);
        gerente.setPresupuesto(8000D);
        System.out.println(gerente);

        Cliente marta = new Cliente("Marta", "Martinez", "000111222D", "Su calle habitual");
        System.out.println(marta);
    }
}
