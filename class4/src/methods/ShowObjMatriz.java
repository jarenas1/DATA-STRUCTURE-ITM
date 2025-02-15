package methods;

import objects.Person;

public class ShowObjMatriz {
    public void ShowObjetualMatriz(Person[][] matriz){
        int iterator = 1;
        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz.length; j++){
                System.out.print("persona " + iterator +": " + matriz[i][j].toString() + " --- ");
                iterator+=1;
            }
            System.out.println();
        }
    }
}
