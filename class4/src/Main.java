import methods.FillObjMatriz;
import methods.ShowObjMatriz;
import objects.Person;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);




        }
        System.out.println("Ingrese la dimension de la matriz");
        int dimention = sc.nextInt();
        sc.nextLine();
        FillObjMatriz a = new FillObjMatriz();
        Person[][] matriz = a.fillMatriz(dimention,sc);
        ShowObjMatriz showObjMatriz = new ShowObjMatriz();
        showObjMatriz.ShowObjetualMatriz(matriz);
    }
}