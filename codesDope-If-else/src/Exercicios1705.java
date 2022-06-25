import java.util.Locale;
import java.util.Scanner;

public class Exercicios1705 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        exe102();
    }

    public static void exe01() {
        System.out.print("Informe alguma coisa: ");
        String algo = ler.nextLine();
        System.out.println("Lenght: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty());
        System.out.println("Uppercase: " + algo.toUpperCase());
        System.out.println("Lowercase: " + algo.toLowerCase());
    }

    public static void exe02() {
        System.out.print("Informe a primeira frase/palavra: ");
        String primeira = ler.nextLine();
        System.out.print("Informe a segunda frase/palavra: ");
        String segunda = ler.nextLine();
        if (primeira.equals(segunda)) {
            System.out.println("São iguais");
        } else if (primeira.equalsIgnoreCase(segunda)) {
            System.out.println("São iguais porem ignorando o0, case");
        } else {
            System.out.println("São diferentes!");
        }
    }

    public static void exe03() {
        System.out.print("Informe a primeira frase/palavra: ");
        String primeira = ler.nextLine();
        System.out.print("Informe a segunda frase/palavra: ");
        String segunda = ler.nextLine();
        if (primeira.contains(segunda) || segunda.contains(primeira)) {
            System.out.println("Uma contem a outra");
        }
    }

    public static void exe04() {
        System.out.print("Informe a primeira frase/palavra: ");
        String primeira = ler.nextLine();
        System.out.print("Informe a segunda frase/palavra: ");
        String segunda = ler.nextLine();
        if (primeira.startsWith(segunda)) {
            System.out.println("A primeira é prefixo da segunda");
        } else if (segunda.startsWith(primeira)) {
            System.out.println("A segunda é prefixo da primeira");
        } else {
            System.out.println("Nada a ver");
        }
    }

    public static void exe05() {
        System.out.print("Informe a primeira frase/palavra: ");
        String primeira = ler.nextLine().toLowerCase();
        System.out.print("Informe a segunda frase/palavra: ");
        String segunda = ler.nextLine().toLowerCase(Locale.ROOT);
        if (primeira.endsWith(segunda)) {
            System.out.println("A primeira é suffixo da segunda");
        } else if (segunda.endsWith(primeira)) {
            System.out.println("A segunda é suffixo da primeira");
        } else {
            System.out.println("Nada a ver");
        }
    }

    public static void exe06() {
        //prints the index and the character for a given word
        System.out.print("Inforne uma palavra: ");
        String palavra = ler.nextLine();
        System.out.print("Informe um indice: ");
        String posicao = ler.nextLine();
        System.out.println(palavra.indexOf(posicao));
    }

    public static void exe07() {
        String palavra = "lala#lwve#-rwgra22lalang!#<3";
        String crypto = palavra.replace("w", "o").replace("#", " ").replace("2", "m").replace("lala", "i").replace("-", "p");
        System.out.println(crypto);
    }

    public static void exe08() {
        System.out.print("Informe a quantidade de números que você deseja informar: ");
        int quantidade = ler.nextInt();
        int[] numeros = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe o número: ");
            numeros[i] = ler.nextInt();
        }
        int somaPar = 0;
        int somaImpar = 0;
        for (int valor : numeros) { // passa em todas as posições
            if ((valor % 2) != 0) {
                somaImpar += valor;
            } else {
                somaPar += valor;
            }
        }
        System.out.println("Soma impar: " + somaImpar + "\nSoma par: " + somaPar);
    }

    public static void exe09() {
        System.out.print("Informe a quantidade de palavras: ");
        int quantidade = ler.nextInt();
        String[] palavras = new String[quantidade];
        ler.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe uma palavra: ");
            palavras[i] = ler.nextLine();
        }
        System.out.print("Infomre um número maior do que zero: ");
        int numeroCorte = ler.nextInt();

        for (int i = 0; i < quantidade; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            }
        }

        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void exe10() {
        System.out.print("Informe a quantidade de numeros: ");
        int quantidade = ler.nextInt();
        String[] palavras = new String[quantidade];
        ler.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe um numero: ");
            palavras[i] = ler.nextLine();
        }

        System.out.print("Informe a quantidade de numeros 2: ");
        int quantidade2 = ler.nextInt();
        String[] palavrasDois = new String[quantidade2];
        ler.nextLine();
        for (int i = 0; i < quantidade2; i++) {
            System.out.print("Informe um numero: ");
            palavrasDois[i] = ler.nextLine();
        }

        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < quantidade2; j++) {
                if (palavras[i].equals(palavrasDois[j])) {
                    palavras[i] = null;
                    break;
                }
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.print(palavra + " ");
            }
        }
    }

    public static void exe102() {
        System.out.print("Informe a quantidade de numeros: ");
        int quantidade = ler.nextInt();
        int[] palavras = new int[quantidade];
        ler.nextLine();
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe um numero: ");
            palavras[i] = ler.nextInt();
        }

        System.out.print("Informe a quantidade de numeros 2: ");
        int quantidade2 = ler.nextInt();
        int[] palavrasDois = new int[quantidade2];
        ler.nextLine();
        for (int i = 0; i < quantidade2; i++) {
            System.out.print("Informe um numero: ");
            palavrasDois[i] = ler.nextInt();
        }

        /*for (int controle : palavras) {
            boolean achou = false;
            for (int controle2 : palavrasDois) {
                if (controle == controle2) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println(controle);
            }
        }*/
        for (int i = 0; i < quantidade; i++) {
            boolean achou = false;
            for (int j = 0; j < quantidade2; j++) {
                if (palavras[i] == palavrasDois[j]) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println(palavras[i]);
            }
        }

    }
}

