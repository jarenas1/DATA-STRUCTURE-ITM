package methods;

import objects.Person;

import java.util.Arrays;
import java.util.Scanner;

public class FillObjMatriz {
    public Person[][] fillMatriz(int dimention, Scanner sc){
        Person[][] matriz = new Person[dimention][dimention];
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                System.out.println("Ingrese el nombre de la persona #"+j+1);
                String name = sc.nextLine();
                System.out.println("Ingrese el apellido de la persona #"+j+1);
                String lastname = sc.nextLine();
                System.out.println("Ingrese la direccion de la persona #"+j+1);
                String address = sc.nextLine();
                System.out.println("Ingrese el telefono de la persona #"+j+1);
                Long phone = sc.nextLong();
                Person person = new Person(name,lastname,address,phone);
                matriz[i][j] = person;
            }
        }
        System.out.println(matriz);
        return matriz;
    }
}
