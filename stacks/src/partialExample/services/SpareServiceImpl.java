package partialExample.services;

import partialExample.entities.Spare;

import java.awt.*;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class SpareServiceImpl implements ISpareService{


    public void createStack(){
        Stack<Spare> spareStack = new Stack<>();
        System.out.println("LLENAR INVENTARIO:");
        Stack<Spare> filledStack = createSpare(spareStack);
        menu(filledStack);
        }


    public void menu (Stack<Spare> spareStack){
        boolean bandera = true;
        Scanner sc = new Scanner(System.in);
        while(bandera){
            System.out.println("Ingrese una opcion:");
            System.out.println("1: Buscar respuesto");
            System.out.println("2: Crear respuesto");
            System.out.println("3: Eliminar respuesto");
            System.out.println("4: Vender respuesto");
            System.out.println("4: Salir");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.println("Ingrese la referencia del repuesto");
                    String spareReference = sc.nextLine();
                    findSpare(spareStack, spareReference);
                case 2:
                    createSpare(spareStack);
                case 3:
                    System.out.println("Ingrese la referencia del repuesto");
                    String spareReferenc = sc.nextLine();
                    deleteSpare(spareStack, spareReferenc);
                case 4:

            }
        }
    }



    @Override
    public void findSpare(Stack<Spare> spareStack, String reference) {
        Spare spareFounded = spareStack.stream()
                .map(spare-> spare.getReference().equals(reference) ? spare : null)
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);

    }


    @Override
    public Stack<Spare>  createSpare(Stack<Spare> spareStack) {
        Scanner scanner = new Scanner(System.in);
        boolean stopper = true;
        while (stopper) {
            System.out.println("Ingrese la marca del respuesto:");
            String brand = scanner.nextLine();
            System.out.println("Ingrese la referencia del respuesto");
            String reference = scanner.nextLine();
            System.out.println("Ingrese la cantidad del producto");
            Long cuantity = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Ingrese el precio");
            BigDecimal price = scanner.nextBigDecimal();
            scanner.nextLine();
            System.out.println("Guardando...");
            Spare spare = new Spare(brand, reference, cuantity, price);
            spareStack.push(spare);
            System.out.println("Guardado.");
            System.out.println("Desea añadir otro item? 1: si, 2: no");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 2) {
                stopper = false;
            }
        }return spareStack;
    }

        @Override
        public void deleteSpare (Stack<Spare> spareStack, String reference){
             //spareStack.stream().map(spare -> spare.getReference().equals(reference) ? spareStack.remove(spare): null);
             spareStack.forEach(spare -> {
                 if (spare.getReference().equals(reference)){
                     System.out.println("Eliminando...");
                     spareStack.remove(spare);
                 }
             });
        }

        @Override
        public Spare sellSpare (Stack < Spare > spareStack, String reference, Long units){
            spareStack.forEach(spare -> {
                if (spare.getReference().equals(reference)){
                    System.out.println("vendiendo...");
                    if (spare.getCuantity() < units){
                        System.out.println("No se puede vender el producto debido a que no hay cantidad suficiente. Cantidad actual: "+ spare.getCuantity());
                    }else{
                        System.out.println("Vendido "+ spare.getReference());
                        spare.setCuantity(spare.getCuantity() - units);
                    }
                }
            });
            return null;
        }
    }

