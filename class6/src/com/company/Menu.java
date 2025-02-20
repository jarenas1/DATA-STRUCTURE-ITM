package com.company;

import java.util.Scanner;

//lets implement a method that allow to verify de var into the scanner to avoid badRequest
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cicle = true;
        while (cicle){
            int option = 0;
            System.out.println("Ingrese la opcion");
            System.out.println("1. mostrar ubicacion y fila de un producto");
            System.out.println("2. mostrar cantidad de inventario de una tienda");
            System.out.println("3. salir");
            while (!sc.hasNextInt()){ //checking if data is not an Integer to start the while
                System.out.println("Dato incorrecto");
                sc.next();
            }
            switch (option){
                case 1:
                    //1
                    break;
                case 2:
                    //2
                    break;
                case 3:
                    cicle = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }

    }
}
