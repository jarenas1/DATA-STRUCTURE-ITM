import methods.FillObjMatriz;
import methods.ShowObjMatriz;
import objects.Person;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz");
        int dimention = sc.nextInt();
        sc.nextLine();
        FillObjMatriz a = new FillObjMatriz();
        Person[][] matriz = a.fillMatriz(dimention,sc);
        ShowObjMatriz showObjMatriz = new ShowObjMatriz();
        showObjMatriz.ShowObjetualMatriz(matriz);
    }
}