import java.util.Scanner;
public class codescope_ex03 {
    public static void main(String[] args) {
    /*
        Uma loja dará desconto de 10% se o custo da quantidade comprada for superior a 1000.
        Pergunte ao usuário a quantidade
        Suponha que uma unidade custará 100.
        Julgue e imprima o custo total para o usuário.
     */
        Scanner ler = new Scanner(System.in);
        double valorUnidade = 100;
        System.out.print("Informe a quantidade comprada: ");
        double quantidade = ler.nextDouble();
        double valorTotal = quantidade * valorUnidade;
        if (valorTotal > 1000) {
            double valorComDesconto = valorTotal * 0.9;
            System.out.printf("Você ganhou um desconto de 10%%, o valor final é de: %.2f \n" ,valorComDesconto );
        } else {
            System.out.printf("O valor total da sua conta foi de: %.2f", valorTotal);
        }
    }
}
