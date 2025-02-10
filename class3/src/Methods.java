import java.util.Scanner;

public class Methods {
    public int[][] createMatriz(Scanner scanner){
        System.out.println("Ingrese el tamaño de la matriz");
        int dimention = scanner.nextInt();
        int[][] matriz = new int[dimention][dimention];
        return matriz;
    }

    public int[][] fillMatriz(int[][]matriz, Scanner sc){
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                System.out.println("Ingrese el valor de la matriz en posicion: "+i+" - "+j);
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }

    public void sumMatriz(int[][] matriz){
        int acumulator = 0;
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz.length; j++){
                acumulator += matriz[i][j];
            }
        }
        System.out.println("El total de la suma es: "+acumulator);
    }

    public void FindBiggest(int[][]matriz){
        int biggest = 0;
        for (int i = 0; i<matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (biggest < matriz[i][j]) {
                    biggest = matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor es: "+biggest);
    }
}
