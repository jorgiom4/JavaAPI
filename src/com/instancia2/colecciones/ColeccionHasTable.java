package com.instancia2.colecciones;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

/**
 * Ejemplo de colecciones basadas en claves
 */
public class ColeccionHasTable {

    public ColeccionHasTable(){
        super();
    }

    public void ejemploHasTable(){

        Hashtable<String,String> aListaPersonas = new Hashtable<>(); //->No permite nulo ni en la clave ni en el valor
        aListaPersonas.put("profesor","Gustavo");
        aListaPersonas.put("alumno","Jose Maria");
        aListaPersonas.put("alumna","Maria");

        System.out.println(aListaPersonas.get("profesor"));

        //Recorremos el HasTable
        Set<String> keyset = aListaPersonas.keySet();

        for(String key:keyset){
            System.out.println("Clave: " + key + " Valor: " + aListaPersonas.get(key));

            //System.out.println("Valor de clave: " + key);
            //System.out.println("Valor de la clave: " + aListaPersonas.get(key));
        }

    }

    public void ejemploHashMap(){

        HashMap<String,String> myHasTable = new HashMap<>(); //-> Permite nulos
        myHasTable.put("profesor","Gustavo");
        myHasTable.put("alumno","Gorka");
        myHasTable.put("alumna","Rocio");
        myHasTable.put(null,null);

        System.out.println(myHasTable.get("profesor"));

        Set<String> keset = myHasTable.keySet();

        for(String key:keset){
            System.out.println("Clave: " + key + " Valor: " + myHasTable.get(key));
        }

    }
}
