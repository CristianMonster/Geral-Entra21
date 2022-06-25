import java.util.Scanner;

public class jogoDaVelha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        boolean finalDeJogo = false;
        boolean jogador1 = true;
        int jogadas = 1;

        while (!finalDeJogo) {


            //Coletando informação pra colocar no tabuleiro
            int posicao;
            int coluna = 0;
            int linha = 0;

            if (jogador1) {
                System.out.print("Iforme a posição X de 1 até 9: ");

            } else {
                System.out.print("Informe a posição O de 1 até 9: ");

            }
            boolean usado = true;
            while (usado) {
                posicao = ler.nextInt();
                switch (posicao) {
                    case 1:
                        coluna = 0;
                        linha = 0;
                        jogadas++;
                        break;
                    case 2:
                        coluna = 1;
                        linha = 0;
                        jogadas++;
                        break;

                    case 3:
                        coluna = 2;
                        linha = 0;
                        jogadas++;
                        break;
                    case 4:
                        coluna = 0;
                        linha = 1;
                        jogadas++;
                        break;
                    case 5:
                        coluna = 1;
                        linha = 1;
                        jogadas++;
                        break;
                    case 6:
                        coluna = 2;
                        linha = 1;
                        jogadas++;
                        break;
                    case 7:
                        coluna = 0;
                        linha = 2;
                        jogadas++;
                        break;
                    case 8:
                        coluna = 1;
                        linha = 2;
                        jogadas++;
                        break;
                    case 9:
                        coluna = 2;
                        linha = 2;
                        jogadas++;
                        break;
                    default:
                        System.out.println("Insira um valor de 1 até 9: ");
                }

                //verificando se da pra jogar naquele lugar
                if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                    System.out.print("Selecione outra posição, essa ja foi utilizada: ");
                } else {
                    usado = !usado;
                }
            }

            //Colocando na posição
            if (jogador1) {
                tabuleiro[linha][coluna] = 'X';
            } else {
                tabuleiro[linha][coluna] = 'O';
            }


            //imprimindo o tabuleiro
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print(tabuleiro[i][j] + " | ");
                }
                System.out.println();
            }

            //checando se alguem ganhou
            if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // linha 1
                    (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // linha 2
                    (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // linha 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // coluna 1
                    (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // coluna 2
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // coluna 3
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') || // diagonal 1
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X')) {  // diagonal 2
                finalDeJogo = true;
                System.out.println("O jogador - X - ganhou!");
            } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // linha 1
                    (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // linha 2
                    (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // linha 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // coluna 1
                    (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // coluna 2
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // coluna 3
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') || // diagonal 1
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O')) {  // diagonal 2
                finalDeJogo = true;
                System.out.println("O jogador - O - ganou!");
            } else if (jogadas > 9) {
                finalDeJogo = true;
                System.out.println("VELHA :(");
            }

            jogador1 = !jogador1;
        }
    }
}

