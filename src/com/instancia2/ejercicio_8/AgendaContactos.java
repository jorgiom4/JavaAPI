package com.instancia2.ejercicio_8;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Como ejemplo practico de uso de colecciones basadas en claves, vamos a realizar un
 programa que permita realizar la gestión de un lista de contactos. Cada contacto esta
 caracterizado por un nombre de persona (valor) con un DNI (clave) que lo identifica y que será
 de tipo numérico, pudiéndose localizar los contactos a partir de ese campo clave.
 Al iniciar el programa se mostrara el siguiente menú de opciones:
 1. Añadir contacto
 2. Eliminar contacto
 3. Mostar contactos
 4. Salir
 Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así
 hasta que elija “salir”.
 */
public class AgendaContactos {

    private HashMap<Long,String> agenda = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private int opcion = 0;

    /**
     * Constructor
     */
    public AgendaContactos(){
        super();
    }

    public void showMenu(){

        System.out.println("**************************");
        System.out.println("1. Añadir nuevo contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Mostrar contactos");
        System.out.println("4. Salir aplicacion");
        System.out.println("Elije una opcion:");

        opcion = sc.nextInt();

    }

    private void comprobarOpcion(int opcion){
        switch (opcion){
            case 1:
                nuevoContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarContacto();
                break;
            case 4:
                //Salimos de la aplicacion
                System.out.println("Hasta pronto!!!");
            default:
                System.out.println("La opción elegida no es válida");
        }
    }

    private void nuevoContacto(){
        System.out.println("Introduce nuevo contacto");
        long dni = sc.nextLong();
        sc.nextLine(); //Para que funcione
        String nombre = sc.nextLine();

        agenda.put(dni,nombre);

        //Sacamos los contactos
        agenda.forEach((a,b)-> System.out.println(a + " - " + b));

    }

    private void eliminarContacto(){
        System.out.println("Introduce DNI a eliminar");
        long dni = sc.nextLong();
        if(agenda.containsKey(dni)){
            agenda.remove(dni);
        }else{
            System.out.println("DNI no encontrado");
        }
        System.out.println("Contacto con DNI eliminado");
    }

    private void mostrarContacto(){
        System.out.println("Lista de contactos:");
        agenda.forEach((a,b)-> System.out.println(a + " - " + b));
    }






}
