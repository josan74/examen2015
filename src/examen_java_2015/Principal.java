/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_java_2015;

import java.util.Scanner;

/**
 *
 * @author José Ángel Andrés Castillejo
 */
public class Principal {
   
  public static void main(String[] args){
      int opcion=0;
      Scanner teclado=new Scanner(System.in);
      
      Empresa miEmpresa=new Empresa();
       
      Fijo t1=new Fijo("11111111A","Juan", "Nadie Nadie");
      Comision t2=new Comision("22222222B", "Laura", "Alguien Alguien", 3970f);
      Horas t3=new Horas("33333333C","Jaime","Cualquier Cualquier",150);
      Horas t4=new Horas("44444444D","Nuria","G. M.", 161);
      
      try{
          miEmpresa.alta(t1);
          miEmpresa.alta(t2);
          miEmpresa.alta(t3);
          miEmpresa.alta(t4);
      }catch(Exception e){
          System.out.println("Existe algún dni repetido");
      }
      
      do {
          System.out.println("\n\n      Mi Empresa");
          System.out.println("Sueldo por empleado (dni)...........1");
          System.out.println("Gasto total en sueldos..............2");
          System.out.println("Generar archivo XML.................3");
          System.out.println("Fin.................................0");
          opcion=teclado.nextInt();
          ///////////////////////////////////////

//INSERTA AQUÍ SI LO CREES CONVENIENTE EL CÓDIGO QUE NECESITES		

          //////////////////////////////////////
      }while(opcion!=0);   
  }
  ///////////////////////////////////////

//INSERTA AQUÍ SI LO CREES CONVENIENTE EL CÓDIGO QUE NECESITES		

  //////////////////////////////////////

}

    

