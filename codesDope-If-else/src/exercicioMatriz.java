import java.util.Scanner;
public class exercicioMatriz {
    public static void main(String[] args) {
        /* Escreva um algoritmo que solicite o numero de linhas e o numero de colunas de uma matriz
        e imprima a martiz montada com #
         */
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o número de linhas: ");
        int linhas = ler.nextInt();
        System.out.print("Informe o numero de colunas: ");
        int colunas = ler.nextInt();


        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
