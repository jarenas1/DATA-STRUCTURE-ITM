package services;

import Entities.VehicleEntity;

import java.awt.*;
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
        deleteItem(scanner, vehicleEntityStack);
        System.out.println("Ingrese el nombre del vehiculo a buscar");
        String carName = scanner.nextLine();
        findByModel(carName, vehicleEntityStack);
        update(scanner, vehicleEntityStack);

        return vehicleEntityStack;
    }

    public static void showStack(Stack<VehicleEntity> vehicleEntityStack){
        vehicleEntityStack.forEach((car) ->{
            System.out.println(car.toString());
            System.out.println("      ");
        });
    }

    public void deleteItem(Scanner sc, Stack<VehicleEntity> stack){
        System.out.println("Ingrese el nombre del vehiculo a borrar");
        String carName = scanner.nextLine();
        VehicleEntity vehicleEntity = findByModel(carName, stack);
        if (stack.remove(vehicleEntity)){
            System.out.println("Vehiculo "+ carName + " fue borrado");
        }else{
            System.out.println("Vehiculo no encontrado");
        }
        showStack(stack);
    }

    public Stack<VehicleEntity> update(Scanner sc, Stack<VehicleEntity> stack){
        System.out.println("Imgrese el nombre del vehiculo que desea modificar");
        String oldModel = sc.nextLine();
        System.out.println("Buscando...");
        VehicleEntity toUpdateObject = findByModel(oldModel, stack);

        System.out.println("Ingrese el nuevo modelo del vehiculo");
        String newModel = sc.nextLine();
        System.out.println("Ingrese la nueva marca del vehiculo");
        String newBrand = sc.nextLine();
        System.out.println("Ingrese el nuevo precio del vehiculo");
        Double newPrice = sc.nextDouble();
        sc.nextLine();

        for (VehicleEntity vehicle : stack){
            if (vehicle == toUpdateObject){
                vehicle.setModel(newModel);
                vehicle.setBrand(newBrand);
                vehicle.setPrice(newPrice);
            }
        }
        showStack(stack);
        return stack;

    }

    public VehicleEntity findByModel(String carName, Stack<VehicleEntity> stack){
        VehicleEntity vehicleEntity = new VehicleEntity();
        for(VehicleEntity vehicle : stack){
            if (vehicle.getModel().equalsIgnoreCase(carName)){
                vehicleEntity = vehicle;
            }
            else {
                System.out.println("Vehiculo no encontrado");
            }
        }
        return vehicleEntity;
    }
}
