import java.util.Scanner;

public class First {
    public void sumaOfMatriz(){
        Methods methods = new Methods();
        Scanner sc = new Scanner(System.in);
        int [][] matriz = methods.createMatriz(sc);
        int[][] filledMatriz = methods.fillMatriz(matriz, sc);
        methods.sumMatriz(filledMatriz);
    }
}
