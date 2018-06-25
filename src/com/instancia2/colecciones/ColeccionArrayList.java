package com.instancia2.colecciones;


import java.util.ArrayList;

/**
 * Colecciones basadas en indices
 */
public class ColeccionArrayList {

    public ColeccionArrayList(){
        super();
    }

    public void arrayList(){

        ArrayList<String> aListString = new ArrayList<>();
        aListString.add("Gorka");

        String sNombre = aListString.get(0);

        System.out.println("Nombre es: " + sNombre);

    }
}
