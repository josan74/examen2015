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

    private double ventas;

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    public Comision() {
    }

    public Comision(String dni, String nombre, String apellidos, double ventas) {
        super(dni, nombre, apellidos);
        this.ventas=ventas;
    }

    
    @Override
    public void setSueldo() {
        double comision=ventas*0.25;
        sueldo=500+comision;
    }
    
}
