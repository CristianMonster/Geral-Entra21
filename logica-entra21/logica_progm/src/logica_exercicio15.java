import java.util.Scanner;
public class logica_exercicio15 {
    /*
    Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior dentre eles.
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
            System.out.println("O maior valor entre estes é: " + valorA);
        } else {
            System.out.println("O maior valor entre estes é: " + valorB);
        }
    }
}
