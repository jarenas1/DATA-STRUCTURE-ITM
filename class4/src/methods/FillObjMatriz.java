package methods;

import objects.Person;

import java.util.Arrays;
import java.util.Scanner;

public class FillObjMatriz {
    public Person[][] fillMatriz(int dimention, Scanner sc){
        Person[][] matriz = new Person[dimention][dimention];
        int iterator = 1;
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                System.out.println("Ingrese el nombre de la persona #"+ iterator);
                String name = sc.nextLine();
                System.out.println("Ingrese el apellido de la persona #"+iterator);
                String lastname = sc.nextLine();
                System.out.println("Ingrese la direccion de la persona #"+iterator);
                String address = sc.nextLine();
                System.out.println("Ingrese el telefono de la persona #"+iterator);
                Long phone = sc.nextLong();
                iterator += 1;
                sc.nextLine();
                Person person = new Person(name,lastname,address,phone);
                matriz[i][j] = person;
            }
        }
        return matriz;
    }
}
