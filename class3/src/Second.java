import java.util.Scanner;

public class Second {
    public void biggestNumber(){
        Methods methods = new Methods();
        Scanner sc = new Scanner(System.in);
        int [][] matriz = methods.createMatriz(sc);
        int[][] filledMatriz = methods.fillMatriz(matriz, sc);
        methods.FindBiggest(filledMatriz);
    }
}
