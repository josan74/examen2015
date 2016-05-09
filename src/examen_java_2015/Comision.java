/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_java_2015;

/**
 *
 * @author José Ángel Andrés Castillejo
 */
public class Comision extends Empleado {

    double ventas;
    
    public Comision() {
    }

    public Comision(String dni, String nombre, String apellidos, double ventas) {
        super(dni, nombre, apellidos);
        this.ventas=ventas;
    }

    
    @Override
    public double sueldo() {
        double comision=ventas*0.25;
        double sueldo;
        sueldo=500+comision;
        return sueldo;
    }
    
}
