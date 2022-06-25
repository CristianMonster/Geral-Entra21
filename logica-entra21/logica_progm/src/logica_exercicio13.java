import java.util.Scanner;
public class logica_exercicio13 {
   /* As maçãs custam R$1,30 cada se forem compradas menos de uma dúzia,
    e R$1,00 se forem compradas pelo menos 12. Escreva um programa que
    leia o número de maçãs compradas, calcule e escreva o custo total da compra.*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numeroMaca;
        double valorMacaFinal;

        System.out.println("Informe o número de maças compradas: ");
        numeroMaca = ler.nextInt();

        if (numeroMaca >= 12) {
            valorMacaFinal = numeroMaca * 1;
            System.out.println("O valor total da compra foi de R$: " + valorMacaFinal);
        } else {
            valorMacaFinal = numeroMaca * 1.3;
            System.out.println("O valor total da compra foi de R$: " + valorMacaFinal);
        }
    }
}
