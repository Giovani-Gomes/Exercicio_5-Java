package Exercicios.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        int quantidade_Pares = 0;
        int quantidade_Impares = 0;

        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){

                System.out.println("Entre com o valor da pos [" + i + "," + j + "]");
                numeros[i][j] = scan.nextInt();
            }
        }
        
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){

                if (numeros[i][j] % 2 == 0){
                    quantidade_Pares++;
                } else {
                    quantidade_Impares++;
                }
            }
        }

        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pares = " + quantidade_Pares);
        System.out.println("Impares = " + quantidade_Impares);
    }
}


