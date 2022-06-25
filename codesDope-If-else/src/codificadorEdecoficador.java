import java.util.Scanner;

public class codificadorEdecoficador {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continua = true;
        while (continua) {
            System.out.print("Escolha 1 para codificar uma mensagem para Morse ou 2 para decodificar: ");
            int escolha = ler.nextInt();
            if (escolha == 1) {
                System.out.println(codificador());
                continua = false;
            } else if (escolha == 2) {
                System.out.println(decodificador());
                continua = false;
            } else {
                System.out.println("Resposta inválida!");
            }
        }
    }

    public static String codificador() {
        Scanner in = new Scanner(System.in);
        System.out.print("Coloque a mensagem a ser codificada: ");

        String mensagem = in.nextLine().toUpperCase();
        String codigo = "";
        for (int i = 0; i < mensagem.length(); i++) {
            switch (mensagem.charAt(i)) {
                case 'A':
                    codigo += ".-";
                    break;
                case 'B':
                    codigo += "-...";
                    break;
                case 'C':
                    codigo += "-.-.";
                    break;
                case 'D':
                    codigo += "-..";
                    break;
                case 'E':
                    codigo += ".";
                    break;
                case 'F':
                    codigo += "..-.";
                    break;
                case 'G':
                    codigo += "--.";
                    break;
                case 'H':
                    codigo += "....";
                    break;
                case 'I':
                    codigo += "..";
                    break;
                case 'J':
                    codigo += ".---";
                    break;
                case 'K':
                    codigo += "-.-";
                    break;
                case 'L':
                    codigo += ".-..";
                    break;
                case 'M':
                    codigo += "--";
                    break;
                case 'N':
                    codigo += "-.";
                    break;
                case 'O':
                    codigo += "---";
                    break;
                case 'P':
                    codigo += ".--.";
                    break;
                case 'Q':
                    codigo += "--.-";
                    break;
                case 'R':
                    codigo += ".-.";
                    break;
                case 'S':
                    codigo += "...";
                    break;
                case 'T':
                    codigo += "-";
                    break;
                case 'U':
                    codigo += "..-";
                    break;
                case 'V':
                    codigo += "...-";
                    break;
                case 'W':
                    codigo += ".--";
                    break;
                case 'X':
                    codigo += "-..-";
                    break;
                case 'Y':
                    codigo += "-.--";
                    break;
                case 'Z':
                    codigo += "--..";
                    break;
                case '0':
                    codigo += "-----";
                    break;
                case '1':
                    codigo += ".---";
                    break;
                case '2':
                    codigo += "..---";
                    break;
                case '3':
                    codigo += "...--";
                    break;
                case '4':
                    codigo += "....-";
                    break;
                case '5':
                    codigo += ".....";
                    break;
                case '6':
                    codigo += "-....";
                    break;
                case '7':
                    codigo += "--...";
                    break;
                case '8':
                    codigo += "---..";
                    break;
                case '9':
                    codigo += "----.";
                    break;
                case ' ':
                    codigo += "*|";
                    break;
                case '.':
                    codigo += ".-.-.-";
                    break;
                case ',':
                    codigo += "--..--";
                    break;
                case '?':
                    codigo += "..--..";
                    break;
                case '!':
                    codigo += "..--.";
                    break;
                case ':':
                    codigo += "---...";
                    break;
                case ';':
                    codigo += "-.-.-.";
                    break;
                case '-':
                    codigo += "-....-";
                    break;
                case '_':
                    codigo += "..--.-";
                    break;
                case '"':
                    codigo += ".-..-.";
                    break;
                case '(':
                    codigo += "-.--.";
                    break;
                case ')':
                    codigo += "-.--.-";
                    break;
                case '=':
                    codigo += "-...-";
                    break;
                case '+':
                    codigo += ".-.-.";
                    break;
                case '/':
                    codigo += "-..-.";
                    break;
                case '@':
                    codigo += ".--.-.";
                    break;
                case '$':
                    codigo += "...-..-";
                    break;
                case '&':
                    codigo += ".-...";
                    break;
                case '#':
                    codigo += "----.";
                    break;
                case '%':
                    codigo += ".-.-.-";
                    break;
                case '*':
                    codigo += ".-.-.";
                    break;
                case '\'':
                    codigo += ".----.";
                    break;

            }
            codigo += "|";
        }

        return codigo;
    }

    public static String decodificador() {
        Scanner in = new Scanner(System.in);
        System.out.print("Coloque a mensagem a ser decodificada: ");

        String frase = in.nextLine().toUpperCase();
        String codigo = "";
        String[] mensagem = frase.split("\\|");

        for (int i = 0; i < mensagem.length; i++) {
            switch (mensagem[i]) {

                case ".-":
                    codigo += "A";
                    break;
                case "-...":
                    codigo += "B";
                    break;
                case "-.-.":
                    codigo += "C";
                    break;

                case "-..":
                    codigo += "D";
                    break;

                case ".":
                    codigo += "E";
                    break;

                case "..-.":
                    codigo += "F";
                    break;

                case "....":
                    codigo += "H";
                    break;

                case "..":
                    codigo += "I";
                    break;

                case ".---":
                    codigo += "J";
                    break;

                case "-.-":
                    codigo += "K";
                    break;

                case ".-..":
                    codigo += "L";
                    break;

                case "--":
                    codigo += "M";
                    break;


                case "-.":
                    codigo += "N";
                    break;

                case "---":
                    codigo += "O";
                    break;

                case ".--.":
                    codigo += "P";
                    break;

                case "--.-":
                    codigo += "Q";
                    break;

                case ".-.":
                    codigo += "R";
                    break;

                case "...":
                    codigo += "S";
                    break;

                case "-":
                    codigo += "T";
                    break;

                case "..-":
                    codigo += "U";
                    break;

                case "...-":
                    codigo += "V";
                    break;

                case ".--":
                    codigo += "W";
                    break;

                case "-..-":
                    codigo += "X";
                    break;

                case "-.--":
                    codigo += "Y";
                    break;

                case "--..":
                    codigo += "Z";
                    break;

                case " ":
                    codigo += "*";
                    break;

                case ".----":
                    codigo += "1";
                    break;

                case "..---":
                    codigo += "2";
                    break;

                case "...--":
                    codigo += "3";
                    break;

                case "....-":
                    codigo += "4";
                    break;

                case ".....":
                    codigo += "5";
                    break;

                case "-....":
                    codigo += "6";
                    break;

                case "--...":
                    codigo += "7";
                    break;

                case "---..":
                    codigo += "8";
                    break;

                case "----.":
                    codigo += "9";
                    break;

                case "-----":
                    codigo += "0";
                    break;

                case "*":
                    codigo += " ";
                    break;

                case ".-.-.-":
                    codigo += ".";
                    break;

                case "--..--":
                    codigo += ",";
                    break;

                case "..--..":
                    codigo += "?";
                    break;

                case "..--.":
                    codigo += "!";
                    break;

                case "---...":
                    codigo += ":";
                    break;

                case "-.-.-.":
                    codigo += ";";
                    break;

                case "-....-":
                    codigo += "-";
                    break;

                case "..--.-":
                    codigo += "_";
                    break;

                case "-.--.":
                    codigo += "(";
                    break;

                case "-.--.-":
                    codigo += ")";
                    break;
                case "-...-":
                    codigo += "=";
                    break;
                case ".-.-.":
                    codigo += "+";
                    break;
                case ".-..-.":
                    codigo += "\"";
                    break;
                case "-..-.":
                    codigo += "/";
                    break;
                case ".--.-.":
                    codigo += "@";
                    break;
                case "...-..-":
                    codigo += "$";
                    break;
                case ".-...":
                    codigo += "&";
                    break;
                case ".----.":
                    codigo += "'";
                    break;

            }
        }
        return codigo;
    }
}
