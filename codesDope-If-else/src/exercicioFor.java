import java.util.Scanner;

public class exercicioFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            soma += ler.nextInt();
        }
        System.out.println("A soma é: " + soma);
    }
}
