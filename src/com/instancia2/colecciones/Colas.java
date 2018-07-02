package com.instancia2.colecciones;

import java.util.PriorityQueue;

/**
 * Ejerccios con colas
 */
public class Colas {

    public Colas(){
        super();
    }

    /**
     * Ejemplo con colas
     */
    public void ejemploColas(){

        //-> OJO SOLO CON POLL ORDENA LOS ELEMENTOS

        PriorityQueue<Integer> myQue = new PriorityQueue<>();

        myQue.add(10);
        myQue.add(40);
        myQue.add(60);
        myQue.add(5);
        myQue.add(11);
        myQue.add(52);
        myQue.add(90);
        myQue.add(7);


        for(int i=0;myQue.size()>i;){
            System.out.println("Dato: " + myQue.poll());
        }


        /*
        for(int dato:myQue){
            System.out.println("Dato: " + dato);
        }
        */
    }
}
