package partialExample.services;

import partialExample.entities.Spare;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class SpareServiceImpl implements ISpareService{

    Scanner scanner = new Scanner(System.in);

    public void createStack(){
        Stack<Spare> spareStack = new Stack<>();
        boolean stopper = true;
        System.out.println("LLENAR INVENTARIO:");
        while(stopper){
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
            if (option == 2){
                stopper = false;
            }
        }
        menu(spareStack);
    }

    public void menu (Stack<Spare> spareStack){

    }

    @Override
    public Spare findSpare(Stack<Spare> spareStack, String reference) {
        return spareStack.stream()
                .map(spare-> spare.getReference().equals(reference) ? spare : null)
                .filter(Objects::nonNull)
                .findFirst()
                .orElse(null);

    }

    @Override
    public Spare addSpare(Stack<Spare> spareStack, Spare spare) {
        return null;
    }

    @Override
    public void createSpare(String brand, String reference, Long cuantity, BigDecimal price) {

    }

    @Override
    public Spare deleteSpare(Stack<Spare> spareStack, String reference) {
        return null;
    }

    @Override
    public Spare sellSpare(Stack<Spare> spareStack, String reference, Long units) {
        return null;
    }
}
