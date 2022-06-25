import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.util.Scanner;

public class batalhaNaval_rudimentar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while (true) {

            boolean continuaLinha = true;
            boolean continua = true;
            int colunaint = 0;

            while (continua) {
                System.out.println("Digite a coluna que você quer atacar de A até H: ");
                String coluna = ler.next().toUpperCase();
                switch (coluna) {
                    case "A":
                        colunaint = 0;
                        continua = false;
                        break;
                    case "B":
                        colunaint = 1;
                        continua = false;
                        break;
                    case "C":
                        colunaint = 2;
                        continua = false;
                        break;
                    case "D":
                        colunaint = 3;
                        continua = false;
                        break;
                    case "E":
                        colunaint = 4;
                        continua = false;
                        break;
                    case "F":
                        colunaint = 5;
                        continua = false;
                        break;
                    case "G":
                        colunaint = 6;
                        continua = false;
                        break;
                    case "H":
                        colunaint = 7;
                        continua = false;
                        break;
                }
            }

            int linha = 0;
            while (continuaLinha) {
                System.out.println("Digite a linha que você quer atacar de 1 até 8: ");
                linha = ler.nextInt() - 1;
                if (!(linha < 0 || linha > 7)) {
                    continuaLinha = false;
                }
            }

            int campoBatalha[][] = {
                    {0, 0, 0, 0, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1},
                    {0, 1, 1, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 1},
            };


            if (linha <= 8 && linha >= 0) {
                if (campoBatalha[linha][colunaint] == 1) {
                    System.out.println("Você acertou um navio!!");
                } else {
                    System.out.println("você acertou... a água");
                }
            } else {
                System.out.println("Digite um valor válido: ");
            }
        }
    }
}
