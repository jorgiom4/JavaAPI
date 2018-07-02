package com.instancia2.colecciones;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Ejemplo con conjuntos de datos
 */
public class Conjuntos {

    public Conjuntos(){
        super();
    }

    /**
     * Ejemplo con conjunto de datos de tipo HashSet
     */
    public void ejemploHashSet(){

        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("Hola");
        myHashSet.add("que tal");
        myHashSet.add("estas");
        myHashSet.add("Hola");

        myHashSet.remove("Hola");

        System.out.println("Tamaño del HashSet: " + myHashSet.size());

        for(String dato:myHashSet){
            System.out.println("Dato: " + dato);
        }


        Iterator<String> iterator = myHashSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
