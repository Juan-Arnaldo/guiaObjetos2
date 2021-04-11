package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int opc;

	    do {
            System.out.println("\t Guia de Objetos II \n");
            System.out.println("1. Ejercicio 1 ");
            System.out.println("2. Ejercicio 2 ");
            System.out.println("3. Ejercicio 3 ");
            System.out.println("\n\t 0. Salir \n");
            System.out.println("Ingrese la opcion que quiera ejecutar: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                        ejer1();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("La opcion ingresada no existe..!");
                    break;
            }

        }while (opc != 0);

    }

    public static void ejer1(){
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, gmail, sexo;

        System.out.println("Ingrese el nombre del autor:");
        nombre = sc.nextLine();

        System.out.println("Ingrese el apellido del autor:");
        apellido = sc.nextLine();

        System.out.println("Ingrese el gmail del autor:");
        gmail = sc.nextLine();

        System.out.println("Ingrese el sexo del autor (M - F - X):");
        sexo = sc.nextLine();


        autor a = new autor(nombre, apellido, gmail, sexo);
        a.mostrarAutor(a);
    }
}
