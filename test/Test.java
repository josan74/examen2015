/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import examen_java_2015.Comision;
import examen_java_2015.Empresa;
import examen_java_2015.ExceptionEmpleadoRepetido;
import examen_java_2015.Fijo;
import examen_java_2015.Horas;
import examen_java_2015.XML;
import java.io.File;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Jose Angel
 */
public class Test {
    private Object FileUtils;
    /*
    @org.junit.Rule
    public ExceptionEmpleadoRepetido exception = ExceptionEmpleadoRepetido.none();
    */
    public Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @org.junit.Test
    public void empleadoTest(){
        Empresa miEmpresa=new Empresa();
        org.junit.Assert.assertNotNull(miEmpresa);
      
        
        
    }  
    
     @org.junit.Test
    public void añadiEmpleadoTest(){
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

    }
    
      @org.junit.Test
    public void generarXMLTest(){
        
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
      XML xml = new XML();
      
      xml.generarXML(miEmpresa);
      
      
      
    }
    
    /*
      @org.junit.Test
    public void empleadoExceptionTest(){
         exception.expect(IllegalArgumentException.class);
         exception.expectMessage("error1");
        new RodneCislo("891415",dopocitej("891415"));
        
        
    }  */
    
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
