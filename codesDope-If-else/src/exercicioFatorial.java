import java.util.Scanner;

public class exercicioFatorial {
    public static void main(String[] args) {
        /*
        Write a java program to calculate the factorial value of given number. Factorial x –> x * x-1 * x-2…x*1
Example: factorial 4 = 4 * 3 * 2 * 1 = 24
Program Starts:
         */
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o numero que eu vou calcular o fatorial dele: ");
        int numero = ler.nextInt();
        int resultado = numero;
        /*
        resultado = 1;
        if (fatorial == 0) {
        valorfinal = 0;
        } else { for(int i = 0; i > numero; i--) {
                resultado *= i;
            }
        }
         */
        for (int i = 0; i < numero; i++) {
                numero--;
                resultado *= numero;
        }
        System.out.println(resultado);
    }
}
