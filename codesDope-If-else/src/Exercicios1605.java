import java.util.Random;
import java.util.Scanner;


public class Exercicios1605 {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        exe04();
    }

    public static void exe01() {
        // mostrando numero invertido
        System.out.print("Informe um número: ");
        String numero = String.valueOf(ler.nextInt());
        // String inverso = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            //   inverso = inverso + String.valueOf(numero.charAt(i));
            System.out.print(numero.charAt(i));
        }
        //System.out.print(inverso);
    }

    public static void exe02() {
        //Leia numeros inteiros até o usuario parar e msotrar o maior numero que ele digitou
        int maior = 0, menor = 0;
        int parada = -1;
        boolean firstCicle = true;
        while (parada != 0) {
            System.out.print("Informe um  - 0 para saída -: ");
            parada = ler.nextInt();
            if (firstCicle) {
                menor = parada;
                maior = parada;
                firstCicle = false;
            } else if (parada > maior) {
                maior = parada;
            } else if (parada < menor && parada != 0) {
                menor = parada;
            }
        }
        System.out.println(menor + " " + maior);
    }

    public static void exe03() {
        Random r = new Random();
        int numeroRandom = r.nextInt(101);
        int chutes = 0;
        while (true) {
            System.out.print("Informe o número para encontrar: ");
            int numeroInformado = ler.nextInt();
            chutes++;
            if (numeroInformado == numeroRandom) {
                System.out.println("VOCE ACHOU");
                break;
            } else if (numeroInformado > numeroRandom) {
                System.out.println("Muito alto");
            } else {
                System.out.println("Muito Baixo");
            }
        }
        System.out.println("Número de tentativas: " + chutes);
    }

    public static void exe04() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j  < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) { //linha
            for (int j = 0; j < 9; j++) { //coluna
                if (i +j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) { //linha
            for (int j = 0; j < 9; j++) { //coluna
                if (i +j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i+1);
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) { //linha
            for (int j = 0; j < 9; j++) { //coluna
                if (i +j < 4 || j - i > 4) {
                    System.out.print(" ");
                } else if (j > 4){
                    System.out.print(Math.abs(j-3));
                } else {
                    System.out.print(Math.abs(j-5));
                }
            }
            System.out.println("");
        }
    }

}

