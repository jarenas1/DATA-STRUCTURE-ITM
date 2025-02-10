import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("Ingrese lel punto deseado del 1 al 11");
        option = sc.nextInt();
        switch (option){
            case 1:
                First first = new First();
                first.sumaOfMatriz();
                break;
            case 2:
                Second second = new Second();
                second.biggestNumber();
        }
    }
}
