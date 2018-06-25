package com.instancia2.ejercicio_4;


/**
 * API SE
 * Ejerccio 4
 * En este ejercicio vamos a realizar un programa que nos muestre la suma de todos los números
 enteros comprendidos entre dos números aleatorios generados por el propio programa. Los
 números aleatorios serán mayores de 0 y menores de 100.
 */
public class Ejerccio4 {

    int num1 = 0;
    int num2 = 0;

    int suma = 0;

    /**
     * Constructor
     */
    public Ejerccio4(){
        super();
    }

    public int sumaRandom(){

        num1 = (int) Math.round(Math.random());
        num2 = (int) (Math.round(Math.random()*100));

        for(int i=num1; i<= num2; i++){
            suma += num1;
        }

        return suma;

    }

}


