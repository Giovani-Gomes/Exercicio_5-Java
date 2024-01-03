import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandom = new Random();
        int maiornumero = 0;
        int linha = 0;
        int coluna = 0;

        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(0 , 9);
            }
        }


        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                if (numerosAleatorios[i][j] > maiornumero){
                    maiornumero = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i=0; i<numerosAleatorios.length; i++){
            for (int j=0; j<numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j] + " ");
            }
        }

        System.out.println("\nMaior valor = " + maiornumero);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }
}


