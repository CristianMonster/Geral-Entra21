import java.util.Scanner;

public class exercicio09_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o algoritmo: ");
        int numero = ler.nextInt();
        int soma = 0;
        for (int i = 0; i <= numero; i++) {
            soma += i;
        }
        System.out.println(soma);
        /*
        while (numero >0) {
        soma += numero;
        numero--;
        }
         */
    }
}
