import java.util.Random;
import java.util.Scanner;
public class PPT_Metodos {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner ler = new Scanner(System.in);
        int pontuacao1 = 0;
        int pontuacao2 = 0;
        while(pontuacao1 < 10 && pontuacao2 < 10) {
            //usuario
            int escolhausuario = -1;
            while (!escolhaValida(escolhausuario)) {
                System.out.println("Escolha: 0 Pedra, 1 Papel, 2 Tesoura");
                escolhausuario = ler.nextInt();
                if (!escolhaValida(escolhausuario)) {
                    System.out.println("Esclha inválida");
                }
            }
            String escolhaUsuarioString = escolhaString(escolhausuario);

            //computador
            int escolhaComputador = aleatorio.nextInt(3); //0, 1, 2
            String escolhaComputadorString = escolhaString(escolhaComputador);
            System.out.println("(Jogador) " + escolhaUsuarioString + " X " + escolhaComputadorString);
            int vencedor = checarVencedor(escolhausuario, escolhaComputador);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate"); break;
                case 1:
                    System.out.println("Usuario venceu"); pontuacao1++; break;
                case 2:
                    System.out.println("Computador Venceu"); pontuacao2++;break;

            }
            System.out.println("=== Pontuação ===");
            System.out.println("Usuaruio: " +pontuacao1);
            System.out.println("Computador: " +pontuacao2);
            System.out.println("");
        }
    }
    public static boolean escolhaValida(int escolha) {
        return escolha == 0 || escolha == 1 || escolha == 2;
    }

    public static String escolhaString(int escolha) {
        switch (escolha) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            default:
                return "Escolha Inválida";
        }
    }

    public static int checarVencedor(int escolha1, int escolha2) {
        //0 empate, 1 escolha1 vence, 2 escolha2 vence
        if ((escolha1 == 0 && escolha2 == 1) || (escolha1 == 1 && escolha2 == 2) || (escolha1 == 2 && escolha2 == 0)) {
            return 2;
        } else if ((escolha2 == 0 && escolha1 == 1) || (escolha2 == 1 && escolha1 == 1) || (escolha2 == 2 && escolha1 == 0)) {
            return 1;
        } else {
            return 0;
        }
    }
}
