import java.util.Scanner;
public class logica_exercicio12 {
    /* Ler um valor e escrever se é positivo ou
    negativo (considere o valor zero como positivo).*/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor;

        System.out.println("Informe um valor:");
        valor = ler.nextDouble();

        if (valor >= 0) {
            System.out.println("É positivo!");
        } else {
            System.out.println("É negativo");
        }
    }
}
