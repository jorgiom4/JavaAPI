package com.instancia2.entradasalida;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * Ejemplo de uso de la clase PrintStream
 */
public class EjemploPrintStream {

    public EjemploPrintStream(){
        super();
    }

    /**
     * Creamos un objeto PrintStream para ver la salida de datos
     */
    public void salidaPrintStream(){
        try {
            PrintStream ps = new PrintStream("salida.txt");
            ps.println("Esto es una linea de salida de ejemplo");
            System.out.println("Fichero con contenido creado");
            ps.close();


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * Ejemplo con BufferedReader
     */
    public void ejemploBufferedReader(){
        try {
            System.out.println("Introduce texto por teclado....");
            InputStream in = System.in;
            InputStreamReader iStr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(iStr);
            br.readLine();

            System.out.println("Introducido: ");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
