package com.instancia2;

import com.instancia2.colecciones.Colas;
import com.instancia2.colecciones.ColeccionArrayList;
import com.instancia2.colecciones.ColeccionHasTable;
import com.instancia2.colecciones.Conjuntos;
import com.instancia2.ejercicio_4.Ejerccio4;
import com.instancia2.parseo.Parseo;

import java.util.Arrays;

/**
 * Tema 3 Java SDK API
 * Métodos de la clase String
 *
 */
public class Main {

    public static void main(String[] args) {

        //getCadenaMayor();
        //getVocales();

        //splitCadena();

        //insertaStringBiulder();

        /*
        Ejerccio4 ejer4 = new Ejerccio4();
        System.out.println("Resultado: " + ejer4.sumaRandom());
        */

        /*
        Parseo parse = new Parseo();
        parse.sumaParseo();
        */

        /*
        ColeccionArrayList myCollectionArrayList = new ColeccionArrayList();
        //myCollectionArrayList.MyarrayList();
        System.out.println(myCollectionArrayList.dameNotas());
        */

        //ColeccionHasTable miColeccionHasTable = new ColeccionHasTable();
        //miColeccionHasTable.ejemploHasTable();
        //miColeccionHasTable.ejemploHashMap();

        /*
        Conjuntos miConjunto = new Conjuntos();
        miConjunto.ejemploHashSet();
        */

        Colas miCola = new Colas();
        miCola.ejemploColas();

    }


    /**
     * Ejercicio para obtener la cadena de mayor tamaño, usamos el metodo length
     */
    public static void getCadenaMayor(){

        int mayor = 0;
        int leng = 0;

        String cadenaMayor = "";

        /*

        String s1 = "Ejemplo de cadena";
        String s2 = "Ejemplo de cadena mas larga";
        String s3 = "Ejemplo de cadena mas larga todavia mas asalsk alsakas laksl";
        String s4 = "Ejemplo de cadena mas larga todavia mas y mas";

        if(s1.length() > mayor){
            mayor = s1.length();
            cadenaMayor = "s1";
        }

        if(s2.length() > mayor){
            mayor = s2.length();
            cadenaMayor = "s2";
        }

        if(s3.length() > mayor){
            mayor = s3.length();
            cadenaMayor = "s3";
        }

        if(s4.length() > mayor){
            mayor = s4.length();
            cadenaMayor = "s4";
        }

        System.out.println("La cadena mayor es: " + mayor + " -> " + cadenaMayor);

        */



        String cadenas[] =  new String[4];

        cadenas[0] = "Ejemplo de cadena";
        cadenas[1] = "Ejemplo de cadena mas aal alslaskla salksla slaskl lakslak s";
        cadenas[2] = "Ejemplo de cadena mas larga todavia mas";
        cadenas[3] = "Ejemplo de cadena mas larga todavia mas y mas larga";

        int i = 0;
        for (String cadena:cadenas) {
            leng = cadena.length();
            if(leng > mayor){
                mayor = leng;
                cadenaMayor = "cadena[" + (i) + "]";
            }
            i++;
        }



        /*
        for(int i=0;i<=3;i++){
            leng = cadenas[i].length();
            if(leng > mayor){
                mayor = leng;
                cadenaMayor = "cadena[" + (i) + "]";
            }

        }
        */

        System.out.println("mayor: " + mayor + " " + cadenaMayor);


    }

    /**
     * Obtenemos el numero de vocales en una cadena
     */
    public static void getVocales(){

        String vocales[] = {"a", "e", "i", "o", "u"};

        String cadena = "Esto es una cadena con muchas vocales";

        int numeroValores = 0;

        for(int i=0;i<cadena.length();i++){
            switch (cadena.toLowerCase().charAt(i)){
                case 'a':

                case 'e':

                case'i':

                case 'o':

                case 'u':
                    //Si paso por aqui es vocal
                    numeroValores ++;
                default:
                    continue;

            }
        }

        System.out.println("El numero de vocales es:" + numeroValores);

    }

    public static void splitCadena(){

        String texto = "esto.es.una.cadena";
        String cadena[] = texto.split("\\."); // --> el punto es considerado como caracter reservado y hay que escaparlo

        System.out.println(cadena);

        for (String parte:cadena) {
            System.out.println(parte);
        }

        //Arrays.stream(cadena).forEach((p-> System.out.println(p))); // --> Programacion funcional



    }

    /**
     * Ejercicio 3
     * Vamos a realizar un ejercicio en el que, dada una determinada cadena de caracteres, se
     inserte una barra / adicional entre palabras.
     Mediante el método indexOf() se irán buscando las posiciones donde se encuentran los espacios
     para insertar el espacio adicional, operación esta que será́realizada a través del método insert().
     */

    public static void insertaStringBiulder(){

        //Con string
        String texto = "Texto donde se insertaran espacio";

        texto = texto.replace(" ", "/ ");

        System.out.println("Nueva cadena: " + texto);

        //Con StringBuilder

        StringBuilder st = new StringBuilder("Texto donde se insertaran espacios");
        int inx = 0;



    }


}
