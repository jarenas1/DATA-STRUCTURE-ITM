package services;

import entities.ProductEntity;

import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);

    public void run (){
        ProductEntity[][] matriz1 = generateMatriz();
        ProductEntity[][] matriz2 = generateMatriz();
        int newDimention = unifiedMatrizSize(matriz1, matriz2);
        ProductEntity[][]unifiedMatriz = unifiedMatriz(matriz1, matriz2, newDimention);
        for (int i = 0; i< unifiedMatriz.length; i++){
            for (int j = 0; j< unifiedMatriz.length; j++){
                System.out.println("ITEMS TOTAL:");
                System.out.println(unifiedMatriz[i][j].toString());
            }
        }
    }

    public ProductEntity[][] unifiedMatriz(ProductEntity[][] matriz1, ProductEntity[][] matriz2, int newDimention) {
        ProductEntity[][] unifiedMatriz = new ProductEntity[newDimention][newDimention];
        ProductEntity[][] largestMatriz;
        int dimention;
        ProductEntity[][] shortestMatriz;
        if (matriz1.length >= matriz2.length) {
            dimention = matriz1.length;
            largestMatriz = matriz1;
            shortestMatriz = matriz1;
        } else {
            dimention = matriz2.length;
            largestMatriz = matriz2;
            shortestMatriz = matriz1;
        }
        for (int a = 0; a < newDimention; a++) {
            for (int b = 0; b < newDimention; b++) {
                for (int i = 0; i < dimention; i++) {
                    for (int j = 0; j < dimention; j++) {
                        ProductEntity currentProductBiggest = largestMatriz[i][j];
                        unifiedMatriz[a][b] = currentProductBiggest;
                        for (int z = 0; z < shortestMatriz.length; z++) {
                            for (int x = 0; x < shortestMatriz.length; x++) {
                                ProductEntity shorterMatrizItem = shortestMatriz[z][x];
                                if (shorterMatrizItem.getName().equals(currentProductBiggest.getName())){
                                    int unifiedCuantity = currentProductBiggest.getCuantity() + shorterMatrizItem.getCuantity();
                                    ProductEntity unifiedItem = new ProductEntity(unifiedCuantity, shorterMatrizItem.getName());
                                    unifiedMatriz[a][b] = unifiedItem;
                                }
                                else{
                                    a += 1;
                                    b += 1;
                                    unifiedMatriz[a][b] = shorterMatrizItem;
                                }
                            }
                        }
                    }
                }
            }}
        return unifiedMatriz;
    }

    public int unifiedMatrizSize(ProductEntity[][] matriz1, ProductEntity[][] matriz2) {
        int dimention;
        int newMatrizDimention = 0;
        ProductEntity[][] largestMatriz;
        ProductEntity[][] shortestMatriz;
        if (matriz1.length >= matriz2.length) {
            dimention = matriz1.length;
            largestMatriz = matriz1;
            shortestMatriz = matriz2;
        } else {
            dimention = matriz2.length;
            largestMatriz = matriz2;
            shortestMatriz = matriz1;
        }
        for (int i = 0; i < dimention; i++) {
            for (int j = 0; j < dimention; j++) {
                ProductEntity currentProductBiggest = largestMatriz[i][j];
                newMatrizDimention += 1;
                for (int z = 0; z < shortestMatriz.length; z++) {
                    for (int x = 0; x < shortestMatriz.length; x++) {
                        if (!currentProductBiggest.getName().equals(shortestMatriz[z][x].getName())) {
                            newMatrizDimention += 1;
                    }
                }
            }
        }
        }
        return newMatrizDimention;
    }

        public ProductEntity[][] generateMatriz() {
            System.out.println("Ingrese la dimension de la matriz");
            int dimention = scanner.nextInt();
            int iterator = 1;
            ProductEntity[][] matriz = new ProductEntity[dimention][dimention];
            scanner.nextLine();
            for (int i = 0; i < dimention; i++) {
                for (int j = 0; j < dimention; j++) {
                    System.out.println("Ingrese el nombre del producto #" + iterator);
                    String name = scanner.nextLine();
                    System.out.println("Ingrese la cantidad del producto #" + iterator);
                    int cuantity = scanner.nextInt();
                    scanner.nextLine();
                    ProductEntity productEntity = new ProductEntity(cuantity, name);
                    matriz[i][j] = productEntity;
                    iterator += 1;
                }
            }
            return matriz;
        }
    }

