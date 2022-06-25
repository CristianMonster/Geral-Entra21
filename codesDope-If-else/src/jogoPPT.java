import java.util.Scanner;

public class jogoPPT {

    public static void main(String[] args) {
        int jogador,computador;
        Scanner in = new Scanner(System.in);
        System.out.println("Pedra = 0");
        System.out.println("Papel = 1");
        System.out.println("Tesoura = 2");
        int PontosComputador = 0;
        int PontosJogador = 0;

        while ( PontosComputador < 10 && PontosJogador < 10) {

            System.out.println("Jogador escolha uma opção: ");
            jogador = in.nextInt();


            switch (jogador) {
                case 0:
                    System.out.println("Jogador escolheu Pedra");
                    break;
                case 1:
                    System.out.println("Jogador escolheu Papel");
                    break;
                case 2:
                    System.out.println("Jogador escolheu Tesoura");
                    break;
                default:
                    System.out.println("Resposta inválida");
                    break;
            }


            computador = (int) (Math.random()* 3);

            switch (computador) {
                case 0:
                    System.out.println("Computador escolheu Pedra");
                    break;
                case 1:
                    System.out.println("Computador escolheu Papel");
                    break;
                case 2:
                    System.out.println("Computador escolheu Tesoura");
                    break;
            }

            switch (jogador){
                case 0:
                    switch (computador) {
                        case 0:
                            System.out.println("Empate");
                            break;
                        case 1:
                            System.out.println("Computador venceu");
                            PontosComputador++;
                            break;
                        case 2:
                            System.out.println("Jogador veceu");
                            PontosJogador++;
                            break;
                    } break;
                case 1:
                    switch (computador) {
                        case 0:
                            System.out.println("Jogador venceu");
                            PontosJogador++;
                            break;
                        case 1:
                            System.out.println("Empate");
                            break;
                        case 2:
                            System.out.println("Computador veceu");
                            PontosComputador++;
                            break;
                    } break;
                case 2:
                    switch (computador) {
                        case 0:
                            System.out.println("Computador venceu");
                            PontosComputador++;
                            break;
                        case 1:
                            System.out.println("Jogador venceu");
                            PontosJogador++;
                            break;
                        case 2:
                            System.out.println("Empate");
                            break;


                    } break;

                default:
                    System.out.println("Resposta inválida");
            }

        }
        if(PontosComputador == 10) {
            System.out.println("Vencedor final é o Computador");

        } else if (PontosJogador == 10) {
            System.out.println("Vencedor final é o Jogador");

        }

    }
}