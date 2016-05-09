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
public class Fijo extends Empleado{

    public Fijo() {
    }

    public Fijo(String dni, String nombre, String apellidos) {
        super(dni, nombre, apellidos);
    }
    
    
    @Override
    public double sueldo() {
        double SUELDO=1300;
        
        return SUELDO;
        
    }
    
}
