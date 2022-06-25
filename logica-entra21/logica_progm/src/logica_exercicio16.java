import java.util.Scanner;
public class logica_exercicio16 {
    /*
    Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valorA;
        int valorB;
        System.out.println("Informe o valor do primeiro número: ");
        valorA = ler.nextInt();
        System.out.println("Informe o valor do segundo número: ");
        valorB = ler.nextInt();

        if (valorA > valorB) {
            System.out.println("Os números inseridos em ordem crescente: " + valorB + " < " + valorA);
        } else {
            System.out.println("Os números inseridos em ordem crescente: " + valorA + " < " + valorB);
        }
    }
}
