import java.util.Scanner;

public class decodificador {
    public static void main(String[] args) {
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
        System.out.println(codigo);
    }
}