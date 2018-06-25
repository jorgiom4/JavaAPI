package com.instancia2.parseo;


import java.util.Scanner;

/**
 * Ejerccios de Parsep
 */
public class Parseo {

    public Parseo(){
        super();
    }

    public void sumaParseo(){

        String sNumero1 = "";
        String sNumero2 = "";

        int suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame primer numero");
        sNumero1 = sc.next();

        System.out.println("Dame segundo numero");
        sNumero2 = sc.next();

        suma = Integer.parseInt(sNumero1) + Integer.parseInt(sNumero2); // Si introducimos texto que no sea numero dará una excepcion de tipo NumberFormatException

        System.out.println("La suma es: " + suma);

    }

}
