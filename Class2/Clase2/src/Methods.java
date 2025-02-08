import java.util.Scanner;

public class Methods {
    public int getDimention(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the size of matriz");
        return scanner.nextInt();
    }

    public int[][] fillMatriz(int dimention){
        int[][] matriz = new int[dimention][dimention];
        for (int i = 0; i>matriz.length; i++){
            for (int j = 0; j> matriz.length; j++){
                matriz[i][j] = (int) Math.random()*50+1;
            }
        }
        return matriz;
    }
}
