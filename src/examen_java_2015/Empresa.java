/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_java_2015;

import static java.lang.Character.UnicodeScript.values;
import java.util.Collection;
import java.util.HashMap;


/**
 *
 * @author José Ángel Andrés Castillejo
 */
public class Empresa {
    private HashMap <String, Empleado> empleados;

    public Empresa() {
        empleados=new HashMap<>();
    }

    public Empresa(HashMap<String, Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public void alta(Empleado empleado) throws ExceptionEmpleadoRepetido{
     
        // compruebo si existe el empleado
       if( getEmpleado(empleado.getDni())==null){
            empleados.put(empleado.getDni(), empleado);
        }
       else throw new ExceptionEmpleadoRepetido("el empleado "+empleado.getDni()+ "ya existe");
        
       
    }
    
    public Empleado getEmpleado(String dni) {
        Empleado empleado = empleados.get(dni);
        return null;
    }
    
    
    
    public void alta(Horas horas) throws examen_java_2015.ExceptionEmpleadoRepetido{
       Empleado empleado = horas;
       alta(empleado);
        
    }
    
    public void alta(Fijo fijo) throws examen_java_2015.ExceptionEmpleadoRepetido{
       Empleado empleado = fijo;
       alta(empleado);
        
    }
    
    public void alta(Comision comision) throws examen_java_2015.ExceptionEmpleadoRepetido{
       Empleado empleado = comision;
       alta(empleado);
        
    }

    
    
    
    public double getNomina(String dni) throws examen_java_2015.ExceptionEmpleadoRepetido{
        double nomina;
        Empleado empleado = getEmpleado(dni);
        return empleado.getSueldo();
        
    
    }
    
    public void totalNomina(){
        Collection listaEmpleados= empleados.values();
        double nominas = 0;
        for(Object empleado:listaEmpleados){
            nominas+= ((Empleado) empleado).getSueldo();
        }
    }

    public HashMap<String, Empleado> getEmpleados() {
        return empleados;
    }
    
    
  
}
