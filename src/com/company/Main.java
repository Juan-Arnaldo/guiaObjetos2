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
                        ejer3();
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

    public static void ejer3(){
        Scanner sc = new Scanner(System.in);
        clienteBanco c = new clienteBanco(1, "Juan Martin", "M");
        cuenta cuenta = new cuenta(2, 10000, c);
        int opc;
        double opc2, total;
        do{
            System.out.println("1. Extraer de la cuenta de " + c.getNombre());
            System.out.println("2. Depositar de la cuenta de " + c.getNombre());
            System.out.println("3. Ver balance de la cuenta de " + c.getNombre());
            System.out.println("4. Ver Cliente ");
            System.out.println("Ingrese la opcion que quiera:");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Ingrese la cantidad a extraer");
                    opc2 = sc.nextDouble();
                    total = cuenta.getBalance() - opc2;
                    if(total >= 0 ){
                        cuenta.setBalance(cuenta.extraer(cuenta, opc2));
                        System.out.println("La extraccion fue correcta\n");
                    }else if(total < 0 && total >= -2000 ){
                        c.setDeudor(c);
                        cuenta.setBalance(cuenta.extraer(cuenta, opc2));
                        System.out.println("La extraccion fue correcta, pero ahora entra como deudor\n");
                    }else{
                        System.out.println("La cantidad que quiere extraer es mas de lo que se le permite\n");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar");
                    opc2 = sc.nextDouble();
                    if(opc2 > 0){
                        if(cuenta.getBalance() < 0 && opc2 + cuenta.getBalance() >= 0){
                            c.setDeudor(c);
                            cuenta.setBalance(cuenta.depositar(cuenta, opc2));
                        }else{
                            cuenta.setBalance(cuenta.depositar(cuenta, opc2));
                        }
                        System.out.println("Se deposito de forma correcta\n");
                    }else{
                        System.out.println("el monto que quiere depositar es incorrecto\n");
                    }
                    break;
                case 3:
                        cuenta.mostrarBalance(cuenta, c);
                    break;
                case 4:
                    c.mostrarCliente(c, cuenta);
                    break;
                default:
                    System.out.println("Opcion Ingresada es incorrecta...\n");
                    break;

            }

        }while(opc != 0);
    }
}
