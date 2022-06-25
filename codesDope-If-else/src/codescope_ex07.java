import java.util.Scanner;

public class codescope_ex07 {
    //Escreva um programa para imprimir o valor absoluto de um número digitado pelo usuário. Ex
    //: ENTRADA: 1 SAÍDA: 1
    //ENTRADA: -1 SAÍDA: 1
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe um valor: ");
        double valor = ler.nextDouble();
        if (valor >= 0 ) {
            System.out.println("O valor absoluto informado foi de: " + valor);
        } else {
            valor = valor * -1;
            System.out.println("O valor absoluto informado foi de: " + valor);
        }
    }
}
