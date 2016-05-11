/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_java_2015;

import java.io.File;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author José Ángel Andrés Castillejo
 */
public class XML {

    private static final String XML_FILE = "empleados.xml";
    private static final String NODO_RAIZ = "Nomina";
    private static final String VERSION_XML = "1.0";
    private static final String ELEMENTO_EMPLEADO = "empleado";
    private static final String NODO_DNI = "dni";
    private static final String NODO_NOMBRE = "nombre";
    private static final String NODO_SUELDO = "sueldo";

     //guarda en fichero
    public void generarXML(Empresa empresa) {
        
        generarXML(XML_FILE,empresa);
    }
    //guarda en fichero
    public void generarXML(String ruta, Empresa empresa) {
        Document document = generarXMLEmpleados(empresa);
        //guardamos el XML
        Source source = new DOMSource(document);
        Result result = new StreamResult(new java.io.File(ruta));
        Transformer transformer;
        try {
            transformer = TransformerFactory.newInstance().newTransformer();

            transformer.transform(source, result);

            // da formato al xml para tabularlo y separarlo en distintas lineas
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            Result console = new StreamResult(System.out);
            transformer.transform(source, console);
            
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);

        } catch (TransformerException ex) {
            Logger.getLogger(XML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //primero generamos y guardamos en memoria
    private Document generarXMLEmpleados(Empresa empresa) {
        Document document = null;

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            //Ahora creamos el objeto Document, lo que vendría a ser nuestra raíz del arbol XML y asignamos la version de XML.
            document = implementation.createDocument(null, NODO_RAIZ, null);
            document.setXmlVersion(VERSION_XML);

            for (Map.Entry<String, Empleado> entrada : empresa.getEmpleados().entrySet()) {
                Element raiz = document.createElement(ELEMENTO_EMPLEADO);
                document.getDocumentElement().appendChild(raiz);
                crearElemento(NODO_DNI, entrada.getKey(), raiz, document);
                crearElemento(NODO_NOMBRE, entrada.getValue().getNombre(), raiz, document);
                //Double.toString meto como string un double
                crearElemento(NODO_SUELDO, Double.toString(entrada.getValue().getSueldo()), raiz, document);
            }
        } catch (ParserConfigurationException ex) {
            System.out.println("Error al crear el parser");
        }

        return document;

    }

    private void crearElemento(String datoEmpleado, String valor, Element raiz, Document document) {
        Element elem = document.createElement(datoEmpleado); //creamos el hijo
        Text text = document.createTextNode(valor); //damos valor
        raiz.appendChild(elem); //pegamos el elemento hijo a la raiz
        elem.appendChild(text); //pegamos el valor
    }
}
