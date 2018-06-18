package com.instancia2;

/**
 * Tema 3 Java SDK API
 *
 */
public class Main {

    public static void main(String[] args) {

        /*
        String s1 = "Ejemplo de cadena";
        String s2 = "Ejemplo de cadena mas larga";
        String s3 = "Ejemplo de cadena mas larga todavia mas";
        String s4 = "Ejemplo de cadena mas larga todavia mas y mas";
        */

        String cadenas[] =  new String[4];

        cadenas[0] = "Ejemplo de cadena";
        cadenas[1] = "Ejemplo de cadena mas largaererererer er er re er ere r er";
        cadenas[2] = "Ejemplo de cadena mas larga todavia mas";
        cadenas[3] = "Ejemplo de cadena mas larga todavia mas y mas";

        int mayor=0;
        int leng=0;

        String cadenaMayor = "";

        for(int i=0;i<3;i++){
            leng = cadenas[i].length();
            if(leng > mayor){
                mayor = leng;
                cadenaMayor = "cadena[" + (i) + "]";
            }

        }

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


}
