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
public abstract class Empleado {
    
    private String dni;
    private String nombre;
    private String apellidos;
    protected double sueldo;

    //constructor vacio
    public Empleado() {
       
    }
    
    //constructor con parametros
    public Empleado(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        setSueldo();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public double getSueldo( ) {
        return sueldo;
    }
    
    //todos los trabajadores tendrán sueldo, pero será distinto para cada uno.
    public abstract void setSueldo();
    
    
}
