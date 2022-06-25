import java.util.Scanner;
public class jogoForca2 {

    public static void main(String[] args) {



        //pega a palavra
        Scanner ler = new Scanner(System.in);
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●");
        System.out.println("░░░░░░░░░░░! ! Jogo Da Forca! !░░░░░░░░░░░ ");
        System.out.println("●▬▬▬▬▬▬▬▬▬▬▬ஜ۩۞۩ஜ▬▬▬▬▬▬▬▬▬▬▬●\n");
        System.out.print("Informe a palavra para o jogo: ");
        String palavraDesconhecida = ler.nextLine().toUpperCase();

        //limpa o console
        for (int i = 0; i < 100; i++) {
            System.out.print("\n");
        }

        // Controla os acertos do usuário, coloca todos caracter como 0 e se acertar vira 1.
        char[] acertos = new char[palavraDesconhecida.length()];
        for (int i = 0; i < acertos.length; i++) {
            acertos[i] = 0;
        }

        //Declaração de variaveis
        int chances = 6;
        char letra;
        String letrasUsadas ="";

        if (palavraDesconhecida.contains("á, à, è, é, ì, í, ò, ó,")) {
            System.out.println("Informe a palavra sem o acento");
        }

        // Quantidade de underlines por letra da palavra sorteada
        for (int i = 0; i < palavraDesconhecida.length(); i++) {
            if(palavraDesconhecida.charAt(i) == ' ') {
                System.out.print("   ");
            } else {
                System.out.print(" _ ");
            }
        }

        // Declaração do "acertou" fora como boolean = false para poder colocar dentro do while como condição de parada
        boolean acertou = false;

        char [] numeros = {'0', '1', '2', '3', '4', '5', '6','7', '8', '9'};
        // começando o jogo
        while (!acertou && chances > 0) {


            System.out.print("-> Informe uma letra: ");
            letra = ler.next().toUpperCase().charAt(0);

            //Para não aceitar números
            for (char numero : numeros) {
                if (letra == numero) {
                    System.out.println("Números não são válidos! Perdeu uma vida!");
                    break;
                }
            }

            //verificar se a leta ja foi utilizada
            if (letrasUsadas.indexOf(letra) >= 0) {
                System.out.printf("Você já tentou a letra %c.%n", letra);
                for (int i = 0; i < palavraDesconhecida.length(); i++) {

                    if(palavraDesconhecida.charAt(i) == ' ') {
                        System.out.print("   ");
                    } else if (acertos[i] == 0) {
                        System.out.print(" _ ");
                    } else {
                        System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                    }
                }
                continue;
            } else {
                letrasUsadas += letra;
            }
            // Controlador de vidas
            boolean vida = true;
            for (int i = 0; i < acertos.length; i++) {

                if (letra == palavraDesconhecida.charAt(i)) { // Executa se acertar a letra
                    acertos[i] = 1;
                    vida = false;
                }
            }
            if (vida) { // Executa se errar a letra
                chances--;
                if (chances == 5) {
                    System.out.println("\n");
                    System.out.println("_____");
                    System.out.println("|    |");
                    System.out.println("|  .___.");
                    System.out.println("|  |◕‿◕|");
                    System.out.println("|  |___| ");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("Você me colocou na forca, temos mais: " + chances + " chances \n");
                    for (int i = 0; i < palavraDesconhecida.length(); i++) {

                        if(palavraDesconhecida.charAt(i) == ' ') {
                            System.out.print("   ");
                        } else if (acertos[i] == 0) {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                        }
                    }
                    continue;
                } else if (chances == 4) {
                    System.out.println("\n");
                    System.out.println("_____");
                    System.out.println("|    |");
                    System.out.println("|  .___.");
                    System.out.println("|  |●▂●|");
                    System.out.println("|  |___| ");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("Pensa direito, meu corpo ja esta na forca: " + chances + " chances \n");
                    for (int i = 0; i < palavraDesconhecida.length(); i++) {

                        if(palavraDesconhecida.charAt(i) == ' ') {
                            System.out.print("   ");
                        } else if (acertos[i] == 0) {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                        }
                    }
                    continue;
                } else if (chances == 3) {
                    System.out.println("\n");
                    System.out.println("_____");
                    System.out.println("|    |");
                    System.out.println("|  .___.");
                    System.out.println("|ب_ب|  |");
                    System.out.println("|  |___| ");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|     \\");
                    System.out.println("|      \\");
                    System.out.println("Ai minha perninha: " + chances + " chances \n");
                    for (int i = 0; i < palavraDesconhecida.length(); i++) {

                        if(palavraDesconhecida.charAt(i) == ' ') {
                            System.out.print("   ");
                        } else if (acertos[i] == 0) {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                        }
                    }
                    continue;
                }else if (chances == 2) {
                    System.out.println("\n");
                    System.out.println("_____");
                    System.out.println("|    |");
                    System.out.println("|  .____.");
                    System.out.println("|  |ಠ╭╮ಠ|");
                    System.out.println("|  |_____| ");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|    |");
                    System.out.println("|   / \\");
                    System.out.println("|  /   \\");
                    System.out.println("Desse jeito você vai me matar: " + chances + " chances \n");
                    for (int i = 0; i < palavraDesconhecida.length(); i++) {

                        if(palavraDesconhecida.charAt(i) == ' ') {
                            System.out.print("   ");
                        } else if (acertos[i] == 0) {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                        }
                    }
                    continue;
                }else if (chances == 1) {
                    System.out.println("\n");
                    System.out.println("_____");
                    System.out.println("|    |");
                    System.out.println("|  .___.");
                    System.out.println("|  |╥_╥|");
                    System.out.println("|  |___| ");
                    System.out.println("|    |");
                    System.out.println("|    | /");
                    System.out.println("|    |/");
                    System.out.println("|    |");
                    System.out.println("|   / \\");
                    System.out.println("|  /   \\");
                    System.out.println("Essa é nossa ultima chance, pensa com carinho: " + chances + " chance \n");
                    for (int i = 0; i < palavraDesconhecida.length(); i++) {

                        if(palavraDesconhecida.charAt(i) == ' ') {
                            System.out.print("   ");
                        } else if (acertos[i] == 0) {
                            System.out.print(" _ ");
                        } else {
                            System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                        }
                    }
                    continue;

                }else if (chances == 0) {
                    System.out.println("\n");
                    System.out.println("_____");
                    System.out.println("|    |");
                    System.out.println("| ._____.");
                    System.out.println("| |✖╭╮✖|");
                    System.out.println("| |_____| ");
                    System.out.println("|    |");
                    System.out.println("|  \\ | /");
                    System.out.println("|   \\|/");
                    System.out.println("|    |");
                    System.out.println("|   / \\");
                    System.out.println("|  /   \\");
                    break;
                }

            }

            // Controlador de acertos
            acertou = true;
            for (int i = 0; i < palavraDesconhecida.length(); i++) {

                if(palavraDesconhecida.charAt(i) == ' ') {
                    System.out.print("   ");
                } else if (acertos[i] == 0) { // Se não acertar entra na condição imprime o underline e false pra acerto
                    System.out.print(" _ ");
                    acertou = false;
                } else { //se acertar a letra imprime o caracter da palavra sorteada
                    System.out.print(" " + palavraDesconhecida.charAt(i) + " ");
                }
            }

        }

        if(chances != 0) {
            System.out.println("\n");
            System.out.println("   ▬▬▬.◙.▬▬▬");
            System.out.println("     .▂▄▄▓▄▄▂");
            System.out.println("   ◢◤ █▀▀████▄▄▄▄▄▄◢◤");
            System.out.println("   |█▄ █ :) ██▀▀▀▀▀▀▀╬");
            System.out.println("    ◥███████◤");
            System.out.println("     ══╩══╩══");
            System.out.println("         |");
            System.out.println("         |");
            System.out.println("   ╔+++++++++++++╗");
            System.out.println("     VOCÊ VENCEU");
            System.out.println("   ╚+++++++++++++╝");
        }
        else {
            System.err.println("\n");
            System.err.println("█████████ ");
            System.err.println("█▄█████▄█");
            System.err.println("█▼▼▼▼▼" );
            System.err.println("█   " + "!!!Você matou o YanDev!!!");
            System.err.println("█▲▲▲▲▲");
            System.err.println("█████████");
            System.err.println( "██ ██");

        }
        ler.close();
    }
}