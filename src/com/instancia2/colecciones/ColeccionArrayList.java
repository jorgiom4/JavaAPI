package com.instancia2.colecciones;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Colecciones basadas en indices
 */
public class ColeccionArrayList {

    public ColeccionArrayList(){
        super();
    }

    public void MyarrayList(){

        ArrayList<String> aListString = new ArrayList<>();
        List<String> aSublist;
        aListString.add("Gorka");
        aListString.add("Alejandro");
        aListString.add("Blanca");
        aListString.add("Gonzalo");
        aListString.add("Belen");

        aListString.add(1,"Galy"); //->Inserta nueva valor en la posicion indicada y mueve el contenido de lo que habia en esa posicion a la siguinete así sucesivamente
        aListString.set(1,"Alfonso"); //-> Reemplaza el contenido de la posicion indicada con el valor pasado

        //Dos maneras de recorrer el ArrayList con for y con foraech
        System.out.println("Recorriendo con for");
        for(int i=0;i<aListString.size();i++){
            System.out.println("Nombre: " + aListString.get(i));
        }
        System.out.println("Size: " + aListString.size());

        //Recorriendo con foreach
        System.out.println("Recorriendo con foreach");
        for (String nombre:aListString) {
            System.out.println(nombre);
        }
        System.out.println("Size: " + aListString.size());

        //Creamos una sublista
        System.out.println("Creando sublista");
        aSublist = aListString.subList(1,3);
        //Recorriendo con foreach
        System.out.println("Recorriendo con foreach");
        for (String nombre:aSublist) {
            System.out.println(nombre);
        }

        System.out.println("Sublista: " + aSublist.size());

    }

    public double dameNotas(){

        double media = 0.0d;
        double suma = 0.0d;

        ArrayList<Double> aListNotas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Dame nota " + i);
            aListNotas.add(sc.nextDouble());
        }

        //
        for(Double num:aListNotas){
            suma += num;
        }

        media = suma / aListNotas.size();

        return media;


    }
}
