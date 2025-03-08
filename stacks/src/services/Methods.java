package services;

import Entities.VehicleEntity;

import java.util.Scanner;
import java.util.Stack;

public class Methods {
    Scanner scanner = new Scanner(System.in);
    public Stack<VehicleEntity> fillStack(){
        Stack<VehicleEntity> vehicleEntityStack = new Stack<>();

        boolean stopper = true;
        while(stopper){
            VehicleEntity vehicle = new VehicleEntity();
            System.out.println("Ingrese la marca del carro");
            vehicle.setBrand(scanner.nextLine());
            System.out.println("Ingrese el modelo del carro");
            vehicle.setModel(scanner.nextLine());
            System.out.println("Ingrese el precio del carro");
            vehicle.setPrice(scanner.nextDouble());
            scanner.nextLine();
            vehicleEntityStack.push(vehicle);
            System.out.println("Añadiendo ...");
            while(true){
                System.out.println("Ingrese 1 si desea añadir otro vehiculo o 2 para finalizar");
                int conditional = scanner.nextInt();
                scanner.nextLine();
                if (conditional == 1 || conditional == 2){
                    if (conditional == 2){
                        stopper = false;
                    }
                    break;
                }else{
                    System.out.println("Ingrese un valor valido");
                }
            }
        }
        showStack(vehicleEntityStack);
        return vehicleEntityStack;
    }

    public static void showStack(Stack<VehicleEntity> vehicleEntityStack){
        vehicleEntityStack.forEach((car) ->{
            System.out.println(car.toString());
            System.out.println("      ");
        });
    }
}
