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

    private final static double SUELDO_FIJO= 1300;
    
    public Fijo() {
        
    }

    public Fijo(String dni, String nombre, String apellidos) {
        super(dni, nombre, apellidos);
    }
    
    
    @Override
    public void setSueldo() {
        sueldo = SUELDO_FIJO;
        
    }
    
}
