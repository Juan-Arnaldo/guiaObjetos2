package com.company;

import java.util.Scanner;
import java.util.UUID;
import java.time.*;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int opc;
	    do {
            System.out.println("\n\n\t Guia de Objetos II \n");
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
                        ejer2();
                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("La opcion ingresada no existe..!");
                    break;
            }

        }while (opc != 0);

    }

    public static void ejer1(){
        Scanner sc = new Scanner(System.in);

        autor a = new autor("Joshua", "Bloch", "joshua@email.com", "M");
        libro libro = new libro("Effective Java", 150, 150, a);

        libro.mostrarLibro(libro);
        a.mostrarAutor(a);
        libro.cambiarPrecio(libro, 500);
        libro.cambiarStock(libro, 50);
        libro.mostrarlibro2(libro, a);
    }

    public static void ejer2(){
        UUID idCliente = UUID.randomUUID();
        String idClienteString = idCliente.toString();
        UUID idFactura = UUID.randomUUID();
        String idFacturaString = idFactura.toString();

        cliente c = new cliente(idClienteString, "Juan", "juan@gmail.com", 50);
        c.mostrarCliente(c);

        LocalDate fecha = LocalDate.now();

        factura f = new factura(idFacturaString, 400, fecha, c);
        f.mostrarFactura(f, c);
    }
}
