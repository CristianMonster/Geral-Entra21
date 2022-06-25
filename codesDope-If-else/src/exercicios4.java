import java.util.Scanner;

public class exercicios4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = 2;
        while (numero != 0) {
            System.out.print("Informe a tabuada que você deseja saber: ");
            numero = ler.nextInt();
            if (numero == 0) {
                break;
            }
            for (int i = 0; i <= 10; i++) {
                System.out.println(i * numero);

            }
        }
    }
}
